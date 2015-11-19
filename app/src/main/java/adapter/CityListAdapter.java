package adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;

import com.dryogi.R;

import java.util.ArrayList;

public class CityListAdapter extends BaseAdapter implements Filterable {

    private static LayoutInflater inflater = null;
    ArrayList<String> finalcity;
    ArrayList<String> filteredData = null;
    private Context activity_context;
    private ItemFilter mFilter = new ItemFilter();


    public CityListAdapter(Context applicationContext,
                           ArrayList<String> cityname) {
        // TODO Auto-generated constructor stub

        activity_context = applicationContext;
        finalcity = cityname;
        this.filteredData = cityname;
        inflater = (LayoutInflater) activity_context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);


    }

    public int getCount() {

        return filteredData.size();
    }

    public Object getItem(int position) {
        return filteredData.get(position);
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        View vi = convertView;
        ViewHolder holder;

        if (convertView == null) {

            vi = inflater.inflate(R.layout.searchviewcity, null);

            holder = new ViewHolder();
            holder.countrytxt = (TextView) vi
                    .findViewById(R.id.txt_cityname);


            vi.setTag(holder);
        } else {
            holder = (ViewHolder) vi.getTag();


        }


        holder.countrytxt.setText(filteredData.get(position).replace("##", ""));


        return vi;
    }

    @Override
    public Filter getFilter() {
        return mFilter;
    }

    public static class ViewHolder {

        public TextView countrytxt;

    }

    private class ItemFilter extends Filter {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {

            String filterString = constraint.toString().toLowerCase();

            FilterResults results = new FilterResults();

            ArrayList<String> resultlist = new ArrayList<String>();

            for (String data : finalcity) {
                if (data.toLowerCase().contains(filterString)) {
                    resultlist.add(data);
                }
            }

            results.values = resultlist;
            results.count = resultlist.size();

            System.out.println("Check result length  " + results.count);
            return results;
        }

        @SuppressWarnings("unchecked")
        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            filteredData = (ArrayList<String>) results.values;
            notifyDataSetChanged();
        }

    }


}