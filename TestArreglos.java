
/**
 * Write a description of class TestArreglos here.
 * 
 * @author Roberto Salazar Marquez
 * @version 1.0
 */
public class TestArreglos
{
    // Variables de Instancia 
    private int arreglo[], arreglo4;
    private int []arreglo2, arreglo5;
    private int[] arreglo3, arreglo6 = { 0,1,2,3,4,5,6,7,8,9 }; //  Inicialización directa
    private int atributo;
    
    
    /**
     * Constructor para objetos de la clase TestArreglos
     */
    public TestArreglos()
    {
        arreglo = new int[15];
        arreglo2 = new int[10];         // inicialición automática
        arreglo5 = new int[200];
        
        for(int i = 0; i < arreglo2.length; i++)
            arreglo2[i] = i;
         
        atributo = 10;              //  Paso de parametros por valor (por copia)
        System.out.println( ejemplo(atributo) );
        
        arreglo[3] = 10;            //  Paso de parámetros por referencia (por alias)
        System.out.println( ejemplo2(arreglo) );
    }
    
    public int ejemplo(int valor) {
        valor = 2;
        return valor;
    }
    
    public int ejemplo2(int valor[]) {
        valor[3] = 2;
        return valor[3];
    }
    
    public static void main(String[] argumentos) {
        int arregloLocal[] = new int[10]; 
    }
    
}




