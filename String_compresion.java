public class String_compresion {
    public static void main(String[] args){

        String s="aaabbc";

        String res="";

        int count=1;

        for(int i=0;i<s.length();i++){
            if(i<s.length() - 1 && s.charAt(i) == s.charAt(i + 1)){
                count++;
            }
            else{
                res=res + s.charAt(i) + count;
                count=1;
            }
        }

        System.out.print(res);

    }
}
