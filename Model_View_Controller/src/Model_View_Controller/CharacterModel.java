package Model_View_Controller;

public class CharacterModel {
    private CharacterView charView;

    //Result of calculations
    private int strengthValue = 10;
    private int dexValue = 10;
    private int magicValue = 10;

    public void getStats(String charClass, int level){
        switch (charClass) {
            case "Fighter":
            case "fighter":
                strengthValue *= level;
                dexValue += level;
                magicValue += level;
                break;
            case "Ranger":
            case "ranger":
                strengthValue += level;
                dexValue *= level;
                magicValue += level;
            case "Mage":
            case "mage":
                strengthValue += level;
                dexValue += level;
                magicValue *= level;
        }
    }

    public int getStrengthValue(){
        return strengthValue;
    }

    public int getDexValue(){
        return dexValue;
    }

    public int getMagicValue(){
        return magicValue;
    }
}
