package com.rtstl.expandablelistview;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.rtstl.expandablelistview.adapter.DriverScheduleAdapter;
import com.rtstl.expandablelistview.adapter.DriverScheduleExpandableAdapter;
import com.rtstl.expandablelistview.databinding.ActivityMainBinding;
import com.rtstl.expandablelistview.model.DriverSchedule;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    Context mContext;
    DriverSchedule list_driver;
    DriverScheduleAdapter adapter;
    DriverScheduleExpandableAdapter adapterExp;
    Gson gson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext=this;
        gson=new Gson();

        initview();
    }

    private void initview() {
        binding= DataBindingUtil.setContentView(this, R.layout.activity_main);
        inflateadapter();
    }

    private void inflateadapter() {
        ////for reading file from raw folder otherwise it's not required
        list_driver= gson.fromJson(readFileFromRawDirectory(R.raw.driverschedule), new TypeToken<DriverSchedule>(){}.getType());
        ////////////////////////////////////////
        Toast.makeText(mContext,""+list_driver.getData().getSclist().size(),Toast.LENGTH_SHORT).show();

        adapterExp = new DriverScheduleExpandableAdapter(mContext, list_driver.getData().getSclist());
        binding.rvRecycle.setLayoutManager(new LinearLayoutManager(this));
        binding.rvRecycle.setAdapter(adapter);
    }


    private String readFileFromRawDirectory(int resourceId){
        InputStream iStream = this.getResources().openRawResource(resourceId);
        ByteArrayOutputStream byteStream = null;
        try {
            byte[] buffer = new byte[iStream.available()];
            iStream.read(buffer);
            byteStream = new ByteArrayOutputStream();
            byteStream.write(buffer);
            byteStream.close();
            iStream.close();

            //inflateadapter();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return byteStream.toString();
    }
}
