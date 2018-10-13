package ListElement.src;

// Creating ListElement class under package ListElement.src

public class ListElement {
	
	ListElement next ;
	ListElement previous;
	private int data;
	public Object todelete;
	
	
	
// Constractor for new object initialization
	
	public ListElement() {
		this.data = 0 ;
		this.next = null;
		this.previous = null;
	}
	
// 	Defining Setters and Getters for retrieving and input data 
//	from/to the list
	
	public ListElement getNext() {
		return next;
	}
	public void setNext(ListElement next) {
		this.next = next;
	}
	public ListElement getPrevious() {
		return previous;
	}
	public void setPrevious(ListElement previous) {
		this.previous = previous;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
}

