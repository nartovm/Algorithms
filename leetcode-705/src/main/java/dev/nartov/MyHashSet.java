package dev.nartov;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyHashSet {
    List<ArrayList<Integer>> buckets;
    int numberOfBuckets = 1000;

    public MyHashSet() {
        buckets = new ArrayList<>(numberOfBuckets);
        for (int i = 0; i < numberOfBuckets; i++) {
            buckets.add(new ArrayList<>());
        }
    }

    public void add(int key) {
        int bucketNumber = hash(key);
        ArrayList<Integer> bucket = buckets.get(bucketNumber);
        if (!this.contains(key)) bucket.add(key);
        bucket.sort(Integer::compareTo);
    }

    public void remove(int key) {
        int bucketNumber = hash(key);
        ArrayList<Integer> bucket = buckets.get(bucketNumber);
        bucket.remove((Object) key);
    }

    public boolean contains(int key) {
        int bucketNumber = hash(key);
        ArrayList<Integer> bucket = buckets.get(bucketNumber);
        return Collections.binarySearch(bucket, key) >= 0;
    }

    private int hash(int value) {
        return value % numberOfBuckets;
    }
}