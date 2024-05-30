
class Ticket {
    private int ticketId;
    private Showtime showtime;
    private String seatNumber;
    private float price;

    public Ticket(int ticketId, Showtime showtime, String seatNumber, float price) {
        this.ticketId = ticketId;
        this.showtime = showtime;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public int getTicketId() {
        return ticketId;
    }

    public Showtime getShowtime() {
        return showtime;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public float getPrice() {
        return price;
    }
}

