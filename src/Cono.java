/**
 * Clase que se encarga de definir conos. Esta clase contiene una serie de métodos que nos permite cambiar y
 * ver los valores que esta tomando el cono en cuestión y también dispone de un método imprimir que nos
 * muestra estos valores por pantalla.
 *
 * @author Thanosin
 */
public class Cono {
    private Circulo base;
    private float altura;
    private String color;

    /**
     * Este es el constructor, gracias a él se puede establecer la base, la altura y el color de un cono.
     *
     * @param cX punto x del círculo.
     * @param cY punto y del círculo.
     * @param r radio del Cono.
     * @param h altura del Cono.
     * @param color que tiene el Cono.
     */
    public Cono (float cX, float cY, float r, float h, String color) { // constructor
        this.base = new Circulo(cX, cY, r);
        this.altura = h;
        this.color = color;
    }

    /**
     * Método que muestra el tamaño de la base.
     *
     * @return la base del Cono.
     */
    public Circulo getBase() {
        return base;
    }

    /**
     * Método que establece cuál será la base del Cono.
     *
     * @param base del Cono.
     */
    public void setBase(Circulo base) {
        this.base = base;
    }

    /**
     * Método que muestra la altura del Cono.
     *
     * @return altura del Cono.
     */
    public float getAltura() {
        return altura;
    }

    /**
     * Método que establece la altura del Cono
     *
     * @param altura del Cono
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    /**
     * Método que muestra el color de un Cono
     *
     * @return color del Cono
     */
    public String getColor() {
        return color;
    }

    /**
     * Método que establece el color del Cono.
     *
     * @param color del cono
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Método que imprime por pantalla la altura y el color del Cono.
     */
    public void imprimir () {
        base.imprimir();
        System.out.println(" h=" + altura + " c=" + color);
    }
}
