package com.example.wm_hni_appointmentsystem;

public class HNI {
    private String Address;
    private String HNI_ID;
    private String HNI_Name;
    private String PhoneNumber;
    private String WM_ID;

    public HNI(String address, String HNI_ID, String HNI_Name, String phoneNumber, String WM_ID) {
        Address = address;
        this.HNI_ID = HNI_ID;
        this.HNI_Name = HNI_Name;
        PhoneNumber = phoneNumber;
        this.WM_ID = WM_ID;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getHNI_ID() {
        return HNI_ID;
    }

    public void setHNI_ID(String HNI_ID) {
        this.HNI_ID = HNI_ID;
    }

    public String getHNI_Name() {
        return HNI_Name;
    }

    public void setHNI_Name(String HNI_Name) {
        this.HNI_Name = HNI_Name;
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
}
