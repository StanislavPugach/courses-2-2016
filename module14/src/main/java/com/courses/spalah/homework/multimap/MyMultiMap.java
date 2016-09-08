package com.courses.spalah.homework.multimap;

import java.util.*;

/**
 * Created by Stanislav Pugach on 06.09.2016.
 */
public class MyMultiMap<K, V> implements MultiMap<K, V> {
    private HashMap<K, ArrayList<V>> map = new HashMap<K, ArrayList<V>>();
    private ArrayList<V> bucket;
    private int size = 0;

    @Override
    public boolean put(K key, V value) {
        bucket = map.get(key);
        if (bucket == null) {
            bucket = new ArrayList<V>();
            bucket.add(value);
            map.put(key, bucket);
            size++;
        } else {
            bucket.add(value);
            map.put(key, bucket);
            size++;
        }
        return true;
    }

    @Override
    public Collection<V> get(K key) {
        bucket = map.get(key);
        if (bucket != null) {
            return bucket;
        }

        return new ArrayList<V>();
    }

    @Override
    public Collection<V> removeAll(K key) {
        bucket = map.get(key);
        int count = 0;
        if (bucket != null) {
            ArrayList<V> lastState = new ArrayList<V>(bucket);
            Iterator<V> bucketIterator = bucket.iterator();
            while (bucketIterator.hasNext()) {
                bucketIterator.next();
                bucketIterator.remove();
                count++;
            }
            size -= count;
            return lastState;
        }

        return new ArrayList<V>();
    }

    @Override
    public boolean remove(K key, V value) {
        bucket = map.get(key);
        if (bucket.size() != 0) {
            Iterator<V> bucketIterator = bucket.iterator();
            while (bucketIterator.hasNext()) {
                if (bucketIterator.next().equals(value)) {
                    bucketIterator.remove();
                    size--;
                    break;
                }
            }
            return true;
        }

        return false;
    }

    @Override
    public Collection<V> allValues() {
        ArrayList<V> allElements = new ArrayList<V>();
        for (Map.Entry<K, ArrayList<V>> num :
                map.entrySet()) {
            ArrayList<V> bucket = num.getValue();
            allElements.addAll(bucket);
        }
        return allElements;
    }

    @Override
    public boolean containsValue(V value) {
        for (Map.Entry<K, ArrayList<V>> num :
                map.entrySet()) {
            ArrayList<V> bucket = num.getValue();
            for (V obj :
                    bucket) {
                if (value.equals(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        if (this.bucket.isEmpty()){
            return true;
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

//    public static void main(String[] args) {
//        MyMultiMap<String, String> myMultiMap = new MyMultiMap<>();
//
//        myMultiMap.put("fruits", "apple");
//        myMultiMap.put("fruits", "banana");
//        myMultiMap.put("fruits", "mango");
//        myMultiMap.put("cars", "honda");
//        myMultiMap.put("cars", "toyota");
//        myMultiMap.put("cars", "lexus");
//
//
//        System.out.println(myMultiMap.get("fruits"));
//
////        myMultiMap.removeAll("fruits");
////        myMultiMap.remove("fruits","mango");
//
//        System.out.println(myMultiMap.get("fruits"));
//
//        System.out.println(myMultiMap.allValues());
//
//        System.out.println(myMultiMap.containsValue("lexus"));
//
//    }

}
