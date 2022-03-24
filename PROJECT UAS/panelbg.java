
package UAS;

import oop.*;
import javax.swing.*;
import java.awt.*;

public class panelbg extends JPanel{
    Image gambar;
    public panelbg(){
        gambar=new ImageIcon(getClass().getResource("/bg/bgg.jpg/")).getImage();
        
    }
    @Override
    protected void paintComponent (Graphics g){
        super.paintComponent(g);
        Graphics2D gd=(Graphics2D)g.create();
        gd.drawImage(gambar, 0, 0, getWidth(),getHeight(),null);
        gd.dispose();
    }
}
