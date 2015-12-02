package fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.dryogi.R;

import java.util.ArrayList;

import activity.AppointmentDetailsActivity;
import adapter.AppointmentListAdapter;


public class AppointmentFragment extends Fragment {


    ListView appointmentlist;

    ArrayList<String> arrayallappointmentlist = new ArrayList<String>();

    AppointmentListAdapter appointmentListAdapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View vi = inflater.inflate(R.layout.fragment_appointment, container, false);

        appointmentlist = (ListView) vi.findViewById(R.id.appointmentlist);


        arrayallappointmentlist.add("1");
        arrayallappointmentlist.add("2");
        arrayallappointmentlist.add("3");
        arrayallappointmentlist.add("4");
        arrayallappointmentlist.add("5");


        appointmentListAdapter = new AppointmentListAdapter(getActivity(), arrayallappointmentlist);
        appointmentlist.setAdapter(appointmentListAdapter);


        appointmentlist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(getActivity(), AppointmentDetailsActivity.class);
                startActivity(intent);
            }
        });


        return vi;
    }


}
