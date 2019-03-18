package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> sameElementsNum = new HashMap<>();
        for (String element : collection1) {
            if (sameElementsNum.containsKey(element)) {
                sameElementsNum.put(element, sameElementsNum.get(element) + 1);
            } else {
                sameElementsNum.put(element, 1);
            }
        }
        return sameElementsNum;
    }
}
