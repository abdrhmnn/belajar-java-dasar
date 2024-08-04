package TipeData;

public class ContohArray {
  // kumpulan data dgn tipe yang sama

  public static void main(String[] args) {
    String[] nama;
    nama = new String[3];

    nama[0] = "Abdu";
    nama[1] = "Abdu 2";
    nama[2] = "Abdu 3";

    // array initializer
    int[] umur = new int[]{
      10, 20, 30
    };

    long[] umur2 = {
      200, 10000, 2030303
    };

    // multidimentasi
    String[][] nama2 = {
      {"Eunha", "Umji"},
      {"Yuju", "SinB"},
      {"Sowon", "Yerin"}
    };

    System.out.println(umur.length);
    System.out.println(umur2[0]);
    System.out.println(nama2[1][1]);
  }
}
