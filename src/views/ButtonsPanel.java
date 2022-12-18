/*
* File: ButtonsPanel.java
* Author: Orosz Levente
* Copyright: 2022, Orosz Levente
* Group: Szoft-II-N
* Date: 2022-12-18
* Github: https://github.com/Olevente/
* Licenc: GNU GPL
*/

package views;
import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonsPanel extends JPanel {
    public JButton calcButton;
    public JButton aboutButton;

    public ButtonsPanel() {
        calcButton = new JButton("Számít");
        aboutButton = new JButton("Névjegy");
        addComponents();
    }

    public void addComponents() {
        add(this.calcButton);
        add(this.aboutButton);
    }

}
