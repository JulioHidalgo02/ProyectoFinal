
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
       Menu();
        
        
    
    }// Fin del Main
    
   public static void Menu(){
      ParquesNacionales parque = new ParquesNacionales();
      Hoteles hoteles = new Hoteles();
      Volcanes volcanes = new Volcanes();
      Teatros teatros = new Teatros();
      Parques_Acuaticos_Diversiones parqueAD = new Parques_Acuaticos_Diversiones();
      Playas playas = new Playas();
       int op; 
        do{
         op = Integer.parseInt(JOptionPane.showInputDialog("Digite la opción que desea elegir \n 1- Parques Nacionales \n 2- Volcanes \n 3- Teatros \n 4- Hoteles \n 5- Playas \n 6- Parques Acuaticos y Diversiones \n 0- Salir"));   
        switch(op){
            case 1:
                parque.Menu();
                
                break;
                
            case 2:
                volcanes.Menu();
                break;
                
            case 3:
                teatros.Menu();
                
                break;
                
            case 4:
                hoteles.Menu();
                
                break;
                
            case 5: 
                playas.Menu();
                break;
                
            case 6:
                
               parqueAD.Menu();
                
                break;
                
            
                
            
        }
        }while (op != 0);
         
   } 
   
    
}// Fin de la clase principal



