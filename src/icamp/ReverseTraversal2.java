package icamp;

import java.util.Arrays;

public class ReverseTraversal2 {
  public static void main(String[] args) {
    int[] arr = new int[] {1, 2, 5, 6, 8, 10, -1, -1, -1, -1};
    int realLength = 6;
    System.out.println(Arrays.toString(doubleEven(realLength, arr)));
  }

  private static int[] doubleEven(int realLength, int[] arr) {
    int endIdx = arr.length - 1;
    int eleEnd = realLength - 1;
    while (eleEnd >= 0) {
      if (arr[eleEnd] % 2 == 0) {
        // move this elem twice to end
        arr[endIdx] = arr[eleEnd];
        endIdx--;
      }
      arr[endIdx] = arr[eleEnd];
      endIdx--;
      eleEnd--;

    }
    return arr;
  }
}
