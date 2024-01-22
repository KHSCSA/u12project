import java.util.Scanner;

class KeyboardInput {
    public static void main(String[] args) { 
        // create a scanner object
        Scanner sc = new Scanner(System.in);

        // precede with a System.out prompt
        // getting String input
        System.out.print("\ntype anything: ");
        String stringVar = sc.nextLine();
        

        // getting integer input, v1
        System.out.print("\nthe safe way to get integer input: ");
        String stringVar2 = sc.nextLine();
        int numVar = Integer.parseInt(stringVar2);


        // getting integer input, (condensed v1)
        System.out.print("\nthe condensed way to get integer input: ");
        int numVar2 = Integer.parseInt(sc.nextLine());


        // getting integer input, RISKY!
        System.out.print("\nenter a number: ");
        int numVar3 = sc.nextInt();

    }
}