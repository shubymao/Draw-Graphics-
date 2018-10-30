package TestGraphics;

import javax.swing.*;
import java.awt.*;

public class Tester {
    static int width = 1000, height = 800;

    public static void main(String[] args) {
        JFrame f = new JFrame("Test Shape");
        f.setSize(width, height);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Integer[] ar = new Integer[50];
        for (int i = 0; i < 50; i++) ar[i] = (Integer) Math.round((float) Math.random() * (700) + 5);
        DrawArray arr = new DrawArray(ar);
        arr.setPreferredSize(new Dimension(1000,800));
        f.add(arr);
        f.setBackground(Color.DARK_GRAY);
        f.setVisible(true);
        BubbleSort b = new BubbleSort();
        b.sort((Comparable[]) ar, arr);

    }
}
