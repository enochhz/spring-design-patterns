package planiet.resource;

public class ArticleResource implements LearningResource{

    private String title;
    private String description;

    public ArticleResource() {
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
        return title + "(article): " + description + ".";
    }
}
