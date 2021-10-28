package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.Invoice;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface InvoiceDao extends CrudRepository<Invoice, Integer> {
    List<Invoice> findInvoiceByNumberNotNull (String invoiceId);
}
