import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cinema {
    private String nom;
    private String adresse;
    private List<Film> films;
    private List<Seance> seances;
    private List<Salle> salles;

    public Cinema(String nom, String adresse) {
        this.nom = nom;
        this.adresse = adresse;
        this.films = new ArrayList<>();
        this.seances = new ArrayList<>();
        this.salles = new ArrayList<>();
    }

    public void addFilm(Film film) {
        films.add(film);
    }

    public void addSalle(Salle salle) {
        salles.add(salle);
    }

    public void removeFilm(Film film) {
        films.remove(film);
    }

    public void scheduleSeance(Film film, Date date, Time heure, Salle salle) {
        Seance seance = new Seance(film, date, heure, salle);
        seances.add(seance);
    }

    public List<Seance> getAllSeancesForFilmOnDate(Film film, Date date) {
        List<Seance> result = new ArrayList<>();
        for (Seance seance : seances) {
            if (seance.getFilm().equals(film) && seance.getDate().equals(date)) {
                result.add(seance);
            }
        }
        return result;
    }

    // Getters and setters

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }

    public List<Seance> getSeances() {
        return seances;
    }

    public void setSeances(List<Seance> seances) {
        this.seances = seances;
    }

    public List<Salle> getSalles() {
        return salles;
    }

    public void setSalles(List<Salle> salles) {
        this.salles = salles;
    }
}