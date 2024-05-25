package JavaCodes.Multithreading.F_Synchronization;
class BookTheaterSeats {
    static int total_seats = 20;

    synchronized static void bookSeats(int seats) {
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
class MovieBookApp1 extends Thread {
    BookTheaterSeats b;
    int seats;

    MovieBookApp1(BookTheaterSeats b, int seats) {
        this.b = b;
        this.seats = seats;
    }

    public void run() {
        BookTheaterSeats.bookSeats(seats);
    }
}
class MovieBookApp2 extends Thread {
    BookTheaterSeats b;
    int seats;

    MovieBookApp2(BookTheaterSeats b, int seats) {
        this.b = b;
        this.seats = seats;
    }

    public void run() {
        BookTheaterSeats.bookSeats(seats);
    }
}
public class D_StaticSynchronization {
    public static void main(String[] args) {
        BookTheaterSeats b1 = new BookTheaterSeats();

        MovieBookApp1 anurag = new MovieBookApp1(b1, 7);
        anurag.start();

        MovieBookApp1 deepak = new MovieBookApp1(b1, 8);
        deepak.start();

        BookTheaterSeats b2 = new BookTheaterSeats();

        MovieBookApp1 bhaskar = new MovieBookApp1(b2, 7);
        bhaskar.start();

        MovieBookApp1 abhinav = new MovieBookApp1(b2, 8);
        abhinav.start();
    }
}
