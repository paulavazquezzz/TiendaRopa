
public class Pantalon extends Prenda {
	private String cortePantalon; 
	public Pantalon(String modelo, String color, Talla talla, double precio, int stock, String cortePantalon) {
        super(modelo, color, talla, precio, stock);
        this.cortePantalon=cortePantalon;
    }
	
}
