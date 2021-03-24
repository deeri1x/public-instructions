package test.c.minus.level;

import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import solution.datastructs.MySimpleBst;
import test.helpers.Snit;

@DisplayName("MySimpleBst Inorder Iterator With Comparator Tests")
public class MySimpleBst_Inorder_Iterator_With_Comparator_Tests {

  @Test
  @DisplayName("inorder iterator for a tree with two items")
  void inorder_iterator_for_a_tree_with_one_items() {
    Comparator<Snit> reverseHdComparator = Comparator.comparing(Snit::hd).reversed();
    MySimpleBst<Snit> bst = new MySimpleBst<>(reverseHdComparator);

    bst.add(Snit.SPEEDY); // 3HD
    bst.add(Snit.WHITNEY); // 12HD

    List<Snit> snitsFromIterator = new ArrayList<>();

    Iterator<Snit> iter = bst.inOrderIterator();

    while (iter.hasNext()) {
      snitsFromIterator.add(iter.next());
    }

    assertThat(snitsFromIterator).containsExactly(Snit.WHITNEY, Snit.SPEEDY);
  }

  @Test
  @DisplayName("inorder iterator for a tree with three items")
  void inorder_iterator_for_a_tree_with_three_items() {
    Comparator<Snit> reverseHdComparator = Comparator.comparing(Snit::hd).reversed();
    MySimpleBst<Snit> bst = new MySimpleBst<>(reverseHdComparator);

    bst.add(Snit.SPEEDY); // 3HD
    bst.add(Snit.WHITNEY); // 12HD
    bst.add(Snit.HAMMAH); // 11HD

    List<Snit> snitsFromIterator = new ArrayList<>();

    bst.inOrderPrinter();

    Iterator<Snit> iter = bst.inOrderIterator();

    while (iter.hasNext()) {
      snitsFromIterator.add(iter.next());
    }

    assertThat(snitsFromIterator).containsExactly(Snit.WHITNEY, Snit.HAMMAH, Snit.SPEEDY);
  }
}