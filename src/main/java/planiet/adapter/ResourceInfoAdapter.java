package planiet.adapter;

import planiet.resource.LearningResource;

public class ResourceInfoAdapter implements ResourceInfo{

    private final LearningResource learningResource;

    public ResourceInfoAdapter(LearningResource learningResource) {
        this.learningResource = learningResource;
    }

    @Override
    public String getInfo() {
        return learningResource.getInfo();
    }

}
