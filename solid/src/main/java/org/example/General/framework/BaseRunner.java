package org.example.General.framework;

import org.example.General.framework.flow.Flow1;
import org.example.General.framework.flow.PartiallyImplementFlow;

public class BaseRunner {
    public static void main(String args[]){
        run(new PartiallyImplementFlow());
    }

    private static void run(BaseFlow baseFlow){
        baseFlow.run();
    }
}
