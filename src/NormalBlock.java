import Blocks.MinesInit;
import Blocks.block;
import Blocks.pair;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.LinkedList;
import java.util.Queue;

public class NormalBlock extends JLabel implements block {
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
                //当前点击的方块是否已经被访问过
                if(MinesInit.TouchMap[e.getX()][e.getY()] == 1){return;}

                //判断点击的方块是否为雷
                if(MinesInit.minesState[getX()][getY()] == 0){
                    //扩展
                }else{
                    //游戏结束
                }
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
