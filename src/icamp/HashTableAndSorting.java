package icamp;

import java.util.HashSet;
import java.util.Set;

public class HashTableAndSorting {
  public static void main(String[] args) {
    int[] arr = new int[] {4, 0};
    int target = 4;
    findPair(arr, target);
  }

  private static void findPair(int[] arr, int target) {
    Set<Integer> set = new HashSet<Integer>();
    for (int elem : arr) {
      if (set.contains(target - elem)) {
        System.out.println(elem + " , " + (target - elem));
        return;
      }
      set.add(elem);
    }
  }
}
