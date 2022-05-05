package net.ayoentem.phonebook.main;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookTest {

    public PhoneBookTest(){
        
    }

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void addEntry() {
    }

    @Test
    public void testRemoveEntryByName() {
        //Testvorbereitung
        PhoneBook book = new PhoneBook();
        book.addEntry("Hans", 123456);

        //TEstling aufrufen
        book.removeEntryByName("Hans");

        //Nachbedingung prüfen
        assertEquals(0, book.size());
        assertNull(book.lookupName(123456));
        assertEquals(0, book.lookupNumber("Hans"));
    }
}