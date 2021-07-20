# Functional Java
### Table of contents
- [General info](#general-info)
- [Technologies](#technologies)
- [Setup](#setup)
- [Things learned](#things-learned)
>- Advantages and disadvantages of functional programming.
>- Functions.
>- How to create my own functions.
>- Pure and impure functions.
>- Types of functions.
>- Lambdas.
>- Stream.
>- Intermediate and final operations.
>- Chaining.
- [Commands](#commands)


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
   

###### Dependencies:
- Feign core, feign gson and jcommander. Within Intellij IDEA copy the next code and insert it into the build.graddle file in the dependencies part of the code.

```java
<!-- https://mvnrepository.com/artifact/com.beust/jcommander -->
<dependency>
    <groupId>com.beust</groupId>
    <artifactId>jcommander</artifactId>
    <version>1.81</version>
</dependency>

<!-- https://mvnrepository.com/artifact/io.github.openfeign/feign-core -->
<dependency>
    <groupId>io.github.openfeign</groupId>
    <artifactId>feign-core</artifactId>
    <version>11.2</version>
</dependency>

<!-- https://mvnrepository.com/artifact/io.github.openfeign/feign-gson -->
<dependency>
    <groupId>io.github.openfeign</groupId>
    <artifactId>feign-gson</artifactId>
    <version>11.2</version>
</dependency>
```

------------
### Things learned
- Advantages and disadvantages of functional programming.

**Advantages**
>- Because pure functions don’t change any states and are entirely dependent on the input, they are simple to understand. 
>- Due to the nature of pure functions to avoid changing variables or any data outside it, implementing concurrency becomes efficacious.
>- It supports the concept of lazy evaluation, which means that the value is evaluated and stored only when it is required.
>- It is more legible.
>- Easy to test.

**Disadvantages**
>- Immutable values combined with recursion might lead to a reduction in performance.
>- In some cases, writing pure functions causes a reduction in the readability of the code.
>- Writing programs in recursive style instead of using loops for the same can be a hard task.

- What is a function. It is a type of data that can operate on data x and generates data y.

- How to declare a function. 

- How to create my own functions (Using a **SAM**). Need to put the @FunctionalInterface mark, it allows us to indicate that we use an interface as a function.

- Characteristics and differences of pure and impure functions.
**Pure functions**
>- A function that always generates the same result for the same argument values.
>- The function application has no side effects (no mutation of local static variables, non-local variables, mutable reference arguments or input/output streams).

**Impure functions**
>- The return value of the impure functions does not solely depend on its arguments Hence, if you call the impure functions with the same set of arguments, you might get the different return values For example, Math.random(), Date.now().
>- They may have any side effects like network or database calls.
>- They may modify the arguments which are passed to them.

- Whate are side effects of functions: Any change observable from outside the system is a side effect. For example a function that once used changes the color of something. Read / create / modify / delete files. An operation, function or expression is said to have a side effect if it modifies some state variable value(s) outside its local environment, that is to say has an observable effect besides returning a value (the intended effect) to the invoker of the operation.

- How a lambda function work. It is a function. Lambda expressions allow passing a function as an input parameter for another function, which was not possible earlier. In short, lambdas can replace anonymous classes, making the code readable and easy to understand.
>- (parameters) -> { statements }; 
>- An example: (parameter)-> System.out.println(parameter);

- High order functions. Either use functions or return functions (or both).

- Advantages of high order functions. ass behaviors, share a form of communication, share logic.

- Data immutability advantages and disadvantages.
**Advantages**
>- Once a piece of information has been created it can no longer be altered.
>- Facilitate pure functions creation, since the functions fon't generate side effects.
>- More easy to use concurrency

**Disadvantages**
>- New instance for each set of modifications.
>- It requires special attention to design.

- Types of functions: Predicate, Consumer, Supplier.
**Predicate**
>- Receives input and returns a boolen type result.
**Consumer**
>- Receives input and returns no result.
**Supplier**
>- Doesn't receive arguments and returns a result.

- UnaryOperator, BiFunction, BiOperator.

- Default methods within a SAM to create a function's body.

- Chaining: Chaining is a technique used to simplify code where multiple methods are applied to an object one after another. It gives us the advantage of not having to be storing the results.

- Composition of functions (**.compose **and **.andThen**). Compose creates a new function that we cannot interfere with. Compose takes a function and executes it first and then on which it was called. **.andThen** executes the function inside () after the funcion where it was appliet is executed.

- The **Optional** class, used to deal with non existing values.

- How Stream work. Stream is a sequence of elements supporting sequential and parallel aggregate operations.

- Once a Stream value is used it can't be used anymore (after final operations).

- Intermediate operations. Intermediate operations return another Stream which allows you to call multiple operations in a form of a query. Stream intermediate operations do not get executed until a terminal operation is invoked

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
