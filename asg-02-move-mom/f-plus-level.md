# F+ Level Overview

This is just like the first assignment - get your project stubbed out and compiling without errors, and you've got yourselves an F+...still better than an F!

## A few hints

### `MySimpleBst<T>`

- your `MySimpleBst<T>` needs to implement the `SimpleBst<T>` interface
- note that T extends `Comparable<T>` in the interface. That means you need to tweak something when you declare your `MySimpleBst` class....
- note that the tests expect `MySimpleBst` to have **two** constructors, one of which accepts a `Comparator<T>` argument

### `MySimpleTreeMap<K, V>`

- your `MySimpleTreeMap<K, V>` needs to implement `SimpleMap<K, V>`
- note that K extends `Comparable<K>` in the interface. That means you need to tweak something when you declare your `MySimpleTreeMap` class....
- note that the tests expect `MySimpleTreeMap` to have **two** constructors, one of which accepts a `Comparator<K>` argument
- the tests expect a `depth` and `isBalanced` method in the `MySimpleTreeMap` class, but they are not part of the `SimpleMap` interface