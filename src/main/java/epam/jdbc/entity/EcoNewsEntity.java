package epam.jdbc.entity;


public class EcoNewsEntity extends Entity {

    private int id;
    private String creationDate;
    private String imagePath;
    private int authorId;
    private String text;
    private String title;
    private String source;

    public EcoNewsEntity() {
    }

    public EcoNewsEntity(int id, String creationDate, String imagePath, int authorId, String text, String title,
        String source) {
        this.id = id;
        this.creationDate = creationDate;
        this.imagePath = imagePath;
        this.authorId = authorId;
        this.text = text;
        this.title = title;
        this.source = source;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public String toString() {
        return "EconNewsEntity{" +
            "id=" + id +
            ", creationDate='" + creationDate + '\'' +
            ", imagePath='" + imagePath + '\'' +
            ", authorId=" + authorId +
            ", text='" + text + '\'' +
            ", title='" + title + '\'' +
            ", source='" + source + '\'' +
            '}';
    }
}
