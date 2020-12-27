# Drill - Arrays Speedrun

_(aka What the Cluck?!?)_

## Preamble

A speedrun is meant to practice running through some basic skills as quickly as possible. Unlike non-speedrun drills, where you're typically asked to build a custom class and then "drive" it a bit, a speedrun drill is meant to be done solely in your `public static void main`.

## Time Required

I used a stopwatch and recorded the times I required when doing this drill:

1. getting the accepted GitHub repo contents into Eclipse: **00:41**
2. coding a solution to the point that it was passing all tests and had no Checkstyle/PMD issues: **10:17**
3. getting the completed project back up to the GitHub repo and confirming it's there: **00:36**
4. submitting the repo, waiting for that process to complete,  and looking at the result: **01:24**

For steps 1, 3, and 4, you should definitely aim to meet - or beat! - these times eventually. (For the first few drills, you will be understandably slower, as you're not used to "the process".)

As for step 2, you shouldn't expect to meet the time - after all, I wrote the dang thing, so I'm nauseatingly familiar with what needs to be done. But taking 3x as much time (so about **30 minutes**) should definitely be within your grasp.


## Instructions

1. Complete the **//TODO** entries in the `main` method in the `Main` class provided, using the documentation to guide you.
   1. If you have completed the tasks properly, you will pass all the tests in `MainTests`.
   2. You might find it useful to run your main if your tests aren't passing. Here is an example of a correctly working main (user input in **bold**):

---

How many chickens do you need? **3**  

Spinning up an array to hold exactly 3 chickens...  
...and spinning up a same-sized array to hold egg counts...  

Here's what's currently in our Chicken array:   
[null, null, null]  

And here's what's currently in our egg-count array:   
[0, 0, 0]  

Let's add us a chicken!  

Name of bird? **Henny Penny**  

Which index to use (0-2)? **0**  

Adding Henny Penny into slot 0...  
...and adding the number of eggs she laid into the egg count array at the same index.  

Now here's what's in our Chicken array:   
[Henny Penny, null, null]  

And here's what's in our egg-count array:   
[11, 0, 0]  

---

> **Crud you gotta deal with**
> - the name can have spaces in it, so choose your Scanner method appropriately
> - when you ask what index to use, you have to calculate that correctly
> - you'll need to read `Chicken`'s public methods (aka its _public interface_) to figure out how to get the number of eggs it lays


## Tests

> *Since this is the first week of drills, I'll explain in detail what's going on with testing. After the first week, I'll assume you're cool with it.*

Your code is being tested through `MainTests.java`. Although it looks kinda scary, all that's going on is this:

1. The test is told what things to "type" when prompted by your `main` code. For example, in the "Big Red" test, the things "typed" will be: **10**, **Big Red**, and **3** - in that order.
2. The test then runs the main, "typing" its input and observing what comes out in the console. That output is checked line-by-line with the Strings you see in the `List.of` part of the test. Your output has to match these Strings **exactly** - the order, spelling, and even capitalization all have to match for the test to pass. Using the `Compare Actual With Expected Test Result` mini-button is a **lifesaver** here!



