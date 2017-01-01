package java7.WeakReferenceStack;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/* WeakReference는 제네릭 컨테이너 클래스이다.
 * 들어 있는 인스턴스에 강력한 참조가 없으면 가비지 컬렉션의 수집 대상이 될 수 있다.
 * 
 */
public class WeakReferenceStack<E>{

	private final List<WeakReference<E>> stackReferences;
	private int stackPointer = 0;
	
	public WeakReferenceStack(){
		this.stackReferences = new ArrayList<>();
	}
	
	public void push(E element){
		this.stackReferences.add(stackPointer, new WeakReference<>(element));
		stackPointer++;
	}
	
	public E pop(){
		stackPointer--;
		return this.stackReferences.get(stackPointer).get();
	}
	
	public E peek(){
		return this.stackReferences.get(stackPointer-1).get();
	}
}
