

public class OrderedCircularLinkedList<T extends Comparable<T>> extends CircularLinkedList<T> implements OrderedListADT<T> {
	
	public void add(T elem){
		/*pre:
		 * post:añade el elemento elem en la posición correspondiente de la lista.
		 */
		Node<T>act=last;
		int contAux=count;
		Node<T>nuevo=new Node<T>(elem);
		
		if (last==null) {
			nuevo.next=nuevo;
			last=nuevo;
		}
		else {
			
			while(contAux>0 && (elem.compareTo(act.next.data)>0)) { 
				act=act.next;
				contAux=contAux-1;
			}
			
			if (contAux==0) { //se he racorrido toda la lista --> el elemento se añade al final
				nuevo.next=last.next;
				last.next=nuevo;
				last=nuevo;
			}
			else {
				nuevo.next=act.next;
				act.next=nuevo;
			}
		}// end if-else
		count=count+1;


	} //end add

}
