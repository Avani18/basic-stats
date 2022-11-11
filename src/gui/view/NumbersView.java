package gui;

import java.util.*;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

import model.BasicStatsModel;
import gui.view.View;

class NumbersView implements View
{
    JTextArea jtaNumbers;
    double number;

    public NumbersView()
    {
        number = 0.0;
        jtaNumbers = new JTextArea(10,50);
        jtaNumbers.setEditable(false);
    }

    @Override
    public void update(BasicStatsModel model)
    {
        // If array is empty
        if (model.getArrayDouble().length == 0)
        {
            jtaNumbers.setText("");
        }
        // Otherwise display numbers
        else
        {
            number = model.getArrayDouble()[model.getArrayDouble().length - 1];
    	    jtaNumbers.append(number + ",");
        }
    }

    // Method to return component
    public JTextArea getView()
    {
        return jtaNumbers;
    }

}
