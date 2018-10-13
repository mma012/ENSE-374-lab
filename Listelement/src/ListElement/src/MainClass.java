package ListElement.src;

import ListElement.src.ListElement;
import java.util.Scanner;

public class MainClass 
{
	public static void main(String[] args) 
 {
				
// Adding new listElements to the list 
System.out.println("How many elements you want to add to the list");
Scanner userinput = new Scanner(System.in);
while(!userinput.hasNextInt())
	{
    System.out.println("'" + userinput.nextLine() + "'" + " is not a valid entry. Please enter a number: ");
    }
int NumOfElements = userinput.nextInt();
ListElement [] Le = new ListElement[NumOfElements];
		  
System.out.println("Enter the data of 1st element");
int FirstListData = userinput.nextInt();

// Defining a new LinkedList and putting a value in the head list
LinkedList list = new LinkedList(FirstListData);

  for (int i=1; i< Le.length; i++)
  {
   System.out.println("Add Data of element # " + (i+1));
   int Listdata = userinput.nextInt();
   Le[i] = new ListElement();
   Le[i].setData(Listdata);
   list.addElement(Le[i]);
  }
  
//Printing the data of the Linkedlist from head to tail
  System.out.println("Elements in the list from Head to Tail");
  list.printLinkedListHead();
  
  
//Deleting an element in the list
  System.out.println("Which list you want to delete? ");
    int listtodelete = userinput.nextInt()-1;
  list.deleteElement(listtodelete);
  System.out.println("Now the Elements in the list from Head to Tail are");
  list.printLinkedListHead();
  
	
 }
}
