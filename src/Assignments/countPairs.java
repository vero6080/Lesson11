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
            //int result = countPairs(testdata,0);
            //String status = result == expected.get(i) ? "OK" : "FAIL";
            //System.out.println(result + "\t" + status);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> in = new ArrayList();
        ArrayList<Integer> out = new ArrayList();

        countPairs prob = new countPairs(in, out, "array11");
        prob.test();
    }

}
