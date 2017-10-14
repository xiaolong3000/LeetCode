package medium;

/*
* You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
*
* */
//新思路，用Java的linkedlist来解决

import java.util.LinkedList;

//旧思路，现在卡在Java的引用上了
public class addTwoNumbers {

    public static void main(String[] args) {
        ListNode l1=new ListNode(2);
        l1.next=new ListNode(4);
        l1.next.next=new ListNode(5);


        ListNode l2=new ListNode(5);
        l2.next=new ListNode(6);
        l2.next.next=new ListNode(4);



        LinkedList<Object> list1=new LinkedList<>();
        LinkedList<Object> list2=new LinkedList<>();
        while(l1!=null){
            list1.add(l1.val);
        }
        while (l2!=null){
            list2.add(l2.val);
        }
        if (list1.size()>=list2.size()){
            for (int i=0;i<list2.size();i++){

            }
        }
//
//        ListNode p=l1;
//        ListNode q=l2;
//        ListNode index=new ListNode(0);
//
//        ListNode result=index;
//
//        int len=0;
//        int len1=0;
//        int len2=0;//链表长度
//
//        while(p!=null){
//          len1++;
//          p=p.next;
//        }
//        while(q!=null){
//            len2++;
//            q=q.next;
//        }
//
//        if (len1>=len2){
//            p=l1;
//            q=l2;
//
//        }else{
//            p=l2;
//            q=l1;
//
//        }//p大q小
//
//        boolean carry=false;//是否进位标志
//        while(p!=null&&q!=null){
//            if (len==0){
//                index.val=p.val+q.val;
//            }else{
//                index=new ListNode(p.val + q.val);
//            }
//
//           if (carry)
//               index.val++;
//           if (index.val>=10){
//               index.val-=10;
//               carry=true;
//           }else{
//               carry=false;
//           }
//           index=index.next;
//           p=p.next;
//           q=q.next;
//           len++;
//        }
//
//        while (p!=null&&q==null){
//                index=new ListNode(p.val);
//                if (carry)
//                {
//                index.val++;
//                }
//                if (index.val>=10){
//                    index.val-=10;
//                    carry=true;
//                }else {
//                    carry=false;
//                }
//                p=p.next;
//                index=index.next;
//        }
//        if (carry)
//            index=new ListNode(1);


//        System.out.println(result.next);






    }
}




 class ListNode {
     int val;
     ListNode next;
    ListNode(int x) { val = x; }
 }
