# D Level Overview

At this level, I wanna see if you can build at least a _partially_ working Binary Search Tree from scratch.

To get past this level, the following must be true:

- you must create your own BinarySearchTree class called `MySimpleBst` that implements the `SimpleBst` interface provided in `main.interfaces`. You must use your own private static member `Node` class to accomplish this.

    > _Note that the interface require T to implement Comparable<`T`>._
    
- your `MySimpleBst` class must pass all of the tests in 6 or 7 of the test classes in the `test.d.plus.level` package

## What's up with the extra constructor?

You might notice that there are **two** constructors required by the tests for `MySimpleBst`. If the no-arg one is used, any insertions into the tree use the **natural ordering** of the elements in the tree to determine where the added element goes. (This is why we require T to implement `Comparable<T>`.)

The second constructor - the one taking a `Comparator<T>` - creates a tree that will use that comparator to determine where elements go in the tree.