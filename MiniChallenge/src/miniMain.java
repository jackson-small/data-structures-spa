public class miniMain {
    public static void main(String [] args) throws NumberFormatException{
        String temp = "He11o World 56";
        System.out.println(firstMethod(temp, 4));
    }
    public static String firstMethod(String s, int k) {
        char c;
        for(int i = 0; i<s.length(); i++){
            if(Character.isLetter(s.charAt(i))) {
                continue;
            } else if(s.charAt(i)==' ') {
                continue;
            } else {
                int num = Integer.valueOf(s.substring(i, i + 1));
                num += k;
                c = (char)num; // this is where my code broke, I was never able to make a char from an int
                s = s.replace(s.charAt(i), c);
            }
        }
        return s;
    }
}
