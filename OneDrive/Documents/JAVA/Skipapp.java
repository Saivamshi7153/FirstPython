
public class Skipapp {
  static String appS(String up) {
    if (up.isEmpty()) {
      return "";
    }
    if (up.startsWith("app") && !up.startsWith("apple")) {
      return appS(up.substring(3));
    } else {
      char ch = up.charAt(0);
      return ch + appS(up.substring(1));
    }
  }

  public static void main(String[] args) {
    String word = "hiapplejuiceapp";
    System.out.println(appS(word));
  }
}
