package adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.andexert.library.RippleView;
import com.androidquery.AQuery;
import com.dryogi.R;

import java.util.ArrayList;

import activity.CatagoryDetailListActivity;

public class CustomGrid extends BaseAdapter {
    boolean memCache = false;
    boolean fileCache = true;
    AQuery aq;
    private Context mContext;
    ArrayList<String> marraygridItem;


    public CustomGrid(FragmentActivity activity, ArrayList<String> arraygridItem) {
        this.marraygridItem = arraygridItem;
        this.mContext = activity;
        aq = new AQuery(activity);


    }

    @Override
    public int getCount() {


        if (marraygridItem.size() <= 0)
            return 1;
        return marraygridItem.size();
    }

    @Override
    public Object getItem(int position) {

        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View vi = convertView;
        final ViewHolder holder;


        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {

            vi = inflater.inflate(R.layout.first_page_grid_content, null);
            holder = new ViewHolder();
            holder.textView = (TextView) vi
                    .findViewById(R.id.txt_category_name);
            holder.imageView = (ImageView) vi
                    .findViewById(R.id.img_category_image);
            holder.rippleView = (RippleView) vi.findViewById(R.id.more);


            holder.backg = (RelativeLayout) vi.findViewById(R.id.frameLayout);

            vi.setTag(holder);

        } else {
            holder = (ViewHolder) vi.getTag();

        }


        holder.textView.setText(marraygridItem.get(position));


//        aq.id(holder.imageView).image(catagories.get(position).icon, memCache, fileCache, 0, R.drawable.fallback_icon);


        holder.rippleView.setOnRippleCompleteListener(new RippleView.OnRippleCompleteListener() {


            @Override
            public void onComplete(RippleView rippleView) {
                Log.d("Sample", "Ripple completed");


                Intent intent = new Intent(mContext, CatagoryDetailListActivity.class);
                mContext.startActivity(intent);


            }


        });


        return vi;
    }

    public static class ViewHolder {

        public TextView textView;
        public ImageView imageView;
        public RelativeLayout backg;
        public RippleView rippleView;


    }
}