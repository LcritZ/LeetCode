
import javax.swing.table.TableColumn;
import javax.xml.transform.Templates;

public class RemoveNthNodeFromEndofList {	 
		 
		public ListNode removeNthFromEnd(ListNode head, int n) {
				if (head==null) {
					 new NullPointerException();
				}
				if (n==0||n<0) {
					new NullPointerException();
				}
		        ListNode temp = head;
		        ListNode last = null;
		        ListNode forenode = null;
		        int len= 1;
		        for( last = head;last.next!=null;last = last.next){
		        	len ++;
		        	
		        }
		        System.out.println(len);
		        int pos = len -n +1;
		        if (pos==2) {
					temp= temp.next;
					head.next = temp.next;
					temp = null;
					return head;
				}
		        if (n>len) {
					return head.next;
				}
		        if (n==len) {
					return head.next;
				}
		        for(int i = 1;i<pos;i++){
		        	temp = temp.next;
		        	if (i==pos-2) {
						forenode = temp;
					}
		        }
		        if (n==1) {		        						
						forenode.next = null;					
				}else {
					forenode.next = temp.next;					
				}
		        System.out.println(temp.val);
		        temp = null;
		        return head;
		        
		    }
		    

	public static void main(String[] args) {
		RemoveNthNodeFromEndofList test = new RemoveNthNodeFromEndofList();
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);		
		//head.next.next.next = new ListNode(4);		
		//head.next.next.next.next = new ListNode(5);		
		test.removeNthFromEnd(head, 2);
		//System.out.println(head.next.val);
		
	}
	
	
	
	
}

