package org.lrucache;

public class MainCache {
    public static void main(String[] args) {

        LruCache<String,String> cache=new LruCacheImpl<>();

        //Adding the value to cache
        cache.put("1","One");
        cache.put("2","Two");

        //Retrieving the value from cache
        System.out.println("Key : 1, value : " + cache.get("1"));
        System.out.println("Key : 2, value : " + cache.get("2"));

        //Evicting the value from cache

        cache.evict("1");
        System.out.println("Key : 1, Value : " + cache.get("1"));

    }
}
