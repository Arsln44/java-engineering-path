/**
 * Reference Types (Referans Tipleri)
 * 
 * Java'da 2 tip veri vardır:
 * 1. Primitive Types (İlkel Tipler) - int, double, boolean, char, vb.
 * 2. Reference Types (Referans Tipleri) - String, Array, Class, vb.
 * 
 * Fark nedir?
 * - Primitive: Değeri direkt tutar (kutu içinde değer var)
 * - Reference: Değerin adresini tutar (kutu içinde adres var, değer başka yerde)
 */

public class ReferenceTypes {
    public static void main(String[] args) {
        
        // ============================================
        // 1. STRING - En Çok Kullanılan Reference Type
        // ============================================
        
        // String = Metin (birden fazla karakter)
        // Çift tırnak ("") kullanılır
        String isim = "Ahmet";
        String soyisim = "Yılmaz";
        String mesaj = "Merhaba Dünya!";
        
        System.out.println("İsim: " + isim);
        System.out.println("Soyisim: " + soyisim);
        System.out.println("Mesaj: " + mesaj);
        
        
        // String birleştirme (Concatenation)
        String tamIsim = isim + " " + soyisim;
        System.out.println("Tam İsim: " + tamIsim);
        
        
        // String metodları (hazır fonksiyonlar)
        System.out.println("\n--- String Metodları ---");
        System.out.println("Uzunluk: " + isim.length());              // Kaç karakter?
        System.out.println("Büyük harf: " + isim.toUpperCase());      // AHMET
        System.out.println("Küçük harf: " + isim.toLowerCase());      // ahmet
        System.out.println("İlk karakter: " + isim.charAt(0));        // A
        
        
        // ============================================
        // 2. PRIMITIVE vs REFERENCE - Temel Fark
        // ============================================
        
        System.out.println("\n--- Primitive vs Reference ---");
        
        // PRIMITIVE TYPE (İlkel Tip)
        int sayi1 = 10;
        int sayi2 = sayi1;      // sayi1'in DEĞERINI kopyalar
        
        sayi1 = 20;             // sayi1'i değiştir
        
        System.out.println("sayi1: " + sayi1);  // 20
        System.out.println("sayi2: " + sayi2);  // 10 (değişmedi!)
        
        /*
         * Primitive'de ne olur?
         * sayi1 kutusu: 10 → 20
         * sayi2 kutusu: 10 (bağımsız)
         */
        
        
        // REFERENCE TYPE (Referans Tipi)
        // Not: Array (dizi) bir reference type'dır
        int[] dizi1 = {1, 2, 3};
        int[] dizi2 = dizi1;    // dizi1'in ADRESİNİ kopyalar (değeri değil!)
        
        dizi1[0] = 99;          // dizi1'in ilk elemanını değiştir
        
        System.out.println("dizi1[0]: " + dizi1[0]);  // 99
        System.out.println("dizi2[0]: " + dizi2[0]);  // 99 (değişti!)
        
        /*
         * Reference'da ne olur?
         * dizi1 ve dizi2 aynı yeri gösterir!
         * Biri değişince diğeri de değişir.
         */
        
        
        // ============================================
        // 3. NULL - "Hiçbir şey" Değeri
        // ============================================
        
        System.out.println("\n--- NULL Kullanımı ---");
        
        // Primitive'ler null olamaz!
        // int sayi = null;  ❌ HATA!
        
        // Reference'lar null olabilir
        String sehir = null;    // Henüz bir değer atanmadı
        System.out.println("Şehir: " + sehir);  // null
        
        sehir = "İstanbul";     // Şimdi değer atandı
        System.out.println("Şehir: " + sehir);  // İstanbul
        
        
        // ============================================
        // 4. String Özel Durumu - String Pool
        // ============================================
        
        System.out.println("\n--- String Pool ---");
        
        // 1. Yöntem: String literal (tırnak içinde)
        String metin1 = "Merhaba";
        String metin2 = "Merhaba";
        
        // 2. Yöntem: new anahtar kelimesi ile
        String metin3 = new String("Merhaba");
        
        // == operatörü: Adresleri karşılaştırır
        System.out.println("metin1 == metin2: " + (metin1 == metin2));  // true (aynı adres)
        System.out.println("metin1 == metin3: " + (metin1 == metin3));  // false (farklı adres)
        
        // equals() metodu: İçerikleri karşılaştırır
        System.out.println("metin1.equals(metin3): " + metin1.equals(metin3));  // true (aynı içerik)
        
        /*
         * ÖNEMLİ: String karşılaştırırken MUTLAKA equals() kullan!
         * == kullanma, yanlış sonuç verebilir!
         */
        
        
        // ============================================
        // 5. Diğer Reference Types (Kısaca)
        // ============================================
        
        System.out.println("\n--- Diğer Reference Types ---");
        
        // Array (Dizi)
        int[] sayilar = {10, 20, 30};
        String[] isimler = {"Ali", "Ayşe", "Mehmet"};
        
        System.out.println("İlk isim: " + isimler[0]);
        
        // Wrapper Classes (Primitive'lerin Class halleri)
        Integer sayi = 100;         // int'in wrapper'ı
        Double ondalik = 19.99;     // double'ın wrapper'ı
        Boolean dogruMu = true;     // boolean'ın wrapper'ı
        
        System.out.println("Wrapper Integer: " + sayi);
        
        
        // ============================================
        // 6. Özet ve Önemli Notlar
        // ============================================
        
        System.out.println("\n✅ Reference Types konusu tamamlandı!");
        
        /*
         * PRIMITIVE vs REFERENCE - Hızlı Karşılaştırma:
         * 
         * PRIMITIVE:
         * - Değeri direkt tutar
         * - Küçük harf: int, double, boolean
         * - Null olamaz
         * - Daha hızlı
         * - 8 tane var
         * 
         * REFERENCE:
         * - Adres tutar (değer başka yerde)
         * - Büyük harf: String, Integer, Array
         * - Null olabilir
         * - Daha yavaş (ama genelde önemli değil)
         * - Sınırsız çeşit var
         */
        
        /*
         * STRING KULLANIM İPUÇLARI:
         * 
         * ✅ Karşılaştırma: equals() kullan (== değil!)
         * ✅ String literal tercih et: "Merhaba" (new String() yerine)
         * ✅ String metodları: length(), toUpperCase(), charAt(), vb.
         * ✅ + ile birleştirme: "Merhaba" + " " + "Dünya"
         */
        
        /*
         * NULL KULLANIMI:
         * 
         * ✅ Reference'larda kullanılır
         * ❌ Primitive'lerde kullanılamaz
         * ⚠️  null.metod() → NullPointerException hatası verir!
         */
        
    }
}