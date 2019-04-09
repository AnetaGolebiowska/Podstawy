package Day8.Lambdas;


import java.util.function.BiFunction;
import java.util.function.Function;

public class LambdasExample {

   public Function<Integer, Integer> power (){ // przy jednym parametrze
       return x-> x * x;
    }
    public BiFunction <Integer, Integer, Integer> add(){
       return (x, y) -> x + y;
    }
}
