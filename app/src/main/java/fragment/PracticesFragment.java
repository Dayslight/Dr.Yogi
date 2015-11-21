package fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dryogi.R;

import java.util.ArrayList;

import adapter.PracticesListAdapter;
import view.NonScrollListView;


public class PracticesFragment extends Fragment {

    NonScrollListView practicesList;
    ArrayList<String> arraypracticeslist = new ArrayList<String>();

    PracticesListAdapter practicesListAdapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View vi = inflater.inflate(R.layout.fragment_practices, container, false);


        practicesList = (NonScrollListView) vi.findViewById(R.id.practiceslist);

        arraypracticeslist.add("1");
        arraypracticeslist.add("2");



        practicesListAdapter = new PracticesListAdapter(getActivity(), arraypracticeslist);
        practicesList.setAdapter(practicesListAdapter);


        return vi;
    }


}
