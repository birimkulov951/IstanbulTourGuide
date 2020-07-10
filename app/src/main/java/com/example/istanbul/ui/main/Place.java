package com.example.istanbul.ui.main;

public class Place {

    private int mImageID;
    private String mPlaceName;
    private String mDistrict;
    private String mInformation;
    private String mAddress;
    private String mTelephone;


    public Place(int mImageID, String mLocationName, String mAddress, String mInformation, String mClickableAddress, String mTelephone) {
        this.mImageID = mImageID;
        this.mPlaceName = mLocationName;
        this.mDistrict = mAddress;
        this.mInformation = mInformation;
        this.mAddress = mClickableAddress;
        this.mTelephone = mTelephone;
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

    public Place(int mImageID, String mPlaceName, String mDistrict, String mInformation, String mAddress) {
        this.mImageID = mImageID;
        this.mPlaceName = mPlaceName;
        this.mDistrict = mDistrict;
        this.mInformation = mInformation;
        this.mAddress = mAddress;
    }

    public int getmImageID() {
        return mImageID;
    }

    public void setmImageID(int mImageID) {
        this.mImageID = mImageID;
    }

    public String getmPlaceName() {
        return mPlaceName;
    }

    public void setmPlaceName(String mPlaceName) {
        this.mPlaceName = mPlaceName;
    }

    public String getmDistrict() {
        return mDistrict;
    }

    public void setmDistrict(String mDistrict) {
        this.mDistrict = mDistrict;
    }

    public String getmInformation() {
        return mInformation;
    }

    public void setmInformation(String mInformation) {
        this.mInformation = mInformation;
    }

    public String getmAddress() {
        return mAddress;
    }

    public void setmAddress(String mAddress) {
        this.mAddress = mAddress;
    }

    public String getmTelephone() {
        return mTelephone;
    }

    public void setmTelephone(String mTelephone) {
        this.mTelephone = mTelephone;
    }
}
