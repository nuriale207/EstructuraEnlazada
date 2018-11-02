

public class OrderedCircularLinkedList<T extends Comparable<T>> extends CircularLinkedList<T> implements OrderedListADT<T> {
	
	public void add(T elem){
		/*pre:
		 * post:añade el elemento elem en la posición correspondiente de la lista.
		 */
		Node<T> nuevo=new Node<T>(elem);
		if(isEmpty()){
			nuevo.next=nuevo;
			this.last=nuevo;
			count++;
		}
		
		else{
			
			Node<T> act=this.last;
			
			if(elem.compareTo(act.data)>0){
					nuevo.next=last.next;
					last.next=nuevo;
					last=last.next;
					count++;
					
				}
			else{
				act=this.last.next;
				Node<T> ant=this.last;
				int cont=0;
				while(elem.compareTo(act.data)<0&& cont<this.count){
					act=act.next;
					ant=ant.next;
					cont++;
					
				}
				nuevo.next=ant.next;
				ant.next=nuevo;
				count++;
				
			}
			
		}





	}


}
