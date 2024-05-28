import java.util.ArrayList;

public class SubSeq {
  // static void findSeq(String p, String up) {
  // if (up.isEmpty()) {
  // System.out.println(p);
  // return;
  // }
  // char ch = up.charAt(0);
  // findSeq(p + ch, up.substring(1));
  // findSeq(p, up.substring(1));
  // }

  static ArrayList<String> seqRet(String p, String up) {
    if (up.isEmpty()) {
      ArrayList<String> list = new ArrayList<>();
      list.add(p);
      return list;
    }
    char ch = up.charAt(0);
    ArrayList<String> left = seqRet(p + ch, up.substring(1));
    ArrayList<String> right = seqRet(p, up.substring(1));
    left.addAll(right);
    return left;

  }

  public static void main(String[] args) {
    System.out.println(seqRet("", "ab"));
  }
}
