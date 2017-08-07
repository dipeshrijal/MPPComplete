package labs.problem2;

import java.util.ArrayList;
import java.util.List;

public class DataMiner {
	List<ClosedCurve> objects = new ArrayList<>();

	public static void main(String[] args) {
		DataMiner dm = new DataMiner();
		dm.objects.add(new Rectangle(12, 23));
		dm.objects.add(new Rectangle(4, 13));
		dm.objects.add(new Circle(8));
		dm.objects.add(new EquilateralTraingle(6));
		dm.objects.add(new Ellipse(5, 5));
		System.out.println(dm.computeAveragePerimeter());
	}

	public double computeAveragePerimeter() {
		if (objects == null || objects.isEmpty())
			return 0.0;
		double sum = 0.0;
		int size = objects.size();
		for (int i = 0; i < size; ++i) {
			sum += objects.get(i).computePerimeter();
		}
		return sum / size;
	}

}
