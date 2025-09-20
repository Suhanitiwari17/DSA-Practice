public class subset {
    public static void main(String[] args) {
        subseq("","abcd");
    }
    static void subseq(String proc,String unproc){
        if(unproc.isEmpty()){
            System.out.println(proc);
            return;
        }
        char ch=unproc.charAt(0);
        subseq(proc+ch,unproc.substring(1));
        subseq(proc,unproc.substring(1));
    }
}
