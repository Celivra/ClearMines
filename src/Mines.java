import javax.swing.*;
import java.awt.*;

public class Mines extends JLabel implements block{
    ImageIcon icon;
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
}
