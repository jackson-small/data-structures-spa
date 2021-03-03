import java.util.*;
import java.io.*;

public class RandomSentence {


    public static ArrayList<String> uploadFile(String filename) throws FileNotFoundException{
        String token = "";
        Scanner inFile = new Scanner(new File(filename));
        ArrayList<String> temps = new ArrayList<String>();
        while (inFile.hasNext()) {
            token = inFile.next();
            temps.add(token);
        }
        inFile.close();
        return temps;
    }


    public static HashMap<String, ArrayList<String>> trainData(ArrayList<String> txt){
        HashMap<String, ArrayList<String>> dictionary = new HashMap<>();
        for(int i = 0; i<txt.size()-1; i++){
            String word = txt.get(i);
            word = word.replaceAll("\"", "");
            word = word.replaceAll("\'\'", "");
            word = word.replaceAll("``", "");
            ArrayList<String> next = new ArrayList<>();
            if(word.equals(".") || word.equals("|") || word.equals("-")){
                continue;
            }
            if(dictionary.containsKey(word)){
                ArrayList<String> newAdd = dictionary.get(word);
                newAdd.add(txt.get(i+1));
                dictionary.remove(dictionary.get(word));
                dictionary.put(word, newAdd);
            } else {
                next.add(txt.get(i+1));
                dictionary.put(word, next);
            }

        }

        return dictionary;
    }

    public static String generateSentence(HashMap<String, ArrayList<String>> dictionary){
        //Reviewed how to iterate through HashMap to get random key.
        //https://www.geeksforgeeks.org/traverse-through-a-hashmap-in-java/
        String result = "";
        Random rand = new Random();
        int first = rand.nextInt(dictionary.size());
        ArrayList<String> keys = new ArrayList<>();
        Iterator dictIterator = dictionary.entrySet().iterator();
        while(dictIterator.hasNext()){
            Map.Entry mapElement = (Map.Entry)dictIterator.next();
            keys.add((String)mapElement.getKey());
        }
        String key = keys.get(first);
        ArrayList<String> next;
        result += key;
        while(key.charAt(key.length()-1) != '.' && key.charAt(key.length()-1) != '?' && key.charAt(key.length()-1) != '!') {
            next = dictionary.get(key);
            if(next == null){
                break;
            }
            if (next.size() > 1) {
                int r = rand.nextInt(next.size());
                result += " " + next.get(r);
                key = next.get(r);
            } else {
                result += " " + next.get(0);
                key = next.get(0);
            }

        }
        return result;
    }


    public static void main(String [] args) throws FileNotFoundException {
        System.out.println(trainData(uploadFile("assignment8\\src\\hp1.txt")).toString());
        for(int i = 0; i<100; i++) {
            System.out.println(generateSentence(trainData(uploadFile("assignment8\\src\\hp1.txt"))));
        }
    }
}
