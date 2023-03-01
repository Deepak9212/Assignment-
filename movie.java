package mypackage;

public class movie {
 private String moviename;
 private String startTime;
 private String endTime;
 private double ticketPrice;
 
 // Constructor
 public movie(String moviename, String startTime, String endTime, double ticketPrice) {
     this.moviename = moviename;
     this.startTime = startTime;
     this.endTime = endTime;
     this.ticketPrice = ticketPrice;
 }
 
 // Getter methods
 public String getmovieName() {
     return moviename;
 }
 
 public String getStartTime() {
     return startTime;
 }
 
 public String getEndTime() {
     return endTime;
 }
 
 public double getTicketPrice() {
     return ticketPrice;
 }
 
 // Setter methods
 public void setmovieName(String name) {
     this.moviename = name;
 }
 
 public void setStartTime(String startTime) {
     this.startTime = startTime;
 }
 
 public void setEndTime(String endTime) {
     this.endTime = endTime;
 }
 
 public void setTicketPrice(double ticketPrice) {
     this.ticketPrice = ticketPrice;
 }
}

