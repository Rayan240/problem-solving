import java.util.Scanner;

public class Movie {
    private String title;
    private String genre;
    private double ticketPrice;
    private int seatsAvailable;

    public Movie(String title, String genre, double ticketPrice, int seatsAvailable) {
        this.title = title;
        this.genre = genre;
        this.ticketPrice = ticketPrice;
        this.seatsAvailable = seatsAvailable;
    }

    public void bookTicket(int count) {
        if (count <= seatsAvailable) {
            seatsAvailable -= count;
            System.out.println(count + " ticket(s) successfully booked.");
        } else {
            System.out.println("Not enough seats available. Only " + seatsAvailable + " seat(s) left.");
        }
     
    }

    // Method to cancel tickets
    public void cancelTicket(int count) {
        seatsAvailable += count;
        System.out.println(count + " ticket(s) successfully canceled.");
    }

    public void showMovieDetails() {
        System.out.println("Movie Details:");
        System.out.println("Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Ticket Price: $" + ticketPrice);
        System.out.println("Seats Available: " + seatsAvailable);
    }

    // Main method to test the class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create multiple movie objects
        Movie movie1 = new Movie("Inception", "Sci-Fi", 12.5, 100);
        Movie movie2 = new Movie("The Dark Knight", "Action", 15.0, 80);
        Movie movie3 = new Movie("The Lion King", "Animation", 10.0, 120);

        System.out.println("Select a movie to watch:");
        System.out.println("1. Inception (Sci-Fi)");
        System.out.println("2. The Dark Knight (Action)");
        System.out.println("3. The Lion King (Animation)");

        int choice = scanner.nextInt(); 

        Movie selectedMovie = null;

        switch (choice) {
            case 1:
                selectedMovie = movie1;
                break;
            case 2:
                selectedMovie = movie2;
                break;
            case 3:
                selectedMovie = movie3;
                break;
            default:
                System.out.println("Invalid choice. Exiting...");
                scanner.close();
                return;  
        }

        selectedMovie.showMovieDetails();

        // Book tickets
        System.out.print("Enter number of tickets to book: ");
        int ticketsToBook = scanner.nextInt();
        selectedMovie.bookTicket(ticketsToBook);
        selectedMovie.showMovieDetails();

        // Cancel tickets
        System.out.print("Enter number of tickets to cancel: ");
        int ticketsToCancel = scanner.nextInt();
        selectedMovie.cancelTicket(ticketsToCancel);
        selectedMovie.showMovieDetails();

        scanner.close();
    }
}