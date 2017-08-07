package prob1.behaviour;

import prob1.intface.QuackBehavior;

public class MuteQuack implements QuackBehavior {

	public void quack() {
		System.out.println("cannot quack");
	}

}
