# Drill - Super Easy Sealegs

**(aka Hit the Ground Running)**

**Accept this project by going here: **

## Preamble

Since the drills, coding topic tests, assignments, and coding portion of the final exam all use the same basic system, it's super-important that you get comfortable using it - pronto!

Unless you were in last Fall's 1502 section, this is going to be new to you.

## Time Required

I used a stopwatch and recorded the times I required when doing this drill:

1. getting the accepted GitHub repo contents into Eclipse: **00:41**
2. coding a solution to the point that it was passing all tests and had no Checkstyle/PMD issues: **10:17**
3. getting the completed project back up to the GitHub repo and confirming it's there: **00:36**
4. submitting the repo, waiting for that process to complete,  and looking at the result: **01:24**

For steps 1, 3, and 4, you should definitely aim to meet - or beat! - these times eventually. (For the first few drills, you will be understandably slower, as you're not used to "the process".)

As for step 2, you should be able to get it done easily within **10 minutes**.

## Instructions

1. Complete the single **//TODO**  in the `main` method in the `Main` class provided, using the documentation to guide you.
   1. If you have completed the task properly, you will pass all the tests in `MainTests`.
   2. You might find it useful to run your main if your tests aren't passing. Here is an example of a correctly working main:

---

2503

---


## Tests

> *Since this is the first week of drills, I'll explain in detail what's going on with testing. After the first week, I'll assume you're cool with it.*

Your code is being tested through `MainTests.java`. Although it looks kinda scary, all that's going on is this:

1. The test is told what things to "type" when prompted by your `main` code. For this drill, there is no input, but for all future ones, there will be.
2. The test then runs the main, "typing" its input and observing what comes out in the console. That output is checked line-by-line with the Strings you see in the `List.of` part of the test. Your output has to match these Strings **exactly** - the order, spelling, and even capitalization all have to match for the test to pass. Using the `Compare Actual With Expected Test Result` mini-button is a **lifesaver** here!

## Submission

To get a mark, you need to submit your code via the system in place on GitHub. This is a 2-step process:

1. Get your code from your local machine to your GitHub repository for this drill:
   1. Open up a command line in the root of the folder that holds your imported Eclipse project. From there:
   
      ```git
      git add --all
      git commit -m "Submitting my project"
      git push
      ```
    2. Confirm that your code has made it into your GitHub repo by checking `src/main`.
2. Use the `Run workflow` button in the `Actions` tab. When prompted, enter your **MRU USERNAME** (for example, jbond007). 
   1. Wait until the process is completed; when it is, you can check your results under the `Issues` tab. (It will be the most recent issue titled **A summary report of your submission was created**.)
   2. Ideally, the contents of your report will show no problems whatsoever, like this:

      ```
      [compilation]
      problems found: 0

      [checkstyle]
      violations found: 0

      [pmd]
      violations found: 0

      [junit errors]
      errors found: 0

      [junit failures]
      failures found: 0
      ```
