public class Card
{
	private int value;
	private String suit; 
	private String face;
	public Card(int v, String s, String f)
	{
		value=v;
		suit=s;
		face=f;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getSuit() {
		return suit;
	}
	public void setSuit(String suit) {
		this.suit = suit;
	}
	public String getFace() {
		return face;
	}
	public void setFace(String face) {
		this.face = face;
	}
}
