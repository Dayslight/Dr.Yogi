package activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import com.dryogi.R;

import fragment.AllServicesFragment;

public class AllServicesActivity extends AppCompatActivity {


    Fragment fragment;
    android.support.v4.app.FragmentManager fm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_services);


        fm = getSupportFragmentManager();


        fragment = new AllServicesFragment();
        fm.beginTransaction().add(R.id.allservices, fragment).commit();

    }

}
