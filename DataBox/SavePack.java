package DataBox;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author BMW
 */
public class SavePack implements Serializable {


    public void openFile(String path) throws IOException {
        BufferedReader reader = null;
        try {
           reader  = new BufferedReader(
		   new InputStreamReader(
                      new FileInputStream(path), "UTF8"));
         //   reader = new BufferedReader(path)   ;                 ;
            int all=-1;
            ArrayList<String> q = new ArrayList<>();
            ArrayList<String> a = new ArrayList<>();
         do{
           all++;
                q.add(reader.readLine());
                a.add(reader.readLine());}
        while((reader.readLine() != null )&&( q.get(all) != null )&& (a.get(all) != null) );
int allcount=all;
//            System.out.println("allcount="+allcount);
//         Letter1Packin(allcount);
            
            for (int i = 0; i < allcount; i++) {
//                question[i] = q.get(i);
//                answers[i] = a.get(i);           
//                System.out.println("this is i="+i+" and its ="+question[i]+"\t"+answers[i]);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SavePack.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            reader.close();
        } catch (IOException ex) {
            Logger.getLogger(SavePack.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         List<Integer> temp = new LinkedList<Integer>();
                    int tt;
     
        }
        

}
