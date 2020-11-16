
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
       Menu();
        
        
        
        
      
        
        
        
                
        
    }// Fin del Main
    
   public static void Menu(){
      ParquesNacionales parque = new ParquesNacionales();
       int op; 
        do{
         op = Integer.parseInt(JOptionPane.showInputDialog("Digite la opción que desea elegir \n 1- Parques Nacionales \n 2- Volcanes \n 3- Teatros \n 4- Hoteles \n 5- Playas \n 6- Parques Acuaticos y Diversiones \n 0- Salir"));   
        switch(op){
            case 1:
                parque.Menu();
                
                break;
                
            case 2:
                
                break;
                
            case 3:
                
                break;
                
            case 4:
                
                break;
                
            case 5: 
                
                break;
                
            case 6:
                
                break;
                
            
                
            
        }
        }while (op != 0);
         
   } 
   
    
}// Fin de la clase principal



