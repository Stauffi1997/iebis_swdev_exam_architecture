import java.util.ArrayList;
import java.util.HashMap;

public class Show {
    private String nameShow;
    private HashMap <Integer, Season> seasons;

    public Show(String nameShow) {
        this.nameShow = nameShow;
        seasons = new HashMap<>();
    }

    public void addSeason(Season season){
        seasons.put(season.getNumberSeasons(), season);
    }

}
