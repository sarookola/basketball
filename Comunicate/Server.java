package Comunicate;

import DataBox.Pack;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author parham
 */
public class Server implements Runnable {

    private ServerSocket listener;
    private final ArrayList<Socket> sockets;
    public static final int PORT = 9090;
    int x;

    private int objecsArrayLenght = 200;
    private final int maxname = 14;
    private boolean socketIsBusy;

    public Server() {
        sockets = new ArrayList<Socket>();
        socketIsBusy = false;
    }

    public boolean open() {
        try {
            listener = new ServerSocket(PORT);
            while (true) {
                try {

                    Socket socket = listener.accept();

                    sockets.add(socket);
//                    System.out.println("new socketa added :"+socket.getRemoteSocketAddress());                    

                } catch (IOException ex) {
                    Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public void close() {
        try {
            listener.close();
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void writeSocket(Pack pack) {
        if (!socketIsBusy) 
        {
            socketIsBusy = true;
            for (Socket socket : sockets) {
//           System.out.println(x++ +"  Write"+socket.getRemoteSocketAddress());
                try {
                    ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());

                    out.writeObject(pack);

                    out.flush();

                } catch (IOException ex) {

                    sockets.remove(socket);

                    Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);

                    try {
                        socket.close();
                    } catch (IOException ex1) {
                        Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex1);
                    }

                }
            }
            socketIsBusy = false;
        }
    }

    @Override
    public void run() {
        open();
    }

    public int getobjecsArrayLenght() {
        return objecsArrayLenght;
    }

    public int getMaxname() {
        return maxname;
    }

}
