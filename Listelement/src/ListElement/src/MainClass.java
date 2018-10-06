package ListElement.src;

import ListElement.src.ListElement;
import ListElement.src.LinkedList;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.out.println("koko");
  LinkedList list = new LinkedList(5);
  ListElement le2 =new ListElement();
  le2.setData(6);
  list.addElement(le2);
  ListElement le3 = new ListElement();
  le3.setData(7);
  list.addElement(le3);
  ListElement le4 = new ListElement();
  le4.setData(8);
  list.addElement(le4);
  
  int mydata = list.head.getData();
  int mynext = list.head.getNext().getData();
  int mynextnext = list.head.getNext().getNext().getData();
  System.out.println("my data is "+mydata+", my next = "+ mynext+", my next next "+mynextnext);
	
  ListElement listel3 = list.getElement(0);
  System.out.println("Third element has data "+ listel3.getData());
	}

}
