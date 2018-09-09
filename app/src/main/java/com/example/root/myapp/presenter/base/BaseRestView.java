package com.example.root.myapp.presenter.base;

import com.arellomobile.mvp.MvpView;

public interface BaseRestView extends MvpView {
    void startLoading();
    void hideLoading();
    void showError(String str);
}
