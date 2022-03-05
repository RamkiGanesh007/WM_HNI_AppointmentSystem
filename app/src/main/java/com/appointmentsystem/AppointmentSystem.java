package com.example.wm_hni_appointmentsystem;

public class AppointmentSystem {
    String AppointmentID;
    String AppointmentTime;
    String IsAttending;
    String RequestedBy;
    String RequestedTo;

    public AppointmentSystem(String appointmentID, String appointmentTime, String isAttending, String requestedBy, String requestedTo) {
        AppointmentID = appointmentID;
        AppointmentTime = appointmentTime;
        IsAttending = isAttending;
        RequestedBy = requestedBy;
        RequestedTo = requestedTo;
    }

    public String getAppointmentID() {
        return AppointmentID;
    }

    public void setAppointmentID(String appointmentID) {
        AppointmentID = appointmentID;
    }

    public String getAppointmentTime() {
        return AppointmentTime;
    }

    public void setAppointmentTime(String appointmentTime) {
        AppointmentTime = appointmentTime;
    }

    public String getIsAttending() {
        return IsAttending;
    }

    public void setIsAttending(String isAttending) {
        IsAttending = isAttending;
    }

    public String getRequestedBy() {
        return RequestedBy;
    }

    public void setRequestedBy(String requestedBy) {
        RequestedBy = requestedBy;
    }

    public String getRequestedTo() {
        return RequestedTo;
    }

    public void setRequestedTo(String requestedTo) {
        RequestedTo = requestedTo;
    }
}
