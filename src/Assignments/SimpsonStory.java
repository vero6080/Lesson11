package Assignments;

public class SimpsonStory {
    
    static String start[] = {"Simpsons in Cave", "Lisa Trapped with Burns",
    "Burns at Moe's", "Moe with Edna", "Edna in School"};
    
    static String end[] = {"Simpsons leave cave", "Lisa takes Picture with Burns",
    "Burns gets Gold", "Moe puts Gold in Machine", "Edna stays as a teacher"};
    
    public static void story(int n) {
        System.out.println(start[n]);
        if (n < 4){
            story(n+1);
            System.out.println(end[n]);
        }
        else {
            System.out.println(end[n]);
        }
    }

    public static void main(String[] args) {
        story(0);
    }
    
}
