package planiet.resource;

public class BookResource implements LearningResource{

    @Override
    public void setTitle(String title) {

    }

    @Override
    public void setDescription(String description) {

    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public String getInfo() {
        return "book resource";
    }
}
