package org.example.General.cache;

public interface CacheWrite {
    Integer set(String name, int value);
    void clear();
    void delete(String name);
}
