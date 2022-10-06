class Solution{
    //Function to add two numbers represented by linked list.
    static void reverse(Node node){
        Node curr = node, prev = null, next=null;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr= next;
        }
        node = prev;
    }
    static Node add(Node first, Node second){
        Node t1 = first;
        Node t2 = second;
        int carry = 0;
        Node node = null;
        while(t1 !=null && t2!=null){
            int n1 = t1.data;
            int n2 = t2.data;
            int sum = n1+n2+carry;
            if(sum>=10){
                carry=1;
            }else{
                carry =0;
            }
            sum =sum%10;
            Node val = new Node(sum);
            val.next = node;
            node=val;
            t1=t1.next;
            t2=t2.next;
        }
        if(t1!=null){
            if(carry>1){
                node.next = new Node(t1.data+1);
                t1=t1.next;
                if(t1!=null){
                    while(t1!=null){
                        node.next = new Node(t1.data);
                        t1=t1.next;
                    }
                }
                
            }else{
                while(t1!=null){
                    node.next = new Node(t1.data);
                    t1=t1.next;
                }
            }
        }
        if(t2!=null){
            if(carry>1){
                node.next = new Node(t1.data+1);
                t2=t2.next;
                if(t2!=null){
                    while(t2!=null){
                        node.next = new Node(t2.data);
                        t2=t2.next;
                    }
                }
                
            }else{
                while(t2!=null){
                    node.next = new Node(t2.data);
                    t2=t2.next;
                }
            }
        }
        
        return node;
    }
    static Node addTwoLists(Node first, Node second){
        // code here
        // return head of sum list
        reverse(first);
        reverse(second);
        Node node = add(first,second);
        return node;
    }
}