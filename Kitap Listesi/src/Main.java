import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("İnsan ne ile yasar" , "Tolstoy" , "1/1/1860",150);
        Book b2 = new Book("Savas ve barıs" , "Tolstoy" , "1/1/1860",250);
        Book b3 = new Book("Çocukluk" , "Tolstoy" , "1/1/1860",80);
        Book b4 = new Book("Anna karenina" , "Tolstoy" , "1/1/1860",300);
        Book b5 = new Book("Hayvan çifliği" , "George Orwell" , "1/1/1940",150);
        Book b6 = new Book("1984" , "George Orwell" , "1/1/1940",300);
        Book b7 = new Book("Kürk montolu madonna" , "Sabahattin Ali" , "1/1/1950",160);
        Book b8 = new Book("Dönüsüm" , "Franz Kafka" , "1/1/1910",64);
        Book b9 = new Book("Yeraltından notlar" , "Dostoyevski" , "1/1/1860",150);
        Book b10 = new Book("Denemeler" , "Montaigne" , "1/1/1500",300);

        ArrayList<Book> books = new ArrayList<>();
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b5);
        books.add(b6);
        books.add(b7);
        books.add(b8);
        books.add(b9);
        books.add(b10);

        Map<String,String> kitapYazar = new HashMap<>();

        books.stream().forEach(p -> kitapYazar.put(p.kitapAdi , p.yazarAdi));

        for (String b:kitapYazar.keySet()){
            System.out.println("Kitap : "+ b+", Yazar : "+kitapYazar.get(b));
        }


        List<Book> newList=books.stream().filter(p->p.getSayfaSayisi()>100).toList();
        System.out.println("\nSayfa Sayısı 100'den fazla olan kitaplar :");
        for(Book b:newList){
            System.out.println("Kitap Adı : "+b.getKitapAdi()+ " Sayfa Sayısı : "+b.getSayfaSayisi() + " Yazar : "+b.getYazarAdi() + " Yayın Tarihi : "+b.getYayinTarihi());
        }



    }
}