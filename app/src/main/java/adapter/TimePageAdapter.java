package adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import fragment.TimeShotFragment;

public class TimePageAdapter extends FragmentStatePagerAdapter {

    Context mcontext;

    public TimePageAdapter(FragmentManager fm, Context context) {
        super(fm);

        this.mcontext = context;
    }

    @Override
    public Fragment getItem(int position) {


        return new TimeShotFragment();

    }

    @Override
    public int getCount() {
        return 7;
    }

    @Override
    public CharSequence getPageTitle(int position) {


        return "";
    }
}