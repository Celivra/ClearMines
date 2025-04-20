package Blocks;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class NormalBlock extends JLabel implements block{
    ImageIcon icon;
    int x, y;
    public NormalBlock(){
        icon = new ImageIcon("src/images/normal.png");
        icon.setImage(icon.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));

        this.setIcon(icon);
        this.setSize(width, height);


        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ///判断有无雷，
            }
        });
    }
    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
        this.setLocation(x, y);
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
}
