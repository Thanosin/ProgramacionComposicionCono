public class Circulo {
    /**
     * La clase Circulo se encarga de definir círculos que forman parte de un Cono. Como en el caso de la
     * clase cono, esta clase también cuenta con métodos que muestran y atribuyen valores a las variables que
     * utiliza esta clase.
     *
     * @author Tamara Alonso Perdomo
     */
    private float x, y;
    private float radio;

    /**
     * Constructor que se encarga de inicializar las variables de la clase circulo.
     *
     * @param cX punto del círculo.
     * @param cY punto del círculo.
     * @param r radio del círculo.
     */
    public Circulo (float cX, float cY, float r) { // constructor
        this.x = cX;
        this.y = cY;
        this.radio = r;
    }

    /**
     * Método que muestra uno de los puntos.
     *
     * @return la equis
     */
    public float getX() { return x; }

    /**
     * Método que sirve para establecer un punto.
     *
     * @param x la equis.
     */
    public void setX(float x) { this.x = x; }

    /**
     * Método que consiste en mostrar el otro punto que es el y.
     *
     * @return el punto y
     */
    public float getY() { return y; }

    /**
     * Método que puede establecer el valor del punto y.
     * @param y el punto y
     */
    public void setY(float y) { this.y = y; }

    /**
     * @return otro punto
     */
    public float getRadio() { return radio; }

    /**
     * Método que nos muestra el radio de un círculo
     * @param radio del círculo
     */
    public void setRadio(float radio) { this.radio = radio; }

    /**
     * Método que calcula el área del círculo.
     *
     * @return devuelve el resultado de la operación
     */
    public float area() { return (float)Math.PI*radio*radio; }

    /**
     * Método que imprime cada parámetro de una circunferencia.
     */
    public void imprimir () {
        System.out.print(" x=" + x);
        System.out.print(" y=" + y);
        System.out.print(" r=" + radio);
        System.out.print(" A=" + area());
    }
}