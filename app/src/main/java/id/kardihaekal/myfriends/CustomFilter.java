package id.kardihaekal.myfriends;

import android.widget.Filter;

import id.kardihaekal.myfriends.model.Adapter;
import java.util.ArrayList;

public class CustomFilter extends Filter {

    Adapter adapter;
    ArrayList<Friends> filterList;

    public CustomFilter(ArrayList<Friends> filterList,Adapter adapter)
    {
        this.adapter=adapter;
        this.filterList=filterList;

    }

    //proses pemfilteran
    @Override
    protected FilterResults performFiltering(CharSequence constraint) {
        FilterResults results=new FilterResults();
        //memeriksa validasi konstrain
        if(constraint != null && constraint.length() > 0)
        {
            //mengubah ke atas
            constraint=constraint.toString().toUpperCase();
            //menyimpan data yang di filter
            ArrayList<Friends> filteredFriends=new ArrayList<>();

            for (int i=0;i<filterList.size();i++)
            {
                //memeriksa
                if(filterList.get(i).getNama().toUpperCase().contains(constraint))
                {
                    //menambah data ke data yang di saring
                    filteredFriends.add(filterList.get(i));
                }
            }

            results.count=filteredFriends.size();
            results.values=filteredFriends;

        }else
        {
            results.count=filterList.size();
            results.values=filterList;
        }

        return results;
    }

    @Override
    protected void publishResults(CharSequence constraint, FilterResults results) {

        adapter.friends= (ArrayList<Friends>) results.values;

        //refresh
        adapter.notifyDataSetChanged();

    }
}