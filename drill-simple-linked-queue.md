# Drill - Simple Linked Queue

_(aka SlinkyQueue)_


**Accept this project by going here:** https://classroom.github.com/a/mNawfq_T


## Caution!

This drill requires that you've completed the [Two-Ended List drill](https://github.com/MRU-CSIS-2503-202101-001/public-instructions/blob/main/drill-two-ended-list.md) first, so don't start this drill unless you've finished that one!

## Preamble

This is just a plain old linked-list-backed queue. The only twist is that it uses `Optional<T>`. (Remember Optional? Sure you do - 'cause you watched [the screencast](https://youtu.be/mrcdif-txak).)


Here are some details about the class - `SimpleLinkedQueue` - that you will be making.

- it will be generic...so you can toss whatever reference type you want in it.
- it should never be full, so if asked `isFull` it will always reply false.
- when you dequeue things, they will be wrapped in an Optional; if you try to dequeue something from an empty `SimpleLinkedQueue`, you'll get an empty Optional back. Contrast that to our `ChibiLinkedStack`, which threw a NoSuchElementException.
- it should use your `TwoEndedSll` under the hood (as one of its instance variables). 


## Skills Covered

Show you can...

- [ ] make a linked-list-backed Queue implementation.
- [ ] use the basic features of `Optional`, like `get`, `of`, `isPresent`, `isEmpty`, and `empty`.


## Instructions

1. Copy your **working** `TwoEndedSll.java` file from that drill to the `main` package of this drill's Eclipse project.

    > _Note from JP:_  
    > _You can do this easily in Eclipse by dragging the `TwoEndedSll.java` file from your `drill-two-ended-sll` project to the `main` package in your `drill-simple-linked-queue` project **while holding down the ctrl key**. If you forget to hold down the ctrl key, you'll move the file instead of copy it, which will make you sad._

2. Create a `SimpleLinkedQueue<T>` class that implements the given `PlainOldQueue` interface. The behaviour of `SimpleLinkedQueue<T>` is described in the [Preamble](#preamble):
   1. Use your `TwoEndedSll` class to get this job done - you should be pleasantly surprised at how quickly this goes, because `TwoEndedSll` does all the heavy lifting!
   2. if all the `SimpleLinkedQueue` tests are passing, you can consider your `SimpleLinkedQueue` to be working okay!
3. Complete the `App.java` run method so that when you run `Main.java`, the program behaves as expected by the `MainTests`.  
     1. I've added some useful methods in `App.java` to make your life easier.


## Example Run

Here is an example run of a working solution (user input in **bold**):


> Hi! I'm the Simple Linked Queue app!  
If you enter a + followed by an integer, I will add that number to the queue.  
If you enter a -, I will remove a number from the head of the queue.  
>  
> I will show you the contents of the queue after every operation.  
> I will stop when you enter an empty line.  
Ready? Start entering numbers!   
> \> +9  
H->[9]<-T  
>  
> \> +11  
H->[9, 11]<-T  
>  
> \> -  
H->[11]<-T  
>  
> \> +9292  
H->[11, 9292]<-T  
>  
> \> -  
H->[9292]<-T  
>  
> \> -  
H->[]<-T  
>  
> \> -  
H->[]<-T  
>  
> \>   
Done now! Thanks!


## Hints

- I'm serious when I say that this should be quick...you only need 7 methods (including the constructor, which is technically optional), 4 of which are one-liners! The longest bit of code you need here is like 5 lines, and it's a simple if/else. If you are writing a lot of code, reach out to JP.