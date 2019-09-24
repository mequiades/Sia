/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minisia.logic;

import java.util.Date;
import java.util.List;
import minisia.UI.UI;
import minisia.data.Campus;
import minisia.data.Grade;
import minisia.data.Group;
import minisia.data.Student;
import minisia.data.Professor;

/**
 *
 * @author julioaguilera
 */

public class MiniSia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
       UI.saludar();
        
       int op=UI.seleccionar();
        
        Student paola =new Student(285314,"jeaguileraf","Julio","Aguilera",12:17:1990,);
        //(int id, String user, String firstName, String lastName, Date birthDate, List<Group> groupAttended, List<Grade> gradeReceived, Campus studyIn)
        Professor pedro = new Professor(13,"Pedro");
        
        if(op==1){
            System.out.println(paola.toString());
        }
        
        
        else if(op==2){
            System.out.println(pedro.toString());
        }
        
        else{
            System.out.print("No valido");
            
        }
        
    }
    
}

        /*
Entrega 1 - Diagrama UML
Clases con set y get. 
Decir con quien estoy trabajando.

Entrega 2 - 
marque 1 para ver estudisntes
la lista de estudiantes es : muestra


marque 2 para ver profesores

*/