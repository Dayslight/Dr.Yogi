package fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.afollestad.materialdialogs.MaterialDialog;
import com.dryogi.R;


public class FeesFragment extends Fragment {

    ImageView infobtn;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View vi = inflater.inflate(R.layout.fragment_fees, container, false);


        infobtn = (ImageView)vi.findViewById(R.id.infobtn);

        infobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new MaterialDialog.Builder(getActivity())
                        .title("Consultation fees")
                        .content("This fees is indicative and might vary. \n NOTE:Fees is payable at clinic. There are NO charges for booking an appointment.")
                        .positiveText("DISMISS")
                        .negativeText("")
                        .show();
            }
        });


        return vi;
    }


}
