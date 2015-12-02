package fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dryogi.R;

import java.util.ArrayList;

import adapter.FeedbackListAdapter;
import view.NonScrollListView;


public class MostrecentFeedbackFragment extends Fragment {

    NonScrollListView feedbackList;
    ArrayList<String> arrayfeedbacklist = new ArrayList<String>();

    FeedbackListAdapter feedbackListAdapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View vi = inflater.inflate(R.layout.fragment_mostrecent, container, false);

        feedbackList = (NonScrollListView) vi.findViewById(R.id.feedbacklist);


        arrayfeedbacklist.add("1");
        arrayfeedbacklist.add("2");
        arrayfeedbacklist.add("3");


        feedbackListAdapter = new FeedbackListAdapter(getActivity(), arrayfeedbacklist);
        feedbackList.setAdapter(feedbackListAdapter);


        return vi;
    }

}
