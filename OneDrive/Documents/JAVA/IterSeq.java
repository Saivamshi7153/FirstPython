import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IterSeq {
  static List<List<Integer>> iSeq(int[] arr) {
    Arrays.sort(arr);
    int start = 0;
    int end = 0;
    List<List<Integer>> outer = new ArrayList<>();
    outer.add(new ArrayList<>());
    for (int i = 0; i < arr.length; i++) {
      start = 0;
      if (i > 0 && arr[i] == arr[i - 1])
        start = end - 1;
      end = outer.size() - 1;
      int n = outer.size();
      for (int j = start; j < n; j++) {

        ArrayList<Integer> internal = new ArrayList<>(outer.get(i));
        internal.add(j);
        outer.add(internal);

      }
    }
    return outer;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 2 };
    List<List<Integer>> ans = iSeq(arr);
    for (List<Integer> list : ans) {
      System.out.println(list);
    }
  }
}
