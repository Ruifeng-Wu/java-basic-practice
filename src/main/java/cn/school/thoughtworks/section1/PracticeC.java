package cn.school.thoughtworks.section1;

import java.util.*;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String,List<String>> collection2) {
        //实现练习要求，并改写该行代码。
        List<String> arrayList1=new ArrayList<>(collection1);
        List<String> arrayList2=collection2.get("value");
        arrayList1.retainAll(arrayList2);
        return arrayList1;
    }
}
