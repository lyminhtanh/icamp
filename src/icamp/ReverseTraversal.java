package icamp;

public class ReverseTraversal {
  public static void main(String[] args) {
    System.out.println(reverseString("I have a string"));
  }

  private static String reverseString(String str) {
    StringBuilder builder = new StringBuilder();
    int endIndex = str.length();
    for (int i = str.length() - 1; i >= 0; i--) {
      if (str.charAt(i) == ' ') {
        builder.append(str.substring(i + 1, endIndex));
        endIndex = i;
        builder.append(' ');
      }
      if (i == 0) {
        builder.append(str.substring(i, endIndex));
      }
    }
    return builder.toString();
  }
}
