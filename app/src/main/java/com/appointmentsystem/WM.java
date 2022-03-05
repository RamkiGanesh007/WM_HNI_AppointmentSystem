package com.example.wm_hni_appointmentsystem;

public class WM {

    private String PhoneNumber;
    private String WM_ID;
    private String WMName;
    private String Assigned_HNI_ID;

    public WM(String phoneNumber, String WM_ID, String WMName, String assigned_HNI_ID) {
        PhoneNumber = phoneNumber;
        this.WM_ID = WM_ID;
        this.WMName = WMName;
        Assigned_HNI_ID = assigned_HNI_ID;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getWM_ID() {
        return WM_ID;
    }

    public void setWM_ID(String WM_ID) {
        this.WM_ID = WM_ID;
    }

    public String getWMName() {
        return WMName;
    }

    public void setWMName(String WMName) {
        this.WMName = WMName;
    }

    public String getAssigned_HNI_ID() {
        return Assigned_HNI_ID;
    }

    public void setAssigned_HNI_ID(String assigned_HNI_ID) {
        Assigned_HNI_ID = assigned_HNI_ID;
    }
}
