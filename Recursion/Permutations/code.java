public class Permutation {
    public static void main(String[] args) {
        String s="abc";
       permutations("",s);
    }
    static void permutations(String proc,String unproc){
        if(unproc.isEmpty()){
            System.out.println(proc);
            return;
        }
        char ch=unproc.charAt(0);
        for(int i=0;i<=proc.length();i++){
            String first=proc.substring(0,i);
            String second=proc.substring(i,proc.length());
            permutations(first+ch+second,unproc.substring(1));
        }
    }
    
}
