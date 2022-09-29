package book;

import java.io.*;
import java.util.ArrayList;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.jetbrains.annotations.NotNull;

public class FileUtils {
    public static void writeToFile(Shelf shelf) throws IOException {
        String bookSplitString;
        String title;
        String author;
        String numberOfPages;
        String backText;
        ArrayList<Book> books = shelf.getBooks();
        File file = new File("out.txt");
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);

        try {
            for (Book book : books) {
                String backtextReplace = book.getBackText().replace("\n", "").replace("\r", "");
                bw.write(book.getAuthor() + "$" + book.getTitle() + "$" + book.getNumberOfPages() + "$" + backtextReplace + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        bw.close();
        // Try catch for using above created file and feeding it books using a $-sign as separator for each attribute.
        try (RandomAccessFile raf = new RandomAccessFile(file, "rw")) {

            while (raf.getFilePointer() < raf.length()) {
                bookSplitString = raf.readLine();
                String[] lineSplit = bookSplitString.split("\\$");

                author = lineSplit[0];
                title = lineSplit[1];
                numberOfPages = lineSplit[2];
                backText = lineSplit[3];

                System.out.println("Title: " + title + "\n" +
                        "Author: " + author + "\n" +
                        "Number of pages: " + numberOfPages + "\n" +
                        "Back text: " + backText +
                        "\n");
            }
            String contentLine = raf.readLine();
            while (contentLine != null) {
                System.out.println(contentLine);
                contentLine = raf.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void gsonWriteToFile(@NotNull Shelf shelf) throws IOException {
        String jsonString;
        ArrayList<Book> books = shelf.getBooks();
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        Gson gson = builder.create();
        for (Book book : books) {
            jsonString = gson.toJson(book);
            FileWriter jsonFileWrite = new FileWriter(book.getAuthor() + ".json");
            jsonFileWrite.write(jsonString);
            jsonFileWrite.close();
        }
    }
}
