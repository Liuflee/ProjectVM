package vm.classes;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

/**
 *
 * @author Liuflee, K3YgON, GWhiteWolf
 */
public class GamePanel extends JPanel implements Runnable{
    
    final int originalTileSize = 16; //16x16 pixeles
    final int scale = 3;
    final int tileSize = originalTileSize * scale;
    final int screenColumns = 16;
    final int screenRows = 12;
    final int screenWidth = tileSize * screenColumns; //768 px
    final int screenHeight = tileSize * screenRows; // 576 px
    
    Thread gameThread;
    
    public GamePanel() {
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
    }

    public void startGameThread() {
        gameThread = new Thread(this);
        gameThread.start(); 
    }
    
    @Override
    public void run() {
        
        while(gameThread != null) {
            System.out.println("El juego ta corriendo");
        }
        
        
    }
    
    
    
}
