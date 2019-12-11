package planiet;

import planiet.resource.*;
import planiet.factory.ResourceFactory;
import planiet.adapter.*;
import planiet.iterator.InfoTracker;

public class Main {

    public static void main(String[] args) {
        ResourceFactory resourceFactory = new ResourceFactory();
        // factory method
        LearningResource video = resourceFactory.makeResource("video");
        LearningResource book = resourceFactory.makeResource("book");
        LearningResource article = resourceFactory.makeResource("article");
        // adapter
        ResourceInfo info1 = new ResourceInfoAdapter(video);
        ResourceInfo info2 = new ResourceInfoAdapter(book);
        ResourceInfo info3 = new ResourceInfoAdapter(article);
        // iterator
        InfoLibrary library = new InfoLibrary();
        library.addInfo(info1);
        library.addInfo(info2);
        library.addInfo(info3);
        InfoTracker tracker = library.getInfoTracker();
        while (tracker.hasNext()) {
            System.out.println(tracker.next());
        }
    }
}
