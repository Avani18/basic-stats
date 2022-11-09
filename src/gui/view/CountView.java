package gui;

import java.util.*;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

//import model.BasicStatsModel;
import View;

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
        count = model.getArrayDouble().length;
        jtfCount.setText("" + count);
    }

}
