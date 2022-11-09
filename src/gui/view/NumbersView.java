package gui;

import java.util.*;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

//import model.BasicStatsModel;
import View;

class NumbersView implements View
{
    JTextArea jtaNumbers;
    double number;

    public CountView()
    {
        number = 0.0;
        jtaNumbers = new JTextArea(10,50);
        jtaNumbers.setEditable(false);
    }

    @Override
    public void update(BasicStatsModel model)
    {
        num = model.getArrayDouble()[model.getArrayDouble().length - 1];
	    jtaNumbers.append(num + ",");
    }

}
