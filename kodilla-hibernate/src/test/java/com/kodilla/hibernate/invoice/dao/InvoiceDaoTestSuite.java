package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave() {
        //given
        Item item1 = new Item(32, new BigDecimal(150));
        Item item2 = new Item(11, new BigDecimal(90));
        Invoice invoice = new Invoice(3, "/09/2021");
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);

        //when
        invoiceDao.save(invoice);
        String id = (invoice.getId() +""+ invoice.getNumber());

        //then
        assertEquals("3/09/2021", id);
    }
}
