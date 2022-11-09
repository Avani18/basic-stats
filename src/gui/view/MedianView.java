package gui;

import java.util.*;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

//import model.BasicStatsModel;
import View;

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
        median = BasicStats.median(model.getArrayDouble());
        jtfMedian.setText("" + median);
    }

}
