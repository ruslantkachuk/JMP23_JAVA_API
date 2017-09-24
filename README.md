Java API. Java 9. Java 8 vs Java 9
-----------------------


    mvn clean install
    java -jar api/target/api-1.0-SNAPSHOT-exec.jar


Java 9
-----------------------

#### The Java Platform module system. Jigsaw http://openjdk.java.net/jeps/201
The defining feature for Java 9 is an all-new module system. When codebases grow larger, the odds of creating complicated, tangled “spaghetti code” increase exponentially. There are two fundamental problems: It is hard to truly encapsulate code, and there is no notion of explicit dependencies between different parts (JAR files) of a system. Every public class can be accessed by any other public class on the classpath, leading to inadvertent usage of classes that weren't meant to be public API. Furthermore, the classpath itself is problematic: How do you know whether all the required JARs are there, or if there are duplicate entries? The module system addresses both issues.

#### Jshell. http://openjdk.java.net/jeps/222
It stands for Java Shell and also known as REPL (Read Evaluate Print Loop). It is used to execute and test any Java Constructs like class, interface, enum, object, statements etc. very easily. It means that if a developer wants to run just a few lines of Java as a standalone, it can be done without having to wrap it all in a separate method or project.

#### Microbenchmarks. http://openjdk.java.net/jeps/230
Microbenchmarking is measuring the performance of some small code fragment. The Java harness (JMH) for analyzing down to nanoseconds is unique to Java 9.

#### HTTP/2 http://openjdk.java.net/jeps/110
A new way of performing HTTP calls arrives with Java 9. This much overdue replacement for the old `HttpURLConnection` API also supports WebSockets and HTTP/2 out of the box. One caveat: The new HttpClient API is delivered as a so-called _incubator module_ in Java 9. This means the API isn't guaranteed to be 100% final yet. 

#### Process API http://openjdk.java.net/jeps/102
An API (application programming interface) allows app’s processes communicate with each other without using native code. This update in Java 9 will extend the ability of Java in controlling and managing OS processes.


Java 8 vs Java 9
-----------------------

#### Immutable List, Set, Map, and Map.Entry API
In Java 8, to create a collection of several elements, a developer had to create several lines of code. Now it can be accomplished in a single line of code. One of the time-consuming disadvantages of Java 8 has thus been eliminated.

#### Publish-Subscribe Framework
This is an improvement over Java 8, as these interfaces will better support the interoperability of a number of asynchronous systems that run on JVM’s (Java Virtual Machines). The idea behind JVM’s is that they allow any computer to run a Java program, by converting Java code into machine language and then executing it. Improvements in this area are one of the big advantages of Java 9.
