package cn.school.thoughtworks.section2;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PracticeA {
    public Map<String, Integer> countSameElements(List<String> collection1) {
        Map<String, Integer> sameElementsNum = collection1.stream()
                .collect(Collectors.toMap(str -> str, str -> Collections.frequency(collection1, str), (a, b) -> b));
        return sameElementsNum;
    }
}
