package Day7.Revision;

public class RemoveDuplicacy {
    public static void main(String args[]){
        String str="aabbccddbbcaa";
        String rem_dupli= removedupli(str);
        System.out.println(rem_dupli);

    }
    // public static void display(String str){
    //     for(int i=0;i<str.length();i++){
    //         System.out.println(str[i]);
    //     }
    // }
    public static String removedupli(String str){
        String newStr=" ";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(newStr.indexOf(ch)==-1)
                newStr+=ch;
            

        }
        return newStr;


    }
   
    
}
