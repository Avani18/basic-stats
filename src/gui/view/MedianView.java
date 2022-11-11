package gui;

import java.util.*;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

import model.BasicStatsModel;
import gui.view.View;

class MedianView implements View
{
    JTextField jtfMedian;
    double median;

    public MedianView()
    {
        median = 0.0;
        jtfMedian = new JTextField(5);
        jtfMedian.setEditable(false);
    }

    @Override
    public void update(BasicStatsModel model)
    {
        // If array is empty
        if (model.getArrayDouble().length == 0)
        {
            jtfMedian.setText("");
        }
        // Otherwise display median
        else
        {
            median = BasicStats.median(model.getArrayDouble());
            jtfMedian.setText("" + median);
        }
    }

    // Method to return component
    public JTextField getView()
    {
        return jtfMedian;
    }

}
