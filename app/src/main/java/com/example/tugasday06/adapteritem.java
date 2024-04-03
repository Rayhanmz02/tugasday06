package com.example.tugasday06;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class adapteritem extends RecyclerView.Adapter<adapteritem.ViewHolder> {

    private ArrayList<itemmodel> itemmodels;
    private OnItemClickListener mlistener;

    public adapteritem(ArrayList<itemmodel> itemmodels) {
        this.itemmodels = itemmodels;
    }
    public interface OnItemClickListener{
        void onItemClick(int position);
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        mlistener = listener;
    }

    @NonNull
    @Override
    public adapteritem.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.listitem, parent,false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.namaitem.setText(itemmodels.get(position).getNamaitem());
        holder.merkitem.setText(itemmodels.get(position).getMerkitem());
        holder.warna.setText(itemmodels.get(position).getWarna());
        holder.logoitem.setImageResource(itemmodels.get(position).getLogoitem());
    }

    @Override
    public int getItemCount() {
        return itemmodels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView namaitem;
        TextView merkitem;
        TextView warna;
        ImageView logoitem;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            namaitem = itemView.findViewById(R.id.tvitem);
            merkitem = itemView.findViewById(R.id.tvitem1);
            warna = itemView.findViewById(R.id.tvitem2);
            logoitem = itemView.findViewById(R.id.ivitem);

        itemView.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                if (mlistener != null ){
                    int position = getAdapterPosition();
                    if (position != RecyclerView.NO_POSITION){
                        mlistener.onItemClick(position);
                    }
                }
            }
        });


        }
    }
}
