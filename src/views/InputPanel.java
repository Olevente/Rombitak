/*
* File: InputPanel.java
* Author: Orosz Levente
* Copyright: 2022, Orosz Levente
* Group: Szoft-II-N
* Date: 2022-12-18
* Github: https://github.com/Olevente/
* Licenc: GNU GPL
*/

package views;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class InputPanel extends JPanel {
    JLabel label;
    JTextField field;

    public InputPanel() {
        this.label = new JLabel("InputPanel");
        this.field = new JTextField();
        this.setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));
        this.setBorder(new EmptyBorder(10, 10, 10, 20));
        this.label.setBorder(new EmptyBorder(5, 5, 10, 10));
        this.addComponent();
    }

    public void addComponent() {
        this.add(label);
        this.add(field);
    }

    public InputPanel(JLabel label) {
        this.label = label;
    }

    public void setText(String text) {
        this.label.setText(text);
    }

    public String getText() {
        return this.label.getText();
    }

    public void setValue(String value) {
        this.field.setText(value);
    }

    public String getValue() {
        return this.field.getText();

    }

}
