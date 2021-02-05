# Bug/Change List

- [2021.02.04] 
  - file: `Main.java`
  - fix: change `return new GraphicalMarbleColumnDisplay(column, inHand, inHandComparator);` -> `return new NullMarbleColumnDisplay(column, inHand, inHandComparator);`
  - notes: until you get your MarbleColumn working, nothing but the NullMarbleColumnDisplay will work without blowing up when you run main!