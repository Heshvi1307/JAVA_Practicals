public class CinemaShow {

    private String title;
    private int seatsAvailable;
    private final int capacity;
    private static int totalBooked = 0;

    // Parameterized Constructor
    public CinemaShow(String title, int capacity) {
        this.title = title;
        this.capacity = capacity;
        this.seatsAvailable = capacity;
    }

    // Default Capacity = 100
    public CinemaShow(String title) {
        this(title, 100);
    }

    // Book Seats
    public boolean book(int n) {
        if (n <= 0 || n > seatsAvailable) {
            return false;
        }

        seatsAvailable -= n;
        totalBooked += n;
        return true;
    }

    // Cancel Seats
    public void cancel(int n) {
        if (n <= 0) {
            return;
        }

        // Cannot cancel more than booked for this show
        int bookedSeats = capacity - seatsAvailable;
        if (n > bookedSeats) {
            n = bookedSeats;
        }

        seatsAvailable += n;
        totalBooked -= n;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public int getSeatsAvailable() {
        return seatsAvailable;
    }

    public static int getTotalBooked() {
        return totalBooked;
    }

    public static void main(String[] args) {

        CinemaShow show1 = new CinemaShow("Avengers", 50);
        CinemaShow show2 = new CinemaShow("Interstellar");

        System.out.println("Movie: " + show1.getTitle());
        System.out.println("Available Seats: " + show1.getSeatsAvailable());

        System.out.println("\nBooking 20 Seats: " + show1.book(20));
        System.out.println("Available Seats: " + show1.getSeatsAvailable());

        System.out.println("\nBooking 25 Seats: " + show1.book(25));
        System.out.println("Available Seats: " + show1.getSeatsAvailable());

        System.out.println("\nBooking 10 Seats: " + show1.book(10)); // Should fail
        System.out.println("Available Seats: " + show1.getSeatsAvailable());

        show1.cancel(15);
        System.out.println("\nAfter Cancelling 15 Seats:");
        System.out.println("Available Seats: " + show1.getSeatsAvailable());

        System.out.println("\nBooking 10 Seats Again: " + show1.book(10));
        System.out.println("Available Seats: " + show1.getSeatsAvailable());

        // Using show2 so VS Code won't warn it's unused
        System.out.println("\nMovie: " + show2.getTitle());
        System.out.println("Available Seats: " + show2.getSeatsAvailable());

        System.out.println("\nTotal Booked Seats: " + CinemaShow.getTotalBooked());
    }
}