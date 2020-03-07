package App_Control_Pattern;

import java.util.HashMap;

public class AlphabetController {
    private final HashMap<String, AlphabetHandler> alphaManager = new HashMap();

    public void manageRequest(String request, HashMap<String, Object> song) {

        AlphabetHandler handler = alphaManager.get(request);
        if (handler != null) {
            handler.alphaHandler(song);
        }
    }

    public void mapCommand(String command, AlphabetHandler handler) {
        alphaManager.put(command, handler);
    }
}
