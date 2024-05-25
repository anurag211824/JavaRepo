package JavaCodes.Multithreading.F_Synchronization;

class BookTheaterSeats {
    int total_seats = 10;

    synchronized void bookSeats(int seats) {
        if (total_seats >= seats) {
            System.out.println("seats booked successfully");
            total_seats = total_seats - seats;
            System.out.println("seats left: " + total_seats);
        } else {
            System.out.println("seats can't be booked");
            System.out.println("seats left: " + total_seats);
        }
    }
}

class MovieBookApp extends Thread {
    BookTheaterSeats b;
    int seats;

    MovieBookApp(BookTheaterSeats b, int seats) {
        this.b = b;
        this.seats = seats;
    }

    public void run() {
        b.bookSeats(seats);
    }
}

public class A_ProblemWithThreads {
    public static void main(String[] args) {
        BookTheaterSeats bts = new BookTheaterSeats();

        MovieBookApp anurag = new MovieBookApp(bts, 7);
        anurag.start();

        MovieBookApp deepak = new MovieBookApp(bts, 8);
        deepak.start();

        MovieBookApp bhaskar = new MovieBookApp(bts, 8);
        bhaskar.start();
    }
}
