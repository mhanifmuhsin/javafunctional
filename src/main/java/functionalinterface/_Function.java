package functionalinterface;

import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        System.out.println(incrementByOne(1));
        System.out.println(incrementByOneFunction.apply(2));
        System.out.println(multiply10Function.apply(incrementByOne(2)));
        System.out.println(twoFunction.apply(2));
    }

    //function old
    static int incrementByOne(int number){
        return number = number +1;
    }

    //function fresh
    static Function<Integer, Integer> incrementByOneFunction = number -> number +1;
    static Function<Integer, Integer> multiply10Function = number -> number * 10;
    static Function<Integer, Integer> twoFunction =
            incrementByOneFunction.andThen(multiply10Function);


}
