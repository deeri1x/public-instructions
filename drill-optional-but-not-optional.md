# Drill - Optional But Not Optional

_(aka That's Not An Option)_

Estimated completion time: 40 minutes

**Accept this project by going here:** https://classroom.github.com/a/bdgnaKKJ



## Preamble

Optionals came out with Java 8 and they haven't gotten enough lovin' from our Prog 3 instructors IMO. So I figured I'd change that.

(Plus, they're on assignment one, so a little bit of practice seems useful.)

There's not an awful lot of code to do here, but if you didn't watch the screencast on Optional, it'll take a while. Ditto if you're rusty on Exceptions.

## Special Warning

As mentioned in the [More generics screencast](https://youtu.be/FLVZzE-Rhn4?t=142), I've decided to turn some compiler warnings back on, so you're going to see extra warnings show up (they'll be labelled as type`Java Problem`). **These warnings have no effect on your mark - I only care about the PMD and Checkstyle warnings.**

## Skills Covered

Show you can...

- [ ] use the basic features of `Optional`, like `get`, `of`, `isPresent`, `isEmpty`, and `empty`.
- [ ] determine the methods to create for a class by the tests available for that class.
- [ ] determine the code to write by observing how a finished product works.


## Instructions

1. Complete the `ExceptionThrowingList<T>` class by doing the `// TODOs`
   1. There's only one method to complete - `findBiggest`. Read its docs and tests to get this done correctly.
   2. if the `ExceptionThrowingList_Find_Biggest_Tests` tests all pass, you can consider your `ExceptionThrowingList` done.
2. Now do the same kind of thing for `OptionalReturningList`.
3. Complete the `App.java` run method so that when you run `Main.java`, the program behaves as expected by the `MainTests`.  


## Example Runs

Here is an example run of a working solution when the user just hits Enter right away:

> Enter in a list of zero or more ints, separated by whitespace: 
>  
> Didn't find a darn thing in the OptionalReturnList. Sad now.  
> Didn't find a darn thing in the ExceptionThrowingList and got this dang exception: You can't findBiggest when it's empty.


Here is an example run of a working solution (user input in **bold**):

> Enter in a list of zero or more ints, separated by whitespace: **19 54 383**  
>
> Found me the biggest in the OptionalReturnList! It's: 383  
> Found me the biggest in the ExceptionThrowingList! It's: 383



