package prob1.app;

import prob1.DecoyDuck;
import prob1.Duck;
import prob1.MallardDuck;
import prob1.RedheadDuck;
import prob1.RubberDuck;

public class Main {

	public static void main(String[] args) {
		Duck[] ducks = { new MallardDuck(), new DecoyDuck(), new RedheadDuck(), new RubberDuck() };

		for (Duck duck : ducks) {
			System.out.println(duck.getClass().getSimpleName() + ":");
			duck.display();
			duck.fly();
			duck.quack();
			duck.swim();
		}

	}
}
