package Expression;

public class Penjelasan {
  public static void main(String[] args) {
    // expressi -> satu single value, contohnya :
    int umur;
    umur = 20;

    // statement -> expression yang komplit yang diakhiri titik koma, contohnya :
    System.out.println(umur = 100);
    umur++;

    // block -> kumpulan statement yang berada didalam {}, contohnya :
    {
      System.out.println("Hello World 1");
      System.out.println("Hello World 2");
      System.out.println("Hello World 3");
    }
    
  }
}
