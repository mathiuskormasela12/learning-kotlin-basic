fun main() {
  // ========== Number ==========
  // Tipe data bilangan bulat
  // 1. Byte
  var tipeDataByte: Byte = 10;
  println(tipeDataByte);
  // 2. Short
  var tipeDataShort = 20;
  println(tipeDataShort);
  // 3. Int
  var tipeDataInt: Int = 30;
  println(tipeDataInt);
  // 4. Long
  var tipeDataLong: Long = 90L;
  println(tipeDataLong);

  // ========== Floating Point ==========
  // Tipe data bilangan pecahan/desimal
  // 1. Float
  var tipeDataFloat: Float = 30.5f;
  var tipeDataFloat2: Float = 30.5F;
  println(tipeDataFloat);
  println(tipeDataFloat2);
  // 2. Double
  var tipeDataDouble: Double = 30.7;
  println(tipeDataDouble);

  // ========== Konversi Tipe Data Number ==========
  var angka1: Short = 10;
  var angka2: Byte = angka1.toByte(); // Konversi ke Byte
  var angka3: Short = angka2.toShort(); // Konversi ke Short
  var angka4: Int = angka3.toInt(); // Konversi ke Int
  var angka5: Long = angka4.toLong(); // Konversi ke Long

  // ========== Character
  // Tipe data single character
  // Harus pakai tanda petik satu
  var txt: Char = 'O';
  println(txt);

  // ========== Booloean
  // Tipe data boolean
  var merried: Boolean = false;
  var merried2: Boolean = true;
  println(merried);

  // ========== String
  // Tipe data kumpulan karakter
  // Mesti pake double qoutes
  var firstName: String = "Mathius"; // single line
  var lastName: String = "Kormasela"; // single line
  println(firstName + " " + lastName);
  var fullName: String = """Mathius 
    Kormasela"""; // multi line
  println(fullName);
  // Trim String ketika multiline
  var trimmedText: String = """Android
    ?Studio
  """.trimMargin("?"); // prefix default nya itu tanda pipe (|), klo pake default gk perlu tulis di parameter function trimMargin function
  println(trimmedText)

  // ========== String Interpolation
  // Pake ${} agar bisa interpilasi lebih bebas, bisa pake expression.
  // klo $ biasa dia cuma cetak value variable doank.
  var data1: String = "$firstName $lastName. Length = ${fullName.length} ${2 * 2}";
  println(data1);
}