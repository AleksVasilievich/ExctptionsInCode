package Task4;


import java.util.Iterator;

public class Program {
    public static void main(String[] args) {
        Employee employee1 = new Employee("AAA", 30);
        System.out.println(employee1.getAge() + " " + employee1.getName());
        System.out.println(employee1.hashCode());


        HashMap<String, String> hashMap = new HashMap<>();


        String v = hashMap.put("+7903", "Сергей");
        v = hashMap.put("+7904", "Николай");
        v = hashMap.put("+7904", "Юрий");
        v = hashMap.put("+79005551123", "Сергей");
        v = hashMap.put("+79005551123", "Алексей");
        v = hashMap.put("+79005551124", "Александр1");
        v = hashMap.put("+79005551125", "Александр2");
        v = hashMap.put("+79005551126", "Александр3");
        v = hashMap.put("+79005551127", "Александр4");
        v = hashMap.put("+79005551128", "Александр5");
//        System.out.println(v);
//        System.out.println(hashMap.iterator());


        HashMap.HashMapIterator it = (HashMap.HashMapIterator) hashMap.iterator();
        while (it.hasNext()) {
            it.next();
            Object K = it.next().getKey();
            Object V = it.next().getValue();
            System.out.println(K + " - "  + V);

        }





//        for (Iterator it = hashMap.iterator(); it.hasNext(); ) {
//            Object entity = it.next();
//            System.out.println(entity + " - " + entity);
//        }



//        for (Object e : hashMap) {
//            System.out.println(e.key + " - " + e.value);
//        }

//        while (HashMap.HashMapIterator.hasNext() == true) {
//             next();
//            System.out.println("Key: " + entry.getKey());
//            System.out.println("Value: " + entry.getValue());
//        }





    }
}