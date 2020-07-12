package com.example.istanbul.ui.main;

public class Place {

    private int mImageID;
    private String mPlaceName;
    private String mDistrict;
    private String mInformation;
    private String mAddress;
    private String mGoogleGeo;
    private String mTelephone;

    public Place(int mImageID, String mPlaceName, String mDistrict, String mInformation, String mAddress, String mGoogleGeo) {
        this.mImageID = mImageID;
        this.mPlaceName = mPlaceName;
        this.mDistrict = mDistrict;
        this.mInformation = mInformation;
        this.mAddress = mAddress;
        this.mGoogleGeo = mGoogleGeo;
    }

    public Place(String mPlaceName, String mDistrict, String mInformation) {
        this.mPlaceName = mPlaceName;
        this.mDistrict = mDistrict;
        this.mInformation = mInformation;
    }

    public Place(int mImageID, String mPlaceName, String mDistrict, String mInformation) {
        this.mImageID = mImageID;
        this.mPlaceName = mPlaceName;
        this.mDistrict = mDistrict;
        this.mInformation = mInformation;
    }

    public Place(String mPlaceName, String mDistrict) {
        this.mPlaceName = mPlaceName;
        this.mDistrict = mDistrict;
    }

    public Place() {
    }

    public Place(int mImageID, String mPlaceName, String mDistrict, String mInformation, String mAddress, String mGoogleGeo, String mTelephone) {
        this.mImageID = mImageID;
        this.mPlaceName = mPlaceName;
        this.mDistrict = mDistrict;
        this.mInformation = mInformation;
        this.mAddress = mAddress;
        this.mGoogleGeo = mGoogleGeo;
        this.mTelephone = mTelephone;
    }

    public Place(int mImageID, String mPlaceName, String mDistrict, String mInformation, String mAddress) {
        this.mImageID = mImageID;
        this.mPlaceName = mPlaceName;
        this.mDistrict = mDistrict;
        this.mInformation = mInformation;
        this.mAddress = mAddress;
    }

    public int getImageID() {
        return mImageID;
    }

    public void setImageID(int mImageID) {
        this.mImageID = mImageID;
    }

    public String getPlaceName() {
        return mPlaceName;
    }

    public void setPlaceName(String mPlaceName) {
        this.mPlaceName = mPlaceName;
    }

    public String getDistrict() {
        return mDistrict;
    }

    public void setDistrict(String mDistrict) {
        this.mDistrict = mDistrict;
    }

    public String getInformation() {
        return mInformation;
    }

    public void setInformation(String mInformation) {
        this.mInformation = mInformation;
    }

    public String getAddress() {
        return mAddress;
    }

    public void setAddress(String mAddress) {
        this.mAddress = mAddress;
    }

    public String getGoogleGeo() {
        return mGoogleGeo;
    }

    public void setGoogleGeo(String mGoogleGeo) {
        this.mGoogleGeo = mGoogleGeo;
    }

    public String getTelephone() {
        return mTelephone;
    }

    public void setTelephone(String mTelephone) {
        this.mTelephone = mTelephone;
    }
}
