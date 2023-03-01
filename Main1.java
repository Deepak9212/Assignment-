package mypackage;

public class Main1 {
    public static void main(String[] args) {
        movie movie = new movie("Mirzapur", "2:00PM", "5:00PM", 500);
        System.out.println("Movie Name: " + movie.getmovieName());
        System.out.println("Start Time: " + movie.getStartTime());
        System.out.println("End Time: " + movie.getEndTime());
        System.out.println("Ticket Price: " + movie.getTicketPrice());
    }
}
