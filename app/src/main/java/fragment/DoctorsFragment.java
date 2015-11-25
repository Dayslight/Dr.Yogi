package fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dryogi.R;

import java.util.ArrayList;

import activity.AllDoctorsActivity;
import adapter.DoctorListAdapter;
import view.NonScrollListView;


public class DoctorsFragment extends Fragment {

    NonScrollListView doctorlist;
    ArrayList<String> arraydoctorlist = new ArrayList<String>();

    DoctorListAdapter doctorListAdapter;

    TextView alldoctorstxt;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View vi = inflater.inflate(R.layout.fragment_doctors, container, false);

        doctorlist = (NonScrollListView) vi.findViewById(R.id.doctorlist);
        alldoctorstxt = (TextView) vi.findViewById(R.id.alldoctorstxt);


        alldoctorstxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), AllDoctorsActivity.class);
                startActivity(intent);
            }
        });





        arraydoctorlist.add("1");
        arraydoctorlist.add("2");
        arraydoctorlist.add("3");


        doctorListAdapter = new DoctorListAdapter(getActivity(), arraydoctorlist);
        doctorlist.setAdapter(doctorListAdapter);


        return vi;
    }


}
