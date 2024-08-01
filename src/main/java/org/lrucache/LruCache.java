package org.lrucache;

public interface LruCache<K,V> {
    V get(K key);
    void put(K k,V v);
    void evict(K k);
}
