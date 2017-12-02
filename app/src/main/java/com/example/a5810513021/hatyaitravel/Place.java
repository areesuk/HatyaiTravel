package com.example.a5810513021.hatyaitravel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by patho on 21/11/2560.
 */

public class Place {
    private String name;
    private int resId;
    private String detail;
    private String location;
    private String facebook;
    private String telnum;
    private String time;
    private List<Place> placeList = new ArrayList<>();

    Place(){

    }
    Place(int resId,String name,String detail,String location,String facebook,String telnum,String time){
        this.resId = resId;
        this.name = name;
        this.detail = detail;
        this.location = location;
        this.facebook = facebook;
        this.telnum = telnum;
        this.time = time;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }

    public List<Place> getPlaceList() {
        return placeList;
    }

    public void setPlaceList(List<Place> placeList) {
        this.placeList = placeList;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getTelnum() {
        return telnum;
    }

    public void setTelnum(String telnum) {
        this.telnum = telnum;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
