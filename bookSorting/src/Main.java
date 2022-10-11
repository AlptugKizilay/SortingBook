import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {


        Book b1 = new Book("Life", 130, "Ali", 2022);
        Book b2 = new Book("Java", 300, "Alex", 2000);
        Book b3 = new Book("Kizil", 230, "Hagi", 1996);
        Book b4 = new Book("Patika", 40, "Alp", 2010);

        //Sorting by name.
        TreeSet<Book> books = new TreeSet<>();
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);

        for (Book name : books) {
            System.out.println("Book Name: "+name.getName()+
                    "\nNumber of page: "+name.getPageNum()+
                    "\nAuthor Name: "+name.getAuthorName()+
                    "\nReleased Date: "+name.getPublishDate());
            System.out.println();

        }
        System.out.println("-------------------");

        //Sorting by page number.
        TreeSet<Book> pageBook = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageNum() - o2.getPageNum();
            }
        });
        pageBook.add(b1);
        pageBook.add(b2);
        pageBook.add(b3);
        pageBook.add(b4);

        for (Book page : pageBook){
            System.out.println("Book Name: "+page.getName()+
                    "\nNumber of page: "+page.getPageNum()+
                    "\nAuthor Name: "+page.getAuthorName()+
                    "\nReleased Date: "+page.getPublishDate());
            System.out.println();
        }




    }
}
