# SmartBuf [![Travis CI](https://travis-ci.org/smartbuf/smartbuf-java.svg?branch=master)](https://travis-ci.org/smartbuf/smartbuf-java) [![codecov](https://codecov.io/gh/smartbuf/smartbuf-java/branch/master/graph/badge.svg)](https://codecov.io/gh/smartbuf/smartbuf-java)

`smartbuf` is a cross-language serialization and deserialization framework, 
which has high performance and compression ratio like `protobuf`, and has high compatibility and scalability like `json`.

Like `json`, encoded-data generated by `smartbuf` still keeps the `schema` infomation, 
without any pre-defined `IDL`, receiver could decode it directly. 
This feature makes `smartbuf` have better scalability, compatibility and universality.

In order to improve the efficiency of compression and transmission, `smartbuf` uses **Partition Serialization** strategy.
It will split object into multiple different parts, and use different method to encode them. 
About the details, please check the following **Partition Serialization** section. 

Because of the well-designed **Partition Serialization** strategy, `smartbuf` provides higher compression ratio and performance.
In my benchmarks, it even could be better than `protobuf`.
For more details, please check the following **Benchmark** section.

`smartbuf` also provides two different modes named `packet` and `stream` for different scenes.
For more details, please check the following **Usage** section.

# Partition Serialization

In the design concept of `smartbuf`, objects are consists of the following three parts:

+ `property`: it's the underlying property of object's fields, like number, float, string, etc.
+ `struct`: it describes object's structure, includes field-name and fields.
+ `body`：it represents normal object, but all `property` and `struct` are referenced from previous two parts.

For this concept, `smartbuf` creates **Partition Serialization** strategy.
That is, during object encoding process, different parts will be encoded into independent partitions, 
thereby forming multiple compact partitions, and each partition is associated by unique `ID` to complete the assembly of objects.  

## `property` Partition

Property Partition is responsible for storing standard and common values, 
like `const`, `float`, `double`, `varint`, `string`, `symbol`, etc.

It also allocate unique `ID` for those values, in other partitions, only need **1~2** bytes to reference those values. 

In the real world, some properties could be repeated in objects, especially for array or collection.
In this case, if use `json` and `protobuf`, the repeated data will be re-serialized again and again.
But for `smartbuf`, thanks to the partition design, it's unnecessary at all, which could significantly improves space utilization.  

## `struct` Partition

In the design of `smartbuf`, `struct` represents a field-name-list, it doesn't care every field's data type.

Struct Partition contains two parts: `field-name` pool and `struct` pool, the former is similar with `string[]`,
the latter is similar with `int[][]`，which means `int[]` could represents an `struct`, 
and each `int` represents the reference to a field name.

This design has two advantages:

 + **Field Name Reusing**: While encoding, different objects could reuse same field names, especially for common name like `name`, `id`, `timestamp`, `url`, etc.
 + **Context Reusing**：Could easily cache and reuse the global `struct` partition.

In fact, `smartbuf` will keep two `struct` pools inside, namely `temporary` and `context`.
the former used to describe some temporary object like `Map`, and the latter used to describe some reusable object like `POJO`.

This is also the biggest difference between the `packet` and `stream` modes mentioned earlier. 
For `packet` mode, the context concept is disabled, it will treat all objects as `temporary` types.

## Data Partition

Data Partition is mainly the `body`.

As mentioned above, the object's `property` and `struct` have been extracted into seperate partitions.
Therefore, `body` could use very small space to reference `property` and `struct`, thus assembling into a complete object. 

The above rules are mainly for ordinary `object`, and for array there has a special set of processing rules:

 + **Native Array**: Native Array as one special entity, wouldn't be extracted into `property`.
 + **Slice Array**: Some complex `object[]` may contains different data, even `null`, so `smartbuf` will treat one array as multiple slices which has same data type. 

`smartbuf` has a very clever algorithm for the processing of arrays, which can improve the coding space utilization.

## Example

For better understanding of Partition Serialization, 
this section demonstrates the details of the partition encoding described above with a simple object.

This is a simple `User` model:

```proto
message User {
    int32 id = 1;
    string name = 2;
    int64 time = 3;
}
```

For the first time to use `smartbuf` to encode `User{id=1001, name="hello", time=10000L}`, the final output bytecode is as follows:

![smartbuf-first-packet](./doc/img/smartbuf-packet.png)

Because the first output contains `schema` data of `User`, so it appears to be bloated.  

If in `stream` mode to encode it again, some `schema` will be reused, and the final output bytecode is as follows:

![smartbuf-following](./doc/img/smartbuf-stream.png)

In real system development, the data we transformed 

As you can imagine, in actual system development, there are often many repetitive properties inside the data we transmit
 (especially arrays). Serializing these repeated attributes with `smartbuf` often requires only one extra byte.

In addition, as can be seen from this example, even for anyone who does not cache the full context `schema` metadata,
the message can be parsed normally.
Of course, due to the lack of auxiliary field information in the data body, 
the field names `id`, `name`, `time` cannot be parsed normally, and they can only be parsed into meaningless serial numbers.

This feature is very helpful for data readability and debugability. 
You can capture packets through the network, and directly view the encoded data message of `smartbuf`, 
which is very difficult for `protobuf`.

# Usage

By now, `smartbuf` only support java language, you can install it by this maven dependency:

```xml
<dependency>
  <groupId>com.github.smartbuf</groupId>
  <artifactId>smartbuf</artifactId>
  <version>0.1.0</version>
</dependency>
```

TODO

## [`SmartPacket`](https://github.com/smartbuf/smartbuf-java/blob/master/src/main/java/com/github/smartbuf/SmartPacket.java)

```java
UserModel user = new UserModel(1001, "hello", 10000L);
byte[] bytes = SmartPacket.serialize(user); // serialize or encode
UserModel newUser = SmartPacket.deserialize(bytes, UserModel.class); // deserialize or decode
assert user.equals(newUser); 
```

TODO 

## [`SmartStream`](https://github.com/smartbuf/smartbuf-java/blob/master/src/main/java/com/github/smartbuf/SmartStream.java)

```java
final SmartStream stream = new SmartStream();
UserModel user = new UserModel(1001, "hello", 10000L);
byte[] bytes = stream.serialize(user); // serialize or encode 
UserModel newUser = stream.deserialize(bytes, UserModel.class);  // deserialize or decode
assert user.equals(newUser);
```

TODO

## Comparison of `packet` and `stream`

TODO

# Benchmark

## `Small` Object

TODO

```java
public class UserModel {
    private long    id;
    private Boolean blocked;
    private String  nickname;
    private String  portrait;
    private float   score;
    private int     loginTimes;
    private long    createTime;
}
```

![small](./doc/img/small.png)

## `Medium` Object

TODO

```java
public class UserModel {
    private long    id;
    private String  nickname;
    private String  portrait;
    private float   score;
    private String  mail;
    private String  mobile;
    private String  token;
    private Integer type;
    private Integer source;
    private Boolean blocked;
    private int     loginTimes;
    private long    updateTime;
    private long    createTime;
    
    private List<Message> msgs;
    private List<Tag>     tags;

    public static class Message {
        private Long   id;
        private Long   from;
        private Long   to;
        private String msg;
        private Long   timestamp;
    }

    public static class Tag {
        private int    code;
        private String name;
    }
}
```

![medium](./doc/img/medium.png)

## `Large` Object

TODO 

![large](./doc/img/large.png)

# Advantages and disadvantages

TODO

# License

Apache-2.0
