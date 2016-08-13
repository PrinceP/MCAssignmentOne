package com.example.root.assignmentone;


import android.os.Bundle;
import android.support.v4.app.Fragment;

/**
 * Created by root on 13/8/16.
 */


public class RetainedFragment extends Fragment {

    // data object we want to retain
    private  String data;

    // this method is only called once for this fragment
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // retain this fragment
        setRetainInstance(true);
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }
}
