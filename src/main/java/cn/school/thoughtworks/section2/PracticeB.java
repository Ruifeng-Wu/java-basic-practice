package cn.school.thoughtworks.section2;

import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {
        Map<String, Integer> sameElementsNum = new PracticeA().countSameElements(collection1);
        for (String str:sameElementsNum.keySet()) {
            if (str.length()>1){
                sameElementsNum.remove(str);
                sameElementsNum.put(str.substring(0,1), Integer.valueOf(str.substring(2,3)));
            }
        }
        return sameElementsNum;
    }
}
