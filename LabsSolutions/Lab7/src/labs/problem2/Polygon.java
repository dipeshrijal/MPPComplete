package labs.problem2;

public interface Polygon extends ClosedCurve {

	double[] getSides();

	default double computePerimeter(double[] getSides) {
		double retVal = 0;
		for (int i = 0; i < getSides.length; i++) {
			retVal += getSides[i];
		}
		return retVal;

	}

}
