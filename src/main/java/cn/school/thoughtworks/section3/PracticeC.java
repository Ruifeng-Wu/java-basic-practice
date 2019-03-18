package cn.school.thoughtworks.section3;

import cn.school.thoughtworks.section2.PracticeA;

import java.util.List;
import java.util.Map;
public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        Map<String, Integer> collection3 = new PracticeA().countSameElements(collectionA);

        return new PracticeB().createUpdatedCollection(collection3,object);
    }
}
