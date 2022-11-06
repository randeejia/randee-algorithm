import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.Date;

class HelloWorld {
  public static void main(String[] args) {
    HelloWorld obj = new HelloWorld();
    obj.printStack();
    obj.printQueue();

  }

  public void printStack() {
    Stack<String> stack = new Stack<String>();
    stack.push("Test");
    String next = stack.pop();
    System.out.println(next);
  }

  public void printQueue() {
    Queue<Date> queue = new ConcurrentLinkedQueue<Date>();
    queue.offer(new Date());
    Date next = queue.peek();
    System.out.println(next);

  }
}