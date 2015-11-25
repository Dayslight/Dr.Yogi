package fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import activity.AllServicesActivity;
import com.dryogi.R;

import java.util.ArrayList;

import adapter.ServicesListAdapter;
import view.NonScrollListView;


public class ServicesFragment extends Fragment {

    NonScrollListView servicesList;
    ArrayList<String> arrayserviceslist = new ArrayList<String>();

    ServicesListAdapter servicesListAdapter;

    TextView allservicestxt;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View vi = inflater.inflate(R.layout.fragment_services, container, false);


        servicesList = (NonScrollListView) vi.findViewById(R.id.serviceslist);


        allservicestxt = (TextView) vi.findViewById(R.id.allservicestxt);


        allservicestxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), AllServicesActivity.class);
                startActivity(intent);
            }
        });


        arrayserviceslist.add("1");
        arrayserviceslist.add("2");
        arrayserviceslist.add("3");


        servicesListAdapter = new ServicesListAdapter(getActivity(), arrayserviceslist);
        servicesList.setAdapter(servicesListAdapter);


        return vi;
    }


}
