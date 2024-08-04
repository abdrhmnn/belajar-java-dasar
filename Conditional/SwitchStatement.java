package Conditional;

public class SwitchStatement {
  public static void main(String[] args) {
    // kondisi sederhana dari if else ( khusus untuk perbandingan == )
    int nilai = 10;

    switch (nilai) {
      case 10:
        System.out.println("nilai " + nilai);
        break;
      case 15:
      case 20:
        System.out.println("nilai kegedean!");
        break;
      default:
        System.out.println("bukan nilai nih!");
        break;
    }
  }
}
