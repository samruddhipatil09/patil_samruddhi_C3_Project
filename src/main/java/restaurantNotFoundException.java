public class restaurantNotFoundException extends Throwable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public restaurantNotFoundException(String restaurantName) {
        super(restaurantName);
    }
}
