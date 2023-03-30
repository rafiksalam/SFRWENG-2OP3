/* Assignment 11 (100 marks in total; 5% of the final score of this course)
 *
 * Question 1 (50 marks in total)
    Use mutils.BinarySearchTree as a basic structure to implement a TreeMap for <String, Integer>.
    You cannot use JCF provided map.
 */

import mutils.BinarySearchTree;
import mutils.Node;

import java.util.ArrayList;

public class Q1_TreeMapByBST {

    // use m_bst as the basic data structure for the treemap of <String, Integer>
    BinarySearchTree m_bst = new BinarySearchTree();
    int size = 0;
    // Question 1.1 (5 marks): implement method size().
    // Returns the number of elements in this map (its cardinality).
    // You can ONLY modify the body of this method including the return statement.
    public int size() {

        return size();
    }

    // Question 1.2 (5 marks): implement method isEmpty().
    // Returns true if this map contains no elements, otherwise return false.
    // You can ONLY modify the body of this method including the return statement.
    public boolean isEmpty() {
        if(size() == 0){
            return true;
        }else {
            return false;
        }
    }

    // Question 1.3 (15 marks) implement method get().
    // If key is contained in the map, return the value of the key.
    // If key is not contained in the map, return -1.
    // You can ONLY modify the body of this method including the return statement.
    public int get(String key) {
        Node temp = m_bst.root;
        while(temp != null){
            if(temp.data.equals(key)){
                return temp.freq;
            }else if(key.compareTo(temp.data) > 0){
                temp = temp.right;
            }else if(key.compareTo(temp.data) < 0){
                temp = temp.left;
            }
        }
        return -1;
    }

    // Question 1.4 (15 marks) implement method put().
    // If the key is already contained in the map, overwrite the old value and return -1;
    // If the key is not contained in the map, add a new <key,value> entry to the map and return 1;
    // You can ONLY modify the body of this method including the return statement.
    public int put(String key, int value) {
        if(get(key) != -1){
            Node temp = m_bst.root;
            while(temp != null) {
                if (temp.data.equals(key)){
                    temp.freq = value;
                    return -1;
                }else if(key.compareTo(temp.data) > 0){
                    temp = temp.right;
                }else if(key.compareTo(temp.data) < 0){
                    temp = temp.left;
                }
            }
        }
        Node new_node = new Node(key,value);
        m_bst.insert(new_node);
        size++;
        return 1;
    }

    // Question 1.5 (10 marks) implement method getKeysInAlphabeticalOrder().
    // return the keys of this map as an ArrayList<String> in Alphabetical order.
    // You can ONLY modify the body of this method including the return statement.
    public ArrayList<String> getKeysInAlphabeticalOrder(){
        ArrayList<String> m_bestKeys = new ArrayList<>();
        key_Alphabet(m_bst.root, m_bestKeys);
        return m_bestKeys;
    }

    public ArrayList<String> key_Alphabet(Node root, ArrayList<String> words){
        if (root == null){
            return words;
        }
        key_Alphabet(root.left, words);
        words.add(root.data);
        key_Alphabet(root.right, words);
        return words;
    }
}
