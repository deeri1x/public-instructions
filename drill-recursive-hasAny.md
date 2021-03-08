# Drill - Recursive hasAny

_(aka Hello? Is there anybody in there?)_

**Accept this project by going here:** https://classroom.github.com/a/ClqN4koU

## Preamble

Not much to preamble on about here - you're gonna write a little utility class that uses recursion to see if at least one thing that matches a certain Comparator-based condition exists in a collection. 

You'll do two versions of this method: one that accepts an array and one that accepts a linked list (I'll supply the list!).


## Skills Covered

Show you can...

- [ ] implement recursive methods.
- [ ] design and code recursive algorithms over lists.


## Instructions

1. Complete the `MyUtil` class methods marked with a `// TODO`.
   
   > _I should probably done some exception handling for the utils, but holy crap am I getting tired of making drills - nearly as much as you might be of making them?!?! Maybe! In any case, forgive my foray into laxness._
   
   1. if all the `MyUtil_hasAny_In_Array_Tests` and `MyUtil_hasAny_In_Linked_List_Tests`tests pass, you're done.
  


## Example Run

No example run for this one - all testing is done through unit tests.

## Hints

- For the `SimpleList` version of `hasAny`, you'll need to use the `first()` and `rest()` methods that are documented in the `SimpleList` interface documentation.
- Use the "public recursive wrapper + private recursive method" style of recursive coding here. I've gotten you started with the outline of the public wrappers....
