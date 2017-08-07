package lesson5.lansolns.Solution.prob1.rulesets;

import java.awt.Component;

import lesson5.lansolns.Solution.prob1.gui.ProfileWindow;


/**
 * Rules:
 * 1. favorite restaurant cannot equal favorite movie
 * 2. all fields non empty
 * 3. id must be numeric
 * 4. firstname and lastname fields may not contain spaces or 
 * characters other than a-z, A-Z.
 *
 */
public class CustomerProfileRuleSet implements RuleSet {

	@Override
	public void applyRules(Component ob) throws RuleException {
		ProfileWindow custProf = (ProfileWindow)ob;
		//check data
		
	}

}
