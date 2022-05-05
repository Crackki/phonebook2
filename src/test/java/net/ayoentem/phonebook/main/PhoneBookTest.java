package net.ayoentem.phonebook.main;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookTest {

    public static final String STD_NAME = "Dummy-";
    public static final int STD_NUMBER = 1234;
    private PhoneBook book;

    public PhoneBookTest(){
        
    }

    @BeforeEach
    void setUp() {
        //Vorbereiten
        book = new PhoneBook();
        int idCount = STD_NUMBER;
        for (int i = 0; i < 20; i++) {
            book.addEntry(STD_NAME + i, idCount);
            idCount++;
        }
    }
    @AfterAll
    public static void tearDownClass(){

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void testClearEntries(){
        //Testling aufrufen
        book.clear();

        //Nachbedingung prüfen
        assertEquals(0, book.size());
        assertEquals(0, book.lookupNumber("Dummy-2"));
    }

    @Test
    public void testRemoveEntryByName() {
        //Testling aufrufen
        book.removeEntryByName("Dummy-0");

        //Nachbedingung prüfen
        assertEquals(19, book.size());
        assertNull(book.lookupName(1234));
        assertEquals(0, book.lookupNumber("Dummy-0"));
    }
}