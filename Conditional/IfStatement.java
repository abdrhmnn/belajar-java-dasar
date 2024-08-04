package Conditional;

public class IfStatement {
  public static void main(String[] args) {
    // untuk percabangan
    int angka = 10;
    int angka2 = 20;
    
    if(angka < angka2){
      System.out.println("Hello");
    }else {
      System.out.println("What????");
    }

    if(angka < angka2){
      System.out.println("Hello");
    }else if (angka > angka2) {
      System.out.println("What????");
    }else{
      System.out.println("DUARRR");
    }

  }
}
