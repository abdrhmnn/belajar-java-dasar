package Loop;

public class BreakContinue {
  // break -> untuk menghentikan case switch dan perulangan
  // continue -> untuk menghentikan perulangan sementara sesuai kondisi tertentu dan akan lanjut ke next loop
  public static void main(String[] args) {
    int nilai = 0;
    while (nilai < 10){
      if(nilai % 2 == 0){
        continue;
      }

      if(nilai == 2){
        break;
      }

      System.out.println(nilai);
    }
  }
}
