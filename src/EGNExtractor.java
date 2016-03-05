public class EGNExtractor {
	public static String extractEGN(long eGN ) {
		if (eGN /10 % 2 == 0) {
			return "male";
		} else {
			return "female";
		}
	}
}
