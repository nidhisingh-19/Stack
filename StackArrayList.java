import java.util.*;
class StackArrayList
{
    static class Sarr 
    {
        ArrayList<Integer> arr = new ArrayList<Integer> ();
        public void push(int data)
        {
            arr.add(data);
        }
        public int pop()
        {
            int op = arr.remove(arr.size()-1);
            return op;
        }
        public int peek()
        {
            return arr.get(arr.size()-1);
        }
        

    }
    public static void main(String args[])
    {
        Sarr s = new Sarr();
        s.push(10);
        s.push(20);
        s.push(30);
        for(int i=0;i<3;i++)
        {
             System.out.print(s.peek() + "->");
             s.pop();


        }
        System.out.println("null");
       

    }
}