package org.example.General.interfaceusage;

import org.example.General.cache.Cache;
import org.example.General.cache.CacheRead;

public class Hasznalat {
    private final CacheRead cacheRead;
    public Hasznalat(CacheRead cacheRead){
        this.cacheRead=cacheRead;
    }

    public  void run(){
        System.out.println(cacheRead.get("titok"));
    }
}
