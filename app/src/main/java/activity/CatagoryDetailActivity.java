package activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;

import com.dryogi.R;

import fragment.DoctorsFragment;
import fragment.FeedBackFragment;
import fragment.ImageScrollFragment;
import fragment.LocationFragment;
import fragment.PracticesFragment;
import fragment.ScheduleFragment;
import fragment.ServicesFragment;

public class CatagoryDetailActivity extends AppCompatActivity {

    LinearLayout inflatlayout;
    FragmentManager fm;
    Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catagory_detail);
        inflatlayout = (LinearLayout) findViewById(R.id.inflatlayout);

        setuplinearList();


    }

    private void setuplinearList() {
        for (int i = 0; i <= 6; i++) {
            LinearLayout parent = new LinearLayout(getApplicationContext());
            parent.setLayoutParams(new
                    LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT));
            parent.setOrientation(LinearLayout.HORIZONTAL);
            fragment = getFragment(i, parent);
            fm = getSupportFragmentManager();
            fm.beginTransaction().add(parent.getId(), fragment).commit();
            inflatlayout.addView(parent);
        }

    }

    private Fragment getFragment(int i, LinearLayout linearLayout) {
        Fragment mFragment = null;
        switch (i) {
            case 0:
                mFragment = new ImageScrollFragment();
                linearLayout.setId(R.id.layout1);
                break;
            case 1:
                mFragment = new ScheduleFragment();
                linearLayout.setId(R.id.layout2);
                break;

            case 2:
                mFragment = new LocationFragment();
                linearLayout.setId(R.id.layout3);
                break;

            case 3:
                mFragment = new DoctorsFragment();
                linearLayout.setId(R.id.layout4);
                break;

            case 4:
                mFragment = new FeedBackFragment();
                linearLayout.setId(R.id.layout5);
                break;
            case 5:
                mFragment = new ServicesFragment();
                linearLayout.setId(R.id.layout6);
                break;

            case 6:
                mFragment = new PracticesFragment();
                linearLayout.setId(R.id.layout7);
                break;

        }
        return mFragment;
    }


}
