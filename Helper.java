import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // the setup
    Scanner sc = new Scanner(System.in);
    String s = "you are <NAME> and you are <AGE> years old";
    String f = "";

    // finding the first thing to replace
    int i1 = s.indexOf("<");
    int i2 = s.indexOf(">");
    String replace = s.substring(i1+1, i2);
    
    // getting input from the user
    System.out.println("enter: " + replace);
    String input = sc.nextLine();

    // building the final String
    f = s.substring(0,i1) + input;

    System.out.println("final answer so far: " + f);




    // begin the next part
    String nextPart = s.substring(i2);
    System.out.println(nextPart);

    // alternate way
    i1 = s.indexOf("<", i2); // pick up where we left off
  }
}