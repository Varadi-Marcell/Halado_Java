package org.example.General.cache;

import java.util.HashMap;
import java.util.Map;

public class Cache implements CacheRead,CacheWrite{

    Map<String,Integer> valuesMap = new HashMap<>();

    @Override
    public Integer set(String name, int value) {
        return valuesMap.put(name,value);
    }

    @Override
    public void clear() {
      valuesMap.clear();
    }

    @Override
    public void delete(String name) {
        valuesMap.remove(name);
    }

    @Override
    public int get(String name) {
        return valuesMap.get(name);
    }

    @Override
    public boolean empty() {
        return valuesMap.isEmpty();
    }
}
