package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        //实现练习要求，并改写该行代码。
        List<String> collection2Element=new ArrayList<>();
        List<String> arrayList1 = new ArrayList<>(collection1);
        Iterator<List<String>> iterator = collection2.iterator();
        while (iterator.hasNext()) {
            collection2Element = iterator.next();
            arrayList1.retainAll(collection2Element);
        }
        return arrayList1;
    }
}
