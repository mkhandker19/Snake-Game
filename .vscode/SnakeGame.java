
package snake;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
public class SnakeGame extends JPanel{
    private class Tile {
        int x;
        int y;
        
        Tile(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    int boardWidth;
    int boardHeight;
    int tileSize = 25;
    
 
    
    SnakeGame(int boardWidth, int boardHeight){
        this.boardWidth = boardWidth;
        this.boardHeight = boardHeight;
        setPreferredSize(new Dimension(this.boardWidth, this.boardHeight));
        setBackground(Color.black);
        
    }
}
