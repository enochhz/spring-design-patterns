package planiet.factory;

import planiet.resource.*;

public class ResourceFactory {

    public static LearningResource makeResource(String type) {
        switch(type.toLowerCase()) {
            case "video":
                return new VideoResource();
            case "book":
                return new BookResource();
            case "article":
                return new ArticleResource();
            default:
                return null;
        }
    }
}
