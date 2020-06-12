package com.example.designpatterns.mvp.demo.mvp;

import android.content.Context;

import com.example.designpatterns.mvp.IDataSource;
import com.example.designpatterns.mvp.demo.api.TestResponse;

public class TestModel implements IDataSource {
    Context mContext;

    String id;
    public TestModel(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public void sendRequest(IDataSource.IDataSourceListener listener) {
        TestResponse response = new TestResponse();
        response.result = "ok:" + id;
        listener.onData(response);
    }

    public void setParams(String id){
        this.id = id;
    }
}
