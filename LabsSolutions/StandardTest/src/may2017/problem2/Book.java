package may2017.problem2;

public class Book extends LendingItem {

	private String isbn;
	private String title;
	private String authorFirstName;
	private String authotLastName;

	public Book(String isbn, String title, String fname, String lname) {
		this.isbn = isbn;
		this.title = title;
		this.authorFirstName = fname;
		this.authotLastName = lname;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 17;
		result = prime * result + ((authorFirstName == null) ? 0 : authorFirstName.hashCode());
		result = prime * result + ((authotLastName == null) ? 0 : authotLastName.hashCode());
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		Book other = (Book) obj;
		if (authorFirstName == null) {
			if (other.authorFirstName != null)
				return false;
		} else if (!authorFirstName.equals(other.authorFirstName))
			return false;
		if (authotLastName == null) {
			if (other.authotLastName != null)
				return false;
		} else if (!authotLastName.equals(other.authotLastName))
			return false;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthorFirstName() {
		return authorFirstName;
	}

	public void setAuthorFirstName(String authorFirstName) {
		this.authorFirstName = authorFirstName;
	}

	public String getAuthotLastName() {
		return authotLastName;
	}

	public void setAuthotLastName(String authotLastName) {
		this.authotLastName = authotLastName;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", authorFirstName=" + authorFirstName + ", authotLastName="
				+ authotLastName + "]";
	}

}
