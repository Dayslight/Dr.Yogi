package activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import com.dryogi.R;

import fragment.AllDoctorsFragment;

public class AllDoctorsActivity extends AppCompatActivity {

    Fragment fragment;
    android.support.v4.app.FragmentManager fm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_doctors);

        fm = getSupportFragmentManager();


        fragment = new AllDoctorsFragment();
        fm.beginTransaction().add(R.id.alldoctors, fragment).commit();


    }

}
