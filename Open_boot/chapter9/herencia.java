/**
 * herencia
 */
public class herencia {
    public static void main(String[] args) {

    Cliente cliente = new Cliente ();
    Trabajador trabajador = new Trabajador();
    cliente.setEdad (18);
    cliente.setNombre( "Yusting" );
    cliente.setTelefono("3225973394");
    cliente.setCredito("ha sido aprobado el credito");
    System.out.println(cliente.getNombre() + " con edad de "  + cliente.getEdad() + " pueden llamarlo al " + cliente.getTelefono() + " diciendole que " + cliente.getCredito());
    }

    
}
class Persona {

    int edad = 12;
    String nombre;
    String telefono;

    public void setEdad (int edad){
        this.edad = edad;
    }

    public int getEdad (){
        return this.edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre (){
        return this.nombre;
    }

    public void setTelefono (String telefono){
        this.telefono = telefono;
    }

    public String getTelefono(){
        return this.telefono;
    }
}

class Cliente extends Persona{
    String credito; 

    public void setCredito (String credito) { 
        this.credito = credito;
    }

    public String getCredito (){
        return this.credito;
    }
}

class Trabajador extends Persona {
    int salario;

    public void setSalario (int salario){
        this.salario = salario;
    }

    public int getSalario(){
        return this.salario;
    }
}
