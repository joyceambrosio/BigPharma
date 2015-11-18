/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigpharma.view;

import javax.swing.JInternalFrame;

/**
 *
 * @author Adeline
 */
public abstract class AbsView extends JInternalFrame {

    public AbsView() {
        super("", true, true, true, true);
    }
}
