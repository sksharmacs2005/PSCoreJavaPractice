package org.java8.examples;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniquePairsSumInArray {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 4, 5, 2, 1, 6};
        int k = 7;
        Set<Pair> pairs = findUniquePairs(arr, k);
        System.out.println("Unique pairs whose sum is " + k + ": " + pairs);
    }

    public static Set<Pair> findUniquePairs(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        Set<Pair> pairs = new HashSet<>();

        for (int num : arr) {
            int complement = k - num;
            if (map.containsKey(complement) && map.get(complement) > 0) {
                pairs.add(new Pair(complement, num));
                map.put(complement, map.get(complement) - 1); // Decrement the count of the complement
            } else {
                map.put(num, map.getOrDefault(num, 0) + 1); // Increment the count of the current number
            }
        }

        return pairs;
    }
}
class Pair {
    int first, second;

    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair pair = (Pair) o;
        return (first == pair.first && second == pair.second) ||
                (first == pair.second && second == pair.first);
    }

    @Override
    public int hashCode() {
        return first + second;
    }

    @Override
    public String toString() {
        return "{" + first + ", " + second + "}";
    }
}