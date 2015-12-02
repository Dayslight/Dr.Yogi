package adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.dryogi.R;

import fragment.MosthelpfulFeedbackFragment;
import fragment.MostrecentFeedbackFragment;

public class AllFeedbackAdapter extends FragmentStatePagerAdapter {

    Context mcontext;

    public AllFeedbackAdapter(FragmentManager fm, Context context) {
        super(fm);

        this.mcontext = context;
    }

    @Override
    public Fragment getItem(int position) {

        Fragment fragment = null;

        if (position == 0) {
            fragment = new MosthelpfulFeedbackFragment();

        }

        if (position == 1) {
            fragment = new MostrecentFeedbackFragment();

        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        String[] listItem = mcontext.getResources().getStringArray(R.array.allfeedbacktitle);

        return listItem[position];
    }
}