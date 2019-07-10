
package univesidad;

import java.util.Scanner;
public class Univesidad {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Alumnos alumno1,alumno2 ;
        Administrativo adm1;
        catedratico cate1;
        Planta planta1;
        
        alumno1=new Alumnos("Ti", "1001346644", "gutierrez pimienta", "Luis alejanadro",17,
        true, "2000114343654", "Ingenieria", "sistema", 7);
        
        adm1=new Administrativo("Cc", "1001346644", "gutierrez pimienta", "Luis alejanadro",40,
        true, "jefe", "20-06-2016");
        
        cate1= new catedratico("Cc", "1001346644", "gutierrez pimienta", "Luis alejanadro",40,
        true, "Ing.sistema ", "Calculo diferencial","20-06-2016", "25-09-2018");
        
        planta1= new Planta("Cc", "1001346644", "gutierrez pimienta", "Luis alejanadro",40,
        true, "Ing.sistema ", "Calculo diferencial","20-06-2016",20);
        
        System.out.println("Datos del Alumno");
        System.out.println("");
        System.out.println(alumno1.mostrar());
        System.out.println("");
        System.out.println("Datos del administrador");
        System.out.println("");
        System.out.println(adm1.mostrar());
        System.out.println("");
        System.out.println("Datos del catedratico");
        System.out.println("");
        System.out.println(cate1.mostrar());
        System.out.println("");
        System.out.println("Datos de planta");
        System.out.println("");
        System.out.println(planta1.mostrar());
        
        
    }
    
}
