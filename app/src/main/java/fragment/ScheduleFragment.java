package fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dryogi.R;

import activity.AllTimingActivity;


public class ScheduleFragment extends Fragment {

    TextView alltimestxt;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View vi = inflater.inflate(R.layout.fragment_schedule, container, false);


        alltimestxt = (TextView) vi.findViewById(R.id.alltimestxt);


        alltimestxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), AllTimingActivity.class);
                startActivity(intent);
            }
        });


        return vi;


    }


}
