package gui;

import java.util.*;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

import model.BasicStatsModel;
import gui.view.View;

class MeanView implements View
{
    JTextField jtfMean;
    double mean;

    public MeanView()
    {
        mean = 0.0;
        jtfMean = new JTextField(5);
        jtfMean.setEditable(false);
    }

    @Override
    public void update(BasicStatsModel model)
    {
        // If array is empty
        if (model.getArrayDouble().length == 0)
        {
            jtfMean.setText("");
        }
        // Otherwise display mean
        else
        {
            mean = BasicStats.mean(model.getArrayDouble());
            jtfMean.setText("" + mean);
        }
    }

    // Method to return component
    public JTextField getView()
    {
        return jtfMean;
    }

}
