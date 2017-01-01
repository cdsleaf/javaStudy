package java7.WeakReferenceStack;

public class ValueContainer {
	private final String value;
	
	public ValueContainer(final String value){
		this.value = value;
	}
	
	public String get(){
		return this.value;
	}
	
	@Override
	protected void finalize() throws Throwable{
		super.finalize();
		System.out.printf("Finalizing for [%s]%n", toString());
	}
	
	/* equals, hashCode, toString은 생략함 */
}
