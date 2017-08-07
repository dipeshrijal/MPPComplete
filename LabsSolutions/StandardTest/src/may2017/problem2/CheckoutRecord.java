package may2017.problem2;

import java.util.ArrayList;
import java.util.List;

public class CheckoutRecord {

	private List<CheckoutRecordEntry> checkoutEntry;

	public CheckoutRecord() {
		checkoutEntry = new ArrayList<>();
	}

	public List<CheckoutRecordEntry> getCheckoutEntryList() {
		return checkoutEntry;
	}

	public void addCheckoutEntry(CheckoutRecordEntry entry) {
		checkoutEntry.add(entry);
	}

	@Override
	public String toString() {
		return "CheckoutRecord [checkoutEntry=" + checkoutEntry + "]";
	}

}
