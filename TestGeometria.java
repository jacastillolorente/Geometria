public class TestGeometria {
	public static void main (String[] args) {
		double areaCuadrado = Geometria.calcularAreaCuadrado (2.123);
		System.out.println ("Area del cuadrado de lado 2.123 vale " + areaCuadrado);
		System.out.println ("");
		double areaRectangulo = Geometria.calcularAreaRectangulo (2.123, 1.233);
		System.out.println ("Area del rectangulo de base 2.123 y altura 1.233 vale " + areaRectangulo);
	}
}
