package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

import model.BasicStatsModel;
import gui.view.View;


public class UndoViewController implements View
{
    private BasicStatsGUI gui;

    JButton jbUndo;

    
    public UndoViewController(BasicStatsGUI gui, JPanel jpInput) {
	this.gui = gui;
	jbUndo = new JButton("Undo Add Number");
    jbUndo.setEnabled(false);

	jpInput.add(jbUndo);
	
	jbUndo.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		    // Parse input and add number to the ArrayList	    
		    gui.undoAdd();
		}
	    });
    }

    public void update(BasicStatsModel model) {
	// Reset
	if (model.getArrayDouble().length == 0) {
	    jbUndo.setEnabled(false);
	}
    else {
        jbUndo.setEnabled(true);
    }
    }

    // TODO 
    public String getStringValue() {	
	// This is a snapshot of the current value to support
	// testability and debuggability without breaking the encapsulation.
	return "Undo Button";
    }
}
