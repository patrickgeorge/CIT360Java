package App_Control_Pattern;

import java.util.HashMap;

public class AlphabetCatcher implements AlphabetHandler {
    @Override
    public void alphaHandler(HashMap<String, Object> index) {
        System.out.println("Printing alphabet index: ");
        System.out.println();

        for (int i = 1; i < 27; i++) {
            System.out.println(index.get(Integer.toString(i)));
        }

    }
}
