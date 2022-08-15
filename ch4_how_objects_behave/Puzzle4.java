public class Puzzle4 {
    public static void main(String[] args) {
        Value[] values = new Value[6]; // *
        int number = 1;
        int i = 0;
        
        while (i < 6) {
            values[i] = new Value(); //*
            values[i].intValue = number; //*
            System.out.println(i + ": " + values[i].intValue);
            number = number * 10;
            i = i + 1; //*
        }

        int result = 0;
        i = 6;

        while (i > 0) {
            i = i - 1; //*
            result = result + values[i].doStuff(i); // values[i].doStuff(i)
            System.out.println(i + ": " + result);
        }
        System.out.println("result " + result);
    }
}

// result 543345
