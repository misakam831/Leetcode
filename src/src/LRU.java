import java.util.HashMap;
import java.util.LinkedHashMap;

public class LRU {
    class Node {
         public int val,key;
         public Node next,prev;
         public Node (int k, int v){
             this.key=k;
             this.val=v;
         }
    }
    class DoubleList{
        private Node head,tail;
        int size=0;
        public DoubleList(){
            head=new Node(0,0);
            tail=new Node(0,0);
            head.next=tail;
            tail.prev=head;
        }
        public void addLast(Node node){
            node.prev=tail.prev;
            node.next=tail;
            tail.prev.next=node;
            tail.prev=node;
            size++;

        }
        public void remove(Node node){
            node.next.prev=node.prev;
            node.prev.next=node.next;
            size--;
        }

        public Node removeFirst (){
            if(head.next==tail){
                return null;
            }
            Node first=head.next;
            remove(first);
            return first;
        }

        public int getSize(){return size;}

    }
    class LRUcache{
//        key->Node<key,val>
        private HashMap<Integer,Node> map;
//        Node<k1,v1><->Node<k2,v2>
        private DoubleList cache;
//        最大容量
        private int cap;
        public LRUcache(int capacity){
            this.cap=capacity;
            map=new HashMap<>();
            cache=new DoubleList();
        }
        private void makeRecently(int key){
            Node x=map.get(key);
            cache.remove(x);
            cache.addLast(x);
        }
//        添加最近使用的元素
        private void addRencently(int key,int val){
            Node x=new Node(key,val);
//            添加到链表尾部
            cache.addLast(x);
//            在map中添加新结点的映射
            map.put(key,x);


        }
//        删除某一个结点
        private void deleteKey(int key){
            Node x=map.get(key);
            cache.remove(x);
            map.remove(x);
        }
//        删除最久未使用结点
        private void removeLeastRecently(){
            Node x=cache.removeFirst();
            int delete= x.key;
            map.remove(delete);


        }
        public int get(int key){
            if(!map.containsKey(key)){
                return -1;
            }
            makeRecently(key);
            return map.get(key).val;

        }
        public void put(int key,int val){
            if(!map.containsKey(key)){
//                删除旧值
                deleteKey(key);
                addRencently(key, val);
                return;

            }
            if(map.size()==cap){
                removeLeastRecently();
            }
            addRencently(key, val);
        }

    }

}
