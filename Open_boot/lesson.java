/**
 * lesson
 */
public class lesson {
    public static void main(String [] args) {
        
        int resultado = 0;
        resultado = suma ( 3, 4, 12);
        System.out.println(resultado);
        coche micarro = new coche();
        micarro.qdepuertas();
        micarro.qdepuertas();
        System.out.println("el numero de puertas es " + micarro.puertas);
    
    }
public static int suma( int a, int b, int c) {

    return a+b+c;
    
}
   
}
class coche {

    public int puertas = 4;

    public void qdepuertas(){
        this.puertas++;
    }
 
}
