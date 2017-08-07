package lesson9.labsolution.prob9;

import java.util.Optional;

public class Finding {

	public static void main(String... args) {
		if (isVegetarianFriendlyMenu()) {
			System.out.println("Vegetarian friendly");
		}

		System.out.println(isHealthyMenu());
		System.out.println(isHealthyMenu2());

		Optional<Dish> dish = findNonVegetarianDish();
		dish.ifPresent(d -> System.out.println(d.getName()));
	}

	private static boolean isVegetarianFriendlyMenu() {
		return Dish.menu.stream().anyMatch(Dish::isVegetarian);
	}

	private static boolean isHealthyMenu() {
		return Dish.menu.stream().allMatch(d -> d.getCalories() < 1000);
	}

	private static boolean isHealthyMenu2() {
		return Dish.menu.stream().noneMatch(d -> d.getCalories() >= 1000);
	}

	private static Optional<Dish> findNonVegetarianDish() {
		return Dish.menu.stream().filter(d -> d.getType() == Dish.Type.MEAT).findFirst();
		// return menu.stream().filter(Dish::isVegetarian).findAny();
	}

}
