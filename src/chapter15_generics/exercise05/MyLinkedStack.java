package chapter15_generics.exercise05;//: generics/LinkedStack.java
// A stack implemented with an internal linked structure.

public class MyLinkedStack<T> {
  // 从原来的static静态类，修改为内部类，
  // private static class Node<U> -> private class Node
  // U item; -> T item // 直接取出MyLinkedStack<T>的T
  // Node<U> next; -> Node next; // 删掉Node<U>的<U>
  private class Node {
    T item;
    Node next;
    Node() { item = null; next = null; }
    Node(T item, Node next) {
      this.item = item;
      this.next = next;
    }
    boolean end() { return item == null && next == null; }
  }
  private Node top = new Node(); // End sentinel
  public void push(T item) {
    top = new Node(item, top);
  }	
  public T pop() {
    T result = top.item;
    if(!top.end())
      top = top.next;
    return result;
  }
  public static void main(String[] args) {
    MyLinkedStack<String> lss = new MyLinkedStack<String>();
    for(String s : "Phasers on stun!".split(" "))
      lss.push(s);
    String s;
    while((s = lss.pop()) != null)
      System.out.println(s);
  }
} /* Output:
stun!
on
Phasers
*///:~
