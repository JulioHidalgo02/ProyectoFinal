
public class Usuario {

    
    public String nombre;
    public String apellidos;
    public String cedula;
    public String correoElectronico;
    public String contrasenia;
    public String numCelular;
     public Estados estados;
     public int cantTicketes;
    
    public Usuario() {
        nombre = "";
        apellidos = "";
        cedula = "";
        correoElectronico = "";
        contrasenia = "";
        numCelular = "";
        estados = estados.Disponible;
          
    }
}


