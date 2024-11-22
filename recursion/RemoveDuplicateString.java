package recursion;

public class RemoveDuplicateString {
    public static void removeDuplicateString(String str, int idx , StringBuilder newStr , boolean map[]){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true){
            removeDuplicateString(str, idx+1, newStr, map);

        }else{
            map[currChar - 'a'] = true;
            removeDuplicateString(str, idx+1, newStr.append(currChar), map);
        }

    }
    public static void main(String[] args) {
        String str = "sachinpandit";
        removeDuplicateString(str, 0, new StringBuilder(""),new boolean[26]);
    }
}
