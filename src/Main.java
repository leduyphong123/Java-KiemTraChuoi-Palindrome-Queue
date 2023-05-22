import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main{
    public static void main(String[] args){
        String text="Able was I ere I saw Elba";
        String newText=text.toLowerCase();
        int index=newText.length();
        boolean result=true;
        Stack stack= new Stack();
        Queue queue = new LinkedList();
        for (int i=0;i<index;i++){
            stack.push(newText.charAt(i));
            queue.add(newText.charAt(i));
        }
        for (int i=0;i<index;i++){
            if(!queue.remove().equals(stack.pop())){
                result=false;
                break;
            }
        }
        if(result){
            System.out.println("Palindrome");
        }else {
            System.out.println("no  Palindrome");

        }
    }
}