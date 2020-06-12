package com.example.designpatterns.mvp;

public interface IView<P extends  IPresenter>{
    P getPresenter();
}
