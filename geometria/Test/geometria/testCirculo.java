package geometria;


import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
import org.junit.runner.RunWith;
import org.junit.Test;

public class testCirculo {
	

	@Test
	public void testArea() {
		Circulo_MMR c = new Circulo_MMR(7);
		double area = c.area();
		assertEquals(area,153.86,0.01);
	}

	@Test
	public void testPerimetro() {
		Circulo_MMR c = new Circulo_MMR(0.-3);
		double perimetro = c.permietro();
		assertEquals(perimetro,0,01);
	}

}