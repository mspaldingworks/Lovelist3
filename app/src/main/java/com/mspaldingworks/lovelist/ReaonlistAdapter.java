package com.mspaldingworks.lovelist.com.mspaldingworks.lovelist


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


public class ReaonListAdapter extends RecyclerView.Adapter<ReasonslistAdapter.ViewHolder> {


        List<Reason> reasonList;

public ReasonsListAdapter(List<Reason> reasonList) {

        this.reasonList = reasonList;
        }

@NonNull
@Override
public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recyclerview, parent, false);

        return new ViewHolder(itemView);
        }

@Override
public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(position);
        }

@Override
public int getItemCount() {

        return reasonList.size();
        }

public void updateList(List<Reason> list) {
        reasonList = list;
        notifyDataSetChanged();
        }

public class ViewHolder extends RecyclerView.ViewHolder {

    protected TextView reasonTextview;


    public ViewHolder (View itemView) {
        super(itemView);

        reasonTextview = itemView.findViewById(R.id.reason_text_view);
    }

    public void bind (int position) {
        reasonTextview.setText(reasonList.get(position).getReason());

    }

}



}
