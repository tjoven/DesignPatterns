package com.example.designpatterns.mvp.demo.mvp;

import android.content.Context;

import com.example.designpatterns.mvp.BasePresenter;
import com.example.designpatterns.mvp.IDataSource;
import com.example.designpatterns.mvp.demo.api.TestResponse;

public class TestPresenter extends BasePresenter<TestContract.TestView> implements TestContract.TestPresenter {

    Context mContext ;
    public TestPresenter(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public void requestData(String id) {
        TestModel model = new TestModel(mContext);
        model.setParams(id);
        model.sendRequest(new IDataSource.IDataSourceListener<TestResponse>() {
            @Override
            public void onRequestStart() {

            }

            @Override
            public void onData(TestResponse var1) {
                getView().updataView(var1);
            }

            @Override
            public void onError(boolean var1, Object var2) {

            }
        });
    }

}
