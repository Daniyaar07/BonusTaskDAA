import java.util.Random;

public class Main {
    static void test(int n){
        int[] num = new int[n];
        for(int i = 0; i < n; i++){
            num[i] = i;
        }
        Random random = new Random(42);
        for(int i = n - 1; i > 0; i--){
            int j = random.nextInt(i+1);
            int temp = num[i];
            num[i] = num[j];
            num[j] = temp;
        }
        BST bst = new BST();
        HashTable hash = new HashTable(n * 2);
        long start;
        long bstInsert , bstSearch , bstDelete;
        long hashInsert , hashSearch , hashDelete;
        start = System.nanoTime();
        for(int i =0; i <n; i++){
            bst.insert(num[i]);
        }
        bstInsert = System.nanoTime() - start;
        start = System.nanoTime();
        for(int i =0; i <n; i++){
            bst.search(num[i]);
        }
        bstSearch = System.nanoTime() - start;
        start = System.nanoTime();
        for(int i =0; i <n; i++){
            bst.delete(num[i]);
        }
        bstDelete = System.nanoTime() - start;
        start = System.nanoTime();
        for(int i =0; i <n; i++){
            hash.insert(num[i]);
        }
        hashInsert = System.nanoTime() - start;
        start = System.nanoTime();
        for(int i =0; i <n; i++){
            hash.search(num[i]);
        }
        hashSearch= System.nanoTime() - start;
        start = System.nanoTime();
        for(int i =0; i <n; i++){
           hash.delete(num[i]);
        }
        hashDelete = System.nanoTime() - start;

        System.out.println("\nElements:" + n);
        System.out.println("Structure Insert(ms) Search(ms) Delete(ms)");
        System.out.printf("BST %.4f    %.4f      %.4f%n", bstInsert / 1000000.0, bstSearch / 1000000.0 , bstDelete / 1000000.0);
        System.out.printf("Hash Table %.4f    %.4f      %.4f%n", hashInsert / 1000000.0, hashSearch / 1000000.0 , hashDelete / 1000000.0);
    }
    public static void main(String[] args){
        test(100);
        test(1000);
        test(10000);
    }
}
