public class Skipapple {
  static String appleS(String up) {
    if (up.isEmpty()) {
      return "";
    }
    if (up.startsWith("apple")) {
      return appleS(up.substring(5));
    } else {
      char ch = up.charAt(0);
      return ch + appleS(up.substring(1));
    }
  }

  public static void main(String[] args) {
    String word = "hiapplejuice";
    System.out.println(appleS(word));
  }

}
