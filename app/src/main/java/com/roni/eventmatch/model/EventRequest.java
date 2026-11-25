package com.roni.eventmatch.model;

import java.util.Date;

public class EventRequest {


    private int requestId;
    private User customer;
    private String eventType;
    private Date eventDate;
    private String location;
    private int guestCount;
    private double budget;
    private String requestDetails;
    private String status;

    public EventRequest(int requestId, User customer, String eventType, Date eventDate, String location, int guestCount, double budget, String requestType, String status) {
        this.requestId = requestId;
        this.customer = customer;
        this.eventType = eventType;
        this.eventDate = eventDate;
        this.location = location;
        this.guestCount = guestCount;
        this.budget = budget;
        this.requestDetails = requestType;
        this.status = status;
    }

    public EventRequest() {
    }

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public User getCustomer() {
        return customer;
    }

    public void setCustomer(User customer) {
        this.customer = customer;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getGuestCount() {
        return guestCount;
    }

    public void setGuestCount(int guestCount) {
        this.guestCount = guestCount;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public String getRequestDetails() {
        return requestDetails;
    }

    public void setRequestDetails(String requestDetails) {
        this.requestDetails = requestDetails;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "EventRequest{" +
                "requestId=" + requestId +
                ", customer=" + customer +
                ", eventType='" + eventType + '\'' +
                ", eventDate=" + eventDate +
                ", location='" + location + '\'' +
                ", guestCount=" + guestCount +
                ", budget=" + budget +
                ", requestType='" + requestDetails + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
