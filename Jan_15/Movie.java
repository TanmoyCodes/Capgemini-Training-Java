public class Movie{
    public static void main(String[] args){
    TicketBooking inception = new TicketBooking("Inception", 2);
    TicketBooking avatar = new TicketBooking("Avatar", 3);
    //ticketObj("", )

    inception.showBill();
    avatar.showBill();
    System.out.println("Total Tickets Sold: " + TicketBooking.ticketsSold);
}
}
class TicketBooking{
    String movieName;
    int ticketPrice = 250;


    int tickets;
    static int ticketsSold = 0;

    TicketBooking(String movieName, int tickets){
        this.movieName = movieName;
        this.tickets = tickets;
        ticketsSold+=tickets;
    }


    void showBill(){
        int total = tickets * ticketPrice;
        System.out.println(movieName+ " Total Cost: " + total);
    }

}