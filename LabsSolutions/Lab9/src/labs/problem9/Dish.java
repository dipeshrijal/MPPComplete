package labs.problem9;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Dish {

	private final String name;
	private final boolean vegetarian;
	private final int calories;
	private final Type type;

	public Dish(String name, boolean vegetarian, int calories, Type type) {
		this.name = name;
		this.vegetarian = vegetarian;
		this.calories = calories;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	public int getCalories() {
		return calories;
	}

	public Type getType() {
		return type;
	}

	public enum Type {
		MEAT, FISH, OTHER
	}

	@Override
	public String toString() {
		return name;
	}

	public static final List<Dish> menu = Arrays.asList(new Dish("pork", false, 800, Dish.Type.MEAT),
			new Dish("beef", false, 700, Dish.Type.MEAT), new Dish("chicken", false, 400, Dish.Type.MEAT),
			new Dish("french fries", true, 530, Dish.Type.OTHER), new Dish("rice", true, 350, Dish.Type.OTHER),
			new Dish("season fruit", true, 120, Dish.Type.OTHER), new Dish("pizza", true, 550, Dish.Type.OTHER),
			new Dish("prawns", false, 400, Dish.Type.FISH), new Dish("salmon", false, 450, Dish.Type.FISH));

	public static void main(String[] args) {
		System.out.println("Is Vegeterian meal available = " + isVegeterianMealAvailable());
		System.out.println("Is Healthy meal available = " + healthyMenu());
		System.out.println("Is unhealthy meal available = " + unhealthyMenu());
		System.out.println("First Meat = " + firstMeat().get());
		System.out.println("Total Calories = " + totalCalories());
		System.out.println("Total Calories = " + calTotalCalories());
	}

	// a. Is there any Vegetarian meal available ( return type boolean)

	public static boolean isVegeterianMealAvailable() {
		return menu.stream().anyMatch(d -> d.isVegetarian());
	}

	// b. Is there any healthy menu have calories less than 1000 ( return type
	// boolean)

	public static boolean healthyMenu() {

		return menu.stream().anyMatch(d -> d.getCalories() < 1000);
	}

	// c. Is there any unhealthy menu have calories greater than 1000 ( return type
	// boolean)

	public static boolean unhealthyMenu() {

		return menu.stream().anyMatch(d -> d.getCalories() > 1000);

	}
	// d. find and return the first item for the type of MEAT( return type
	// Optional<Dish>)

	public static final Optional<Dish> firstMeat() {
		return menu.stream().filter(d -> d.getType().equals(Dish.Type.MEAT)).findFirst();
	}

	// e. calculateTotalCalories() in the menu using reduce. (return int)
	public static int totalCalories() {
		return menu.stream().map(d -> d.getCalories()).reduce(0, (x, y) -> x + y);
	}

	// f. calculateTotalCaloriesMethodReference()in the menu using MethodReferences.
	// (return int)

	public static final int calTotalCalories() {
		return menu.stream().map(Dish::getCalories).reduce(Integer::sum).get();
	}

}