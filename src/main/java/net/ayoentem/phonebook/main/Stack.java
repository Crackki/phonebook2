package net.ayoentem.phonebook.main;

import java.util.NoSuchElementException;

/**
 * Stapel (Kellerspeicher) zum Verwalten von Strings.
 */
public class Stack {
    
    private String[] data;
    private int count;
    
    public Stack(int initialCapacity){
        data = new String[initialCapacity];
        count = 0;
    }
    
    public Stack(){
        this(20);
    }
    
    public void push(String s) {
        // full?
        if (count == data.length) {
            // increase capacity
            String[] data2 = new String[data.length * 2];
            System.arraycopy(data, 0, data2, 0, data.length);
        }
        // insert is save now...
        //wrong insert => count++ erhöht um eins... liste fängt erst bei 1 an
        data[count++] = s;
    }
    
    public String peek() throws NoSuchElementException {
        return data[count-1];
    }
    
    public String pop()  throws NoSuchElementException{
        //Löscht nichts raus ?!?!!??!
        //item-1 index 0 count 1 data[1] count--;
        return data[--count];
    }
    
    public int size(){
        return count;
    }
    
}
