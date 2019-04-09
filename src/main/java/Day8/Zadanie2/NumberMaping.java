package Zadanie2;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class NumberMaping {

   private Map <Integer, String> integerMap = new HashMap<>();

    public void add (Integer key, String value){
        integerMap.putIfAbsent(key, value);
    }
    public Optional <String> get (Integer key){
      String word = integerMap.get(key); // pobieramy wartośc z mapy
      return Optional.ofNullable(word); // opakowujemy pobraną wartość w optionalu
    }
}
