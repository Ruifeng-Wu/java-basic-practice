package cn.school.thoughtworks.section2;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String, Integer> countSameElements(List<String> collection1) {
        Map<String, Integer> sameElementsNum = new HashMap<>();
        for (String str : collection1) {
            sameElementsNum.put(str, Collections.frequency(collection1, str));
        }
        return sameElementsNum;
    }
}
