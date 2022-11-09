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
        if (model.getArrayDouble().length == 0)
        {
            jtfMax.setText("");
        }
        else
        {
            max = BasicStats.max(model.getArrayDouble());
            jtfMax.setText("" + max);
        }
    }

    public JTextField getView()
    {
        return jtfMax;
    }

}
