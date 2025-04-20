import javax.swing.*;
import java.awt.*;

public class NormalBlock extends JLabel implements block{
    ImageIcon icon;
    public NormalBlock(){
        icon = new ImageIcon("src/images/normal.png");
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
