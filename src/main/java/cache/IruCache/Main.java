package cache.IruCache;

public class Main {
    public static void main(String[] args) {
        IruCache<String, String> cache = new IruCacheImpl<>();

        // Adding values to the cache
        cache.put("1", "One");
        cache.put("2", "Two");

        // Retrieving values from the cache
        System.out.println("Key: 1, Value: " + cache.get("1")); // Output: One
        System.out.println("Key: 2, Value: " + cache.get("2")); // Output: Two

        // Evicting a value from the cache
        cache.evict("1");
        System.out.println("Key: 1, Value: " + cache.get("1")); // Output: null
    }
}