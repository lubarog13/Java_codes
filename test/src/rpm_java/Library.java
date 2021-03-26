package rpm_java;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Library {
    private int id;
    private String address;
    private List<Book> books;
    public Library(){}

    public Library(int id, String address, List<Book> books) {
        this.id = id;
        this.address = address;
        this.books = books;
    }

    @Override
    public String toString() {
        return "Library{" +
                "id='" + id + '\'' +
                ", address='" + address + '\'' +
                ", books=" + books +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
    public void readBook() throws BookReadException{
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        System.out.println("Введите количество книг");
        try {
            int n = Integer.parseInt(scanner.nextLine());

        for(int i=0; i<n; i++){
            System.out.println("Введите информацию о книге");
            Integer id = Integer.parseInt(scanner.nextLine());
            String name = scanner.nextLine();
            String author = scanner.nextLine();
            Integer year = Integer.parseInt(scanner.nextLine());
            try{
            if(name.length()<=3 || name.length()>=33) throw new BookReadException("Введено неправильное название");
            if(author.length()<=3||author.length()>=30) throw new BookReadException("Введен неправильный автор");
            if(year<=-3350||year>=2022) throw new BookReadException("Введен неправильный год");}
            catch (BookReadException e){
                System.out.println(e);
                continue;
            }
            books.add(new Book(id, name, author, year));
            counter++;
        }
        System.out.println("Введено " + counter + " книг из " + n);}
        catch (NumberFormatException e){ throw new BookReadException("Введено не число");}
    }
}
