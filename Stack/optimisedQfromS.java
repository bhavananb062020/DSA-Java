package Stack;

import java.util.Stack;

class Myqueue1{
    Stack<Integer> input = new Stack<>();
    Stack<Integer> output = new Stack<>();
    public void push(int x){
        input.push(x);
    }

    public int pop(){
        while (input.empty()==false){
            output.push(input.peek());
            input.pop();
        }
        int val = output.peek();
        output.pop();
        return val;
    }

    public int peek(){
        if(output.empty()){
            while (input.empty()==false){
                output.push(input.peek());
                input.pop();
            }
        }
        return output.peek();
    }

    public int size(){
        return (output.size() + input.size());
    }
}
public class optimisedQfromS {
    public static void main(String args[]){
        Myqueue1 q = new Myqueue1();
        q.push(3);
        q.push(4);
        System.out.println(q.pop());
        System.out.println(q.peek());
        System.out.println(q.size());

    }

}
