public class BackTr {
  static int solve(int arr[], int n, int idx, int prev) {
    if (idx == n)
      return 1;
    System.out.println(idx);
    System.out.println(prev);
    System.out.println(arr[idx]);
    return solve(arr, n, idx + 1, prev) + ((arr[idx] >= prev) ? solve(arr, n, idx + 1, arr[idx]) : 0);

  }

  public static void main(String[] args) {
    int arr[] = { 1, 8, 2 };
    System.out.println(solve(arr, 3, 0, Integer.MIN_VALUE));
  }
}
