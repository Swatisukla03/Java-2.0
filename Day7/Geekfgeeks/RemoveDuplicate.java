package Day7.Geekfgeeks;

public class RemoveDuplicate {
    public static String removeDuplicate(String str){
        String newString=" ";
        
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(newString.indexOf(ch)==-1){
                newString+=ch;
            }

        }
        return newString;

    }
    public static void main(String args[]){
        String str="aabbaccdaacdfffddv";
        String  removeDupli= removeDuplicate(str);
        System.out.println(removeDupli);
    }
    
}
