package Lab8;

public class LinkedListTDD {
	private Node head, curr, prev;
	private int size = 0;

	public int size() {
		return size;
	}

	public void insert(Object data) {
	
		if (head == null) {
			head = new Node(data, null);
			curr = head;
		}
		else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = new Node(data);
		}
		size++;
	}
	public void add(Object obj) {
        if (head == null) {
            head = new Node(obj, null);
            curr = head;
        } else {
            if (curr == null){
                curr = new Node(obj, curr);
                prev.next = curr;
                prev = curr;
            } else {
                Node tmp = new Node (obj, curr.next);
                curr.next = tmp;
                prev      = curr;
                curr      = tmp;
            }
        }
        size += 1;
    }

	public void addFirst(Object o){
		Node tmp = new Node (o, head);
		head = tmp;
		prev = null;
		curr = head;
		size++;
	}
	
	public void remove() {
        if (this.isEmpty() || curr == null) {
            return;
        } else {
            if (prev == null) {
                head = curr.next;
                curr = head;
            } else {
                prev.next = curr.next;
                curr = curr.next;
            }
            size -= 1;
        }
    }
	
	public void reverse() {
		if (head == null) {
			return;
		}
		
		Node curr = head;
		Node temp;
		while (curr.next != null) {
			temp = curr.next; 
			curr.next = temp.next ;
			temp.next = head;
			head = temp;
		}
	}
	
	/*
	 * Methods to deal with the print
	 */
	public void reset() {
		  curr = head;
		  prev = null;
		  // note: this only resets the running pointer, not the list!
		  // size remains the same
		} 

		public boolean eol() {
		  return (curr == null); 
		}

		public void succ() {
		  curr = curr.next;
		  if (prev == null)
		    prev = head;
		  else
		    prev = prev.next;
		}
		
		// If empty strings are given, use a list default
		public String print() {
			String s = "";
			for (this.reset();!this.eol();this.succ()){
				// this wastes a lot of system data
				s = s + curr.data + ((curr.next != null)?", ":"");
			}
			return s;
		}
		
		public boolean isEmpty() {
			return head == null;
		}
}