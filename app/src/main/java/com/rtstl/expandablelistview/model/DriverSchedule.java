package com.rtstl.expandablelistview.model;

import android.databinding.BaseObservable;

import com.bignerdranch.expandablerecyclerview.model.Parent;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by User1 on 09-03-2018.
 */

public class DriverSchedule extends BaseObservable {

    @SerializedName("status")
    @Expose
    public String status;

    @SerializedName("msg")
    @Expose
    public String msg;

    @SerializedName("data")
    @Expose
    public Data data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public class Data {
       
        @SerializedName("schedules")
        @Expose
        List<Schedules> sclist;

        @SerializedName("driver_details")
        @Expose
        Driver_details driver_details;

        public List<Schedules> getSclist() {
            return sclist;
        }

        public void setSclist(List<Schedules> sclist) {
            this.sclist = sclist;
        }

        public Driver_details getDriver_details() {
            return driver_details;
        }

        public void setDriver_details(Driver_details driver_details) {
            this.driver_details = driver_details;
        }
    }

    public class Schedules implements Parent<Alloted_kids> {

        @SerializedName("is_active")
        @Expose
        public String is_active;


        @SerializedName("route_details")
        @Expose
        public Route_details route_details;


        @SerializedName("alloted_kids")
        @Expose
        public List<Alloted_kids> alloted_kids;

        public String getIs_active() {
            return is_active;
        }

        public void setIs_active(String is_active) {
            this.is_active = is_active;
        }

        public Route_details getRoute_details() {
            return route_details;
        }

        public void setRoute_details(Route_details route_details) {
            this.route_details = route_details;
        }

        public List<Alloted_kids> getAlloted_kids() {
            return alloted_kids;
        }

        public void setAlloted_kids(List<Alloted_kids> alloted_kids) {
            this.alloted_kids = alloted_kids;
        }

        @Override
        public List<Alloted_kids> getChildList() {
            return null;
        }

        @Override
        public boolean isInitiallyExpanded() {
            return false;
        }
    }

    public class Driver_details {

        @SerializedName("driver_details")
        @Expose
        public Driver_details1 driver_details;

        public Driver_details1 getDriver_details() {
            return driver_details;
        }

        public void setDriver_details(Driver_details1 driver_details) {
            this.driver_details = driver_details;
        }
    }

    public class Route_details {
        @SerializedName("ds_id")
        @Expose
        public String ds_id;

        @SerializedName("kidpool_route_id")
        @Expose
        public String kidpool_route_id;


        public String getDs_id() {
            return ds_id;
        }

        public void setDs_id(String ds_id) {
            this.ds_id = ds_id;
        }

        public String getKidpool_route_id() {
            return kidpool_route_id;
        }

        public void setKidpool_route_id(String kidpool_route_id) {
            this.kidpool_route_id = kidpool_route_id;
        }
    }

    public class Alloted_kids {

        @SerializedName("kid_name")
        @Expose
        public String kid_name;


        @SerializedName("kid_image")
        @Expose
        public String kid_image;

        public String getKid_name() {
            return kid_name;
        }

        public void setKid_name(String kid_name) {
            this.kid_name = kid_name;
        }

        public String getKid_image() {
            return kid_image;
        }

        public void setKid_image(String kid_image) {
            this.kid_image = kid_image;
        }
    }

    public class Driver_details1 {

        @SerializedName("driver_id")
        @Expose
        public String driver_id;


        @SerializedName("driver_name")
        @Expose
        public String driver_name;

        public String getDriver_id() {
            return driver_id;
        }

        public void setDriver_id(String driver_id) {
            this.driver_id = driver_id;
        }

        public String getDriver_name() {
            return driver_name;
        }

        public void setDriver_name(String driver_name) {
            this.driver_name = driver_name;
        }
    }


}
