package TipeData;

public class BukanPrimitif {
  // tipe data primitif adalah tipe data bawaan dari bahasa pemrograman, seperti :
  // char, int, short, long, double, float, byte

  // tipe data bukan primitif adalah tipe data yg tidak memiliki nilai default dan bs bernilai null
  // tipe data bukan primitif memiliki method, by default tipe data ini value nya adalah null
  // di Java setiap data primitif mempunyai representasi tipa data bukan primitif nya, seperti :
  // String, Char, Integer, Short, Long, Double, Float, Byte

  Integer umur = 10;
  Byte angka = 100;
  Char c = null;

  // konversi dari primitif ke bukan primitif
  float angka2 = 10.9F;
  Float konversiPrimitif = angka2;

  // dari bukan primitif ke primitif tapi berbeda tipe data
  byte angka3 = konversiPrimitif.byteValue();
  short angka4 = konversiPrimitif.shortValue();
}
