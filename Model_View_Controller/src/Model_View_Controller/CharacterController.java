package Model_View_Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CharacterController {
    private CharacterView charView;
    private CharacterModel charModel;

    public CharacterController(CharacterView charView, CharacterModel charModel) {
        this.charView = charView;
        this.charModel = charModel;


        this.charView.addCreateListener(new CharacterController.CharacterListener());
    }

    class CharacterListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String classValue = "";
            int levelValue = 0;

            try{
                classValue = charView.getCharacterClass();
                levelValue = charView.getLevel();
                charModel.getStats(classValue, levelValue);
                charView.setStrengthOutput(charModel.getStrengthValue());
                charView.setDexOutput(charModel.getDexValue());
                charView.setMagicOutput(charModel.getMagicValue());
            }

            catch(NumberFormatException ex){
                System.out.println(ex);
                charView.displayErrorMessage("Class must be string, Level must be integer");
            }
        }
    }
}
