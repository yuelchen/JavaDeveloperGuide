public class Plate {	
	private String color;
	private String shape;
	private char size; 		//s (small), m (medium), l (large)
	private double weight;
	private Plate nextPlate;
	
	public Plate(String pColor, String pShape, char pSize, double pWeight) {
		this.color = pColor;
		this.shape = pShape;
		this.size = pSize;
		this.weight = pWeight;
		this.nextPlate = null;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public String getShape() {
		return this.shape;
	}
	
	public char getSize() {
		return this.size;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	public void setNextPlate(Plate plate) {
		this.nextPlate = plate;
	}
	
	public Plate getNextPlate() {
		return this.nextPlate;
	}
	
	public String toString() {
		return "A " + this.color + " " + this.shape + " of size " + this.size + " that weights approximately " + this.weight + "!";
	}
}
