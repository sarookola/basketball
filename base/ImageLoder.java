/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author shayan
 */
public class ImageLoder {
    /**
     * 
     */
    public String imageSeqPath,extend;
    public int     imageSeqLength;
        BufferedImage x = null;
/**
     * 
     * @param imageSeqPath
     * @param image extend
     * @param imageSeqLength
     * @param image 
     */
    public ImageLoder(String imageSeqPath, String extend, int imageSeqLength) {
        this.imageSeqPath = imageSeqPath;
        this.extend = extend;
        this.imageSeqLength = imageSeqLength;
    }
    public BufferedImage getImage(int  i){

        if(i>imageSeqLength) i=imageSeqLength;
        try {
            x=ImageIO.read(new File(String.format(imageSeqPath+"%04d"+"."+extend , i)));
//             System.out.println("3="+ new Date().getTime());

        } catch (IOException ex) {
            Logger.getLogger(ImageLoder.class.getName()).log(Level.SEVERE, null, ex);
        }

        return x;
    }
}
