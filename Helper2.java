import java.util.Scanner;

class Helper2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // we need to 'clean' the html formatting and replace the field with user input
        // this is a sample of html text we might be given
        String sample = "Welcome <b>username</b> to my site!"; 
        System.out.println("\nhere is the original string: " + sample);
        String complete = ""; // this will be the complete string

        // find the position of the html formatting
        int place1 = sample.indexOf("<b>");
        int place2 = sample.indexOf("</b>");
        // get the name of the field
        String weWant = sample.substring(place1+3, place2);

        // we will use this user input to replace the html field
        System.out.print("\nplease type " + weWant + ": ");
        String temp = s.nextLine();
        // replacing the html field with the user input
        complete = sample.substring(0, place1) + temp + sample.substring(place2+4);
        System.out.println("\nhere is the new string: " + complete);

    }
}