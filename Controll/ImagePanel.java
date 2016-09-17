/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controll;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author shayan
 */
class ImagePanel extends JPanel {

    String address;
    Image background;
//        ImageIcon icon = new ImageIcon();

    public ImagePanel() {
        this.address = "pictures\\testPicShayan.png";
        File f = new File(address);
        drawImage(f);
    }

    public void drawImage(File address) {
        try {
            this.address = address.getAbsolutePath();

            drawImage(ImageIO.read(address));
        } catch (IOException ex) {
            Logger.getLogger(ImagePanel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void drawImage() {
        this.address = "pictures\\testPicShayan.png";
    }

    private void drawImage(Image background) {
        this.background = background;
        repaint();
    }

    public Image getImage() {
        return background;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (background == null) {
            return;
        }
        Graphics2D g2d = (Graphics2D) g;

        Rectangle r = this.getBounds();

        AffineTransform affImageBack = new AffineTransform();
        affImageBack.scale((float) r.width / background.getWidth(null), (float) r.height / background.getHeight(null));
        g2d.drawImage(background, affImageBack, this);

    }

    void redrawImage() {
        drawImage(background);
        repaint();
    }

    void reloadImage() {
        File f = new File(address);
        try {
            drawImage(ImageIO.read(f));
        } catch (IOException ex) {
            address = "pictures\\testPicShayan.png";
            f = new File(address);
            drawImage(f);

        }

    }
}
