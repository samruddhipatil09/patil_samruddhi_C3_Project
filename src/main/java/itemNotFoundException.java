public class itemNotFoundException extends Throwable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public itemNotFoundException(String itemName) {
        super(itemName);
    }
}
