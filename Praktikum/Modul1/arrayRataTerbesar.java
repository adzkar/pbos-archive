import java.util.Scanner;

class arrai {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(), total = 0, terbesar = -1000;
    int[] arrai = new int[n];
    while(n-- > 0) {
      int x = sc.nextInt();
      arrai[n] = x;
      total += x;
      terbesar = (terbesar < x) ? x:terbesar;
    }
    System.out.printf("%d %d \n", (total/arrai.length), terbesar);
  }
}
