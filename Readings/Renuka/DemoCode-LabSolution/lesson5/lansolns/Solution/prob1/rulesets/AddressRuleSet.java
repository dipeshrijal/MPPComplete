package lesson5.lansolns.Solution.prob1.rulesets;

import java.awt.Component;

import lesson5.lansolns.Solution.prob1.gui.AddrWindow;

/**
 * Rules 1. All fields must be nonempty 2. ID field must be numeric 3. Zip must
 * be numeric with exactly 5 digits 4. State must have exactly two characters in
 * the range A-Z 5. ID field may not equal zip field.
 *
 */

public class AddressRuleSet implements RuleSet {
	private AddrWindow addr;

	@Override
	public void applyRules(Component ob) throws RuleException {
		addr = (AddrWindow) ob;
		nonemptyRule();
		idNumericRule();
		zipNumericRule();
		stateRule();
		idNotZipRule();
	}

	private void nonemptyRule() throws RuleException {
		if(addr.getIdValue().trim().isEmpty() ||
				addr.getStreetValue().trim().isEmpty() ||
				addr.getCityValue().trim().isEmpty() ||
				addr.getStateValue().trim().isEmpty() ||
				addr.getZipValue().trim().isEmpty()) {
			throw new RuleException("All fields must be non-empty!");
		}
	}

	private void idNumericRule() throws RuleException {

	}

	private void zipNumericRule() throws RuleException {

	}

	private void stateRule() throws RuleException {

	}

	private void idNotZipRule() throws RuleException {

	}

}
