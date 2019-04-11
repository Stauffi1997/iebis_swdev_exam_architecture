public class Episode {
    private int length;
    private String name;
    private String show;

    public Episode(int length, String name) {
        this.length = length;
        this.name = name;
        show = "Game of Thrones";
    }

    public String getName() {
        return name;
    }

    public String getShow() {
        return show;
    }
}
