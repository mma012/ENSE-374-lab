package ListElement.src;
import ListElement.src.ListElement;

// Creating LinkedList class
public class LinkedList {
	ListElement head =new ListElement();

// Constractor for new object "head" initialization 
	public LinkedList(int n){
		        head.setData(n);
		        head.setNext(null);
		        head.setPrevious(null);
		    }

// Function to add new element in the linkedlist
	
	public void addElement(ListElement le)
	{
// Start by going to the first element in the linkedlist
		ListElement last =head;
		
// As long as the last has a next go to the next one
		while(hasNext(last))
		{
			last=last.getNext();
		}
//Connect the last element with the new element
		last.setNext(le);
		le.setPrevious(last);
		}
	
//New function to retrieve the element corresponding to the index	
	public ListElement getElement(int index)
	{
		int count =0;
		ListElement currentElement = head;
		while(index !=count)
		{
			count++;
			currentElement =currentElement.getNext();
			
		}
		return currentElement;		
	}

//New function to delete the element corresponding to the index	
		public ListElement deleteElement(int index)
		{
			
			ListElement todelete = getElement(index);
			ListElement previous = todelete.getPrevious();
			ListElement next = todelete.getNext();
						
			if (index == 0 ) {
				System.out.println("You have deleted the head");
				head = head.getNext();
				 head.setPrevious(null);
				return head;
				}
				else if(todelete.getNext() == null) {
				 System.out.println("You have deleted the tail");
				 previous.next = null;}
				else {
			System.out.println("You have deleted list #" +(index+1));
			next.setPrevious(previous);
			previous.setNext(next);}
									
			return next;		
		}
// Function to print the list from head to tail

 public void printLinkedListHead()
 {
	 ListElement currentelement = head;
	 System.out.print(head.getData() +" ");
	 while(hasNext(currentelement))
	 {
		 currentelement = currentelement.getNext();
		 System.out.print(currentelement.getData() +" ");
	 }
	System.out.println();
	 
 }
		
//Function to print the list from tail to head

public void printLinkedListTail()
{
	 ListElement tail = head;
	// System.out.print(head.getData() +" ");
	 while(hasNext(tail))
	 {
		 tail = tail.getNext();
		 
	 }
	 System.out.print(tail.getData() + " ");
	 
	 
	 while (hasPrevious(tail))
	{
	 tail = tail.getPrevious();
	 System.out.print(tail.getData() +" ");
	 }
	System.out.println();
	 
}

  
// Boolean function to help to check if there is a next element or not
	
	private boolean hasPrevious(ListElement currentelement) {
	// TODO Auto-generated method stub
	ListElement previous = currentelement.getPrevious();
	if (previous ==null)
	{
		return false;
	}
	
		return true;
}

	public Boolean hasNext(ListElement le)
	{
		
		ListElement next = le.getNext();
		if(next ==null)
		{
		//	System.out.println("Element" + le.getData()+" has no next");
			return false;
		}
	//	System.out.println("Element" + le.getData()+" has next");
			return true;
	
	}
}


