
package univesidad;

import java.util.ArrayList;
import java.util.Scanner;
public class Univesidad {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Alumnos alumno1;
        Administrativo adm1;
        catedratico cate1;
        Planta planta1;
        
        
        String tipoDocumento , Documento, Apellido,  Nombres, cargo , fechaContrato,
                codigo, facultad,  programa, profesion, asignatura, fechaInicio, fechaFin;
        
        int edad,semestre, cantProyectos;
        boolean activo;
        
        
        int op=0;
        
        ArrayList <Alumnos> PersonalAlumno = new ArrayList();
        ArrayList <Administrativo> Administrativo = new ArrayList();
        ArrayList <catedratico> catedraticos = new ArrayList();
        ArrayList <Planta> Plantas = new ArrayList();
       boolean seguir=true;
       
        do{
            
            System.out.println("-------Registro Universidad-----");
            System.out.println("--------------------------------");
            System.out.println("[1] Alunmos");
            System.out.println("[2] Adiministrativo");
            System.out.println("[3] Docentes");
            System.out.println("[4] Mostrar Datos");
            System.out.println("Seleccione una opcion");
            System.out.println("---------------------------------");
            op=leer.nextInt();
        
            switch(op){
                case 1:
                    System.out.println("");
                    System.out.println("Ingrese Tipo de Documento: ");
                    tipoDocumento=leer.next();
                    System.out.println("");

                    System.out.println("Ingrese Documento: ");
                    Documento=leer.next();
                    System.out.println("");

                    System.out.println("Ingreses Nombres: ");
                    Nombres=leer.next();
                    System.out.println("");

                    System.out.println("Ingrese Apellidos: ");
                    Apellido=leer.next();
                    System.out.println("");

                    System.out.println("Ingrese edad: ");
                    edad=leer.nextInt();
                    System.out.println("");

                    System.out.println("Ingrese Estado true / false: ");
                    activo=leer.nextBoolean();
                    System.out.println("");

                    System.out.println("Ingrese Codigo: ");
                    codigo=leer.next();
                    System.out.println("");

                    System.out.println("Ingrese Facultadad:");
                    facultad=leer.next();
                    System.out.println("");

                    System.out.println("Ingrese Programa: ");
                    programa=leer.next();
                    System.out.println("");

                    System.out.println("Ingrese Semestre: ");
                    semestre=leer.nextInt();
                    System.out.println("");



                    alumno1=new Alumnos(tipoDocumento, Documento, Apellido, Nombres,edad,
                    activo, codigo, facultad,programa,semestre);

                    PersonalAlumno.add(alumno1);             
                break;
                
                case 2:
                    System.out.println("");
                    System.out.println("Ingrese Tipo de Documento: ");
                    tipoDocumento=leer.next();
                    System.out.println("");

                    System.out.println("Ingrese Documento: ");
                    Documento=leer.next();
                    System.out.println("");

                    System.out.println("Ingreses Nombres: ");
                    Nombres=leer.next();
                    System.out.println("");

                    System.out.println("Ingrese Apellidos: ");
                    Apellido=leer.next();
                    System.out.println("");

                    System.out.println("Ingrese edad: ");
                    edad=leer.nextInt();
                    System.out.println("");

                    System.out.println("Ingrese Estado true / false: ");
                    activo=leer.nextBoolean();
                    System.out.println("");
                    
                    System.out.println("Ingrese cargo: ");
                    cargo=leer.next();
                    System.out.println("");
                    
                    System.out.println("Ingrese fecha de contrato: ");
                    fechaContrato=leer.next();
                    System.out.println("");

                    adm1= new Administrativo(tipoDocumento, Documento, Apellido, Nombres,edad,
                        activo,cargo,fechaContrato );
                    
                    Administrativo.add(adm1);
                    break;
                    
                    
                case 3:
                    int profesor=0;
                    System.out.println("");
                    System.out.println("[1] Catedratico");
                    System.out.println("[2] Planta");
                    System.out.println("");
                    System.out.println("Seleccione una opcion: ");
                    profesor=leer.nextInt();
                    
                    switch(profesor){
                        case 1:
                            System.out.println("");
                            System.out.println("Ingrese Tipo de Documento: ");
                            tipoDocumento=leer.next();
                            System.out.println("");

                            System.out.println("Ingrese Documento: ");
                            Documento=leer.next();
                            System.out.println("");

                            System.out.println("Ingreses Nombres: ");
                            Nombres=leer.next();
                            System.out.println("");

                            System.out.println("Ingrese Apellidos: ");
                            Apellido=leer.next();
                            System.out.println("");

                            System.out.println("Ingrese edad: ");
                            edad=leer.nextInt();
                            System.out.println("");

                            System.out.println("Ingrese Estado true / false: ");
                            activo=leer.nextBoolean();
                            System.out.println("");
                            
                            System.out.println("Ingrese la profesion: ");
                            profesion=leer.next();
                            System.out.println("");
                            
                            System.out.println("Ingrese Asignatura: ");
                            asignatura=leer.next();
                            System.out.println("");
                            
                            System.out.println("Ingrese Fecha De Incio: ");
                            fechaInicio=leer.next();
                            System.out.println("");
                            
                            System.out.println("Ingrese Fecha De Fin: ");
                            fechaFin=leer.next();
                            System.out.println("");
                            
                            cate1= new catedratico(tipoDocumento, Documento, Apellido, Nombres,edad
                                    ,activo,profesion, asignatura,fechaInicio, fechaFin);
                            
                            catedraticos.add(cate1);
                            
                            break;
                            
                        case 2:
                            
                            System.out.println("");
                            System.out.println("Ingrese Tipo de Documento: ");
                            tipoDocumento=leer.next();
                            System.out.println("");

                            System.out.println("Ingrese Documento: ");
                            Documento=leer.next();
                            System.out.println("");

                            System.out.println("Ingreses Nombres: ");
                            Nombres=leer.next();
                            System.out.println("");

                            System.out.println("Ingrese Apellidos: ");
                            Apellido=leer.next();
                            System.out.println("");

                            System.out.println("Ingrese edad: ");
                            edad=leer.nextInt();
                            System.out.println("");

                            System.out.println("Ingrese Estado true / false: ");
                            activo=leer.nextBoolean();
                            System.out.println("");
                            
                            System.out.println("Ingrese la profesion: ");
                            profesion=leer.next();
                            System.out.println("");
                            
                            System.out.println("Ingrese Asignatura: ");
                            asignatura=leer.next();
                            System.out.println("");
                            
                            System.out.println("Ingrese Fecha De Contrato: ");
                            fechaContrato=leer.next();
                            System.out.println("");
                            
                            System.out.println("Ingrese la Cantidad de proyectos: ");
                            cantProyectos =leer.nextInt();
                            System.out.println("");
                            
                            planta1 = new Planta(tipoDocumento, Documento, Apellido, Nombres,edad
                                    ,activo,profesion, asignatura,fechaContrato, cantProyectos);
                            
                            Plantas.add(planta1);
                            
                            break;
                        
                    }
                    
                    
                    
                    break;
                    
                case 4:
                    int mostrar=0;
                    System.out.println("");
                    System.out.println("--------------------");
                    System.out.println("[1] Alumnos");
                    System.out.println("[2] Administrativos");
                    System.out.println("[3] Docentes");
                    System.out.println("--------------------");
                    System.out.println("Seleccione una opcion: ");
                    mostrar=leer.nextInt();
                    
                    switch(mostrar){
                        case 1:
                            System.out.println("-------Alumnos-------");
                            System.out.println("");
                            for(int q=0; q<PersonalAlumno.size(); q++){   
                                System.out.println(PersonalAlumno.get(0).mostrar());
                                System.out.println("");
                            }
                            break;
                        case 2:
                            System.out.println("-------Administrativos-------");
                            System.out.println("");
                            for(int q=0; q<Administrativo.size(); q++){   
                                System.out.println(Administrativo.get(0).mostrar());
                                System.out.println("");
                            }
                            break;
                        case 3:
                            int mostraop=0;
                            System.out.println("-----------------");
                            System.out.println("[1] Catedraticos");
                            System.out.println("[3] Planta");
                            System.out.println("Seleccione una opcion: ");
                            mostraop=leer.nextInt();
                            
                            switch(mostraop){
                                case 1:
                                    System.out.println("-------catedraticos-------");
                                    System.out.println("");
                                    for(int q=0; q<catedraticos.size(); q++){   
                                        System.out.println(catedraticos.get(0).mostrar());
                                        System.out.println("");
                                    }
                                break;
                                
                                case 2:
                                    System.out.println("-------Planta-------");
                                    System.out.println("");
                                    for(int q=0; q<Plantas.size(); q++){   
                                        System.out.println(Plantas.get(0).mostrar());
                                        System.out.println("");
                                    }
                                 break;
                                    
                            
                            }
                            break;
                            
                            
                    }
                    
                    
                    break;
            }
        }while(seguir=!false);
        
             
       
                
                
         
        
        
        
        
        
        
        
    }
    
        
    
}
