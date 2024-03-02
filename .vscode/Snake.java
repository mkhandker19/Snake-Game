package snake;
import java.util.*;
import javax.swing.*;
public class Snake {
    public static void main(String[] args) {
        int boardHeight = 500;
        int boardWidth = 500;
        
        JFrame frame = new JFrame("Snake");
        frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        SnakeGame game = new SnakeGame(boardHeight, boardWidth);
        frame.add(game);
        frame.pack();
    }
    
}
