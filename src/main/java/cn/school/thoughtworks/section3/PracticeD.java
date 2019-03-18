package cn.school.thoughtworks.section3;


import java.util.List;
import java.util.Map;

public class PracticeD {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> collection3 =new cn.school.thoughtworks.section2.PracticeB().countSameElements(collectionA);
        return new PracticeB().createUpdatedCollection(collection3,object);
    }
}
