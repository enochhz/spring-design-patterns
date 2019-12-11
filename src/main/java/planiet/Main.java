package planiet;

import java.util.*;

import planiet.resource.*;
import planiet.factory.ResourceFactory;
import planiet.adapter.*;
import planiet.iterator.InfoTracker;


public class Main {

    public static void main(String[] args) {
        // Create different learning resources using Factory Method design pattern
        ResourceFactory resourceFactory = new ResourceFactory();
        List<LearningResource> resourceList = new ArrayList<>();
        LearningResource video = resourceFactory.makeResource("video");
        video.setTitle("Python in 7 days");
        video.setDescription("The most popular tutorial on Youtube");
        LearningResource book = resourceFactory.makeResource("book");
        book.setTitle("Deep Learning with Python");
        book.setDescription("A Hands-on Book related to Deep Learning");
        LearningResource article = resourceFactory.makeResource("article");
        article.setTitle("ReactJS in Depth");
        article.setDescription("An article talks about the most important concepts related to ReactJS");
        resourceList.add(video);
        resourceList.add(book);
        resourceList.add(article);
        // Convert different kinds of resources into resource info using Adapter design pattern
        List<ResourceInfo> infoList = convertToResourceInfo(resourceList);
        // Iterate all resources information using Iterator design pattern
        InfoLibrary library = buildAnLibrary(infoList);
        InfoTracker tracker = library.getInfoTracker();
        while (tracker.hasNext()) {
            System.out.println(tracker.next());
        }
    }

    public static List<ResourceInfo> convertToResourceInfo(List<LearningResource> learningResourceList) {
        List<ResourceInfo> infoList = new ArrayList<>();
        for (LearningResource learningResource: learningResourceList) {
            infoList.add(new ResourceInfoAdapter(learningResource));
        }
        return infoList;
    }

    public static InfoLibrary buildAnLibrary(List<ResourceInfo> resourceInfoList) {
        InfoLibrary library = new InfoLibrary();
        for (ResourceInfo info: resourceInfoList) {
            library.addInfo(info);
        }
        return library;
    }
}
