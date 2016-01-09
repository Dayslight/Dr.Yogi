package fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dryogi.R;

import adapter.TimePageAdapter;
import view.MyViewPager;

/**
 * Created by bijaybogati on 12/21/15.
 */
public class CreatAccountFragment extends Fragment {

    private MyViewPager mViewPager;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View vi = inflater.inflate(R.layout.fragment_create_account, container, false);

        mViewPager = (MyViewPager) vi.findViewById(R.id.materialViewPager);
        mViewPager.setAdapter(new TimePageAdapter(getFragmentManager(), getActivity()));


        return vi;
    }
}
