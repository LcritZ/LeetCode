package week1;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Template;

class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }

public class AddTwoNumbers {
	  
	  public ListNode addTwoNumbers(ListNode node1, ListNode node2) {
	        ListNode result = new ListNode(0);
	        if (node1==null&&node2==null) {
				return null;
			}else if(node1==null&&node2!=null){
				return node2;
			}else if(node1!=null&&node2==null){
				return node1;
			}else {
				result.val=(node1.val+node2.val)%10;
			ListNode temp = result.next;
			result.next = temp;
			ListNode temp1 = node1.next;
			ListNode temp2 = node2.next;
			int carrynum = (node1.val+node2.val)/10;
	        while(temp1!=null&&temp2!=null){
	        	temp = new ListNode((temp1.val+temp2.val+carrynum)%10);
	        	System.out.println(temp.val);
	        	carrynum = ((temp1.val+temp2.val+carrynum)/10);
	        	temp = temp.next;
	        	temp1 = temp1.next;
	        	temp2 = temp2.next;
	        }
	        return result;
			}
	        
	    }
	public static void main(String[] args) {
		AddTwoNumbers test= new AddTwoNumbers();
		 ListNode l1 = null,l2 = null;
		 l1= new ListNode(3);
        l1.next=new ListNode(4);
        l1.next.next=new ListNode(2);
         l2 = new ListNode(5);
        l2.next=new ListNode(6);
       l2.next.next=new ListNode(1);
		ListNode result;
		result=test.addTwoNumbers(l1, l2);
		//System.out.println(result.val);
		System.out.println(result.next.val);
		System.out.println(result.next.next.val);
		
	}

}
