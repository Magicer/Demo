package xyz.magicer.daggerdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import javax.inject.Inject;

import xyz.magicer.daggerdemo.inject.component.DaggerMainComponent;
import xyz.magicer.daggerdemo.inject.module.MainModule;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    @Inject
    Bean bean;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerMainComponent.builder()
                .mainModule(new MainModule("iiiiid","tttttitle"))
                .build()
                .inject(this);
        Log.i(TAG, "onCreate: "+bean.toString());
    }
}
