package Method;

public class Penjelasan {
  // block kode program yang akan berjalan saat dipanggil
  public static void main(String[] args) {
    sayHello("Abdu");
    hitung(20, 100);
    kalkulasi(0, 20, 30, 40, 100);

    // overload method
    kalkulasi(null, "Eunha", "Umji", "Sowon", "Umji");
  }

  static void sayHello(String nama){
    System.out.println("Hellow, " + nama);
  }

  // hanya bisa return satu value saja
  static int hitung(int angka1, int angka2){
    return angka1 + angka2;
  }

  // method dengan variabel argument (untuk menagkap argument dgn jumlah yg tidak pasti)
  // biasanya ditaro diakhir dri parameter
  static void kalkulasi(int hasil, int... angka){
    for (int i : angka) {
      hasil += i;
    }
  }

  // method overloading
  // nama bisa sama, parameter dan return harus BEDA (baik jumlah maupun tipe nya)
  static void kalkulasi(String nama, String... kumpulanNama){
    for (String name : kumpulanNama){
      System.out.println("Hellow, " + name);
    }
  }
}
