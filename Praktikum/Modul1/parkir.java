import java.util.Scanner;
class parkir {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int jam_masuk = sc.nextInt(), menit_masuk = sc.nextInt(), jam_keluar = sc.nextInt(), menit_keluar = sc.nextInt(), selisih_menit = 0, cost = 0;
    if(menit_keluar < menit_masuk) {
      selisih_menit = (menit_keluar += 60) - menit_masuk;
      jam_keluar--;
    } else selisih_menit = menit_keluar - menit_masuk;
    cost = ((selisih_menit > 30) ? 3000:1000) + ((jam_keluar-jam_masuk)*3000);
    System.out.printf("%d jam %d menit %d \n", (jam_keluar-jam_masuk), selisih_menit, cost);
  }
}
