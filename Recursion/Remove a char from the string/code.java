public class Removeafromstring {
    public static void main(String[] args) {
        String name="badabacada";
        removeA(" ",name);
       
    }
    static void removeA(String proc,String unproc){
        if(unproc.isEmpty()){
            System.out.println(proc);
            return;
        }
        char ch=unproc.charAt(0);
        if(ch=='a'){
            removeA(proc,unproc.substring(1));
        }else{
            removeA(proc+ch,unproc.substring(1));
        }
    }
}
