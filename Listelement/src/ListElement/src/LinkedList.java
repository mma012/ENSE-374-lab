package ListElement.src;
import ListElement.src.ListElement;
public class LinkedList {
	
	
		
	ListElement head =new ListElement();
	public LinkedList(int n){
		        head.setData(n);
		        head.setNext(null);
		        head.setPrevious(null);
		    }

	public void addElement(ListElement le)
	{
		ListElement last =head;
		while(hasNext(last))
		{
			last=last.getNext();
		}
		last.setNext(le);
		le.setPrevious(last);
		
	}
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


