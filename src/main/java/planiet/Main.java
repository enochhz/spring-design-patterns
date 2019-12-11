package planiet;

import planiet.resource.*;
import planiet.factory.ResourceFactory;
import planiet.adapter.*;

public class Main {

    public static void main(String[] args) {
        ResourceFactory resourceFactory = new ResourceFactory();
        LearningResource video = resourceFactory.makeResource("video");
        LearningResource book = resourceFactory.makeResource("book");
        ResourceInfo info1 = new ResourceInfoAdapter(video);
        ResourceInfo info2 = new ResourceInfoAdapter(book);

    }
}
