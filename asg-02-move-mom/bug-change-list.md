# Bug/Change List

Bugs & changes here!

## 2021-03-14

### BUG

When you submit on GitHub, you might be getting weird messages about no compilations being found...but the Checkstyle and JUnit portions of your summary report say "something bad happened". Here is what's going on and what to do to fix it:

1. The `submit.yml` file in `.github/workflows` is not correct. Please replace the contents of the one you have with the one [here](bugfix-files/submit.yml)
2. The submission script expects at least *something* in the main package. Please add a simple `Main.java` there.