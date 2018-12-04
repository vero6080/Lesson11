package Assignments;

import java.util.ArrayList;

public class countPairs {

    ArrayList<String> testdata;
    ArrayList<Integer> expected;
    String id;

    countPairs(ArrayList<String> al, ArrayList<Integer> ex, String name) {
        testdata = al;
        expected = ex;
        id = name;
    }

    public int countPairs(String str) {
        //needs to be fixed
        int count = 0, index = 0;
        if (str.length() <= 1) {
            return count;
        }
        if (str.charAt(index) == str.charAt(index + 2)) {
            count++;
        } else {
            countPairs(str);
        }
        return count;
    }

    public void test() {
        System.out.println("Expected\t\tRun\tResult");
        System.out.println("====================================");
        for (int i = 0; i < testdata.size(); i++) {
            String output = id + "(" + testdata.get(i) + ")->" + expected.get(i);
            System.out.print(String.format("%-25s", output));
            int result = countPairs(testdata.get(i));
            String status = result == expected.get(i) ? "OK" : "FAIL";
            System.out.println(result + "\t" + status);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> in = new ArrayList();
        ArrayList<Integer> out = new ArrayList();
        
        in.add("axa");
        in.add("axax");
        in.add("axbx");
        in.add("hi");
        in.add("hihih");
        in.add("ihihhh");
        in.add("ihjxhh");
        in.add("a");
        in.add("aa");
        in.add("aaa");
        
        out.add(1);
        out.add(2);
        out.add(1);
        out.add(0);
        out.add(3);
        out.add(3);
        out.add(0);
        out.add(0);
        out.add(0);
        out.add(0);
        out.add(1);

        countPairs prob = new countPairs(in, out, "array11");
        prob.test();
    }

}
