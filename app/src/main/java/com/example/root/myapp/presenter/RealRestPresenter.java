package com.example.root.myapp.presenter;

import com.example.root.myapp.presenter.base.BaseRestPresenter;

import rx.Observable;

public class RealRestPresenter extends BaseRestPresenter<String> {

    @Override
    public void onNext(String s) {

    }

    public void update() {
        getViewState().startLoading();
        Observable.just("", "")
                .subscribe(this);
    }
}
