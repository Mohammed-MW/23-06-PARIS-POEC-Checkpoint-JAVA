import java.util.ArrayList;
import java.util.List;

public class Salle {
    private int capacite;
    private List<String> places;

    public Salle(int capacite) {
        this.capacite = capacite;
        this.places = new ArrayList<>();

    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public List<String> getPlaces() {
        return places;
    }

    public void setPlaces(List<String> places) {
        this.places = places;
    }
}