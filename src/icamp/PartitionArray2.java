package icamp;

import java.util.Arrays;

// You're given a list of Marbles. Each marble can have one of 3 colors (Red, White or Blue).
// Arrange the marbles in order of the colors (Red -> White -> Blue).
// Colors are represented as follows:
// 0 - Red
// 1 - White
// 2 - Blue
public class PartitionArray2 {
  public static void main(String[] args) {
    int[] arr = new int[] {1, 2, 0, 2, 1, 0, 2, 1};
    System.out.println(Arrays.toString(groupColors(arr)));
  }

  private static int[] groupColors(int[] arr) {
    int red = 0;
    int blue = arr.length - 1;
    int i = 0;
    while (i < blue) {
      if (arr[i] == 0) {
        swap(arr, red, i);
        red++;
        i++;
      } else if (arr[i] == 2) {
        swap(arr, blue, i);
        blue--;
      } else if (arr[i] == 1) {
        i++;
      }
    }
    return arr;
  }

  private static void swap(int[] arr, int boundary, int i) {
    int temp = arr[i];
    arr[i] = arr[boundary];
    arr[boundary] = temp;

  }

}
