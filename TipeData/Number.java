package TipeData;

public class Number {
  // by default kedua tipe ini value nya adalah 0

  // dibagi menjadi 2 :
  // Integer number (bilangan bulat): byte, short, int, long (bedanya di ukuran minimum dan maksimum nya)
  // Floating number: float, double (bedanya juga di ukuran min dan max)

  // byte (1 byte)
  // -128 - 127

  // short (2 bytes)
  // -32,768 - 32,767

  // int (3 bytes)
  // -2,147,483,648 - 2,147,483,647

  // long (4 bytes)
  // -9,223,372,036,854,775,808 - 9,223,372,036,854,775,807

  byte iniByte = 100;
  short iniShort = 10_000;
  int iniInt = 1_000_000;
  long iniLong = 100L;

  // float (4 bytes)
  // 3.4e - 038

  // double (8 bytes)
  // 1.7e - 308

  float iniFloat = 2.7F;
  double iniDouble = 1.5;

  // --------------------------------------------

  // KONVERSI TIPE DATA NUMBER
  // WIDENING CASTING (Otomatis diubah oleh Java asalkan mengikuti urutan dibawah ini):
  // byte -> short -> int -> long -> float -> double

  // NARROWING CASTING (Konversi Manual oleh kita sendiri)
  // double -> float -> long -> int -> short -> byte

  float iniKonversiKeFloat = (float) iniDouble;
  short iniKonversiKeShort = (short) iniLong;
  byte iniKonversiKeByte = (byte) iniFloat;
}
