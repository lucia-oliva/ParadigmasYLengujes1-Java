package com.unlar.paradigmas1;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner leer = new Scanner(System.in);
        int contadorPerro=0;
        int contadorGato=0;
        int contadorAve=0;
        int opcion;
        int pacientes;
        Animal listadoPerros[] = new Animal[50];
        Animal listadoGatos[] = new Animal[50];
        Animal listadoAves[]= new Animal[50];
        
        

        do{

            System.out.println( "\nBienvenidos al Sistema de Veterinaria. Eliga una opcion: \n");
            System.out.println( "1)Carga Datos\t 2)Mostrar datos\t 3)Salir\t");
            opcion = leer.nextInt();

        switch(opcion){
            case 1:
                //carga datos
                int opcion2,peso;
                String nombre, dueño, raza;
                System.out.println( "\nIngrese la cantidad de pacientes atendidos: ");
                pacientes= leer.nextInt();

                for(int i = 0;i<pacientes;i++){
                    

                    System.out.print("\nPaciente:" + (i+1) );
                    System.out.println("\nTipo de animal atentido: \n");
                    System.out.println( "1)Perro\t 2)Gato\t 3)Ave\t");
                    opcion2 = leer.nextInt();
                    leer.nextLine();
                    
                    if(opcion2==1){
                        System.out.println( "\nIngrese el nombre del dueño: ");
                        dueño = leer.nextLine();
                        System.out.println( "Ingrese el nombre del animal: ");
                        nombre = leer.nextLine();
                        System.out.println( "Ingrese la raza del animal: ");
                        raza = leer.nextLine();
                        System.out.println( "Ingrese el peso del animal: ");
                        peso = leer.nextInt();
                        listadoPerros[contadorPerro]=new Perro(nombre, raza, peso, dueño);
                        contadorPerro++;
                    }else if(opcion2==2){
                        System.out.println( "\nIngrese el nombre del dueño: ");
                        dueño = leer.nextLine();
                        System.out.println( "Ingrese el nombre del animal: ");
                        nombre = leer.nextLine();
                        System.out.println( "Ingrese la raza del animal: ");
                        raza = leer.nextLine();
                        System.out.println( "Ingrese el peso del animal: ");
                        peso = leer.nextInt();
                        listadoGatos[contadorGato]=new Gato(nombre, raza, peso, dueño);
                        contadorGato++;
                    }else if(opcion2==3){
                        System.out.println( "\nIngrese el nombre del dueño: ");
                        dueño = leer.nextLine();
                        System.out.println( "Ingrese el nombre del animal: ");
                        nombre = leer.nextLine();
                        System.out.println( "Ingrese la raza del animal: ");
                        raza = leer.nextLine();
                        System.out.println( "Ingrese el peso del animal: ");
                        peso = leer.nextInt();
                        listadoAves[contadorAve]=new Ave(nombre, raza, peso, dueño);
                        contadorAve++;
                    }

                    System.out.println( "\nPaciente guardado correctamente.");
                }
                
                System.out.println( "\n Carga completada con exito. ");
                
            break;
           

            case 2:
            //mostrar datos
            if(contadorPerro>0){
            System.out.println( "\nListado Perros: ");
            System.out.println( "\nCantidad total: " + contadorPerro );
            
            for(int i=0;i<contadorPerro;i++){
                listadoPerros[i].mostrarDatos();
                }
            }
            
            if(contadorGato>0){
            System.out.println( "\nListado Gatos: ");
            System.out.println( "\nCantidad total: " + contadorGato );
            
            for(int i=0;i<contadorPerro;i++){
                listadoGatos[i].mostrarDatos();
             }
            }

            if(contadorAve>0){
            System.out.println( "\nListado Aves: ");
            System.out.println( "\nCantidad total: " + contadorAve );
            
            for(int i=0;i<contadorPerro;i++){
                listadoAves[i].mostrarDatos();
                }
            }

            break;

            case 3:
            System.out.println( "\nCerrando programa.");
            break;
        }
        }while(opcion != 3);
            
        
    }

}
