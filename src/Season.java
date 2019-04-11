import java.util.ArrayList;
import java.util.HashMap;

public class Season {

    private HashMap<String, Episode> season;
    private int numberSeasons;
    private ArrayList<Subscriber> subscribers;

    public Season(int numberSeasons){
        this.numberSeasons = numberSeasons;
        season = new HashMap<String, Episode>();
        subscribers = new ArrayList<>();
    }

    public void addFullSeason(ArrayList<Episode> episodes){
        for (int i = 0; i < episodes.size(); i++){
            if (episodes.get(i)!=null)
            {season.put(episodes.get(i).getName(), episodes.get(i));
            notifySubscribers(episodes.get(i));}
        }
    }

    public void addEpisode(Episode episodeExtra){
        if (!season.containsKey(episodeExtra.getName()))
        {season.put(episodeExtra.getName(), episodeExtra);
        notifySubscribers(episodeExtra);
        }

    }

    public int getNumberSeasons() {
        return numberSeasons;
    }

    public void addSubscriber(Subscriber subscriber){
        subscribers.add(subscriber);
    }

    public void notifySubscribers(Episode episode){
        for (int i = 0; i < subscribers.size(); i++){
            subscribers.get(i).update(episode);
        }
    }
}
