/* Assignment 11 (100 marks in total; 5% of the final score of this course)
 *
 * Question 2 (50 marks in total)
    Use the Q1_TreeMapByBST to implement a WordCounter to count words in documents.
    You cannot use JCF provided map.
 */

import java.util.ArrayList;
import java.io.*;
import mutils.Node;
import java.util.Scanner;

public class Q2_WordCounter {
    // use the m_treemap as the data structure for word counting
    Q1_TreeMapByBST m_treemap = new Q1_TreeMapByBST();

    // Question 2.1 (15 marks) implement buildTreeMap() to build a treemap that stores
    // the words and word frequencies of a document into m_treemap.
    // "filename" is the path to the file. Please use the "JingleBell.txt" under folder "data".
    // You can ONLY modify the body of this method including the return statement.
    public void buildTreeMap(String filename) throws IOException {
        File file = new File(filename);
        Scanner scan = new Scanner(file);
        
        while(scan.hasNextLine()) {
            String word = scan.next().toLowerCase();
            word = word.replace(",", "");
            word = word.replace("]", "");
            word = word.replace("[", "");
            word = word.replace("-", " ");
            String[] arr = word.split(" ");

            boolean nums = true;
            try {
                Double num = Double.parseDouble(word);
            } catch (NumberFormatException e) {
                nums = false;
            }
            if (nums) {
                continue;
            }

            if (arr.length > 1) {
                for (int i = 0; i < arr.length; i++) {
                    int counter = 0;
                    if (m_treemap.get(arr[i]) == -1) {
                        counter++;
                        m_treemap.put(arr[i], counter);
                    } else {
                        m_treemap.put(arr[i], m_treemap.get(arr[i]) + 1);
                    }
                }
            } else {
                int counter = 0;
                if (m_treemap.get(word) == -1) {
                    counter++;
                    m_treemap.put(word, counter);
                } else {
                    m_treemap.put(word, m_treemap.get(word) + 1);
                }
            }
        }
    }

    // Question 2.2 (15 marks) print all the counted words in the document in alphabetical order.
    // You can ONLY modify the body of this method including the return statement.
    public void printWordsAlphabetical(){
        ArrayList<String> counted_words = m_treemap.getKeysInAlphabeticalOrder();
        for (String a : counted_words){
            System.out.printf("%s", a);
        }
        System.out.println(" ");

    }

    // Question 2.3 (15 marks) write an output file named "Output.txt" under folder "data"
    // The output of will consist of two lists.
    // Each list contains all the words from the file, along with the number of times
    // that the word occurred.
    // One list is sorted alphabetically.
    // The other list is sorted according to the number of occurrences, with the most
    // common words (i.e., a word with a larger frequency or count is said to be more common)
    // at the top and the least common at the bottom.
    // IMPORTANT: the output format is given in the file "Output_Example.txt" under folder "data".
    // Input parameter "filename" is the path to the output file.
    public void outputResult(String filename) throws IOException {
        FileWriter write_file = new FileWriter(filename);

        write_file.write(Integer.toString(m_treemap.size()));
        write_file.write("Words found in file: \n\n");
        write_file.write("List of words in alphabetical order: \n\n");

        ArrayList<String> list_alphabetical = m_treemap.getKeysInAlphabeticalOrder();
        for(String s: list_alphabetical){
            write_file.write("   ");
            write_file.write(s);
            write_file.write(" (");
            write_file.write(Integer.toString(m_treemap.get(s)));
            write_file.write(") \n");
        }

        write_file.write("\n\nList of words by freq of occurrence: \n\n");

        ArrayList<Node> list_frequency = new ArrayList<Node>();
        for (String s : list_alphabetical) {
            Node temp = new Node(s, m_treemap.get(s));
            list_frequency.add(temp);
        }
        for (int i = 0; i < list_frequency.size() - 1; i++)
            for (int j = 0; j < list_frequency.size() - i - 1; j++){
                if (list_frequency.get(j).freq < list_frequency.get(j + 1).freq) {
                    Node temp = list_frequency.get(j);
                    list_frequency.set(j, list_frequency.get(j + 1));
                    list_frequency.set(j + 1, temp);
                }
            }
        for (Node s : list_frequency) {
            write_file.write("   ");
            write_file.write(s.data);
            write_file.write(" (");
            Integer count = s.freq;
            write_file.write(count.toString());
            write_file.write(")\n");
        }
        write_file.close();
    }

    // Question 2.4 (5 marks) call each of the above methods in the main() method to
    // successfully count the words and produce expected outputs.
    public static void main(String[] args) throws Exception{

        Q2_WordCounter word_counter = new Q2_WordCounter();
        word_counter.buildTreeMap("Assignment11/src/data/JingleBell.txt");
        word_counter.printWordsAlphabetical();
        word_counter.outputResult("Assignment11/src/data/Output.txt");
    }

}
