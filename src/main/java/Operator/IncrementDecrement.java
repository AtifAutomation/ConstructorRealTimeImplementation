package Operator;

public class IncrementDecrement {
    public static void main(String[] args) {
        //post fix
        //perform the action then increment the value
        int num=10;
        System.out.println(num++); //10
        System.out.println("************");
        System.out.println(num); //11
        System.out.println(num++ + num++ + ++num + num + ++num +num++);
        System.out.println(num); //16
        //11 + 12 + 14 + 14 + 15 + 15 = 81

    }
}
