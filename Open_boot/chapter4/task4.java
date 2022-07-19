import javax.lang.model.util.ElementScanner14;

/**
 * task4
 */
public class task4 {
public static void main(String[] args) {
int numeroif = 45;
int numeroWhile = 0;

if (numeroif > 0){
    System.out.println("el numero es positivo");
    }
else if (numeroif < 0){
        System.out.println("el numero es negativo");
    }
else
    {
        System.out.println("EL VALOR ES CERO");
    }

while (numeroWhile < 3) {
    System.out.print(numeroWhile);
    numeroWhile = numeroWhile + 1;
    }
System.out.println();
do{
    numeroWhile = numeroWhile + 1;
    System.out.print(numeroWhile);
} while (numeroWhile < 1);
System.out.println();

for(int numeroFor = 0; numeroFor <= 3; numeroFor++ ){
    System.out.print(numeroFor);
}
System.out.println();
}

}
    

