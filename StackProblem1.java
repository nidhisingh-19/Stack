import java.util.*;
class StackProblem1
{
    public static void pushAtBottom(Stack <Integer> s, int data)
    {
        while(!s.isEmpty())
        {
            s.push(data);
            return;
        }
        int emp = s.pop();
        pushAtBottom(s,data);
        s.push(emp);

    }
    public static void main(String args[])
    {
        Stack <Integer> s = new Stack <>();
        s.push(1);
        s.push(2);
        s.push(3);

        pushAtBottom(s,4);
        while(!s.isEmpty())
        {
            System.out.print(s.pop() + "->");
        }
        


    }
}