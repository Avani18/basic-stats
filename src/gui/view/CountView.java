package gui;

import java.util.*;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

import model.BasicStatsModel;
import gui.view.View;

class CountView implements View
{
    JTextField jtfCount;
    int count;

    public CountView()
    {
        count = 0;
        jtfCount = new JTextField(5);
        jtfCount.setEditable(false);
    }

    @Override
    public void update(BasicStatsModel model)
    {
        if (model.getArrayDouble().length == 0)
        {
            jtfCount.setText("");
        }
        else
        {
            count = model.getArrayDouble().length;
            jtfCount.setText("" + count);
        }
    }

    public JTextField getView()
    {
        return jtfCount;
    }

}
