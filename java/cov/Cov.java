package cov;
public class Cov {
  public static void main(String[] args) {
    if (args.length == 1) {
      if (Boolean.parseBoolean(args[0])) {
        System.out.println("Boolean.parseBoolean returned true");  // line 6
      } else {
        System.out.println("Boolean.parseBoolean returned false"); // line 8
      }
    }
  }
}
