package planiet;

import java.util.*;
import planiet.adapter.ResourceInfo;
import planiet.iterator.InfoTracker;
import planiet.iterator.ResourceInfoIterator;

public class InfoLibrary {

    private List<ResourceInfo> infoList;

    public InfoLibrary() {
        this.infoList = new ArrayList<>();
    }
    public void addInfo(ResourceInfo info) {
        this.infoList.add(info);
    }

    public InfoTracker getInfoTracker() {
        return new ResourceInfoIterator(infoList);
    }
}
