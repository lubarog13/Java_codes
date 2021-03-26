package rpm_java;

import java.util.List;
import java.util.Map;

public class Library {
    private String title;
    private String address;
    private List<Book> books;
    private Map<String, Integer> bookCase;

    public Library(String title, String address, List<Book> books, Map<String, Integer> bookCase) {
        this.title = title;
        this.address = address;
        this.books = books;
        this.bookCase = bookCase;
    }
    public boolean hasBook(String title){

        return bookCase.containsKey(title);
    }
    public Book takeBook(String title){
        for ( String s: bookCase.keySet() ){
            if (s.equals(title)){
                if (bookCase.get(s)==1){
                    bookCase.remove(s);
                    books.removeIf(book -> book.getTitle().equals(title));
                }
                else {
                    bookCase.replace(s, bookCase.get(s), bookCase.get(s) - 1);
                }
                for(Book book: books){
                    if (title.equals(book.getTitle())) return book;
                }
            }

        }
        return null;
    }
    public void addBook(Book book){
        boolean hasbook = false;
        for (Book b: books){
            if (b.getTitle().equals(title)) hasbook=true;
        }
        if(!hasbook){
            books.add(book);
            bookCase.put(book.getTitle(), 1);
        }
        else {
            bookCase.replace(book.getTitle(), bookCase.get(book.getTitle())+1);
        }
    }
    public int bookCount(String title){
        Integer a = bookCase.get(title);
        if(a==null) return 0;
        else return a;
    }
    @Override
    public String toString() {
        return "Library{" +
                "title='" + title + '\'' +
                ", address='" + address + '\'' +
                ", books=" + books +
                ", bookCase=" + bookCase +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public Map<String, Integer> getBookCase() {
        return bookCase;
    }

    public void setBookCase(Map<String, Integer> bookCase) {
        this.bookCase = bookCase;
    }
}
