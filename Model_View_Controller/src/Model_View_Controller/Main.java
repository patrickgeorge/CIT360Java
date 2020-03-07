package Model_View_Controller;

public class Main {

    public static void main(String[] args) {
        CharacterView charView = new CharacterView();
        CharacterModel charModel = new CharacterModel();
        CharacterController charController = new CharacterController(charView, charModel);
        charView.setVisible(true);
    }
}
