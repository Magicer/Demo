package xyz.magicer.design;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by lenovo on 2017/7/19.
 */

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.recycler)
    RecyclerView recycler;
    @BindView(R.id.navigation)
    NavigationView navigation;
    @BindView(R.id.drawer)
    DrawerLayout drawer;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        _init();
        listener();
        loadData();
    }

    private void listener() {
        navigation.setNavigationItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.nav_music:
                    break;
                case R.id.nav_movie:
                    break;
                case R.id.nav_setting:
                    break;
            }
            drawer.closeDrawer(GravityCompat.START);
            Intent intent = new Intent(MainActivity.this, DetailActivity.class);
            startActivity(intent);
            return false;
        });

    }


    private void _init() {
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.open, R.string.close);
        toggle.syncState();
        drawer.addDrawerListener(toggle);
    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    private void loadData() {
        ArrayList<String> datas = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            datas.add("");
        }
        Adapter adapter = new Adapter(datas);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recycler.setLayoutManager(layoutManager);
        recycler.setAdapter(adapter);
    }
}
