//package Task5;
//
//import java.util.Iterator;
//
//public class HashMap<K, V> implements Iterable<HashMap.Entry<K, V>> {
//
//    private static final int INIT_BUCKET_COUNT = 16;
//    private static final double LOAD_FACTOR = 0.5;
//
//    private int size;
//
//    public int getSize() {
//        return size;
//    }
//
//    private Bucket[] buckets;
//
//    @Override
//    public Iterator<HashMap.Entry<K, V>> iterator() {
//        return new HashMapIterator();
//    }
//
//    class HashMapIterator implements Iterator<HashMap.Entry<K, V>> {
//
//        private int currentBucketIndex;
//        private Bucket.Node currentNode;
//
//        public HashMapIterator() {
//            currentBucketIndex = 0;
//            currentNode = null;
//        }
//
//        @Override
//        public boolean hasNext() {
//            if (currentNode != null && currentNode.next != null) {
//                return true;
//            }
//            for (int i = currentBucketIndex + 1; i < buckets.length; i++) {
//                if (buckets[i] != null && buckets[i].head != null) {
//                    return true;
//                }
//            }
//            return false;
//        }
//
//        @Override
//        public HashMap.Entry<K, V> next() {
//            if (currentNode != null && currentNode.next != null) {
//                currentNode = currentNode.next;
//            } else {
//                do {
//                    currentBucketIndex++;
//                } while (currentBucketIndex < buckets.length && buckets[currentBucketIndex] ==
//                        null);
//                if (currentBucketIndex < buckets.length) {
//                    currentNode = buckets[currentBucketIndex].head;
//                }
//            }
//            return currentNode != null ? currentNode.value : null;
//        }
//
//    }
//
//    class Entity {
//        K key;
//        V value;
//    }
//
//    public class Bucket<K, V> {
//        Node head;
//
//        class Node {
//            Node next;
//            Entity value;
//        }
//
//        public V add(Entity entity) {
//            Node node = new Node();
//            node.value = entity;
//
//            if (head == null) {
//                head = node;
//                return null;
//            }
//            Node currentNode = head;
//            while (true) {
//                if (currentNode.value.key.equals(entity.key)) {
//                    V buf = (V) currentNode.value.value;
//                    currentNode.value.value = entity.value;
//                    return buf;
//                }
//                if (currentNode.next != null) {
//                    currentNode = currentNode.next;
//                } else {
//                    currentNode.next = node;
//                    return null;
//                }
//            }
//        }
//
//        public V get(K key) {
//            Node node = head;
//            while (node != null) {
//                if (node.value.key.equals(key)) {
//                    return (V) node.value.value;
//                }
//                node = node.next;
//            }
//            return null;
//        }
//
//        public V remove(K key) {
//            if (head == null)
//                return null;
//            if (head.value.key.equals(key)) {
//                V buf = (V) head.value.value;
//                head = head.next;
//                return buf;
//            } else {
//                Node node = head;
//                while (node.next != null) {
//                    if (node.next.value.key.equals(key)) {
//                        V buf = (V) node.next.value.value;
//                        node.next = node.next.next;
//                        return buf;
//                    }
//                    node = node.next;
//                }
//                return null;
//            }
//        }
//    }
//
//    private int calculateBucketIndex(K key) {
//        return Math.abs(key.hashCode()) % buckets.length;
//    }
//
//    private void recalculate() {
//        size = 0;
//        Bucket<K, V>[] old = buckets;
//        buckets = new Bucket[old.length * 2];
//        for (int i = 0; i < old.length; i++) {
//            Bucket<K, V> bucket = old[i];
//            if (bucket != null) {
//                Bucket.Node node = bucket.head;
//                while (node != null) {
//                    put((K) node.value.key, (V) node.value.value);
//                    node = node.next;
//                }
//            }
//            old[i] = null;
//        }
//    }
//
//    public V put(K key, V value) {
//        if (buckets.length * LOAD_FACTOR <= size) {
//            recalculate();
//        }
//        int index = calculateBucketIndex(key);
//        Bucket bucket = buckets[index];
//        if (bucket == null) {
//            bucket = new Bucket();
//            buckets[index] = bucket;
//        }
//        Entity existingEntity = bucket.get(key);
//        if (existingEntity != null) {
//            V oldValue = existingEntity.value;
//            existingEntity.value = value;
//            return oldValue;
//        } else {
//            Entity entity = new Entity();
//            entity.key = key;
//            entity.value = value;
//
//            V res = (V) bucket.add(entity);
//            if (res == null) {
//                size++;
//            }
//            return res;
//        }
//    }
//
//    public V get(K key) {
//        int index = calculateBucketIndex(key);
//        Bucket bucket = buckets[index];
//        if (bucket == null)
//            return null;
//        return (V) bucket.get(key);
//    }
//
//    public V remove(K key) {
//        int index = calculateBucketIndex(key);
//        Bucket bucket = buckets[index];
//        if (bucket == null)
//            return null;
//        V res = (V) bucket.remove(key);
//        if (res != null) {
//            size--;
//        }
//        return res;
//    }
//
//    public HashMap() {
//        buckets = new Bucket[INIT_BUCKET_COUNT];
//    }
//
//    public HashMap(int initCount) {
//        buckets = new Bucket[initCount];
//    }
//
//    public static class Entry<K, V> {
//        private K key;
//        private V value;
//
//        public Entry(K key, V value) {
//            this.key = key;
//            this.value = value;
//        }
//
//        public K getKey() {
//            return key;
//        }
//
//        public V getValue() {
//            return value;
//        }
//    }
//}
//
