/**
 * HelloWorld - İlk Java Programımız
 * 
 * Bu program ekrana "Hello, World!" yazdırır.
 * Java'nın temel yapısını gösterir.
 */

// public: Herkes bu class'ı görebilir
// class: Bir şablon/blueprint oluşturuyoruz
// HelloWorld: Class ismi (dosya adıyla aynı olmalı!)
public class HelloWorld {
    
    // main metodu - Programın başladığı nokta (Java buradan başlar!)
    // public: Herkes erişebilir
    // static: Obje oluşturmadan çalışır
    // void: Geriye bir şey döndürmez
    // main: Özel metot ismi (değiştirilemez!)
    // String[] args: Komut satırından gelen parametreler
    public static void main(String[] args) {
        
        // System.out.println: Ekrana yazdır ve alt satıra geç
        // "Hello, World!": Yazdırılacak metin (String)
        // ; : Her komut noktalı virgül ile biter
        System.out.println("Hello, World!");
        
    } // main metodu burada bitiyor
    
} // HelloWorld class'ı burada bitiyor