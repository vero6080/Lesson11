package Assignments;

import java.util.ArrayList;

public class array11 {

    ArrayList<Integer> testdata;
    ArrayList<Integer> expected;
    String id;

    array11(ArrayList<Integer> al, ArrayList<Integer> ex, String name) {
        testdata = al;
        expected = ex;
        id = name;
    }

    public int array11(ArrayList<Integer> nums, int index) {
        //need to fix
        int count = 0;
        if (index == nums.size()) return count;
         if (nums.get(index)==11) count++;
         else
            array11(nums, index+1);
        return count;
    }
    
    /*
    Original (still broken) version
    public int array11(int[] nums, int index) {
        int count = 0;
        if (index == nums.length) return count;
         if (nums[index]==11) count++;
         else
            array11(nums, index+1);
        return count;
}
    */

    public void test() {
        System.out.println("Expected\t\tRun\tResult");
        System.out.println("====================================");
        for (int i = 0; i < testdata.size(); i++) {
            String output = id + "(" + testdata.get(i) + ")->" + expected.get(i);
            System.out.print(String.format("%-25s", output));
            int result = array11(testdata,0);
            String status = result == expected.get(i) ? "OK" : "FAIL";
            System.out.println(result + "\t" + status);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> in = new ArrayList();
        ArrayList<Integer> out = new ArrayList();

        in.add(1);
        in.add(2);
        in.add(0);
        in.add(3);
        in.add(1);
        in.add(0);
        in.add(0);
        in.add(2);
        in.add(2);

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
