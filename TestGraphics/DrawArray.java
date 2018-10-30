package TestGraphics;
import java.util.concurrent.TimeUnit;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class DrawArray extends JPanel{
    Integer[] arr;
    int x=0;
    int y=0;
    int width=0;
    int height=0;
    DrawArray(Integer a[]){
        arr = a;
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.WHITE);
        width=(getWidth())/arr.length;
        g.setColor(Color.BLACK);
        for(int i=0;i<arr.length;i++){
            y=Math.round(getHeight()-arr[i]);
            x=i*width;
            g.drawRect(x,y,width,arr[i]);
        }
    }
    public void refresh(Integer a[]){
        arr=a;
        repaint();
    }
}
