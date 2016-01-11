package activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.dryogi.R;

import fragment.DoctorActionBarFragment;
import fragment.ExperienceFrament;
import fragment.FeesFragment;
import fragment.ImageGalleryFragment;
import fragment.LocationFragment;
import fragment.PracticesFragment;
import fragment.ScheduleFragment;
import fragment.ServicesFragment;

public class DoctorsDetailActivity extends AppCompatActivity {

    LinearLayout inflatlayout;
    FragmentManager fm;
    Fragment fragment;
    RelativeLayout booklay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_detail);
        inflatlayout = (LinearLayout) findViewById(R.id.inflatlayout);
        booklay = (RelativeLayout)findViewById(R.id.book);



        booklay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),CreateAccountActivity.class);
                startActivity(intent);
            }
        });


        setuplinearList();


    }

    private void setuplinearList() {
        for (int i = 0; i <= 7; i++) {

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
                mFragment = new DoctorActionBarFragment();
                linearLayout.setId(R.id.layout11);
                break;

            case 1:
                mFragment = new ExperienceFrament();
                linearLayout.setId(R.id.layout22);
                break;
            case 2:
                mFragment = new FeesFragment();
                linearLayout.setId(R.id.layout33);
                break;
            case 3:
                mFragment = new LocationFragment();
                linearLayout.setId(R.id.layout44);
                break;

            case 4:
                mFragment = new ScheduleFragment();
                linearLayout.setId(R.id.layout55);
                break;

            case 5:
                mFragment = new ImageGalleryFragment();
                linearLayout.setId(R.id.layout66);
                break;

//            case 6:
//                mFragment = new DoctorsFragment();
//                linearLayout.setId(R.id.layout77);
//                break;

//            case 7:
//                mFragment = new FeedBackFragment();
//                linearLayout.setId(R.id.layout88);
//                break;
            case 6:
                mFragment = new ServicesFragment();
                linearLayout.setId(R.id.layout99);
                break;

            case 7:
                mFragment = new PracticesFragment();
                linearLayout.setId(R.id.layout100);
                break;


        }
        return mFragment;
    }


}
