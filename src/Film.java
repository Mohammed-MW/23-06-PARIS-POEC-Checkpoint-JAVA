import java.util.Date;

public class Film {
    private String name;
    private String synopsis;
    private Date dateDeSortie;

    public Film(String name, String synopsis, Date dateDeSortie) {
        this.name = name;
        this.synopsis = synopsis;
        this.dateDeSortie = dateDeSortie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public Date getDateDeSortie() {
        return dateDeSortie;
    }

    public void setDateDeSortie(Date dateDeSortie) {
        this.dateDeSortie = dateDeSortie;
    }
}
