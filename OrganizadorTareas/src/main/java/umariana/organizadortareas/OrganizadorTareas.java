package umariana.organizadortareas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Juan Eraso
 */
public class OrganizadorTareas {
    
    Scanner lector=new Scanner(System.in);
    ArrayList<Tarea> misTareas=new ArrayList<>();
    
    public static void main(String[] args) {
        
        OrganizadorTareas tarea = new OrganizadorTareas();
        tarea.mostrarMenu();
    }
    
    //Métodos
    public void mostrarMenu() {
        boolean activo=true;
        
        do {
            System.out.println("==========");
            System.out.println("MENÚ DE OPCIONES");
            System.out.println("1. Agregar Tarea");
            System.out.println("2. Mostrar Tareas");
            System.out.println("3. Mostrar Tareas (En Forma Descendente)");
            System.out.println("4. Salir");
            System.out.println("==========");
            
            int opcion=lector.nextInt();
            switch(opcion){
                
                case 1:
                    agregarTarea();
                    break;
                    
                case 2:
                    mostrarTareas();
                    break;
                    
                case 3:
                    mostrarTareasDescendente();
                    break;
                    
                case 4:
                    activo=false;
                    System.out.println("==========");
                    System.out.println("Hasta Pronto...");
                    System.out.println("==========");
                    break;
                    
                default:
                    System.out.println("¡ERROR!");
            }
        } while (activo);
    }
    
    public void agregarTarea() {
        System.out.println("==========");
        System.out.println("Ingrese la información");
                    
        System.out.println("Id:");
        int idTarea=lector.nextInt();
                    
        lector.nextLine();
        System.out.println("Descripcion:");
        String descripcion=lector.nextLine();
                    
        System.out.println("Prioridad: (1-5)");
        int prioridad=lector.nextInt();
                    
        //Creación del OBJ
        //Llenar la información
        Tarea nuevaTarea=new Tarea(idTarea, descripcion, prioridad);
        //Almacena del OBJ en la contenedora
        misTareas.add(nuevaTarea);
        System.out.println("Tarea agregada exitosamente");
        System.out.println("==========");
    }
    
    public void mostrarTareas() {
        System.out.println("==========");
        System.out.println("TAREAS REGISTRADAS");
                    
        for(Tarea t: misTareas) {
            System.out.println("Id:"+t.getIdTarea());
            System.out.println("Descripción: "+t.getDescripcion());
            System.out.println("Prioridad: "+t.getPrioridad());
            System.out.println("==========");
        }
    }
    
    public void mostrarTareasDescendente() {
        System.out.println("==========");
        System.out.println("MOSTRAR EN FORMA DESCENDENTE");
                    
        /**
        * Orden de burbuja para reorganizar las tareas
        * Según su prioridad
        * (Mayor a Menor)
        */
        int n=misTareas.size();
        for(int i=0; i<n-1; i++) {
            for(int j=0; j<n-i-1; j++) {
                if(misTareas.get(j).getPrioridad() < misTareas.get(j+1).getPrioridad()) {
                    //Reorganizar las tareas en orden descendente
                    Tarea temp=misTareas.get(j);
                    misTareas.set(j, misTareas.get(j+1));
                    misTareas.set(j+1, temp);
                }
            }
        }
        
        for(Tarea t: misTareas) {
            System.out.println("Id:"+t.getIdTarea());
            System.out.println("Descripción: "+t.getDescripcion());
            System.out.println("Prioridad: "+t.getPrioridad());
            System.out.println("==========");
        }
    }
    
}
