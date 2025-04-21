import Blocks.block;

import javax.swing.*;
import java.awt.*;

public class Mines extends JLabel implements block {
    ImageIcon icon;
    int x, y;
    public Mines() {
        this.icon = new ImageIcon("src/images/mines.jpeg");
        icon.setImage(icon.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));

        this.setIcon(icon);
        this.setSize(width, height);
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
