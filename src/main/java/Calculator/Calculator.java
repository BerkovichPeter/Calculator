package Calculator;


public class Calculator {
    public static long calculate(long elem1, long elem2, String operation){
        long result = Long.MIN_VALUE;
        //switch на случай множества операндов
        switch (operation){
            case ("+"):
                result = elem1 + elem2;
                break;
            case ("-"):
                result = elem1 - elem2;
                break;
        }
        return result;
    }
}
