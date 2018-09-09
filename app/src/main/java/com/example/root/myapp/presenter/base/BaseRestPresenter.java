package com.example.root.myapp.presenter.base;

import com.arellomobile.mvp.MvpPresenter;
import com.example.root.myapp.presenter.base.BaseRestView;

import rx.Observer;

abstract class BaseRestPresenter<T> extends MvpPresenter<BaseRestView> implements Observer<T> {

    @Override
    public void onCompleted() {
        getViewState().hideLoading();
    }

    @Override
    public void onError(Throwable e) {
        getViewState().showError(e.getLocalizedMessage());
    }
}
