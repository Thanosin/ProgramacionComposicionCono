/**
 * Esta es la clase que representa el programa principal, en él se encuentra un método que imprime los valores
 * que necesitamos por pantalla y el método main que se encarga de que el programa se ejecute.
 *
 * @author Thanosin
 */
public class ProgramaComposicionCono {
    /**
     * Método que imprime el los datos de un determinado objeto por pantalla.
     *
     * @param datos valores que hay que mostrar por pantalla.
     */
    private static void imprimir (Object datos) {
        System.out.println(datos);
    }

    /**
     * Método main en el que se calcula un radio aleatorio, luego ese radio debe usarse como parámetro para
     * la clase Cono y por último se invoca al método imprimir que se mencionó anteriormente.
     *
     * @param args parámetro del main
     */
    public static void main (String[] args) {
        java.util.Random aleatorio = new java.util.Random();
        for (int i=1; i<=5; i++) {
            int radio = aleatorio.nextInt(9)+1;
            Cono cono = new Cono(0, 0, radio, i, "Azul");
            cono.imprimir();
        }
    }
}
