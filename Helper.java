public class Helper {
    public static void main(String[] args){
        // your project will require you to use .indexOf()
        // and .substring()
        // this program is meant to review those methods

        String s = "Avocados are a fruit, not a vegetable. The Eiffel Tower can be 15 cm taller during the summer. Venus is the only planet to spin clockwise.";

        // get the position of the first period
        int p1 = s.indexOf(".");
        String s1 = s.substring(0, p1+1);
        System.out.println("Here's the first sentence: " + s1);

        // get the second sentence


        // get the third sentence


    }
}
