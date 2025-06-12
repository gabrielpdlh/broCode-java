# Primitive Types x Reference Types

# Primitive - 

## Primitive types are directly stored at memory (Stack or Heap)
> <h3>Stacks - </h3>
> Stores local variables, called methods, function`s params, primitives. <br> 
> LIFO - Last in, First Out <br>
> Each thread has your own stack <br>
> Fast memory, automatically managed  <br>

> <h3>Heap - </h3>
> Dinamic memory, organized in free form (No specific order). <br>
> Stores objects and arrays <br>
> Managed by Garbage Collector (GC) <br>
> Slower than stack, but necessary to data that has to surviver after method<br>

## Primitive Types examples -
`int, double, char, boolean, byte, short, long, float`

# Reference -

### Are stored as reference (Memory Adress) <br>
### When create an object, the object goes to heap, and the variable keep the adress where the object is at heap

## Reference Types examples -
`String, , Classes, Interfaces, Enums, Wrapper classes`

# Resume - 

## ✅ Primitive Types in Java (8 types)

| Type      | Size (bits) | Value Range                                | Example            |
|-----------|-------------|--------------------------------------------|--------------------|
| `byte`    | 8           | -128 to 127                                 | `byte b = 1;`      |
| `short`   | 16          | -32,768 to 32,767                           | `short s = 2;`     |
| `int`     | 32          | -2³¹ to 2³¹-1                               | `int i = 10;`      |
| `long`    | 64          | -2⁶³ to 2⁶³-1                               | `long l = 100L;`   |
| `float`   | 32          | ±1.4e-45 to ±3.4e38                         | `float f = 1.0f;`  |
| `double`  | 64          | ±4.9e-324 to ±1.8e308                       | `double d = 2.0;`  |
| `char`    | 16          | 0 to 65,535 (Unicode)                       | `char c = 'A';`    |
| `boolean` | 1 (theoretical) | `true` or `false`                     | `boolean b = true;`|


## ✅ Reference Types in Java

| Type             | Description                                         | Example                          |
|------------------|-----------------------------------------------------|----------------------------------|
| `String`         | Sequence of characters                              | `String name = "John";`         |
| Arrays           | Collection of elements of the same type             | `int[] numbers = {1, 2, 3};`    |
| Classes          | Instances of custom or built-in classes             | `Person p = new Person();`      |
| Interfaces       | References to implementations of interfaces         | `Runnable r = new Task();`      |
| Enums            | Enumerated types                                     | `DayOfWeek day = DayOfWeek.MONDAY;` |
| Wrapper classes  | Object versions of primitives (`Integer`, `Double`) | `Integer i = 10;`               |
