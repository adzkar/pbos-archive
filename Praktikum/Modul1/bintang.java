import java.util.Scanner;

class Bintang {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = n;i > 0;i--) {
      for (int j = i;j > 0;j--)
        System.out.printf("*");
      System.out.printf("\n");
    }
  }
}
