package ListElement.src;

import ListElement.src.ListElement;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
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
   int count = i+1;
   System.out.println("Add Data of element # " + count);
   Scanner userdatainput = new Scanner(System.in);
   int Listdata = userdatainput.nextInt();
   Le[i] = new ListElement();
   Le[i].setData(Listdata);
   list.addElement(Le[i]);
  }
  
  //Printing the data of the Linkedlist from head to tail
  list.printLinkedListHead();
  
  //Deleting an element in the list
  list.deleteElement(2);
  list.printLinkedListHead();
	}

}
