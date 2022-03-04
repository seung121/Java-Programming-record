import java.util.Scanner;

interface StackInterface {
    int length();
    String pop();
    boolean push(String ob);
}

class StringStack implements StackInterface {

String stack[]; 
private int top = 0;
public StringStack()
{
    stack = new String[5];
}
@Override
public int length() {
    return top+1;
}

@Override
public String pop() {
    return stack[--top];
}

@Override
public boolean push(String ob) {
    if(top==5) return false;
    else stack[top++] = ob;

    return true;
}

}
public class StackManager {
    public static void main(String[] args)
    {
        StringStack stack = new StringStack();
        Scanner scanner = new Scanner(System.in);
        System.out.printf(">>>");
        for (int i = 0; i < 5; i++)
        {
            stack.push(scanner.next());
        }
        
        for(int i = 0; i <5 ; i++)
        {
            System.out.printf(stack.pop()+ " ");
        }
    }

}
