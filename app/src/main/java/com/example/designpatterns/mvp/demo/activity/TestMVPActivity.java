package com.example.designpatterns.mvp.demo.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.designpatterns.R;
import com.example.designpatterns.mvp.demo.api.TestResponse;
import com.example.designpatterns.mvp.demo.mvp.TestContract;
import com.example.designpatterns.mvp.demo.mvp.TestPresenter;

public class TestMVPActivity extends Activity implements TestContract.TestView {

    private TestPresenter presenter;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_mvp);
        textView = (TextView) findViewById(R.id.tv);
    }

    public void request(View v){
        getPresenter().requestData("110");
    }

    public TestPresenter getPresenter(){
        if(presenter == null){
            presenter = new TestPresenter(this);
            presenter.attachView(this);
        }
        return presenter;
    }

    @Override
    public void updataView(TestResponse response) {
        textView.setText(response.result);
    }
}
