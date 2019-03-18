package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {
        Map<String, Integer> sameElementsNum = new HashMap<>(10);
        for (String element: collection1) {
            if (element.length()>1){
                sameElementsNum.put(element.substring(0,1), Integer.valueOf(element.substring(2,3)));
            }else {
                if (sameElementsNum.containsKey(element)) {
                    sameElementsNum.put(element, sameElementsNum.get(element) + 1);
                } else {
                    sameElementsNum.put(element, 1);
                }
            }
        }
        return sameElementsNum;
    }
}
