
class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

public class AddTwoNumbers {

	public ListNode addTwoNumbers(ListNode node1, ListNode node2) {
		ListNode result = new ListNode(0);
		if (node1 == null && node2 == null) {
			return null;
		} else if (node1 == null && node2 != null) {
			return node2;
		} else if (node1 != null && node2 == null) {
			return node1;
		} else {
			result.val = (node1.val + node2.val) % 10;
			ListNode temp = result;
			result.next = temp.next;
			ListNode temp1 = node1.next;
			ListNode temp2 = node2.next;
			int carrynum = (node1.val + node2.val) / 10;
			while (temp1 != null && temp2 != null) {
				temp.next = new ListNode((temp1.val + temp2.val + carrynum) % 10);
				carrynum = ((temp1.val + temp2.val + carrynum) / 10);
				temp = temp.next;
				temp1 = temp1.next;
				temp2 = temp2.next;
			}
			if (temp1==null&&temp2==null) {
				if (carrynum==0) {
					
				}else {
					
					temp.next = new ListNode((carrynum) % 10);
				}
			}else	if (temp1!=null&&temp2==null) {
				if (carrynum==1) {
				while(temp1!=null){
					temp.next = new ListNode((carrynum+temp1.val)%10);					
					carrynum = (carrynum+temp1.val)/10;
					temp = temp.next;
					temp1 = temp1.next;					
					}
				if (carrynum == 1) {					
					temp.next = new ListNode(carrynum);
				}
				}else {
					temp.next = temp1;
					temp1 = temp1.next;
					temp = temp.next;
				}
				
			}else if (temp1==null&&temp2!=null) {
				if (carrynum==1) {
				while(temp2!=null){
						temp.next = new ListNode((carrynum+temp2.val)%10);					
						carrynum = (carrynum+temp2.val)/10;
						temp2 = temp2.next;	
						temp = temp.next;
					}
				if (carrynum == 1) {
					temp.next = new ListNode(carrynum);				
				}
				}else {
						temp.next = temp2;
						temp2 = temp2.next;
					}					
			}
			return result;
		}
	}

	public static void main(String[] args) {
		AddTwoNumbers test = new AddTwoNumbers();
		ListNode l1 = null, l2 = null;
		l2 = new ListNode(9);
		
		l1 = new ListNode(1);
		l1.next = new ListNode(9);
		
		ListNode result;
		result = test.addTwoNumbers(l1, l2);
		System.out.println(result.val);
		System.out.println(result.next.val);
		System.out.println(result.next.next.val);
	
	}

}
