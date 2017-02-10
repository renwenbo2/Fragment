package renwenbo.bwie.com.fragment.activity.activity;

import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import renwenbo.bwie.com.fragment.R;
import renwenbo.bwie.com.fragment.activity.fragment.Fragment1;
import renwenbo.bwie.com.fragment.activity.fragment.Fragment2;
import renwenbo.bwie.com.fragment.activity.fragment.Fragment3;
import renwenbo.bwie.com.fragment.activity.fragment.Fragment4;

public class MainActivity extends FragmentActivity implements View.OnClickListener {

    private FrameLayout fl;
    private TextView show;
    private TextView re;
    private TextView news;
    private TextView my;
    private Fragment1 f1;
    private Fragment2 f2;
    private Fragment3 f3;
    private Fragment4 f4;
    private FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fl = (FrameLayout) findViewById(R.id.fl);
        show = (TextView) findViewById(R.id.shou);
        re = (TextView) findViewById(R.id.re);
        news = (TextView) findViewById(R.id.news);
        my = (TextView) findViewById(R.id.my);
        f1 = new Fragment1();
        f2 = new Fragment2();
        f3 = new Fragment3();
        f4 = new Fragment4();
        manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.fl, f1);
        transaction.add(R.id.fl, f2);
        transaction.add(R.id.fl, f3);
        transaction.add(R.id.fl, f4);
        transaction.show(f1).hide(f2).hide(f3).hide(f4).commit();
        show.setOnClickListener(this);
        re.setOnClickListener(this);
        news.setOnClickListener(this);
        my.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.shou :
                FragmentTransaction transaction1 = manager.beginTransaction();
                transaction1.show(f1).hide(f2).hide(f3).hide(f4).commit();
                 show.setTextColor(Color.RED);
                 re.setTextColor(Color.BLACK);
                news.setTextColor(Color.BLACK);
                my.setTextColor(Color.BLACK);
                break;
            case R.id.re :
                FragmentTransaction transaction2 = manager.beginTransaction();
                transaction2.show(f2).hide(f1).hide(f3).hide(f4).commit();
                show.setTextColor(Color.BLACK);
                re.setTextColor(Color.RED);
                news.setTextColor(Color.BLACK);
                my.setTextColor(Color.BLACK);
                break;
            case R.id.news:
                FragmentTransaction transaction3 = manager.beginTransaction();
                transaction3.show(f3).hide(f2).hide(f1).hide(f4).commit();
                show.setTextColor(Color.BLACK);
                re.setTextColor(Color.BLACK);
                news.setTextColor(Color.RED);
                my.setTextColor(Color.BLACK);
                break;
            case R.id.my:
                FragmentTransaction transaction4 = manager.beginTransaction();
                transaction4.show(f4).hide(f2).hide(f3).hide(f1).commit();
                show.setTextColor(Color.BLACK);
                re.setTextColor(Color.BLACK);
                news.setTextColor(Color.BLACK);
                my.setTextColor(Color.RED);

                break;


        }

    }
}
