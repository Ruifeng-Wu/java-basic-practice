package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;

public class PracticeA {
    List<String> collectSameElements(List<String> collection1, List<String> collection2) {
        //实现练习要求，并改写该行代码。
        List<String> arrayList1=new ArrayList<>(collection1);
        List<String> arrayList2=new ArrayList<>(collection2);
        arrayList1.retainAll(arrayList2);
        return arrayList1;
    }
}
