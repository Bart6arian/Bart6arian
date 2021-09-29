package com.kodilla.good.patterns.challenges.salesmanager;

public class ProductOrderService {
    private InformationService informationService;
    private Product product;
    private User user;
    private Shipping shipping;
    private ERP erp;

    public ProductOrderService(InformationService informationService, Product product,
                               User user, Shipping shipping) {
        this.informationService = informationService;
        this.product = product;
        this.user = user;
        this.shipping = shipping;
    }

    public SaleDto sale(Order order) {
        int isAvailable = product.quantity();

        if(isAvailable > 0) {
            informationService.fullOrderInfo(user.getNickname(), product.name(),
                    product.quantity(), product.showPrice(), product.showId(),
                    shipping.shippingCost(),
                    shipping.carrier());
            erp.setQuantity(product.quantity());
            erp.getTax(product.showPrice() * 23);
            informationService.moreInfo(order);
            return new SaleDto(user.getNickname(), true);
        } else {
            return new SaleDto(user.getNickname(), false);
        }
    }
}
