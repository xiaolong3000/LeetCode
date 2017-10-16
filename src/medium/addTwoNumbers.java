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
//java的引用没有c++好用，所以还是用Java特有的方式解决比较好
public class addTwoNumbers {
//    static ListNode change(LinkedList<Integer> list){
//        ListNode result=new ListNode(0);
//        ListNode ln=result;
//        for (int i=0;i<list.size();i++){
//                ln.next=new ListNode(list.get(i));
//        }
//        return result.next;
//    }

    public static void main(String[] args) {
        ListNode l1=new ListNode(2);
        l1.next=new ListNode(4);
        l1.next.next=new ListNode(5);


        ListNode l2=new ListNode(5);
        l2.next=new ListNode(6);
        l2.next.next=new ListNode(4);

    //    ListNode result=new ListNode(0);

//
//        ListNode dummyHead = new ListNode(0);
//        ListNode p = l1, q = l2, curr = dummyHead;
//        int carry = 0;
//        while (p != null || q != null) {
//            int x = (p != null) ? p.val : 0;
//            int y = (q != null) ? q.val : 0;
//            int sum = carry + x + y;
//            carry = sum / 10;
//            curr.next = new ListNode(sum % 10);
//            curr = curr.next;
//            if (p != null) p = p.next;
//            if (q != null) q = q.next;
//        }
//        if (carry > 0) {
//            curr.next = new ListNode(carry);
//        }
//        System.out.println(dummyHead.next.next.val);//这leetcold上的标准答案，我靠，为什么可以正常运行！
//
//        LinkedList<Integer> list1=new LinkedList<>();
//        LinkedList<Integer> list2=new LinkedList<>();
//
//        while(l1!=null){
//            list1.add(l1.val);
//            l1=l1.next;//刚刚这里忘记了，怪不得报错
//        }
//        while (l2!=null){
//            list2.add(l2.val);
//            l2=l2.next;
//        }
//
//if(list1.size()>=list2.size()) {
//    for (int i = 0; i < list2.size(); i++) {
//        list1.set(i, list1.get(i) + list2.get(i));
//    }
//    for (int j = 0; j < list1.size() - 1; j++) {//最后一位单独处理
//        if (list1.get(j) >= 10) {
//            list1.set(j, list1.get(j) - 10);
//            list1.set(j + 1, list1.get(j + 1) + 1);
//        }
//    }
//
//    if (list1.getLast() >= 10) {
//        list1.set(list1.size()-1, 0);
//        list1.add(0);
//    }//处理最后一位
//}
//if (list1.size()<list2.size()){
//            for (int i=0;i<list1.size();i++){
//                list2.set(i,list2.get(i)+list1.get(i));
//            }
//            for (int j=0;j<list2.size()-1;j++){
//                if (list2.get(j)>=10){
//                    list2.set(j,list2.get(j)-10);
//                    list2.set(j+1,list2.get(j+1)+1);
//                }
//            }
//            if (list2.getLast()>=10){
//                list2.set(list2.size()-1,0);
//                list2.add(0);
//            }
//
//}
//     if (list1.size()>=list2.size()){
//            result=change(list1);
//
//     }else{
//             result=change(list2);
//     }
//
//        System.out.println(result.next.next);



        ListNode p=l1;
        ListNode q=l2;
        ListNode index;

        ListNode result=new ListNode(0);
        index=result;//太厉害了，原来这样把动态和静态的联系起来



       int carry=0;//是否进位标志
        while(p!=null||q!=null){//学习答案得来的，厉害啊
          int x= (p!=null)?p.val:0;
          int y= (q!=null)?q.val:0;
          int sum=x+y+carry;
          index.next=new ListNode(sum%10);
          carry=sum/10;
          index=index.next;
          if (p!=null)p=p.next;
          if (q!=null)q=q.next;

        }


        if (carry>0)//处理最后一位大于9的情况
            index=new ListNode(1);


        System.out.println(result.next.val);






    }
}




 class ListNode {
     int val;
     ListNode next;
    ListNode(int x) { val = x; }
 }
