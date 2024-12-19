// package Stack;
// class stack {
//     private class stackNode {

//         int data;
//         stackNode next;
//         stackNode(int d) {
//             data = d;
//             next = null;
//         }

//     }

//     stackNode top;

//     int size;

//     stack() {
//         this.top = null;
//         this.size = 0;
//     }

//     public void stackPush(int x) {

//         stackNode element = new stackNode(x);

//         element.next = top;

//         top = element;

//         System.out.println("Element pushed");
//         size++;
//     }
//     public int stackPop() {

//         if (top == null) return -1;

//         int topData = top.data;

//        stackNode temp = top;

//         top = top.next;

//         return topData;
//     }
//     public int stacktop(){
//         if(top == null) return -1;
//         return top.data;
//     }
//     public int stackSize() {
//         return size;
//     }
//     public boolean stackIsEmpty() {
//         return top == null;
//     }
//     public void printStack() {
//         stackNode current = top;
//         while (current != null) {
//             System.out.print(current.data + " ");
//             current = current.next;
//         }
//         System.out.println();
//     }
// }
// class Main {
//     public static void main(String args[]) {
//         stack s = new stack();
//         s.stackPush(10);
//         s.stackPush(20);
//         System.out.println(s.stacktop());
//         s.printStack();
//         System.out.println("Element popped " + s.stackPop());
//         System.out.println("Stack size: " + s.stackSize());
//         System.out.println("Stack is empty or not: " + s.stackIsEmpty());

//     }
// }

package Stack;


class Stack{
    private class stackNode{
        int data;
        stackNode next;
        stackNode(int d){
            data = d;
            next = null;
        }
    }
    stackNode top;
    int size ;
    Stack(){
        this.top = null;
        this.size = 0;
    }

    public void stackpush(int x){
        stackNode element = new stackNode(x);
        element.next = top;
        top = element;
        System.out.println("Element pushed" );
        size++;
    }

    public int stackpop(){
        if(top == null) return -1;
        int topdata = top.data;
        top = top.next;
        size--;
        return topdata;
        
    }

    public int stacktop(){
        if(top == null) return -1;
        return top.data;

    }
    public int stacksize(){
        return size;

    }
    public void printStack(){
        stackNode current = top;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }

    }
}

class Main{
    public static void main(String[] args) {
        Stack s = new Stack();
        s.stackpush(23);
        s.stackpush(1);
        s.stackpush(2);
        System.out.println("Popped element is "+ s.stackpop());
        System.out.println("Top is "+ s.stacktop());
        System.out.println("Size "+ s.stacksize());
        s.printStack();
    }
}