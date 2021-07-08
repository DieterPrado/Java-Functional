# Functional Java
### Table of contents
- General info
- Technologies
- Setup
- Things learned
- Commands


------------

### General info

This repository contains files and explanations of things learned in the Platzi's Functional Java course. The course taught the different types of functios available, how to create or own functions and how to use all those functions. It taught about Functions, BiFunctions, Operators (Unary and Bi), Consumers, Suppliers, Predicates the structure of a lambda expression and how to use Streams. Inside the **Java-Functiona-Platzi ** directory are files utilized only for practice purposes. It contains examples of the functions taught in the course. In other hand, the **job-search** directory contains a project whose function is to send petitions and receive data from the GitHub Job Search Api. Unfortunately, the api is now deprected so the project doesn't work.

------------

### Technologies
- OpenJDK8 (requieres installation)
- IntelliJ IDEA (requieres installation)

Requiered dependencies. Used within Intellij IDEA.
- JCommander
- Feign Core
- Feign Gson


------------

### Setup

###### IntelliJ IDEA 
- Go to https://www.jetbrains.com/idea/download/ and download the Community version

###### OpenJDK
- Go to https://adoptopenjdk.net/ and download the following version:
    - OpenJDK 8
   
**Within Intellij IDEA**

###### JCommander
- Copy the next code and insert it into the build.graddle file in the dependencies part of the code.
-  `<!-- https://mvnrepository.com/artifact/com.beust/jcommander -->
<dependency>
    <groupId>com.beust</groupId>
    <artifactId>jcommander</artifactId>
    <version>1.81</version>
</dependency>`

###### Feign Core
- Copy the next code and insert it into the build.graddle file in the dependencies part of the code.
- `<!-- https://mvnrepository.com/artifact/io.github.openfeign/feign-core -->
<dependency>
    <groupId>io.github.openfeign</groupId>
    <artifactId>feign-core</artifactId>
    <version>11.2</version>
</dependency>`

###### Feign Gson
- Copy the next code and insert it into the build.graddle file in the dependencies part of the code.
- `<!-- https://mvnrepository.com/artifact/io.github.openfeign/feign-gson -->
<dependency>
    <groupId>io.github.openfeign</groupId>
    <artifactId>feign-gson</artifactId>
    <version>11.2</version>
</dependency>`

------------
### Things learned
- Advantages and disadvantages of functional programming
- What is a function.
- How to declare a function.
- How to create my own functions (Using a **SAM**).
- Characteristics and differences of pure and impure functions.
- Whate are side effects of functions.
- How a lambda function work.
- High order functions. Either use functions or return functions (or both).
- Advantages of high order functions.
- Data immutability advantages and disadvantages.
- Types of functions: Predicate, Consumer, Supplier.
- UnaryOperator, BiFunction, BiOperator.
- Default methods within a SAM to create a function's body.
- Chaining.
- Composition of functions (**.compose **and **.andThen**)
- The **Optional** class, used to deal with non existing values.
- How Stream class work.
- Once a Stream value is used it can't be used anymore.
- Intermediate operations.
- Final operations.
- Collector interface.




------------
### Commands
|  Command | Function  |
| ------------ | ------------ |
| Function | Receives a specified input type and returns a specified value type.   |
| BiFunction | Receives two specified input types and returns a specified value type. |
| BinaryOperator | Receives 2 inputs and returns 1 value, all of the same type.|
| UnaryOperator | Receives an input and returns a value, all of the same type . |
| Consumer | Receives input and returns no result. |
| Supplier | Doesn't receive arguments and returns a result. |
| Predicate | Receives input and returns a boolen type result. |
| Stream | A sequence of elements supporting sequential and parallel aggregate operations. |
| .compose() | First run a funcion inside the () and then executes the function where it was applied. |
| .andThen() | Executes the function inside () after the funcion where it was appliet is executed |
| .filter() | Filters by conditions. |
| .max() | Obtain the max value of a stream using a comparator |
| intStream | Generates integers. |
| .limit() | Limits the integer generation of IntStream. |
|  findAny(), findFirst() | Return an Optional as a result of searching for an element within the Stream |
| Optional | Class that helps with empty values. |
| optional.isPresent() | Finds out if there is a value present in the optional instance and returns true or false. |
| optional.ifPresent() | Allows to use a Consumer if there is a value present. |
| optional.boxed() |  Is a stream of the wrapper class instances to simulate a stream of primitives. |
| collector.toSet() | Returns a Collector that accumulates the input elements into a new Set . |
| @FunctionalInterface | Indicates that an interface is used for a function creation. It can be used only in SAM interfaces |
| @Headers | Feign notation to indicate the headers of our petitions. |
| @Serializedname | Indicates the name of the variable as it is in the API. |
| @Parameter | Indicates to JCommander if a parameter can be received by terminal. |
