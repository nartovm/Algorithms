package dev.nartov;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class MyHashMap {
    private final int numberOfBuckets = 1000;
    private final List<LinkedList<Pair<Integer, Integer>>> buckets;

    public MyHashMap() {
        buckets = new ArrayList<>(numberOfBuckets);
        for (int i = 0; i < numberOfBuckets; i++) {
            buckets.add(new LinkedList<>());
        }
    }

    public void put(int key, int value) {
        int hash = hash(key);
        LinkedList<Pair<Integer, Integer>> bucket = buckets.get(hash);
        int position = search(bucket, key);
        if (position < 0) {
            Pair<Integer, Integer> buf = new Pair<>(key, value);
            bucket.add(buf);
        } else {
            bucket.get(position).setValue(value);
        }
    }

    public int get(int key) {
        int hash = hash(key);
        LinkedList<Pair<Integer, Integer>> bucket = buckets.get(hash);
        int position = search(bucket, key);
        return position >= 0 ? bucket.get(position).getValue() : -1;
    }

    public void remove(int key) {
        int hash = hash(key);
        LinkedList<Pair<Integer, Integer>> bucket = buckets.get(hash);
        int position = search(bucket, key);
        if (position >= 0) bucket.remove(position);
    }

    private int search(LinkedList<Pair<Integer, Integer>> bucket, int key) {
        for (int i = 0; i < bucket.size(); i++) {
            Pair<Integer, Integer> pair = bucket.get(i);
            if (pair.getKey() == key) return i;
        }
        return -1;
    }

    private int hash(int val) {
        return val % numberOfBuckets;
    }

    static class Pair<K, V> {
        private final K key;
        private V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public V getValue() {
            return value;
        }

        public K getKey() {
            return key;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }
}