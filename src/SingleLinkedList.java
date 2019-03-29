public class SingleLinkedList {

    private int size;
    private Node header;

    public SingleLinkedList(){
        size=0;
        header=null;
    }
    private class Node{
        private Object data;
        private Node next;
        public Node(Object data){
            this.data=data;
        }
    }

    //插在头结点之前
    public void addHead(Object data){
        Node newHead=new Node(data);
        if(null==header){
            header=newHead;
        }else{
            newHead.next=header;
            header=newHead;
        }
        size++;
    }

    //插入第position个位置之后
    public void addObjectPosition(Object data,int position){
        Node newNode=new Node(data);
        Node currentNode=header;
        if(0==position){
            addHead(data);
        }else{
            while (currentNode.next!=null || position>1){
                currentNode=currentNode.next;
                position--;
            }
            newNode.next=currentNode.next;
            currentNode.next=newNode;
        }
    }


}
