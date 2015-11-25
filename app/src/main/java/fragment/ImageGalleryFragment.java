package fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.dryogi.R;


public class ImageGalleryFragment extends Fragment {


    LinearLayout imageLayout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View vi = inflater.inflate(R.layout.fragment_image_gallery, container, false);


        imageLayout = (LinearLayout) vi.findViewById(R.id.innerLay);

        setImageLayout();


        return vi;
    }

    private void setImageLayout() {

        for (int i = 0; i < 4; i++) {

            LayoutInflater inflaterImage = (LayoutInflater) getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View imageView = inflaterImage.inflate(R.layout.imageitem, null);
            imageLayout.addView(imageView);

        }

    }

}