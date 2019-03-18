package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.toList;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        Map<String, Integer> sameElementsMap = new HashMap<>();
        List<String> regularList = collection1.stream().filter(x -> x.length() == 1).collect(toList());
        List<String> irregularList = collection1.stream().filter(x -> x.length() > 1).collect(toList());
        for (int i = 0; i < irregularList.size(); i++) {
            String element = "";
            String elementNum = "";
            String string = irregularList.get(i);
            for (int j = 0; j < string.length(); j++) {
                char temp = string.charAt(j);
                if (temp >= 'a' && temp <= 'z') {
                    element = String.valueOf(temp);
                }
                if (Character.isDigit(temp)) {
                    elementNum += temp;
                }
            }
            if (sameElementsMap.containsKey(element)) {
                sameElementsMap.put(element, sameElementsMap.get(element) + Integer.valueOf(elementNum));
            } else {
                sameElementsMap.put(element, Integer.valueOf(elementNum));
            }
        }
        for (String x : regularList) {
            if (sameElementsMap.containsKey(x)) {
                sameElementsMap.put(x, sameElementsMap.get(x) + 1);
            } else {
                sameElementsMap.put(x, 1);
            }
        }
        return sameElementsMap;
    }
}
