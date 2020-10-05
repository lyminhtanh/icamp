package icamp;

import java.util.Arrays;

// You are given an array of integers. Rearrange the array so that all zeroes are at
// the beginning of the array.
// For example,
// a = [4,2,0,1,0,3,0] -> [0,0,0,4,1,2,3]
public class PartitionArray {
  public static void main(String[] args) {
    int[] arr = new int[] {-4, -2, -1, 0, 3, 0, 0, 5};
    System.out.println(Arrays.toString(moveZerosToStartKeepNonZeroOrder(arr)));
  }

  private static int[] moveZerosToStart(int[] arr) {
    int boundary = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 0) {
        swap(arr, boundary, i);
        boundary++;
      }
    }
    return arr;
  }

  private static int[] moveZerosToStartKeepNonZeroOrder(int[] arr) {
    int boundary = arr.length - 1;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != 0) {
        swap(arr, boundary, i);
        boundary--;
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
