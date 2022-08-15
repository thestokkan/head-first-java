public class TenBottles {

    public static void main(String[] args) {
        int numBottles = 10;
        String word = "bottles";

        while (numBottles > 1) {
            String phrase1 = numBottles + " green " + word + ", hanging on the wall.\n";
            String phrase2 = "And if one green bottle accidentally falls, \n";

            numBottles -= 1;
            if (numBottles < 2) {
                word = "bottle";
            }

            String phrase3 = "there'll be " + numBottles + " green " + word + " hanging on the wall.\n";

            System.out.println(phrase1  + phrase1 + phrase2 + phrase3);
            
        }
        
        System.out.println("One green bottle, hanging on the wall");
        System.out.println("One green bottle, hanging on the wall");
        System.out.println("And if the last green bottle accidentally falls,");
        System.out.println("there'll be no green bottles hanging on the wall");

    }
}
