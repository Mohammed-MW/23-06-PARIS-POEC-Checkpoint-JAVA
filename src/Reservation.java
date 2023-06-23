public class Reservation {
    private Client reservation;
    private String client;
    private Seance seance;
    private Salle salle;
    private String place;

    public Reservation(Client reservation, String client, Seance seance, Salle salle, String place) {
        this.reservation = reservation;
        this.client = client;
        this.seance = seance;
        this.salle = salle;
        this.place = place;
    }

    public Client getReservation() {
        return reservation;
    }

    public void setReservation(Client reservation) {
        this.reservation = reservation;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public Seance getSeance() {
        return seance;
    }

    public void setSeance(Seance seance) {
        this.seance = seance;
    }

    public Salle getSalle() {
        return salle;
    }

    public void setSalle(Salle salle) {
        this.salle = salle;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}
