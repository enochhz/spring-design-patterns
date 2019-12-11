package planiet.resource;

public class BookResource implements LearningResource{

    private String title;
    private String description;

    public BookResource() {
        title = "";
        description = "";
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getInfo() {
        return title + "(book): " + description + ".";
    }
}
