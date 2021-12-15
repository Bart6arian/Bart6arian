package com.kodilla.patterns2.decorator.taxiportal;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaxiOrderTestSuite {

    @Test
    public void testBasicTaxiOrderGetCost() {
        //given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        //when
        BigDecimal calculatedCost = taxiOrder.getCost();
        //then
        assertEquals(new BigDecimal(5), calculatedCost);
    }

    @Test
    public void testBasicTaxiOrderGetDesc() {
        //given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        //when
        String desc = taxiOrder.getDescription();
        //then
        assertEquals("Drive course", desc);
    }

    @Test
    public void testTaxiNetworkGetCost() {
        //given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new TaxiNetworkOrderDecorator(taxiOrder);
        //when
        BigDecimal cost = taxiOrder.getCost();
        //then
        assertEquals(new BigDecimal(40), cost);
    }

    @Test
    public void testTaxiNetworkGetDesc() {
        //given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new TaxiNetworkOrderDecorator(taxiOrder);
        //when
        String desc = taxiOrder.getDescription();
        //then
        assertEquals("Drive course by Taxi Network", desc);
    }

    @Test
    public void testMyTaxiWithChildSeatGetCost() {
        //given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new MyTaxiNetworkOrderDecorator(taxiOrder);
        taxiOrder = new ChildSeatDecorator(taxiOrder);
        //when
        BigDecimal cost = taxiOrder.getCost();
        //then
        assertEquals(new BigDecimal(37), cost);
    }

    @Test
    public void testMyTaxiWithChildSeatGetDesc() {
        //given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new MyTaxiNetworkOrderDecorator(taxiOrder);
        taxiOrder = new ChildSeatDecorator(taxiOrder);
        //when
        String desc = taxiOrder.getDescription();
        //then
        assertEquals("Drive course by MyTaxi Network for child seat", desc);
    }

    @Test
    public void testMyTaxiWithTwoChildSeatGetCost() {
        //given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new UberNetworkOrderDecorator(taxiOrder);
        taxiOrder = new ChildSeatDecorator(taxiOrder);
        taxiOrder = new ChildSeatDecorator(taxiOrder);
        //when
        BigDecimal cost = taxiOrder.getCost();
        //then
        assertEquals(new BigDecimal(29), cost);
    }

    @Test
    public void testMyTaxiWithTwoChildSeatGetDesc() {
        //given
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        taxiOrder = new UberNetworkOrderDecorator(taxiOrder);
        taxiOrder = new ChildSeatDecorator(taxiOrder);
        taxiOrder = new ChildSeatDecorator(taxiOrder);
        //when
        String desc = taxiOrder.getDescription();
        //then
        assertEquals("Drive course by Uber Network for child seat for child seat", desc);
    }

    @Test
    public void testVipTaxiWithChildSeatExpressGetCost() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);
        theOrder = new ExpressDecorator(theOrder);
        theOrder = new VipCarDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        System.out.println(theOrder.getCost());
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(57), theCost);
    }

    @Test
    public void testVipTaxiWithChildSeatExpressGetDescription() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);
        theOrder = new ExpressDecorator(theOrder);
        theOrder = new VipCarDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        System.out.println(theOrder.getDescription());
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Drive course by Taxi Network express service variant VIP for child seat", description);
    }
}
