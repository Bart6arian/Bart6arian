package com.kodilla.stream.invoice.simple;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleInvoiceTestSuite {
    @Test
    void testGetValueToPay() {
        SimpleInvoice simpleInvoice = new SimpleInvoice();
        //when
        simpleInvoice.addItem(new SimpleItem(new SimpleProduct("Product1", 23.3),3.5));
        simpleInvoice.addItem(new SimpleItem(new SimpleProduct("Product4", 3),5));
        simpleInvoice.addItem(new SimpleItem(new SimpleProduct("Product15", 57.43), 4.3));
        //then
        assertEquals(343.499, simpleInvoice.getValueToPay(), 0.001);
    }
}
