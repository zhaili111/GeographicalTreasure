package com.example.geographicaltreasure.user.login;

/**
 * Created by 翟力 on 2017/1/3.
 */


// 视图的接口
public interface LoginView {

    void showProgress();

    void hideProgress();

    void showMessage(String msg);

    void navigationToHome();

}
