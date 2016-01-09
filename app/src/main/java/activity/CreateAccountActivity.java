package activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import com.dryogi.R;

import fragment.CreatAccountFragment;

public class CreateAccountActivity extends AppCompatActivity {

    android.support.v4.app.FragmentManager fm;
    Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        // create account fragment

        fm = getSupportFragmentManager();
        fragment = new CreatAccountFragment();
        fm.beginTransaction().add(R.id.createacclayout, fragment).commit();


    }
}
