# Java Streams API

## Overview

This repository is a Java learning project focused on the Java Streams API. It demonstrates how to use streams for processing collections and arrays in a functional style. The examples include intermediate stream methods, terminal operations, and practical problems solved with stream pipelines.

## What this repo contains

- `IntermidiateMethods/`: Examples of intermediate stream operations such as `filter`, `map`, `flatMap`, `distinct`, `sorted`, `limit`, and `skip`.
- `TerminalMethods/`: Examples of terminal stream operations such as `forEach`, `count`, `reduce`, `collect`, `min`, `max`, `findFirst`, `findAny`, `anyMatch`, `allMatch`, and `noneMatch`.
- `Problems/Easy/`: Small practice problems solved using streams, including filtering, aggregation, and collection conversion.
- `StreamMethod/Main.java`: A main class demonstrating basic stream creation and usage.

## What is the Java Streams API?

The Java Streams API is part of Java's `java.util.stream` package. It provides a way to perform bulk operations on sequences of elements in a functional and declarative style. A stream is not a data structure: it does not store elements. Instead, it conveys elements from a source such as a collection, array, or I/O channel, through a pipeline of computational operations.

### Key characteristics of streams

- **No storage**: Streams do not hold data; they process data from a source.
- **Functional-style operations**: Stream operations use lambdas and method references.
- **Laziness**: Intermediate operations are lazy and are not executed until a terminal operation runs.
- **Pipelining**: Multiple operations can be chained in a fluent manner.
- **Possibly parallel**: Streams can execute operations in parallel easily with `parallelStream()`.

## Stream pipeline structure
A stream pipeline has three parts:

1. **Source**: Where the stream comes from, such as a `Collection`, `List`, or array.
2. **Intermediate operations**: Transformations that return a new stream. They are lazy and can be chained.
3. **Terminal operation**: Produces a result or side effect and triggers execution of the pipeline.

Example:

```java
List<String> items = List.of("apple", "banana", "cherry");
long count = items.stream()
    .filter(s -> s.startsWith("b"))
    .count();
```

## Intermediate stream operations

Intermediate operations return another stream and are used to transform or filter data.

- `filter(Predicate<T>)`: Keeps elements that match a condition.
- `map(Function<T,R>)`: Transforms each element into another form.
- `flatMap(Function<T,Stream<R>>)` : Flattens nested streams into a single stream.
- `distinct()`: Removes duplicate elements.
- `sorted()`: Sorts elements in natural order.
- `sorted(Comparator<T>)`: Sorts elements using a custom comparator.
- `limit(long maxSize)`: Truncates the stream to a maximum size.
- `skip(long n)`: Skips the first `n` elements.

### Example intermediate use

```java
List<Integer> values = List.of(1, 2, 3, 4, 5);
List<Integer> result = values.stream()
    .filter(n -> n % 2 == 0)
    .map(n -> n * n)
    .collect(Collectors.toList());
```

## Terminal stream operations

Terminal operations close the stream pipeline and produce a result or side effect.

- `forEach(Consumer<T>)`: Performs an action for each element.
- `collect(Collector<T,A,R>)`: Converts the stream into a collection, map, string, or other result.
- `count()`: Returns the number of elements.
- `reduce(BinaryOperator<T>)`: Combines elements to produce a single value.
- `min(Comparator<T>)` / `max(Comparator<T>)`: Finds the smallest or largest element.
- `findFirst()`: Returns the first element wrapped in `Optional`.
- `findAny()`: Returns any element wrapped in `Optional`.
- `anyMatch(Predicate<T>)`: Returns `true` if any element matches.
- `allMatch(Predicate<T>)`: Returns `true` if all elements match.
- `noneMatch(Predicate<T>)`: Returns `true` if no elements match.

### Example terminal use

```java
Optional<Integer> minValue = values.stream()
    .min(Integer::compareTo);

boolean anyOdd = values.stream()
    .anyMatch(n -> n % 2 != 0);
```

## Why use streams?

Streams simplify collection processing by:

- Reducing boilerplate loops and temporary collections.
- Making code more readable and expressive.
- Enabling better composition of operations.
- Allowing easy switching between sequential and parallel execution.

## How to use this repo

- Review the example classes in `IntermidiateMethods/` and `TerminalMethods/`.
- Run `StreamMethod/Main.java` to see basic stream usage.
- Solve or extend the practice problems under `Problems/Easy/` using stream pipelines.
- Add new examples for other stream operations and combinations.

## Notes

- Streams are single-use: once a terminal operation is called, the stream cannot be reused.
- Be careful with stateful operations and side effects when using parallel streams.
- Prefer immutable data and pure functions inside stream pipelines when possible.

---

## License

This repository is intended for learning and demonstration purposes.