package Assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class array11 {

    ArrayList<int[]> testdata;
    ArrayList<Integer> expected;
    String id;

    array11(ArrayList<int[]> al, ArrayList<Integer> ex, String name) {
        testdata = al;
        expected = ex;
        id = name;
    }
     
    public int array11(int[] nums, int index) {
        int count = 0;
        if (index == nums.length) {
            return count;
        }
        if (nums[index] == 11) {
            count = 1;
        }
        return count + array11(nums, index + 1);
    }
    

    public void test() {
        System.out.println("Expected\t\t\t\tRun\tResult");
        System.out.println("======================================================");
        for (int i = 0; i < testdata.size(); i++) {
            String output = id + "(" + Arrays.toString(testdata.get(i)) + ")->" + expected.get(i);
            System.out.print(String.format("%-25s", output));
            int result = array11(testdata.get(i), 0);
            String status = result == expected.get(i) ? "OK" : "FAIL";
            if (i==7)
                System.out.println("\t" + result + "\t" + status);
            else
                System.out.println("\t\t" + result + "\t" + status);
        }
    }

    public static void main(String[] args) {
        ArrayList<int[]> in = new ArrayList();
        ArrayList<Integer> out = new ArrayList();

        int x[][] = {{1,2,11},{11,11},{1,2,3,4},{1,11,3,11,11},
            {11},{1},{},{11,2,3,4,11,5},{11,5,11}};
        for (int nums[]:x)
            in.add(nums);

        out.add(1);
        out.add(2);
        out.add(0);
        out.add(3);
        out.add(1);
        out.add(0);
        out.add(0);
        out.add(2);
        out.add(2);

        array11 prob = new array11(in, out, "array11");
        prob.test();
    }

}
