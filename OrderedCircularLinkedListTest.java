package actividad2;

import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class OrderedCircularLinkedListTest {
	Node<Integer> n1,n2,n3,n4,n5,n6,n7;
	OrderedCircularLinkedList<Integer> l0,l1,l2,l3,l4;

	@Before
	public void setUp() throws Exception {
		l0=new OrderedCircularLinkedList<Integer>();
		l1=new OrderedCircularLinkedList<Integer>();
		l1.add(1);
		
		l2=new OrderedCircularLinkedList<Integer>();
		l2.add(4);
		l2.add(3);
		
		l3=new OrderedCircularLinkedList<Integer>();
		l3.add(6);
		l3.add(3);
		l3.add(4);
		l3.add(5);
		l3.add(5);
		
		
		l4=new OrderedCircularLinkedList<Integer>();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		
		assertTrue(l1.size()==1);
		assertTrue(l1.contains(1));
		
		assertTrue(l2.size()==2);
		assertSame(l2.last.data,4);
		assertSame(l2.first(),3);
		
		assertTrue(l3.size()==5);
		Node<Integer>act=l3.last;
		assertTrue(act.next.data==3);
		act=act.next;
		assertTrue(act.next.data==4);
		act=act.next;
		assertTrue(act.next.data==5);
		act=act.next;
		assertTrue(act.next.data==5);
		act=act.next;
		assertTrue(act.next.data==6);
		
		l3.add(6);
		act=act.next;
		assertTrue(act.next.data==6);
		assertTrue(l3.last.data==6);
		
		l3.add(3);
		assertTrue(l3.first()==3);
		
	}


}
