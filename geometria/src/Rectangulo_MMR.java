/**
 * 
 * @author Mikel
 * Mikel Mendoza Rubio
 * Versión 1.2
 */
public class Rectangulo_MMR extends FiguraGeometrica_MMR {
	private double l1;
	private double l2;
	/**
	 * Constructor
	 * @param  tipoFigura 
	 * @param  lG 
	 * @param  lP
	 */
	public Rectangulo_MMR(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}
    /**
     * Mide el area
     */
	@Override
	public double area() {
		return l1 * l2;
	}
	/**
	 * Mide el perimetro
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
