package may2017.problem2;

import java.time.LocalDate;

public class CheckoutRecordEntry {

	private LocalDate checkoutDate;
	private LocalDate dueDate;
	private LendingItem lendingItem;
	private ItemType lendingitemType;

	public CheckoutRecordEntry(LendingItem item, LocalDate chDate, LocalDate dueDate, ItemType type) {
		this.checkoutDate = chDate;
		this.dueDate = dueDate;
		this.lendingItem = item;
		this.lendingitemType = type;
	}

	public LocalDate getCheckoutDate() {
		return checkoutDate;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public LendingItem getLendingItem() {
		return lendingItem;
	}

	public ItemType getLendingitemType() {
		return lendingitemType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 17;
		result = prime * result + ((checkoutDate == null) ? 0 : checkoutDate.hashCode());
		result = prime * result + ((dueDate == null) ? 0 : dueDate.hashCode());
		result = prime * result + ((lendingItem == null) ? 0 : lendingItem.hashCode());
		result = prime * result + ((lendingitemType == null) ? 0 : lendingitemType.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CheckoutRecordEntry other = (CheckoutRecordEntry) obj;
		if (checkoutDate == null) {
			if (other.checkoutDate != null)
				return false;
		} else if (!checkoutDate.equals(other.checkoutDate))
			return false;
		if (dueDate == null) {
			if (other.dueDate != null)
				return false;
		} else if (!dueDate.equals(other.dueDate))
			return false;
		if (lendingItem == null) {
			if (other.lendingItem != null)
				return false;
		} else if (!lendingItem.equals(other.lendingItem))
			return false;
		if (lendingitemType != other.lendingitemType)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CheckoutRecordEntry [checkoutDate=" + checkoutDate + ", dueDate=" + dueDate + ", lendingItem="
				+ lendingItem + ", lendingitemType=" + lendingitemType + "]";
	}

}
