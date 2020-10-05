package icamp;

import java.util.Arrays;

public class ReverseFromBothEnd {
  public static void main(String[] args) {
    int[] arr = new int[] {1, 2, 5, 6, 8, 10, -1, -1, -1};
    System.out.println(Arrays.toString(reverseArr(arr)));
  }

  private static int[] reverseArr(int[] arr) {
    int start = 0, end = arr.length - 1;
    while (start < end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
    return arr;
  }
}
