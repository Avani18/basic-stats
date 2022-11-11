package gui;

import java.util.*;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

import model.BasicStatsModel;
import gui.view.View;

class MaxView implements View
{
    JTextField jtfMax;
    double max;

    public MaxView()
    {
        max = 0.0;
        jtfMax = new JTextField(5);
        jtfMax.setEditable(false);
    }

    @Override
    public void update(BasicStatsModel model)
    {
        // If array is empty
        if (model.getArrayDouble().length == 0)
        {
            jtfMax.setText("");
        }
        // Otherwise display max
        else
        {
            max = BasicStats.max(model.getArrayDouble());
            jtfMax.setText("" + max);
        }
    }

    // Method to return component
    public JTextField getView()
    {
        return jtfMax;
    }

}
