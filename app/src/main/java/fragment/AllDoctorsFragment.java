package fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dryogi.R;

import java.util.ArrayList;

import adapter.DoctorListAdapter;
import view.NonScrollListView;


public class AllDoctorsFragment extends Fragment {

    NonScrollListView doctorlist;
    ArrayList<String> arraydoctorlist = new ArrayList<String>();

    DoctorListAdapter doctorListAdapter;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View vi = inflater.inflate(R.layout.fragment_alldoctors, container, false);

        doctorlist = (NonScrollListView) vi.findViewById(R.id.doctorlist);


        arraydoctorlist.add("1");
        arraydoctorlist.add("2");
        arraydoctorlist.add("3");


        doctorListAdapter = new DoctorListAdapter(getActivity(), arraydoctorlist);
        doctorlist.setAdapter(doctorListAdapter);


        return vi;
    }


}
