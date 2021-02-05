# D Level Overview

OK. So you've shut the compiler up by writing a bunch of stubs. Now it's time to start doing the first bit of "real" work.

You have the following things to accomplish to clear this level:

- Answer the question in the first `// TODO` in the `App.java` file. It'll force you to do a bit of reading into Java Regular Expressions. I'm not expecting an essay here, folks. An example answer (that is technically incorrect, but still gives you a feel for what I'm looking for) might be *"VALID_TWO_ARG_PATTERN matches any word that has 3 digits at the end of it."* or *"VALID_ONE_ARG_PATTERN matches any word that contains a vowel."*
- Make all the tests in `test.d.level` package pass. To do this you will need to:
  - ~~complete the `displayMenu` method in `App.java` so that it behaves as stated in its documentation. There are just a few printlns and a conditional here; the only slightly tricky thing here is figuring out how to determine whether you should display the undo option or not....~~
    - [UPDATE Feb 05]: don't worry about the `App_Tests.java` test any more - in fact, delete it! **You will have to eventually complete the `displayMenu` method - but that can wait until the A level.
  - complete the `StartupEngine` class so that it behaves as stated in its documentation and passes its tests.