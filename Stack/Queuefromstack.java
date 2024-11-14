package Stack;
import java.util.*;

class Myqueue{
    Stack <Integer> input = new Stack<>();
    Stack <Integer> output = new Stack<>();
    public void push(int x){
        while (input.empty()==false){
            output.push(input.peek());
            input.pop();
        }

        input.push(x);
        while (output.empty()==false){
            input.push(output.peek());
            output.pop();
        }
    }

    public int pop(){
        int val = input.peek();
        input.pop();
        return val;
    }

    public int peek(){
        return input.peek();
    }

    public int size(){
        return input.size();
    }
}

public class Queuefromstack {
    public static void main(String args[]){
        Myqueue q = new Myqueue();
        q.push(3);
        q.push(2);
        System.out.println();
        System.out.println(q.pop());
        System.out.println(q.peek());
        System.out.println(q.size());

    }
}


