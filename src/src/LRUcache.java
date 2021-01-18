import java.util.LinkedHashMap;

public class LRUcache {
    LinkedHashMap<Integer,Integer> cache=new LinkedHashMap<>();
//    cache的容量
    int cap;
    public LRUcache(int capacity){
        this.cap=capacity;
    }
    public void makeRecently(int key){
        int val=cache.get(key);
        cache.remove(key);
        cache.put(key,val);
    }

    public int get(int key){
        if(!cache.containsKey(key)){
            return -1;
        }
        makeRecently(key);
        return cache.get(key);
    }

    public void put(int key,int val){
        if(cache.containsKey(key)){
            cache.put(key,val);
            makeRecently(key);
            return;

        }
        if(cache.size()>=cap){
//            获得最久未使用的key，即队头的key，将其删除
            int oldestKey=cache.keySet().iterator().next();
            cache.remove(oldestKey);
        }
        cache.put(key,val);

    }

}
