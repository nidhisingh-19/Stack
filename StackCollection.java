import java.util.*;
class StackCollection
{
    public static void main(String args[])
    { 
        Stack <Integer> s = new Stack<Integer>();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.print(s);
        s.pop();
        System.out.println(s);
        System.out.println(s.peek());

    }
} 