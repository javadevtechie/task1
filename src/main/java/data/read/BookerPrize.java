package data.read;

import java.util.List;

public class BookerPrize {
	private int Year;
	private Book winner;
	private List<Book> shorList;
	private List<String> panel;
	private String chairPersion;

	public void setYear(int year) {
		Year = year;
	}

	public void setWinner(Book winner) {
		this.winner = winner;
	}

	public void setShorList(List<Book> shorList) {
		this.shorList = shorList;
	}

	public void setPanel(List<String> panel) {
		this.panel = panel;
	}

	public void setChairPersion(String chairPersion) {
		this.chairPersion = chairPersion;
	}

	public int getYear() {
		return Year;
	}

	public Book getWinner() {
		return winner;
	}

	public List<Book> getShorList() {
		return shorList;
	}

	public List<String> getPanel() {
		return panel;
	}

	public String getChairPersion() {
		return chairPersion;
	}

	@Override
	public String toString() {
		return "BookerPrize [Year=" + Year + ", winner=" + winner + ", shorList=" + shorList + ", panel=" + panel
				+ ", chairPersion=" + chairPersion + "]";
	}

}
