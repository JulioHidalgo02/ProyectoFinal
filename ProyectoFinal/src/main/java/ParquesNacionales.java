
import javax.swing.JOptionPane;


public class ParquesNacionales {
 Usuario espacios[] = new Usuario[10];
 
 public ParquesNacionales (){ // Se inicializa el arreglos con los datos y gracias a la clase estados, se ponen todos en disponible
   for (int i = 0; i < 10; i++){
       espacios[i] = new Usuario();
   }   
 }// Fin Constructor ParquesNacionales
 
 public void Menu(){
     int op = Integer.parseInt(JOptionPane.showInputDialog("Digite la opción que desea elegir \n 1- Parques Nacional Manuel Antonio \n 2- Parque Nacional Corcovado \n 3- Parque Nacional Tortuguero \n 4- Parque Nacional Cahuita \n 5- Salir" ));
     int Seleccion;
        do{
            
        switch(op){
            case 1:
                Seleccion = Integer.parseInt(JOptionPane.showInputDialog("El precio del Ticket a Manuel Antonio es de 1500 colones por persona si desea comprarlo digite: \n 1 \n Si desea reservarlo digite \n 2 "));
                if(Seleccion == 1){
                    Comprar();
                }else if (Seleccion == 2){
                    
                }else{
                    
                }
                
                break;
                
            case 2:
                Seleccion = Integer.parseInt(JOptionPane.showInputDialog("El precio del Ticket a Manuel Antonio es de 1500 colones por persona si desea comprarlo digite: \n 1 \n Si desea reservarlo digite \n 2 "));
                if(Seleccion == 1){
                    Comprar();
                }else if (Seleccion == 2){
                    
                }else{
                    
                }
                
                break;
                
            case 3:
                Seleccion = Integer.parseInt(JOptionPane.showInputDialog("El precio del Ticket a Manuel Antonio es de 1500 colones por persona si desea comprarlo digite: \n 1 \n Si desea reservarlo digite \n 2 "));
                if(Seleccion == 1){
                    Comprar();
                }else if (Seleccion == 2){
                    
                }else{
                    
                }
                break;
                
            case 4:
                Seleccion = Integer.parseInt(JOptionPane.showInputDialog("El precio del Ticket a Manuel Antonio es de 1500 colones por persona si desea comprarlo digite: \n 1 \n Si desea reservarlo digite \n 2 "));
                if(Seleccion == 1){
                    Comprar();
                }else if (Seleccion == 2){
                    
                }else{
                    
                }
             
        }
        }while (op != 5);
 }
 
 public void Comprar(){
      String nombre, apellidos, cedula, correoElectronico, contrasenia, numCelular;
      int cantTicketes;
      nombre = JOptionPane.showInputDialog("Digite su nombre");
         apellidos = JOptionPane.showInputDialog("Digite sus apellidos");
         cedula  = JOptionPane.showInputDialog("Digite su cedula");
          numCelular = JOptionPane.showInputDialog("Digite su numero de celular");
           correoElectronico = JOptionPane.showInputDialog("Digite su correo electronico");
            contrasenia = JOptionPane.showInputDialog("Digite una contraseña");
            cantTicketes = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de ticketes que desea comprar"));
            
           for (int i = 0; i < 10; i++){
             if (espacios[i].estados == Estados.Disponible){
                 espacios[i].nombre = nombre;
                 espacios[i].apellidos = apellidos;
                 espacios[i].cedula = cedula;                // Asignacion de datos en el arreglo Usuarios.
                 espacios[i].numCelular = numCelular;
                 espacios[i].correoElectronico = correoElectronico;
                 espacios[i].contrasenia = contrasenia;
                 espacios[i].estados = Estados.Vendido;
                 JOptionPane.showMessageDialog(null, "Felicidades, usted adquirió" + cantTicketes );
                 i = 10;
             } 
           }
            
   }
 
 
}
