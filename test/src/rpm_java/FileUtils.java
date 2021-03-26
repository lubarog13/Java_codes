package rpm_java;

import java.io.*;
import java.util.ArrayList;

public class FileUtils {
    public static void write(File file, Library library) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {

            bw.write(library.getId() + ";" + library.getAddress());
            for ( Book book : library.getBooks() ) {
                bw.newLine();
                bw.write(book.getId() + ";" + book.getTitle() + ";" + book.getAuthor() + ";" + book.getYear());

            }
        }
    }

    public static Library read(File file) throws IOException {
        try(BufferedReader br = new BufferedReader(new FileReader(file))) {

            String s = "";
            if ((s = br.readLine()) != null) {
                String[] arr = s.split(";");
                Library library = new Library(Integer.parseInt(arr[0]), arr[1], new ArrayList<>());
                while ((s = br.readLine()) != null) {
                    arr = s.split(";");
                    library.getBooks().add(new Book(Integer.parseInt(arr[0]), arr[1], arr[2], Integer.parseInt(arr[3])));
                }
                return library;
            }
        }
        return null;
    }
}
