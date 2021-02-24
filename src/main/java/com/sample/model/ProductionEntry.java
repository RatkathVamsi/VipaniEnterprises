package com.sample.model;

import java.sql.Date;
import java.util.Arrays;

public class ProductionEntry {
    private Float GST;
    private Float processingRate;
    private Float udCakeQty;
    private String consumptionQties[];
    private Date startDate;
    private Date endDate;
    private String[] itemNames;
    private String[] stock;

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return "ProductionEntry{" +
                "GST=" + GST +
                ", processingRate=" + processingRate +
                ", udCakeQty=" + udCakeQty +
                ", consumptionQties=" + Arrays.toString(consumptionQties) +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", itemNames=" + Arrays.toString(itemNames) +
                ", stock=" + Arrays.toString(stock) +
                '}';
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Float getGST() {
        return GST;
    }

    public void setGST(Float GST) {
        this.GST = GST;
    }

    public Float getProcessingRate() {
        return processingRate;
    }

    public void setProcessingRate(Float processingRate) {
        this.processingRate = processingRate;
    }

    public Float getUdCakeQty() {
        return udCakeQty;
    }

    public void setUdCakeQty(Float udCakeQty) {
        this.udCakeQty = udCakeQty;
    }

    public String[] getConsumptionQties() {
        return consumptionQties;
    }

    public void setConsumptionQties(String[] consumptionQties) {
        this.consumptionQties = consumptionQties;
    }


    public void setItemNames(String[] itemNames) {
        this.itemNames = itemNames;
    }

    public String[] getItemNames() {
        return itemNames;
    }

    public void setStock(String[] stock) {
        this.stock = stock;
    }

    public String[] getStock() {
        return stock;
    }
}
