/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programamesanfermines;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 *
 * @author salcu
 */
public class ProgramameSanFermines {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ent=new Scanner(System.in);
        Pattern pattern=null;
            try{
                pattern  = Pattern.compile("\\d+");
            }catch(PatternSyntaxException e){            
                System.out.println("Error a l'expressió regular: "+e.getDescription()+"\nTorna-ho a provar.");
              
            }
        while (ent.hasNext()) {
            long toros=Long.valueOf(ent.next(pattern));
            long maxim=0;
            while(toros-->0){
                long dato=Long.valueOf(ent.next(pattern));
                if(maxim<dato) maxim=dato; 
            }
            System.out.println(maxim);
        }
        ent.close();
    }
    
}
 