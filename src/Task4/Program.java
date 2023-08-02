package Task4;


import Task4.HashMap.Entity;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

public class Program {
    public static void main(String[] args) {


//        Employee employee1 = new Employee("AAA", 30);
//        System.out.println(employee1.getAge() + " " + employee1.getName());
//        System.out.println(employee1.hashCode());
//
//        System.out.println("++++++++++++++++++++++++++++++++++++");


        HashMap<String, String> hashMap = new HashMap<>(4);


        String v = hashMap.put("+79854367654", "Сергей");
        v = hashMap.put("+79045432321", "Николай");
        v = hashMap.put("+75676789321", "Юрий");
        v = hashMap.put("+79005551120", "Сергей1");
        v = hashMap.put("+79005551123", "Алексей");
        v = hashMap.put("+79005551124", "Александр1");
        v = hashMap.put("+79005551125", "Александр2");
        v = hashMap.put("+79005551126", "Александр3");
        v = hashMap.put("+79005551127", "Александр4");
        v = hashMap.put("+79005551128", "Александр5");
        v = hashMap.put("+79105551120", "Сергей2");
        v = hashMap.put("+79205551123", "Алексей1");
        v = hashMap.put("+79305551124", "Александр11");
        v = hashMap.put("+79405551125", "Александр21");
        v = hashMap.put("+79505551126", "Александр31");
        v = hashMap.put("+79605551127", "Александр41");
        v = hashMap.put("+79705551128", "Александр51");
//        System.out.println(hashMap.toString());

//        System.out.println(hashMap.iterator());



//        HashMap.HashMapIterator it = (HashMap.HashMapIterator) hashMap.iterator();
//        while (it.hasNext()) {
//            it.next();
//            HashMap.Entity entity = it.next();
//            System.out.println(entity.key + " - " + entity.value);
            //System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
            for (Entity entity: hashMap) {
                System.out.println(entity.getKey() + " - " + entity.getValue());
            }
//            Object K = it.next().getKey();
//            Object V = it.next().getValue();
//            System.out.println(K + " - " + V);

        }


//        System.out.println("+++++++++++++++++++++++++++++++++++++++++");

//
//        for (HashMap.HashMapIterator it1 = (HashMap.HashMapIterator) hashMap.iterator(); it1.hasNext(); ) {
//            Object entity = it1.next();
//            for (Object o: entity) {
//                System.out.println(o + " - " + );
//            }
            //Object entity1 = it1.next().value;
            //System.out.println(entity + " - " + entity);
 //       }
//    }
}