package figuras;

public class Triangulo extends Poligono {

	public Triangulo(double base, double altura) {
        super(base, altura);
    }

    @Override
    public double Area() {
        return ( super.getBase() * super.getAltura() ) / 2;
    }

    @Override
    public double Perimetro() {
        double cat = super.getBase() / 2;
        double hipotenusa = Math.sqrt( Math.pow(super.getAltura(), 2) + Math.pow(cat, 2) );
        return hipotenusa + hipotenusa + super.getBase();
    }

	@Override
	public String toString() {
		return "Triangulo [Area()=" + Area() + ", Perimetro()=" + Perimetro() + "]";
	}

}
