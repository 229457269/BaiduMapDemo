package zhaoq_qiang.baidumapdemo;

import android.app.Application;

import com.baidu.mapapi.SDKInitializer;

/**
 * ProjectName : zhaoq_qiang.baidumapdemo
 * Created by : zhaoQiang
 * Email : zhaoq_hero163.com
 * On 2015/11/11 // 21:13
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        SDKInitializer.initialize(this);
        super.onCreate();
    }

}
