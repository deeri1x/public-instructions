# Bug/Change List

Bugs & changes here!

## 2021-03-24

### CHANGE

I forgot to add explicit tests of the behaviour of the BSTs when they use the constructor that takes in a Comparator! (I _implicity_ test that in some of the Map tests...but that's not helping anybody, is it?)

Please add [this additional test](bugfix-files/MySimpleBst_Inorder_Iterator_With_Comparator_Tests.java) to your Eclipse project's `test.c.minus.level` package.

I am NOT adding this to the tests that are run by the submit process on GitHub - I'm providing it here for your own sanity's sake.


## 2021-03-14

### BUG

When you submit on GitHub, you might be getting weird messages about no compilations being found...but the Checkstyle and JUnit portions of your summary report say "something bad happened". Here is what's going on and what to do to fix it:

1. The `submit.yml` file in `.github/workflows` is not correct. Please replace the contents of the one you have with the one [here](bugfix-files/submit.yml)
2. The submission script expects at least *something* in the main package. Please add a simple `Main.java` there - it can even be as simple as this:

```java
public class Main {}
```