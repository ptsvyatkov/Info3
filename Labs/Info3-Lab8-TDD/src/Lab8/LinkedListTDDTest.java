package Lab8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LinkedListTDDTest {
	
	LinkedListTDD myList;
	// AHHHHHHH, in JUnit 5 it's not @Before, but @BeforeEach ... to have a setUp that runs before each test
	@BeforeEach
	void setUp() {
	myList = new LinkedListTDD();
	}
	
	@Test
	void testLinkedListIsCreatedEmpty() {
		assertEquals(0, myList.size());
	}
	
	@Test
	void testLinkedListInsertionOneElement() {
		myList.insert("great this works");
		assertEquals("great this works", myList.print());
		assertEquals(1, myList.size());
	}
	
	@Test
	void testLinkedListInsertionTwoElements() {
		myList.insert("great this works");
		myList.insert("with two elements");
		assertEquals("great this works, with two elements", myList.print());
		assertEquals(2, myList.size());
	}
	
	@Test
	void testLinkedListInsertionTwoIntegers() {
		myList.insert(1);
		myList.insert(2);
		assertEquals("1, 2", myList.print());
		assertEquals(2, myList.size());
	}
	
	@Test
	void testLinkedListInsertionWithAddFirst() {
		myList.addFirst("pass one");
		myList.addFirst("pass two");
		assertEquals("pass two, pass one", myList.print());
		assertEquals(2, myList.size());
		
		myList.addFirst("pass three");
		assertEquals("pass three, pass two, pass one", myList.print());
		assertEquals(3, myList.size());
	}
	
	@Test
	void testDeletingOneElementFromList() {
		myList.insert("delete this");
		myList.insert("delete this2");
		myList.remove();
		assertEquals("delete this2", myList.print());
	}
	
	@Test
	void testDeletingMoreElementsFromList() {
		myList.addFirst("first");
		myList.remove();
		myList.addFirst("second"); 
		myList.addFirst("third");  
		myList.addFirst("fourth"); 
		myList.remove();
		myList.remove();
		assertEquals("second", myList.print());
		assertEquals(1, myList.size());
	}
	
	@Test
	void testReverseEmptyList() {
		myList.reverse();
		assertEquals("", myList.print());
	}
	
	@Test
	void testReverseListWithOneElement() {
		myList.insert("first");
		myList.reverse();
		assertEquals("first", myList.print());
	}
	
	@Test
	void testReverseListWithMoreElements() {
		myList.insert("first");
		myList.insert("second");
		//List looks like: first, second
		myList.reverse();
		assertEquals("second, first", myList.print());
	}
	
	@Test
	void testReverseListWithMoreElements2() {
		myList.insert("first");
		myList.insert("second"); 
		myList.insert("third");
		myList.insert("fourth");
		//List looks like: first, second, third, fourth
		myList.reverse();
		assertEquals("fourth, third, second, first", myList.print());
	}
	
	@Test
	void testReverseManyElementsWithAddFirst() {
		myList.addFirst(1);
		myList.addFirst(2);
		myList.addFirst(3);
		myList.addFirst(4);
		myList.addFirst(5);
		assertEquals(5, myList.size());
		// List looks like 5,4,3,2,1
		
		myList.remove();
		assertEquals(4, myList.size());
		// List looks like 4,3,2,1
		
		myList.reverse();
		
		assertEquals("1, 2, 3, 4", myList.print());
		assertEquals(4, myList.size());
	}
	
	@Test
	void testReverseManyElementsWithInsertAndRemove() {
		myList.insert(1);
		myList.insert(2);
		myList.insert(3);
		myList.insert(4);
		myList.insert(5);
		myList.insert(6);
		assertEquals(6, myList.size()); 
		//List looks like 1, 2, 3, 4, 5, 6 (adding at the end)
		
		myList.remove(); // removing from the front of the list
		assertEquals(5, myList.size()); //List looks like 2, 3, 4, 5, 6
		
		myList.reverse();
		assertEquals("6, 5, 4, 3, 2", myList.print());
		assertEquals(5, myList.size());
	}
	
	@Test
	void testIsEmpty() {
		assertEquals(true, myList.isEmpty());
	}
	
	@Test
	void testRemoveSomeMore() {
		myList.addFirst("a");
		myList.remove();
		myList.addFirst("b");
		myList.remove();
		myList.addFirst("c");
		myList.remove();
		myList.addFirst("d");
		myList.remove();
		myList.addFirst("e");
		myList.remove();
		assertEquals("", myList.print());
	}
	
	@Test
	void testRemoveSomeMore2() {
		myList.addFirst("a");
		myList.addFirst("b");
		myList.addFirst("c");
		myList.addFirst("c");
		myList.remove();
		myList.addFirst("c");
		myList.remove();
		myList.remove();
		// after removing all the C's
		assertEquals("b, a", myList.print());
	}
	
	@Test
	void testAdditional() {
		myList.addFirst("one");
		myList.addFirst("one");
		myList.remove();
		myList.remove();
		myList.remove();
		myList.addFirst("one");
		myList.reverse();
		assertEquals("one", myList.print());
	}
	
	@Test
	void testAdditionalTwoReverses() {
		myList.addFirst("one");
		myList.addFirst("two");
		myList.reverse();
		myList.reverse();
		assertEquals("two, one", myList.print());
	}
}
