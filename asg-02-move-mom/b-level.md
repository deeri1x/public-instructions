# B Level Overview

OK. Things get (more?) interesting now.

If you haven't done so already, [review what a fully-functioning B-level app](https://youtu.be/8oUPc_GZAJ0) should behave like.

## What's your plan?

You can't just jump into this - you need to figure out what to do here first. So I strongly recommend that you bounce your plan off of JP before you begin coding - you don't want to waste time going in a dead-end direction!

So yes, that means you should **literally talk to me - email, Meet, whatever - before you begin coding**.


## Tools at your disposal

To make this level work as planned, you'll need some tools.

### the key piece: your SimpleBstTreeMap

Since you've completed up to the C+ level to get here, that means you have a fully-functioning, balanceable TreeMap. You'll need it. You just have to figure out what keys and values to add to it!

### things JP has provided that could be used at this level

You can read the provided docs to figure these out.

#### `main.datastructs.ExplodingIndexablePluckableQueue`

It's been modified to include a new method:

```java
/**
 * Returns all the items in this EIPQ in head-> tail order.
 *
 * @return a List containing all the items in this EIPQ in head to tail order
 */
public List<T> contents()
```

#### `main.utils.Permutations`

Definitely need this. It helps you generate all possible columns of a given length. 

#### `main.utils.Stopwatch`

Optional. You can use this to time how long things take and display useful messages.

#### `main.utils.TextBoxUtil`

Optional. Provides a way to put a "box" around text.

