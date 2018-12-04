package Assignments;

import java.util.ArrayList;

public class countPairs {
    
    ArrayList<Integer> testdata;
    ArrayList<Integer> expected;
    String id;

    countPairs(ArrayList<Integer> al, ArrayList<Integer> ex, String name) {
        testdata = al;
        expected = ex;
        id = name;
    }
    
    public void test() {
        System.out.println("Expected\t\tRun\tResult");
        System.out.println("====================================");
    }

    public static void main(String[] args) {
        ArrayList<Integer> in = new ArrayList();
        ArrayList<Integer> out = new ArrayList();
        
        countPairs prob = new countPairs(in, out, "array11");
        prob.test();
    }
    
}
