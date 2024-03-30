public class Book {
    private String authorName;

    public Book(String authorName) {
        this.authorName = authorName;
    }

    public void displayPublication() {
        System.out.println("Author: " + authorName);
    }
}

class BookPublication extends Book {
    private String title;

    public BookPublication(String authorName, String title) {
        super(authorName);
        this.title = title;
    }

    @Override
    public void displayPublication() {
        super.displayPublication();
        System.out.println("Book Title: " + title);
    }
}

class PaperPublication extends Book {
    private String title;

    public PaperPublication(String authorName, String title) {
        super(authorName);
        this.title = title;
    }

    @Override
    public void displayPublication() {
        super.displayPublication();
        System.out.println("Paper Title: " + title);
    }
}

public class PublicationDemo {
    public static void main(String[] args) {
        if (args.length % 3 != 0) {
            System.out.println("Invalid number of arguments. Each publication requires author name and title.");
            return;
        }

        int n = args.length / 3; // Number of publications

        // Array to store publication objects
        Book[] publications = new Book[n];

        // Process data for each publication
        for (int i = 0; i < n; i++) {
            String authorName = args[i * 3];
            String title = args[i * 3 + 1];
            String publicationType = args[i * 3 + 2];

            // Create publication object based on type
            if (publicationType.equalsIgnoreCase("book")) {
                publications[i] = new BookPublication(authorName, title);
            } else if (publicationType.equalsIgnoreCase("paper")) {
                publications[i] = new PaperPublication(authorName, title);
            } else {
                System.out.println("Invalid publication type: " + publicationType);
                return;
            }
        }

        // Display all publications
        for (int i = 0; i < n; i++) {
            publications[i].displayPublication();
            System.out.println();
        }
    }
}