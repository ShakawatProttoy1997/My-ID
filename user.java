
package citizeninfo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


    class user extends admin{
    static String update1 = null;
      
    public static void main(String[] args)   {
       
       
//       CitizenInfo citizen = new admin();
//       
           long start, end;
           double elapsedtime;
           admin ad = new admin();
           
           start = System.currentTimeMillis();
           ad.fileread();
           ad.update(update1);
           for(int i = 0; i<4; i++){
               try {
                   Thread.sleep(100);
               } catch (InterruptedException ex) {
                   Logger.getLogger(user.class.getName()).log(Level.SEVERE, null, ex);
               }
           }
           end = System.currentTimeMillis();
           elapsedtime = (end-start)/1000;
           System.out.println("time in seconds: "+elapsedtime);
       
     
            
              
       
    }
    
    
        
        
    
}
