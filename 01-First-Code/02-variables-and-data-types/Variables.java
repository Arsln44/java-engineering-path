/**
 * Variables (Değişkenler) ve Veri Tipleri
 * 
 * Değişken nedir?
 * - Bilgisayarın hafızasında değer saklayan kutu
 * - Her değişkenin bir ismi ve tipi vardır
 * 
 * Syntax (Yazım Kuralı):
 * tip isim = değer;
 */

public class Variables {
    public static void main(String[] args) {
        
        // ============================================
        // 1. int - Tam Sayılar (Tamsayı)
        // ============================================
        // Örnek: Yaş, adet, skor
        int yas = 25;                    // Yaş bilgisi
        int ogrenciSayisi = 30;          // Sınıftaki öğrenci sayısı
        int skor = 100;                  // Oyun skoru
        
        System.out.println("Yaş: " + yas);
        System.out.println("Öğrenci Sayısı: " + ogrenciSayisi);
        
        
        // ============================================
        // 2. double - Ondalıklı Sayılar
        // ============================================
        // Örnek: Fiyat, boy, kilo, sıcaklık
        double fiyat = 19.99;            // Ürün fiyatı (TL)
        double boy = 1.75;               // Boy (metre)
        double sicaklik = 23.5;          // Sıcaklık (derece)
        
        System.out.println("Fiyat: " + fiyat + " TL");
        System.out.println("Boy: " + boy + " metre");
        
        
        // ============================================
        // 3. boolean - Doğru/Yanlış (true/false)
        // ============================================
        // Örnek: Açık/kapalı, var/yok, evet/hayır
        boolean ogrenciMi = true;        // Öğrenci misin?
        boolean evliMi = false;          // Evli misin?
        boolean yagmurYagiyorMu = true;  // Yağmur yağıyor mu?
        
        System.out.println("Öğrenci mi? " + ogrenciMi);
        System.out.println("Yağmur yağıyor mu? " + yagmurYagiyorMu);
        
        
        // ============================================
        // 4. char - Tek Karakter
        // ============================================
        // Tek tırnak ('') kullanılır!
        char not = 'A';                  // Ders notu
        char cinsiyet = 'E';             // Cinsiyet (E/K)
        char sembol = '@';               // Özel karakter
        
        System.out.println("Not: " + not);
        System.out.println("Cinsiyet: " + cinsiyet);
        
        
        // ============================================
        // 5. Diğer Sayı Tipleri (Daha Az Kullanılır)
        // ============================================
        
        // long - Çok büyük tam sayılar
        long numaraNumarasi = 1234567890L;  // Sonuna 'L' eklenir
        
        // float - Ondalıklı (double'dan daha az hassas)
        float agirlik = 70.5f;              // Sonuna 'f' eklenir
        
        // byte - Çok küçük tam sayılar (-128 ile 127 arası)
        byte kucukSayi = 100;
        
        // short - Küçük tam sayılar (-32,768 ile 32,767 arası)
        short ortaSayi = 5000;
        
        
        // ============================================
        // 6. Değişken Değerini Değiştirme
        // ============================================
        int puan = 50;                   // Başlangıç puanı
        System.out.println("İlk puan: " + puan);
        
        puan = 75;                       // Puanı değiştir
        System.out.println("Yeni puan: " + puan);
        
        puan = puan + 10;                // Puana 10 ekle
        System.out.println("Son puan: " + puan);
        
        
        // ============================================
        // 7. Birden Fazla Değişken Tanımlama
        // ============================================
        int sayi1 = 10, sayi2 = 20, sayi3 = 30;  // Aynı satırda
        
        int toplam = sayi1 + sayi2 + sayi3;
        System.out.println("Toplam: " + toplam);
        
        
        // ============================================
        // 8. Önemli Notlar
        // ============================================
        
        /*
         * İsimlendirme Kuralları:
         * ✅ Küçük harfle başla: yas, ogrenciSayisi
         * ✅ CamelCase kullan: ogrenciSayisi (birleşik kelimeler)
         * ✅ Anlamlı isimler: fiyat, yas (a, b, x yerine)
         * ❌ Rakamla başlama: 1sayi (YANLIŞ!)
         * ❌ Boşluk yok: ogrenci sayisi (YANLIŞ!)
         * ❌ Türkçe karakter kullanma: yaş (ş yerine s)
         */
        
        /*
         * Varsayılan Değerler (Atama yapmazsan):
         * int, byte, short, long → 0
         * float, double → 0.0
         * boolean → false
         * char → '\u0000' (boş karakter)
         */
        
        /*
         * Veri Tipi Aralıkları:
         * byte:  -128 ile 127
         * short: -32,768 ile 32,767
         * int:   -2 milyar ile 2 milyar (yaklaşık)
         * long:  Çok büyük sayılar
         */
        
        System.out.println("\n✅ Değişkenler konusu tamamlandı!");
    }
}