package weibo.demo.carl.co.viewpagerlikeweibodemo;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import weibo.demo.carl.co.viewpagerlikeweibodemo.fregment.FragmentFore;
import weibo.demo.carl.co.viewpagerlikeweibodemo.fregment.FragmentOne;
import weibo.demo.carl.co.viewpagerlikeweibodemo.fregment.FragmentThree;
import weibo.demo.carl.co.viewpagerlikeweibodemo.fregment.FragmentTwo;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private ViewPager mViewPager;
    private TextView mToolbarTitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setSupportActionBar((Toolbar)findViewById(R.id.toolbar));
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        initView();
    }

    private void initView(){
        mToolbarTitle = (TextView)findViewById(R.id.toolbar_title);
        mToolbarTitle.setText(R.string.one_text);
        mViewPager = (ViewPager)findViewById(R.id.viewPager);
        MyFragmentPagerAdapter adapter = new MyFragmentPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new FragmentOne());
        adapter.addFragment(new FragmentTwo());
        adapter.addFragment(new FragmentThree());
        adapter.addFragment(new FragmentFore());
        mViewPager.setAdapter(adapter);
        RadioButton oneRadio = (RadioButton)findViewById(R.id.radio_one);
        RadioButton twoRadio = (RadioButton)findViewById(R.id.radio_two);
        RadioButton threeRadio = (RadioButton)findViewById(R.id.radio_three);
        RadioButton fourRadio = (RadioButton)findViewById(R.id.radio_four);
        ImageButton centerButton = (ImageButton)findViewById(R.id.center_button);
        oneRadio.setOnClickListener(this);
        twoRadio.setOnClickListener(this);
        threeRadio.setOnClickListener(this);
        fourRadio.setOnClickListener(this);
        centerButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.radio_one:
                mViewPager.setCurrentItem(0);
                mToolbarTitle.setText(R.string.one_text);
                break;
            case R.id.radio_two:
                mViewPager.setCurrentItem(1);
                mToolbarTitle.setText(R.string.two_text);
                break;
            case R.id.radio_three:
                mViewPager.setCurrentItem(2);
                mToolbarTitle.setText(R.string.three_text);
                break;
            case R.id.radio_four:
                mViewPager.setCurrentItem(3);
                mToolbarTitle.setText(R.string.fore_text);
                break;
            case R.id.center_button:
                startActivity(new Intent(MainActivity.this,ShareActivity.class));
                break;
            default:
                break;
        }
    }
}
