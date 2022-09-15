package book;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Skapar böcker
        Book book1 = new Book("Colour of Magic", "Terry Pratchett", 288,
                "On a world supported on the back of a giant turtle (sex unknown), a gleeful, explosive, " +
                        "\nwickedly eccentric expedition sets out. There's an avaricious but inept wizard, a naive " +
                        "\ntourist whose luggage moves on hundreds of dear little legs, dragons who only exist if you " +
                        "\nbelieve in them, and of course THE EDGE on the planet...");
        Book book2 = new Book("The Talismans of Shannara", "Terry Brooks", 453,
                "The Shadowen still swarm over the Four Lands, poisoning everything with their dark magic. " +
                        "\nAnd their leader is determined to destroy all the Scions of Shannara. For Walker Boh, he " +
                        "\ndispatches the Four Horsemen. For Wren, he sends an untrue friend. And for Par, he devises " +
                        "\nthe most terrible fate of all. With these traps cleverly laid, the charges given by the " +
                        "\nshade of the Druid Allanon are doomed to failure—unless Par can discover a way to harness " +
                        "\nthe power of the Sword of Shannara. Thus continues the enthralling Shannara epic, a " +
                        "\nspellbinding tale of adventure, magic, and myth…");
        Book book3 = new Book("The Alchemist", "Paulo Coelho", 163,
                "Combining magic, mysticism, wisdom and wonder into an inspiring tale of self-discovery, " +
                        "\nThe Alchemist has become a modern classic, selling millions of copies around the world " +
                        "\nand transforming the lives of countless readers across generations. Paulo Coelho's " +
                        "\nmasterpiece tells the mystical story of Santiago, an Andalusian shepherd boy who yearns " +
                        "\nto travel in search of a worldly treasure. His quest will lead him to riches far " +
                        "\ndifferent—and far more satisfying—than he ever imagined. Santiago's journey teaches us " +
                        "\nabout the essential wisdom of listening to our hearts, of recognizing opportunity and " +
                        "\nlearning to read the omens strewn along life's path, and, most importantly, " +
                        "\nto follow our dreams.");

        // Skapar bokhyllan
        Shelf shelf = new Shelf("brun");
        // Fyller bokhyllan med böckerna vi skapade
        shelf.getBooks().add(book1);
        shelf.getBooks().add(book2);
        shelf.getBooks().add(book3);
        // Skapar variabel för snabb åtkomst till shelf.getBooks()
        ArrayList<Book> books = shelf.getBooks();

        // do while-loop för att hålla användaren i en meny tills man avslutar på egen hand
        int menu;
        do {
            // 1. Printa menyn
            printMenu();
            Scanner scanner = new Scanner(System.in);

            // 2. Ta user input för menyval
            menu = scanner.nextInt();
            // Menyval för att få fram titlarna på böckerna i bokhyllan
            if (menu == 1) {
                shelf.printTitles();
            }
            // Menyval för att visa författaren till en bok
            else if (menu == 2) {
                shelf.printTitles();
                int choice = scanner.nextInt();
                System.out.println("Författaren till " + books.get(choice -1).getTitle() + " är " + books.get(choice - 1).getAuthor()
                        + ".");
            }
            // Menyval för att visa antal sidor för en bok
            else if (menu == 3) {
                shelf.printTitles();
                int choice = scanner.nextInt();
                System.out.println(books.get(choice -1).getTitle() + " har " + books.get(choice - 1).getNumberOfPages()
                        + " sidor.");
            }
            // Menyval för att visa baktexten till en bok
            else if (menu == 4) {
                shelf.printTitles();
                int choice = scanner.nextInt();
                System.out.println(books.get(choice -1).getTitle() + " har den här baktexten: \n"
                        + books.get(choice - 1).getBackText());
            }
        } while (menu != 0);
    }

    //Metod för menyval
    private static void printMenu() {
        System.out.println("-----------Menu-----------");
        System.out.println("1: List books in the book shelf");
        System.out.println("2: Get author of book");
        System.out.println("3: Get number of pages");
        System.out.println("4: Get back text");
        System.out.println("0: Avsluta");
    }

//    public static void printBookTitle(Book book) {
//        System.out.println(book.getTitle());
//    }
//
//    public static void printNrOfPages(Book book) {
//        System.out.println(book.getNumberOfPages());
//    }
}
