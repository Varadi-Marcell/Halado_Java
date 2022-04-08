package org.example.General.interfaceusage;

import org.example.General.cache.Cache;

public class Main {
    public  static void main(String args[]){

        Cache cache = new Cache();

        cache.set("titok",123);

        Hasznalat hasznalat = new Hasznalat(cache);
        hasznalat.run();
    }
}
