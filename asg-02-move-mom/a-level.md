# A Level Overview

At this level, I need to see a fully-functional PEMM: a user should be able to enter in their dispenser configuration, Potions, Ingredient Pool and then ask Ma for help. 

If you haven't done so already, [review what a fully-functioning A-level app](https://youtu.be/9gIEfElbiAs) could look like. Yes, you can roll your eyes when my solution bugs out (I found the bug afterward, in my defence!)

## What's your plan?

You can't just jump into this - you need to figure out what to do here first. So I strongly recommend that you bounce your plan off of JP before you begin coding - you don't want to waste time going in a dead-end direction!

So yes, that means you should **literally talk to me - email, Meet, whatever - before you begin coding**.

## What kind of moves do you need to evaluate?

The game rules require that you **must** make a regular pick (which may or may not trigger an explosion) and that you **may** ask for help - and that this help can come before or after your regular pick.

To make things more manageable, we're going to need to make some simplifications:

- you only have to evaluate the following kind of moves:
  - make one regular pick, or
  - make one help pick followed by one regular pick
- each column will have at most 9 marbles in it: 8 visible and 1 in the "peekable zone". You don't need to worry about the hidden marbles in the hopper - trust me, while interesting, adding those suckers into the mix makes things tres challenging!

## Things JP has provided that could be used

You don't have to use the following things, but you can if you want. Feel free to modify them to suit your needs. Some of them could use a little loving. And some are more well-documented than others. :)

### `main.gameparts.Dispenser`

### `main.gameparts.Potion`

### `main.gameparts.IngredientPool`

### `main.views.DispenserView`

