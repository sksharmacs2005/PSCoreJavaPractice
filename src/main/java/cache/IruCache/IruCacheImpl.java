package cache.IruCache;

import java.util.HashMap;
import java.util.Map;

public class IruCacheImpl<K, V> implements IruCache<K, V> {
    private final Map<K, V> cache = new HashMap<>();

    @Override
    public V get(K key) {
        return cache.get(key);
    }

    @Override
    public void put(K key, V value) {
        cache.put(key, value);
    }

    @Override
    public void evict(K key) {
        cache.remove(key);
    }
}

