package com.bw.jiguoshuai20200306;

import android.app.Application;
import android.content.Context;

public class App extends Application {
    private static Context context;

//    5、	把项目提交到Github上，提交信息填写完成了程序异常处理/
    @Override
    public void onCreate() {
        super.onCreate();
        context=getApplicationContext();
    }
    public static Context getAppli(){
        return context;
    }
}
