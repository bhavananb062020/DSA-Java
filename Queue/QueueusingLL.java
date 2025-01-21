// import java.util.*;

// class QueueNode
// {
//     int data;
//     QueueNode next;
//     QueueNode(int val)
//     {
//        data = val;
//        next = null;
//     }
// }  


// class QueueusingLL
// {
//     QueueNode Front = null, Rear = null;
//     int size = 0;

// boolean Empty()
// {
//     return Front == null;
// }  
// int Peek()
// {
//     if(Empty())  
//      {  System.out.println("Queue is Empty");
//         return -1;
//      } 
//     else 
//       return Front.data;
// }   
// void Enqueue(int value)
// {
//     QueueNode Temp = new QueueNode(value); 
//     if (Temp == null)  //When heap exhausted 
//         System.out.println("Queue is Full");
//     else
//     {
//         if (Front == null)
//         {
//             Front = Temp;
//             Rear = Temp;
//         } 
//         else
//         {
//             Rear.next = Temp; //link-address

//             Rear = Temp;
//         }
//         System.out.println(value+" Inserted into Queue ");
//         size++;
//     } 
// }      
// void Dequeue() 
// {
//     if (Front == null) 
//         System.out.println("Queue is Empty");
//     else
//     { 
//         System.out.println(Front.data+" Removed From Queue");
//         QueueNode Temp = Front;
//         Front = Front.next;  //delete
//         size--;
//     }  
// }  
// public static void main(String args[])

// {
//     QueueusingLL Q=new QueueusingLL();
//     Q.Enqueue(10);
//     Q.Enqueue(20);
//     Q.Enqueue(30);
//     Q.Enqueue(40);
//     Q.Enqueue(50);
//     Q.Dequeue();
//     System.out.println("The size of the Queue is "+Q.size);
//     System.out.println("The Peek element of the Queue is "+Q.Peek());
// }
// }   

import java.util.*;

class QueueusingLL{
    int data;
    QueueusingLL next;
    QueueusingLL(int val){
        data = val;
        next  = null;
    }

    QueueusingLL Front 
    
}