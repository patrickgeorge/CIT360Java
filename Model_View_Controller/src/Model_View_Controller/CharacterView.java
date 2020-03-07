package Model_View_Controller;

import javax.swing.*;
import java.awt.event.ActionListener;

public class CharacterView extends JFrame {
    private JLabel instructions = new JLabel("Please choose a class: 'Fighter', 'Ranger', 'Mage' " +
            "and select a level for your character.      ");
    private JLabel classLabel = new JLabel("Class:");
    private JTextField classType = new JTextField(10);
    private JLabel levelLabel = new JLabel("Level");
    private JTextField levelType = new JTextField(10);
    private JButton createButton = new JButton("CREATE");
    private JLabel strengthLabel = new JLabel("STR:");
    private JTextField strengthOutput = new JTextField(10);
    private JLabel dexLabel = new JLabel("DEX:");
    private JTextField dexOutput = new JTextField(10);
    private JLabel magicLabel = new JLabel("MAG:");
    private JTextField magicOutput = new JTextField(10);

    CharacterView() {

        // Sets up view and adds components

        JPanel jPanel = new JPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(550, 200);

        jPanel.add(instructions);
        jPanel.add(classLabel);
        jPanel.add(classType);
        jPanel.add(levelLabel);
        jPanel.add(levelType);
        jPanel.add(createButton);
        jPanel.add(strengthLabel);
        jPanel.add(strengthOutput);
        jPanel.add(dexLabel);
        jPanel.add(dexOutput);
        jPanel.add(magicLabel);
        jPanel.add(magicOutput);

        this.add(jPanel);

    }

    public String getCharacterClass() {
        return classType.getText();
    }

    public int getLevel() {
        return Integer.parseInt(levelType.getText());
    }

    public void setStrengthOutput(int solution) { strengthOutput.setText(Integer.toString(solution));
    }

    public void setDexOutput(int solution) { dexOutput.setText(Integer.toString(solution));
    }

    public void setMagicOutput(int solution) { magicOutput.setText(Integer.toString(solution));
    }

    void addCreateListener(ActionListener listenForCreateButton) {
        createButton.addActionListener(listenForCreateButton);
    }

    //Error Alert
    void displayErrorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(this, errorMessage);
    }
}
