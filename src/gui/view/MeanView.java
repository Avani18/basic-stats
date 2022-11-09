package gui;

import java.util.*;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

//import model.BasicStatsModel;
import View;

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
        mean = BasicStats.mean(model.getArrayDouble());
        jtfMean.setText("" + mean);
    }

}
