package figuras;

import java.util.ArrayList;

public class Geometria {

	public Geometria() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ArrayList<Figura> figuras = new ArrayList<>();
        figuras.add(new Circulo(10));
        figuras.add(new Losango(20,8));
		figuras.add(new Quadrado(15));
		figuras.add(new Retangulo(14, 8));
        figuras.add(new Triangulo(12,8));

		System.out.println(String.format("%-30s %-6s %-10s %-9s", "Figura", "Area", "Perimetro", "Diagonal"));
		System.out.println(String.format("%-30s %-6s %-10s %-9s", "------------------------------", "------", "----------", "---------"));

		for (Figura fig : figuras) {
			if (fig instanceof Diagonal) {
				System.out.println(String.format("%-30s %6.2f %10.2f %9.2f", fig.getClass().getName(), fig.Area(),
						fig.Perimetro(), ((Diagonal) fig).calcDiagonal()));
			} else {
				System.out.println(String.format("%-30s %6.2f %10.2f %9s", fig.getClass().getName(), fig.Area(),
						fig.Perimetro(), "N/A"));
			}
		}
	}

}
