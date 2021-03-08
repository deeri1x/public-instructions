# Drill - BST Level-Order Traversal

_(aka Descending Into Madness, Level by Level)_

**Accept this project by going here:** https://classroom.github.com/a/PfkkubZT

## Preamble

Last hop.

Although the In-Order Traversal of a BST is kinda cool (how it traverses the BST in ascending order, so to speak), there's nothing like a good Level-Order Traversal to get the blood flowing.

(In all seriousness, a level-order traversal is equivalent to something called a _breadth-first search_ and that sucker pops up frequently when solving a variety of interesting problems, especially in a little branch of fun called Graph Theory. See [here](https://en.wikipedia.org/wiki/Breadth-first_search#Applications).)

One of the easier ways to implement a level-order traversal is by using...wait for it...a Queue! Who would have thunk it?

You can find a good implementation of a breadth-first traversal (which you can use as the basis for your Iterator) here at my old pal Baeldung: https://www.baeldung.com/java-binary-tree#2-breadth-first-search

You should toss a link to the site if you do decide to use the code there.


## Skills Covered

Show you can...

- [ ] traverse a tree in a variety of ways. (well, one particular way, here)
- [ ] implement an `Iterator<E>`.


## Instructions


1. Add your `MySimpleBst` from assignment 2 (or from the BST Removals Drill) to the `main` package and them make sure it implements the `SimpleBst` interface. (This should just mean implementing `levelOrderIterator`!)

  > _Since I'm not sure what order you'll do the last two drills, I didn't add `remove` to the interface. That means if you are using a working `MySimpleBst` from the other drill, you'll probably get some barking about your `@Overrides` on the `remove`. Just get rid of the method - or the `@Overrides` - and you'll be fine._
  
  > _As mentioned in the Preamble, you might find this very easy to do if you use a Queue. Feel free to use a Queue you've made, or grab one from the JDK._
  
  > _I think it's easier to do this iteratively instead of recursively, but your mileage may vary._

   1. Yep. Pass the tests and you're done. Le whee!
  

## Example Run

No example run for this one - all testing is done through unit tests.

