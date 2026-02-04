import java.util.ArrayList;

/**
 * Lab: GenericStack
 * 
 * A generic stack implementation using ArrayList.
 * Students will implement all methods.
 */
public class GenericStack<E> {
    
    private ArrayList<E> list = new ArrayList<>();
    
    /**
     * TODO: Implement this method.
     * Hint: Add the element to the end of the list (top of stack).
     */
    public void push(E element) {
        list.add(element);
    }
    
    /**
     * TODO: Implement this method.
     * Hint: Remove and return the last element (top of stack).
     * Return type is E.
     */
    public E pop() {
        int realLength = list.size() - 1;
        E element = list.get(realLength);
        list.remove(realLength);
        return element;
    }
    
    /**
     * TODO: Implement this method.
     * Hint: Return the last element without removing it.
     * Return type is E.
     */
    public E peek() {
        int realLength = list.size() - 1;
        return list.get(realLength);
    }
    
    /**
     * TODO: Implement this method.
     * Hint: Return the number of elements in the stack.
     */
    public int getSize() {
        return list.size();
    }
    
    /**
     * TODO: Implement this method.
     * Hint: Return true if the stack is empty.
     */
    public boolean isEmpty() {
        return list.isEmpty();
    }
    
    @Override
    public String toString() {
        return "Stack: " + list.toString();
    }

    public static void main(String[] args) {
        // Test with Strings
        GenericStack<String> stringStack = new GenericStack<>();
        stringStack.push("Hello");
        stringStack.push("World");
        stringStack.push("Java");
        
        System.out.println("String Stack: " + stringStack);
        System.out.println("Peek: " + stringStack.peek());
        System.out.println("Pop: " + stringStack.pop());
        System.out.println("Size: " + stringStack.getSize());
        
        // Test with Integers
        GenericStack<Integer> intStack = new GenericStack<>();
        intStack.push(10);
        intStack.push(20);
        intStack.push(30);
        
        System.out.println("\nInteger Stack: " + intStack);
        System.out.println("Peek: " + intStack.peek());
        System.out.println("Pop: " + intStack.pop());
        System.out.println("Size: " + intStack.getSize());

    }
}

