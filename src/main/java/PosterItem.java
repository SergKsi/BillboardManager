public class PosterItem {
    // храним одну позицию афиши
    private int id;
    private int posterId;
    private String posterName;
    private String posterGenre;

    public PosterItem() {
    }

    public PosterItem(int id, int posterId, String posterName, String posterGenre) {
        this.id = id;
        this.posterId = posterId;
        this.posterName = posterName;
        this.posterGenre = posterGenre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPosterId() {
        return posterId;
    }

    public void setPosterId(int posterId) {
        this.posterId = posterId;
    }

    public String getPosterName() {
        return posterName;
    }

    public void setPosterName(String posterName) {
        this.posterName = posterName;
    }

    public String getPosterGenre() {
        return posterGenre;
    }

    public void setPosterGenre(String posterGenre) {
        this.posterGenre = posterGenre;
    }
}
