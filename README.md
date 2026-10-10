# BST vs Hash Table Performance Report
## 1. Complexity Analysis
This project compares Binary Search Tree (BST) and Hash Table performance in Java.

BST stores values in nodes. Smaller values go to the left, and larger values go to the right.

Hash Table uses a hash function to find an index. Collisions are handled using LinkedList.

| Operation | BST Best | BST Average | BST Worst | Hash Best | Hash Average | Hash Worst |
|---|---|---|---|---|---|---|
| Insert | O(1) | O(log n) | O(n) | O(1) | O(1) | O(n) |
| Search | O(1) | O(log n) | O(n) | O(1) | O(1) | O(n) |
| Delete | O(1) | O(log n) | O(n) | O(1) | O(1) | O(n) |

BST can take O(n) time when the tree becomes unbalanced.

Hash Table can take O(n) time when many values have collisions.

## 2. Experimental Results

The program was tested with 100, 1000, and 10000 elements.

| Elements | Structure | Insert (ms) | Search (ms) | Delete (ms) |
|---|---|---|---|---|
| 100 | BST | 0.9508 | 0.0413 | 0.0846 |
| 100 | Hash Table | 0.1965 | 0.0618 | 0.0666 |
| 1000 | BST | 0.2630 | 0.4393 | 0.2421 |
| 1000 | Hash Table | 0.5733 | 0.3335 | 0.4858 |
| 10000 | BST | 2.1630 | 2.3563 | 2.2856 |
| 10000 | Hash Table | 3.1613 | 1.1192 | 1.7617 |

## 3. Conclusions

The results show that BST and Hash Table have different performance.

For 10000 elements, Hash Table was faster in searching and deletion, while BST was faster in insertion.

BST performance depends on tree height. Hash Table performance depends on hash collisions.


