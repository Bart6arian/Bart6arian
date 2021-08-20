package com.kodilla.stream.invoice.simple;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class SimpleInvoice {
    private final List<SimpleItem> itemsList = new ArrayList<>();

    public void addItem(SimpleItem item) {
        itemsList.add(item);
    }

    public boolean removeItem(SimpleItem item) {
        return itemsList.remove(item);
    }

    public double getValueToPay() {
        return itemsList.stream()
                .collect(Collectors.summingDouble(SimpleItem::getValue));
    }
}
