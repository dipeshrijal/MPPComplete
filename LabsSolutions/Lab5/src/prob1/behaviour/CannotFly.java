package prob1.behaviour;

import prob1.intface.FlyBehaviour;

public class CannotFly implements FlyBehaviour {

	public void fly() {
		System.out.println("cannot fly");
	}

}
