# What is Method Reference : 
Method reference is a short hand way to define lamba expression;

### Normal Lambda
person ->person.getName()

Method reference version : 
Person::getName

Dono same kaam karte hain.
---

### Example

List<Person>people = List.of(
new Person("Shiv",25),
new Person("Peter",20)
);

people.stream()
.map(person ->person.getName())
.forEach(System.out::println);

Output:
Shiv
Peter

# Same code: using method reference

people.stream()
.map(Person::getName)
.forEach(System.out::println);
```

Output:

Shiv
Peter

# Java internally kya samajhta hai?

Jab tu likhta hai:
.map(Person::getName)

Java samajhta hai:
.map(person ->person.getName())

---

### Ek aur example

```java
Comparator.comparingInt(Person::getAge)
```

Ye internally equivalent hai:

```java
Comparator.comparingInt(
person ->person.getAge()
)
```

---

### Method Reference kab use kar sakte ho?

Jab lambda sirf ek existing method ko call kar rha ho.

Example:

```java
person ->person.getAge()
```

to likh sakte ho:

```java
Person::getAge
```

---

### Common Method References

### Instance Method

```java
Person::getAge
Person::getName
```

---

### Static Method

```java
Integer::parseInt
Math::abs
```

Equivalent:

```java
str ->Integer.parseInt(str)

num ->Math.abs(num)
```

---

### Constructor Reference

```java
Person::new
```

Equivalent:

```java
(name,age) ->newPerson(name,age)
```

Ye advanced streams me bahut use hota hai.