import javax.swing.*;
import java.util.Random;

public class GameWindow extends JFrame {
    int[][] minesState = new int[15][15];
    JPanel panel = new JPanel();

    public GameWindow() {
        initMines();
        this.add(panel);

        this.setTitle("Game");
        this.setSize(500, 550);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void printMinesNum(){
        for(int i = 1; i <= 10; i++){
            for(int j = 1; j <= 10; j++){
                System.out.print(minesState[i][j]+" ");
            }
            System.out.println();
        }
    }
    //生成雷
    public void initMines(){
        panel.setLayout(null);

        for(int i = 1; i <= 10; i++){
            for(int j = 1; j <= 10; j++){
                Random rand = new Random();
                int randNum = rand.nextInt(101);
                if(randNum >= 95) {
                    minesState[i][j] = 1;
                }else{
                    minesState[i][j] = 0;
                }
            }
        }

        //将雷添加到panel里
        for(int y = 1; y <= 10; y++){
            for(int x = 1; x <= 10; x++){
                Mines mines = new Mines();
                NormalBlock normalBlock = new NormalBlock();

                normalBlock.setLocation(x*normalBlock.getWidth(), y*normalBlock.getHeight());
                mines.setLocation(x*mines.getWidth(), y*mines.getHeight());
                if(minesState[y][x] == 1){
                    panel.add(mines);
                }else {
                    panel.add(normalBlock);
                }
            }
        }
    }
}
