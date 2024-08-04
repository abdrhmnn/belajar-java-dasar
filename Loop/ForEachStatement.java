package Loop;

public class ForEachStatement{
  // untuk loop array
  public static void main(String[] args) {
    String[] nama = {
      "Abdu", "Eunha", "Umji"
    };

    for (String element : nama) {
      System.out.println("Nilai array: " + element);
    }
  }
}