# C Level Overview

For this level, you'll be showing you can create a simple Map data structure.

- you must use the `MySimpleBst` class to create a class called `MySimpleTreeMap` that implements the `SimpleMap` interface provided in `main.interfaces`. (That is, you'll use your working `MySimpleBst` class as the backing data structure for your `MySimpleTreeMap`.)

    > _If you look through the SimpleMap interface and some of the C level tests, you'll see that there is mention of `MyMapEntry` - that class has been provided for you in `main.datastructs`._
    
- your `MySimpleTreeMap` class must pass all of the tests in the `test.c.level` package classes

## What's up with the extra constructor?

You might notice that there are **two** constructors required by the tests for `MySimpleTreeMap`. If the no-arg one is used, any insertions into the map use the **natural ordering of the keys** to determine where the added key/value pair goes. (This is why we require K to implement `Comparable<K>`.)

The second constructor - the one taking a `Comparator<K>` - creates a map that will use that comparator to determine where the key/value pairs go in the map.