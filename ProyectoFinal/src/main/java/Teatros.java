
import javax.swing.JOptionPane;

public class Teatros {
    
       Usuario espacios[] = new Usuario[10];
   
   
 public Teatros(){ // Se inicializa el arreglos con los datos y gracias a la clase estados, se ponen todos en disponible
   for (int i = 0; i < 10; i++){
       espacios[i] = new Usuario();
   }   
 }// Fin Constructor ParquesNacionales
 
 public void Menu(){
        JOptionPane.showMessageDialog(null, "bienvenido al servicio de apartado turistico de Teatros "  );
     int ope;
        do{
            ope = Integer.parseInt(JOptionPane.showInputDialog("Digite la opción que desea elegir "
                    + "\n 1- Teatro Nacional de Costa Rica"
                    + " \n 2- Teatro Popular Melico Salazar"
                    + " \n 3- Teatro Lucho Barahona"
                    + "\n 4-  Teatro El Ángel"
                    + " \n 5- Devolver Tickete "
                    + "\n 6- Reporte"
                    + ""
                    + " \n 0- Salir" ));
         int Seleccion;   
        switch(ope){
            case 1:
                
                do{
                    Seleccion = Integer.parseInt(JOptionPane.showInputDialog("El precio del Ticket al Teatro Nacional de Costa Rica es de 9500 colones por persona "
                            + "si desea comprarlo digite: "
                            + "\n 1 "
                            + "\n Si desea reservarlo digite \n 2 "
                            + "\n Para salir digite 0 "));
                    switch(Seleccion){
                        case 1:
                          Comprar();
                          
                    break;
                        case 2:
                            Reservar();
                            break;
                    }
                    
                    
                }while(Seleccion != 0);
               break;
                
            case 2:
                
               do{
                   Seleccion = Integer.parseInt(JOptionPane.showInputDialog("El precio del ticket al Teatro Popular Melico Salazar"
                           + " es de 8000 colones por persona si desea comprarlo digite: \n 1"
                           + " \n Si desea reservarlo digite "
                           + "\n 2 \n Para salir digite 0"));
                    switch(Seleccion){
                        case 1:
                          Comprar();
                    break;
                        case 2:
                            Reservar();
                            break;
                    }
                    
                }while(Seleccion != 0);
                
                break;
                
            case 3:
                
                do{
                    Seleccion = Integer.parseInt(JOptionPane.showInputDialog("El precio del Ticket al Teatro Lucho Barahona es de "
                            + "7700 colones por persona si desea comprarlo digite: "
                            + "\n 1 "
                            + "\n Si desea reservarlo digite "
                            + "\n 2 \n Para salir digite 0"));
                    switch(Seleccion){
                        
                        case 1:
                          Comprar();
                    break;
                        case 2:
                            Reservar();
                            break;
                    }
                    
                }while(Seleccion != 0);
                break;
                
            case 4:
                
              do{
                  Seleccion = Integer.parseInt(JOptionPane.showInputDialog("El precio del Ticket al Teatro El Ángel"
                          + " es de 6500 colones por persona si desea comprarlo digite: "
                          + "\n 1 "
                          + "\n Si desea reservarlo digite "
                          + "\n 2 \n Para salir digite 0"));
                    switch(Seleccion){
                        case 1:
                          Comprar();
                    break;
                        case 2:
                            Reservar();
                            break;
                    }
                    
                }while(Seleccion != 0);
              break;
            case 5:
                
                Devolver();
                
                break;
            
            case 6:
                Reporte();
                break;
        }
        }while (ope != 0);
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
                 JOptionPane.showMessageDialog(null, "Felicidades, usted adquirió " + cantTicketes + " Ticketes"  );
                 i=10;
             }else{
                 
             } 
           }
            
   } // Fin del metodo Comprar
 
 public void Reservar(){
     String nombre, apellidos, cedula, correoElectronico, contrasenia, numCelular;
      int cantTicketes;
      nombre = JOptionPane.showInputDialog("Digite su nombre");
         apellidos = JOptionPane.showInputDialog("Digite sus apellidos");
         cedula  = JOptionPane.showInputDialog("Digite su cedula");
          numCelular = JOptionPane.showInputDialog("Digite su numero de celular");
           correoElectronico = JOptionPane.showInputDialog("Digite su correo electronico");
            contrasenia = JOptionPane.showInputDialog("Digite una contraseña");
            cantTicketes = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de ticketes que desea reservar"));
            
           for (int i = 0; i < 10; i++){
             if (espacios[i].estados == Estados.Disponible){
                 espacios[i].nombre = nombre;
                 espacios[i].apellidos = apellidos;
                 espacios[i].cedula = cedula;                // Asignacion de datos en el arreglo Usuarios.
                 espacios[i].numCelular = numCelular;
                 espacios[i].correoElectronico = correoElectronico;
                 espacios[i].contrasenia = contrasenia;
                 espacios[i].estados = Estados.Reservado;
                 JOptionPane.showMessageDialog(null, "Felicidades, usted reservó " + cantTicketes + " Ticketes"  );
                 break;
             }else{
                 
             } 
           }
     
 }
 
 public void Devolver(){
String prueba = JOptionPane.showInputDialog("Digite su cedula para devolver el tickete");
     for (int i = 0; i < 10; i++){
        if (espacios[i].cedula.equals(prueba)){
         espacios[i].estados = Estados.Disponible;
         JOptionPane.showMessageDialog(null, "Delvolvio el tickete comprado");
         i = 10;
        }else if(espacios[i].cedula != prueba){
            JOptionPane.showMessageDialog(null, "Aun no ha comprado o reservado ningun tickete");
            i = 10;
        }
    } 
 }
 
 public void Reporte(){ // El reporte se encarga de mostrar los usuarios que compraron o reservaron ticketes
    String mensaje = "";
     for (int i = 0; i < 10; i++){
        if(espacios[i].estados == Estados.Disponible){
            mensaje = mensaje + " _ ";
        }else if (espacios[i].estados == Estados.Vendido){
            mensaje = mensaje + " V ";
        }else{
          mensaje = mensaje + " R ";  
        }
    } 
     JOptionPane.showMessageDialog(null,"Reporte de ventas y/o reservas del dia: \n V = Vendido \n R = Reservado " + " \n " + mensaje);
     
 } 
    
    
    
    
    
    
    
    
    
    
}//fin teatros
