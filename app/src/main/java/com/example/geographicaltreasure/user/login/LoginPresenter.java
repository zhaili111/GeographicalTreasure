package com.example.geographicaltreasure.user.login;

import android.os.AsyncTask;

import com.example.geographicaltreasure.user.register.RegisterView;

/**
 * Created by 翟力 on 2017/1/3.
 */

public class LoginPresenter {

    /**
     * 视图的交互怎么处理？
     * 1. RegisterActivity
     * 2. 接口回调
     * 接口的实例化和接口方法的具体实现
     * 让Activity实现视图接口
     */

    private LoginView mLoginView;

    public LoginPresenter(LoginView loginView) {
        mLoginView = loginView;
    }

    public void login(){

        new AsyncTask<Void, Integer, Void>() {

            // 可以使用进度条增加用户体验度。 此方法在主线程执行，用于显示任务执行的进度。
            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                // UI的处理：进度条的展示
                mLoginView.showProgress();
            }

            // 后台执行，比较耗时的操作都可以放在这里,后台线程，不可以做UI的更新
            @Override
            protected Void doInBackground(Void... params) {

                // 后台线程，做网络请求
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                return null;
            }

            // 相当于Handler 处理UI的方式，在这里面可以使用在doInBackground 得到的结果处理操作UI
            @Override
            protected void onPostExecute(Void aVoid) {
                super.onPostExecute(aVoid);

                // 拿到数据，做UI更新
                // 登录成功之后的处理
                mLoginView.hideProgress();
                mLoginView.showMessage("登录成功");
                mLoginView.navigationToHome();
            }
        }.execute();
    }

}
