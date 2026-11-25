package com.roni.eventmatch.model;

import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class Event {

    private int eventId;
    private EventRequest request;




    private ArrayList<Supplier> suppliersList;


    private double finalPrice;
    private String notes;

    private String eventStatus;


    public Event() {

    }

    public Event(int eventId, EventRequest request, ArrayList<Supplier> suppliersList, double finalPrice, String notes, String eventStatus) {
        this.eventId = eventId;
        this.request = request;
        this.suppliersList = suppliersList;
        this.finalPrice = finalPrice;
        this.notes = notes;
        this.eventStatus = eventStatus;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public EventRequest getRequest() {
        return request;
    }

    public void setRequest(EventRequest request) {
        this.request = request;
    }

    public String getEventStatus() {
        return eventStatus;
    }

    public void setEventStatus(String eventStatus) {
        this.eventStatus = eventStatus;
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(double finalPrice) {
        this.finalPrice = finalPrice;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public ArrayList<Supplier> getSuppliersList() {
        return suppliersList;
    }

    public void setSuppliersList(ArrayList<Supplier> suppliersList) {
        this.suppliersList = suppliersList;
    }

    @Override
    public String toString() {
        return "Event{" +
                "eventId=" + eventId +
                ", request=" + request +
                ", suppliersList=" + suppliersList +
                ", finalPrice=" + finalPrice +
                ", notes='" + notes + '\'' +
                ", eventStatus='" + eventStatus + '\'' +
                '}';
    }
}
