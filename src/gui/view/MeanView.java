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
        if (model.getArrayDouble().length == 0)
        {
            jtfMean.setText("");
        }
        else
        {
            mean = BasicStats.mean(model.getArrayDouble());
            jtfMean.setText("" + mean);
        }
    }

    public JTextField getView()
    {
        return jtfMean;
    }

}
