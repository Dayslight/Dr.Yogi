package adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.dryogi.R;

import fragment.AppointmentFragment;
import fragment.ProfileFragment;
import fragment.ViewPagerFragment;

public class MyPageAdapter extends FragmentStatePagerAdapter {

    Context mcontext;

    public MyPageAdapter(FragmentManager fm, Context context) {
        super(fm);

        this.mcontext = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;

        if (position == 0) {
            fragment = new ViewPagerFragment();

        } else if (position == 1) {
            fragment = new ProfileFragment();
        } else if (position == 2) {
            fragment = new AppointmentFragment();

        }


        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        String[] listItem = mcontext.getResources().getStringArray(R.array.tabitems);

        return listItem[position];
    }
}