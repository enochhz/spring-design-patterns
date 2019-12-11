package planiet.iterator;

import java.util.*;
import planiet.adapter.ResourceInfo;

public class ResourceInfoIterator implements InfoTracker{

    private List<String> infoList;
    private int next;

    public ResourceInfoIterator(List<ResourceInfo> list) {
       infoList = new ArrayList<>();
       for (ResourceInfo info: list) {
           infoList.add(info.getInfo());
       }
       next = 0;
    }

    public boolean hasNext() {
        if (next >= infoList.size()) {
            return false;
        } else {
            return true;
        }
    }

    public String next() {
        String info = (next + 1) + " - " + infoList.get(next);
        next++;
        return info;
    }
}
