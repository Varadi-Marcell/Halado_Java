package org.example.General.Liscov.BadPattern;


import java.util.ArrayList;
import java.util.List;

public class Experiment {
    public static void main(String[] args) {
        List<Integer> data = new Measurment().getData();
        System.out.println(new Analize().process(data));
        System.out.println(new LaterAnalize().process(data));
        //System.out.println(new Analize().process(new ArrayList<Integer>()));
        //new Analize().process(null);
    }
}
