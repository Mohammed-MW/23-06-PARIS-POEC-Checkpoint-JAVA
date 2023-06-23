import java.util.List;

public class Client {
    private String nom;
    private String email;
    private List<Reservation> reservations;

    public Client(String nom, String email, List<Reservation> reservations) {
        this.nom = nom;
        this.email = email;
        this.reservations = reservations;
    }

    public Reservation reserve(String client, Seance seance, Salle salle, String place) {
        if (seance.isFull()) {
            return null;
        }

        Reservation reservation = new Reservation(this, client, seance, salle, place);
        seance.addReservation(reservation);
        reservations.add(reservation);

        return reservation;
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }
}
