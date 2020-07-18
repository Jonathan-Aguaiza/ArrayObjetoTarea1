/*
Tarea basada en el paper.
 */
package arrayobjetotarea1;

/**
 *
 * @author Aguaiza Quimbita Jonathan Fabricio
 */
class Automovil_Combustion_Interna
{
    public String motor;
    public String serie;
    public String sistema_Alimentacion;
    public int numero_Pistones;
    public String material;
    Automovil_Combustion_Interna(String motor, String serie, String sistema_Alimentacion,
    int numero_Pistones, String material)
    {
        this.motor = motor;
        this.serie = serie;
        this.sistema_Alimentacion = sistema_Alimentacion;
        this.numero_Pistones = numero_Pistones;
        this.material = material;
    }
}
public class ArrayObjetoTarea1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("                                 UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE");
        System.out.println("\n");
        System.out.println("APELLIDOS Y NOMBRES: AGUAIZA QUIMBITA JONATHAN FABRICIO");
        System.out.println("CARRERA: INGENIERÍA AUTOMOTRIZ");
        System.out.println("ASIGNATURA: PROGRAMACIÓN");
        System.out.println("NRC: 7450");
        System.out.println("\n");
        System.out.println("              Array Objeto           ");
        
        Automovil_Combustion_Interna[] arreglo;
        
        
        arreglo = new Automovil_Combustion_Interna[10];
        
        arreglo[0] = new Automovil_Combustion_Interna("gasolina", "7458HF451", "Inyección electrónica", 4,"Hierro fundido");
        arreglo[1] = new Automovil_Combustion_Interna("diesel", "7821HA152", "Inyección", 6, "Hierro fundido");
        arreglo[2] = new Automovil_Combustion_Interna("gasolina","7139HB259", "Inyección electrónica", 4, "Aluminio");
        arreglo[3] = new Automovil_Combustion_Interna("diesel", "4830HR862", "Inyección", 4, "Hierro fundido");
        arreglo[4] = new Automovil_Combustion_Interna("diesel","4261HR364", "Inyección", 6, "Hierro fundido");
        arreglo[5] = new Automovil_Combustion_Interna("gasolina","5562HP021", "Inyección electrónica", 6, "Aluminio");
        arreglo[6] = new Automovil_Combustion_Interna("diesel","7820HH001", "Inyección", 6, "Hierro fundido");
        arreglo[7] = new Automovil_Combustion_Interna("gasolina","0215HG158", "Carburador", 4, "Hierro fundido");
        arreglo[8] = new Automovil_Combustion_Interna("gasolina","9631HM200", "Inyección electrónica", 6, "Aluminio");
        arreglo[9] = new Automovil_Combustion_Interna("diesel","9982HT154", "Inyección", 4, "Hierro fundido");
        
        for(int i = 0;i<arreglo.length; i++)
            System.out.println("Elemento en "+i+ " : "+"El vehículo es a "+
                    arreglo[i].motor + " con la siguiente serie "+arreglo[i].serie+
                    " con un sistema de alimentación de "+arreglo[i].sistema_Alimentacion+
                    " con "+arreglo[i].numero_Pistones+ " pistones y el motor es fabricado \n"+"con un material"
                            + " de "+arreglo[i].material+".");
    }
    
}





















