package Loop;

public class DoWhileStatement {
  // sama seperti while hanya ada kondisi saja
  // hanya saja doWhile ini akan mengecek kondisi setelah perulangan dilakukan
  // kalo while sebelum perulangan dilakukan

  // doWhile akan execute perulangan sekali walaupun kondisi false
  public static void main(String[] args) {
    int nilai = 10;

    do{
      System.out.println("HELLOW");
      nilai++;
    }while(nilai < 10);
  }
}
