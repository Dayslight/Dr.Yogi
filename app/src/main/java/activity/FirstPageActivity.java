package activity;

import android.annotation.TargetApi;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.astuetz.PagerSlidingTabStrip;
import com.dryogi.R;

import adapter.MyPageAdapter;
import view.MyViewPager;

public class FirstPageActivity extends AppCompatActivity {

    private MyViewPager mViewPager;
    PagerSlidingTabStrip tabs;
    private LinearLayout mTabsLinearLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);


        tabs = (PagerSlidingTabStrip) findViewById(R.id.tabs);
        mViewPager = (MyViewPager) findViewById(R.id.materialViewPager);


        mViewPager.setAdapter(new MyPageAdapter(getSupportFragmentManager(),getApplicationContext()));
        tabs.setViewPager(mViewPager);
        tabs.setIndicatorHeight(2);
        tabs.setIndicatorColor(getApplicationContext().getResources().getColor(R.color.white));

        setUpTabStrip();


    }


    @TargetApi(Build.VERSION_CODES.ICE_CREAM_SANDWICH)
    public void setUpTabStrip() {
        //your other customizations related to tab strip...blahblah
        // Set first tab selected
        mTabsLinearLayout = ((LinearLayout) tabs.getChildAt(0));
        if (Build.VERSION.SDK_INT >= 16) {
            mTabsLinearLayout.setBackground(new ColorDrawable(getApplicationContext().getResources().getColor(R.color.pagestripbg)));
        } else {
            mTabsLinearLayout.setBackgroundDrawable(new ColorDrawable(getApplicationContext().getResources().getColor(R.color.pagestripbg)));
        }

        for (int i = 0; i < mTabsLinearLayout.getChildCount(); i++) {
            TextView tv = (TextView) mTabsLinearLayout.getChildAt(i);
            tv.setAllCaps(false);
            tv.setTextSize(16);
            if (i == 0) {
//                tv.setTextColor(Color.parseColor("#000000"));
            } else {
//                tv.setTextColor(getApplicationContext().getResources().getColor(R.color.tabstriptxt));
            }
        }
    }

}
