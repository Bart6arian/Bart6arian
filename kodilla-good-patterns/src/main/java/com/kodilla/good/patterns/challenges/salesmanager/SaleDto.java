package com.kodilla.good.patterns.challenges.salesmanager;

public class SaleDto {
    private String user;
    private boolean available;

    public SaleDto(final String user, final boolean available) {
        this.user = user;
        this.available = available;
    }

    public String getUser() {
        return user;
    }

    public boolean isAvailable() {
        return available;
    }
}
