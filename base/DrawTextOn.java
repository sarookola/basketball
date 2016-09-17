/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Shape;
import java.awt.font.FontRenderContext;
import java.awt.font.TextLayout;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImageOp;
import javax.swing.JPanel;

/**
 *
 * @author shayan
 */
public class DrawTextOn {

    JPanel panel;
    Graphics2D g2D;

    Font font2;
    int strok;
    int fixDivideLine=40;

    public void setFixsivideLINE(int fixsivideLINE) {
        this.fixDivideLine = fixsivideLINE;
    }

    public void setFont2(Font font2) {
        this.font2 = font2;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public void setStrok(int strok) {
        this.strok = strok;
    }

    public void setG2D(Graphics2D g2D) {
        this.g2D = g2D;
    }

    public DrawTextOn(JPanel panel) {
        this.panel = panel;

    }

    /**
     *
     * @param rectangle
     * @param xRelative
     * @param yRelative
     * @param widthRelative
     * @param heightRelative
     * @param strok
     * @param text1
     * @param font2
     * @param strokC
     * @param textC
     */
 public void drawText(Rectangle2D rectangle, double xRelative, double yRelative, double widthRelative, double heightRelative, String text1, Color textC, Color strokC) //outlined
    {text1 = text1.trim();
        if (text1.equals("")) {
            text1 = " ";
        } else {
            String text2 = "";
            for (int i = 0; i < text1.length(); i++) {
                if (text1.charAt(i) == 10) {
                    text2 = (String) text1.subSequence(i + 1, text1.length());
                    text1 = (String) text1.subSequence(0, i);
                    i = text1.length();
                }
            }
              if (text2.equals("") &  text1.length()>fixDivideLine){
                 for (int i =  text1.length()/2; i >0; i--) {
                       if (text1.charAt(i) == ' ') {
                            text2 = (String) text1.subSequence(i + 1, text1.length());
                            text1 = (String) text1.subSequence(0, i);
                             i = 0;
                       }
                 }
            }      
            if (text2.equals("")) {
                FontRenderContext frc = new FontRenderContext(null, true, true);

                TextLayout textLayout = new TextLayout(text1, font2, frc);
                Rectangle2D tlBounce = textLayout.getBounds();

                double scaleHeight = rectangle.getHeight() *( heightRelative) / (textLayout.getAscent() + textLayout.getDescent());
                double scaleWidth = rectangle.getWidth() * widthRelative / tlBounce.getWidth();
                if (scaleHeight > scaleWidth) {
                    scaleHeight = scaleWidth;
                }
                if (scaleHeight < scaleWidth) {
                    scaleWidth = scaleHeight;
                }
                scaleWidth=scaleWidth*.95;
                scaleHeight=scaleHeight*.95;
                float ascent_descent = textLayout.getAscent();

                double yOffset = scaleHeight * (ascent_descent)+((rectangle.getHeight() * heightRelative - scaleHeight * tlBounce.getHeight())/2);               
                double xoffset = (rectangle.getWidth() * widthRelative - scaleWidth * tlBounce.getWidth()) *.4;
                double x = (xRelative * 1) * rectangle.getWidth()+xoffset;
                double y = yRelative * rectangle.getHeight() + yOffset;

                AffineTransform textAt = new AffineTransform(scaleWidth , 0, 0, scaleHeight, x , y);

                Shape outline = textLayout.getOutline(textAt);

                 g2D.setPaint(new Color(strokC.getRed(), strokC.getGreen(),strokC.getBlue(), strokC.getAlpha()));                
                BasicStroke wideStroke = new BasicStroke(strok);
                g2D.setStroke(wideStroke);
                g2D.draw(outline);

                 g2D.setPaint(new Color(textC.getRed(), textC.getGreen(),textC.getBlue(), textC.getAlpha()));                
                g2D.fill(outline);
            }
            else {
                 FontRenderContext frc = new FontRenderContext(null, true, true);

                TextLayout textLayout1 = new TextLayout(text1, font2, frc);
                TextLayout textLayout2 = new TextLayout(text2, font2, frc);
                Rectangle2D tlBounce1 = textLayout1.getBounds();
                Rectangle2D tlBounce2 = textLayout2.getBounds();
                
                double scaleHeight1 = rectangle.getHeight() * ( heightRelative/2) / (textLayout1.getAscent() + textLayout1.getDescent());
                double scaleWidth1 = rectangle.getWidth() * widthRelative / tlBounce1.getWidth();
                double scaleHeight2 = rectangle.getHeight() * ( heightRelative/2) / (textLayout2.getAscent() + textLayout2.getDescent());
                double scaleWidth2 = rectangle.getWidth() * widthRelative / tlBounce2.getWidth();
                double scaleHeight = Math.min(scaleHeight1, scaleHeight2);
                double scaleWidth = Math.min(scaleWidth1,scaleWidth2);
                if (scaleHeight > scaleWidth) {
                    scaleHeight = scaleWidth;
                }
                if (scaleHeight < scaleWidth) {
                    scaleWidth = scaleHeight;
                }
                scaleWidth=scaleWidth*.95;
                scaleHeight=scaleHeight*.95;
                
                float ascent_descent1 = textLayout1.getAscent();
                float ascent_descent2 = textLayout2.getAscent();
                float ascent_descent= Math.min(ascent_descent1, ascent_descent2);
                
                double yOffset = scaleHeight * (ascent_descent);
                double xoffset = (rectangle.getWidth() * widthRelative - (scaleWidth * tlBounce1.getWidth())/.95)/2 ;
                double x = (xRelative ) * rectangle.getWidth()+xoffset;                
                double y = yRelative * rectangle.getHeight() + yOffset;

                AffineTransform textAt = new AffineTransform(scaleWidth , 0, 0, scaleHeight, x , y);

                Shape outline = textLayout1.getOutline(textAt);

                 g2D.setPaint(new Color(strokC.getRed(), strokC.getGreen(),strokC.getBlue(), strokC.getAlpha()));                
                BasicStroke wideStroke = new BasicStroke(strok);
                g2D.setStroke(wideStroke);
                g2D.draw(outline);

                 g2D.setPaint(new Color(textC.getRed(), textC.getGreen(),textC.getBlue(), textC.getAlpha()));                
                g2D.fill(outline);
                
                 y = yRelative * rectangle.getHeight() + yOffset+rectangle.getHeight()*heightRelative/2;
                 xoffset = (rectangle.getWidth() * widthRelative - scaleWidth * tlBounce2.getWidth()/.95)/2 +.01*rectangle.getWidth() * widthRelative ;
                 x = (xRelative ) * rectangle.getWidth()+xoffset;
//                 System.out.println("this is ="+text2+" recwi="+rectangle.getWidth() * widthRelative+"   :"+scaleWidth * tlBounce2.getWidth());
                 
                 textAt = new AffineTransform(scaleWidth , 0, 0, scaleHeight, x , y);
                 
                outline = textLayout2.getOutline(textAt);
                
                 g2D.setPaint(new Color(strokC.getRed(), strokC.getGreen(),strokC.getBlue(), strokC.getAlpha()));                
                 
                g2D.setStroke(wideStroke);
                g2D.draw(outline);

                 g2D.setPaint(new Color(textC.getRed(), textC.getGreen(),textC.getBlue(), textC.getAlpha()));                
                g2D.fill(outline);
                
            }
        }
    }

    
    public void drawTextWithBack(Rectangle2D rectangle, double xRelative, double yRelative, double widthRelative, double heightRelative, String text1, Color strokC, Color textC, Color back, int alpha) {
//        g2D.setColor(back);
//        g2D.fillRect((int) (xRelative * rectangle.getWidth()), (int) (yRelative * rectangle.getHeight()), (int) (rectangle.getWidth() * widthRelative), (int) (heightRelative * rectangle.getHeight()));
        drawBack(rectangle, xRelative, yRelative, widthRelative, heightRelative, back, alpha);
        drawText(rectangle, xRelative, yRelative, widthRelative, heightRelative, text1, strokC, textC);

    }

    public void drawBack(Rectangle2D rectangle, double xRelative, double yRelative, double widthRelative, double heightRelative, Color back, int alpha) {
        g2D.setPaint(new Color(back.getRed(), back.getGreen(), back.getBlue(), alpha));
        g2D.fillRect((int) (xRelative * rectangle.getWidth()), (int) (yRelative * rectangle.getHeight()), (int) (rectangle.getWidth() * widthRelative), (int) (heightRelative * rectangle.getHeight()));
    }

    public void drawImage(Rectangle2D rectangle, double xRelative, double yRelative, double widthRelative, double heightRelative, Image image) {
        int height = (int) (rectangle.getHeight() * heightRelative);
        int width = (int) (rectangle.getWidth() * widthRelative);
        int x = (int) (xRelative * rectangle.getWidth());
        int y = (int) (yRelative * rectangle.getHeight());
//g2D.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 150));
        g2D.drawImage(image, x, y, width, height, panel);
   

    }

    public void drawBorder(Rectangle2D rectangle, double xRelative, double yRelative, double widthRelative, double heightRelative, Color color, int border) {
        int height = (int) (rectangle.getHeight() * heightRelative);
        int width = (int) (rectangle.getWidth() * widthRelative);
        int x = (int) (xRelative * rectangle.getWidth());
        int y = (int) (yRelative * rectangle.getHeight());
        g2D.setPaint(color);
        g2D.draw3DRect(x, y, width, height, true);

    }

}
