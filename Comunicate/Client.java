package Comunicate;


import DataBox.Pack;
import display1.Display_Frame;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author parham
 */
public class Client implements Runnable {

    private Socket socket;
    private final Display_Frame display_Frame;
    public static final int PORT = 9090;
    int x ;

    public Client(boolean prev) {
      display_Frame = new Display_Frame(prev);
    }

    public boolean open() {
        try {
            socket = new Socket("localhost", 9090);
//            socket = new Socket("192.168.1.100", 9090);
            return true;
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    public void close() {
        try {
            if (socket != null) {
                socket.close();
            }
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void read() {
          
        try {

            Object object;

            while (true) {
                ObjectInputStream input
                        = new ObjectInputStream(socket.getInputStream());

                object = input.readObject();
                if (object instanceof Pack) {
//                    System.out.println(x++ +"  Read  "+socket.getRemoteSocketAddress());
                    display_Frame.updatePack((Pack) object);
                }

            }

        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void run() {

        if (open()) {
            read();
        }
    }

    public Display_Frame getDisplay_Frame() {
        return display_Frame;
    }

}
