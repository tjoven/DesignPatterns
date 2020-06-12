package com.example.designpatterns.mvp.demo.mvp;
import com.example.designpatterns.mvp.IPresenter;
import com.example.designpatterns.mvp.IView;
import com.example.designpatterns.mvp.demo.api.TestResponse;

public interface TestContract {
    interface TestPresenter extends IPresenter<TestView> {
        void requestData(String id);
    }

    interface TestView extends IView<TestPresenter> {
        void updataView(TestResponse response);
    }
}
