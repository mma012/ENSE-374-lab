package ListElement.src;

import ListElement.src.ListElement;
import java.util.Scanner;

public class MainClass 
{
	public static void main(String[] args) 
 {
		// TODO Auto-generated method stub

		
// Adding new listElements to the list 
System.out.println("How many elements you want to add to the list");
Scanner userinput = new Scanner(System.in);
int NumOfElements = userinput.nextInt();
ListElement [] Le = new ListElement[NumOfElements];
		  
System.out.println("Enter the data of 1st element");
Scanner data_userinput = new Scanner(System.in);
int FirstListData = data_userinput.nextInt();

// Defining a new LinkedList and putting a value in the head list
LinkedList list = new LinkedList(FirstListData);

  for (int i=1; i< Le.length; i++)
  {
   System.out.println("Add Data of element # " + (i+1));
   Scanner userdatainput = new Scanner(System.in);
   int Listdata = userdatainput.nextInt();
   Le[i] = new ListElement();
   Le[i].setData(Listdata);
   list.addElement(Le[i]);
  }
  
//Printing the data of the Linkedlist from head to tail
  System.out.println("Elements in the list from Head to Tail");
  list.printLinkedListHead();
  
//Printing the data of the Linkedlist from tail to head
  System.out.println("Elements in the list from Tail to Head");
  list.printLinkedListTail();
  
//Deleting an element in the list
  System.out.println("Which list you want to delete? ");
  Scanner deletindex = new Scanner(System.in);
  int listtodelete = deletindex.nextInt()-1;
  list.deleteElement(listtodelete);
  System.out.println("Now the Elements in the list from Head to Tail are");
  list.printLinkedListHead();
  System.out.println("Now the Elements in the list from Tail to Head are");
  list.printLinkedListTail();
	
 }
}
