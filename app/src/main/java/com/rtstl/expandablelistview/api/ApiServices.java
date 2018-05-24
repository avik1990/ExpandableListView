package com.rtstl.expandablelistview.api;


import com.rtstl.expandablelistview.model.DriverSchedule;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by User1 on 09-03-2018.
 */

public interface ApiServices {
    @GET(".")
    Call<DriverSchedule> getDriverSchedule();


}
