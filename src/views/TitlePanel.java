/*
* File: TitlePanel.java
* Author: Orosz Levente
* Copyright: 2022, Orosz Levente
* Group: Szoft-II-N
* Date: 2022-12-18
* Github: https://github.com/Olevente/
* Licenc: GNU GPL
*/

package views;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class TitlePanel extends JPanel {
    JLabel mainLabel;

    public TitlePanel() {
        this.mainLabel = new JLabel("Rombusz kerület és terület számítása");
        this.mainLabel.setFont(new Font("Lithos Pro", Font.BOLD, 15));
        this.mainLabel.setHorizontalAlignment(SwingConstants.CENTER);
        this.mainLabel.setBorder(new EmptyBorder(10, 10, 10, 80));

        this.add(this.mainLabel);
    }

}