/**
 * task-8 video
 */
public class task {
    public static void main(String[] args) {

        Persona persona = new Persona ();
        persona.setEdad (15);
        persona.setNombre("Yusting Rosero");
        persona.setTelefono(602647839);
        int edad = persona.getEdad();
        String nombre = persona.getNombre();
        int telefono = persona.getTelefono();
        System.out.print("soy " + nombre);
        System.out.print(" y tengo " + edad); 
        System.out.print(" me puede contactar al " + telefono);
        System.out.println();
    }    
    }
    
    class Persona {

        private int edad;
        private String nombre;
        private int telefono;

        public void setEdad(int edad) {
            this.edad = edad;    
        }

        public int getEdad(){
            return this.edad;   
        }

        public void setNombre(String nombre){
            this.nombre = nombre;
        }

        public String getNombre(){
            return this.nombre;
        }

        public void setTelefono(int telefono){
            this.telefono = telefono;
        }

        public int getTelefono(){
            return this.telefono;
        }



    }

