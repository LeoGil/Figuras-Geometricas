package figuras;

public class Circulo extends Figura {

	private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    @Override
    public double Area() {
        return  Math.PI * Math.pow(this.raio, 2);
    }

    @Override
    public double Perimetro() {
        return 2 * Math.PI * this.raio;
    }

	@Override
	public String toString() {
		return "Circulo [Area()=" + Area() + ", Perimetro()=" + Perimetro() + "]";
	}

}
