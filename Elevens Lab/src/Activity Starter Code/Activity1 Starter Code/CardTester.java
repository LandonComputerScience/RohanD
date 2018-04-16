/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card card1 = new Card("ace", "hearts", 1);
		Card card2 = new Card("2", "clubs", 2);
		Card card3 = new Card ("3", "spades", 3);

		System.out.println("card1 rank " + card1.rank());
		System.out.println("card1 suit " + card1.suit());
		System.out.println("card1 pointValue " + card1.pointValue());
		System.out.println("card1 " + card1.toString());

		System.out.println("card2 rank " + card2.rank());
		System.out.println("card2 suit " + card2.suit());
		System.out.println("card2 pointValue " + card2.pointValue());
		System.out.println("card2 " + card2.toString());


		System.out.println("card3 rank " + card3.rank());
		System.out.println("card3 suit " + card3.suit());
		System.out.println("card3 pointValue " + card3.pointValue());
		System.out.println("card3 " + card3.toString());


		if (card1.matches(card2))
		System.out.println("card1 is bigger");
		else System.out.println("card2 is bigger");

		if (card2.matches(card3))
			System.out.println("card2 is bigger");
		else System.out.println("card3 is bigger");
	}
}
