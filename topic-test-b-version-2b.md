# Topic Test B - Version 2B

**Accept this project by going here:** *link will be given by JP in Discord*

**TIME ALLOWED:** 50 minutes  

## WARNING!

I'm assuming you've completed the prereqs that were announced on Blackboard and that were also part of the Practice Test. If you _haven't_ completed them...well, I guess you should go do that now?

They're here: https://github.com/MRU-CSIS-2503-202101-001/topic-test-b-prereqs

You **MUST** complete the steps in the Readme before attempting this test! 


## Warning, Part Deux

For this coding test, you're going to eat your own dog food. Less colloquially, this means **you cannot use any data structures other than the following in the methods you create:**

- ArrayBackedStack
- ListBackedStack
- ArrayBackedQueue
- ListBackedQueue

If you violate this rule, you'll be penalized by having your mark on this test go down to a D (unless it's already below a D, in which case, you get to keep your grade).


## Skills Assessed

You will show that you can, under time-pressure:

- [ ] solve a problem using a Stack.
- [ ] solve a problem using a Queue.
- [ ] use a Comparator to solve a problem.
- [ ] implement a Comparator.

## Hints & Suggestions Before You Begin

- log into GitHub
- open up the folder where you keep your Eclipse projects in Windows Explorer / Mac Finder
- have a Git Bash (Windows) / Terminal (Mac) open in the location where you keep your Eclipse projects
- have Eclipse open and ready to roll
- close any other open projects in Eclipse
- stay focused on one task at a time; it is really easy to get intimidated and/or lost in code if you stop focusing!
- get things compiling, even if you have to stub things out; it'll both increase your mark and also get your tests running...which is also important to your mark

## Instructions

> _**Important Note**  
>  Because of how the submission system works, if you have any classes that DON'T compile, the results of your submission won't show your tests behaving the same way as they do in Eclipse. So try really hard to get your classes to compile, even if you have to stub out some things!_

**You have to do step 1 first; you can do steps 2 and 3 in any order you wish.**

1. Copy all source files from the `topic-test-b-prereqs` project into the `main` package of your test project.
2. Complete the 1 method in the `QueueUtils` class, following the instructions in the `// TODO`.
2. Complete the 1 method in the `StackUtils` class, following the instructions in the `// TODO`.

    > _Because these are static methods, if you wish to create any helper methods, those helper methods should be `private` and `static`._
  
    1. If you have completed the 2 methods correctly, all the associated tests should pass.


## Where are the Main Tests?

There are none! All the tests in this test are unit tests.


## Marks

> **Note**  
> Checkstyle and PMD warnings only have a bearing on your mark if your work is the A range, so don't worry about them unless everything is compiling and all your tests are running green! 

### Grade: F

- no attempt, or the code present is wildly incorrect

### Grade: D

- few, if any, files compile - but there is enough code present that the instructor can see that the student was at least on the right track 

### Grade: C range

- no compilation problems
- neither method has ***all*** its associated tests passing, but at least **_some_** tests are passing
- where you fall in this range will be a judgement call

### Grade: B range

- no compilation problems
- one of the two methods is passing all its related tests; the other method is passing at least _some_ of its related tests; where you fall in B range depends on how many "some" is!

### Grade: A range

- no compilation problems
- no tests with errors or failures
- the number of checkstyle and pmd warnings present determines where in this range you are:
  - no warnings: A+
  - 1 or 2 warnings: A
  - 3 or more warnings: A-