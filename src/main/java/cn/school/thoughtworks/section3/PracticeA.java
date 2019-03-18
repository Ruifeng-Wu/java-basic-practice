package cn.school.thoughtworks.section3;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PracticeA {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        Set<String> elements=new HashSet<>(collectionA.keySet());
        List<String> reducedElements=object.get("value");
        elements.retainAll(reducedElements);
        for (String str:elements) {
            collectionA.put(str,collectionA.get(str)-1);
        }
        return collectionA;
    }
}
