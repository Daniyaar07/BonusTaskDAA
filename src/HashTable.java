import java.util.LinkedList;

public class HashTable {
    LinkedList<Integer>[] table;
    HashTable(int size){
        table = new LinkedList[size];
        for(int i = 0; i<size; i++){
            table[i] = new LinkedList<>();
        }
    }
    int hash(int value) {
        return value % table.length;
    }
    void insert(int value){
        int index = hash(value);
        if (!table[index].contains(value)){
            table[index].add(value);
        }
    }
    boolean search(int value){
        int index = hash(value);
        return table[index].contains(value);
    }
    void delete(int value){
        int index = hash(value);
        table[index].remove(Integer.valueOf(value));
    }
}
