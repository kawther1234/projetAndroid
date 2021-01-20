package de.demo.android_project.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.fragment.app.FragmentActivity;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import de.demo.android_project.R;
import de.demo.android_project.model.Interventions;


public class interventionAdapter extends RecyclerView.Adapter {
    FragmentActivity ctx;
    ArrayList<Interventions> interventionsList;

    public interventionAdapter(ArrayList<Interventions> contractsList, FragmentActivity activity) {
        this.interventionsList = interventionsList;
        this.ctx = activity;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int position) {
        RecyclerView.ViewHolder viewHolder = null;
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_intervention, viewGroup, false);
        viewHolder = new InterventionsHolder(v);

        return  new InterventionsHolder(v);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {

        ((InterventionsHolder) holder).adr_inter.setText(String.valueOf(interventionsList.get(position).getId()));
        ((InterventionsHolder) holder).societe_inter.setText(String.valueOf(interventionsList.get(position).getCommentaires()));
        ((InterventionsHolder) holder).time_inter.setText(String.valueOf(interventionsList.get(position).getDatedebut().toString()));
        ((InterventionsHolder) holder).title_inter.setText(String.valueOf(interventionsList.get(position).getDatefin().toString()));
/*
        ((InterventionsHolder) holder).checkBox.setChecked(interventionsList.get(position).getId() == 1);
*/
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Bundle args =new Bundle();
                /*
                args.putInt("clientId",interventionsList.get(position).getId());

                Navigation.findNavController(ctx, R.id.nav_host_fragment)
                        .navigate(R.id.detailsIntervention,args);*/
            }
        });

    }


    @Override
    public int getItemCount() {
        return interventionsList.size();
    }

    public static class InterventionsHolder extends RecyclerView.ViewHolder {
        TextView title_inter;
        TextView societe_inter;
        TextView adr_inter;
        TextView time_inter;
        CheckBox checkBox;

     InterventionsHolder(View itemView) {
            super(itemView);
            title_inter = (TextView) itemView.findViewById(R.id.title_inter);
            societe_inter = (TextView) itemView.findViewById(R.id.societe_inter);
            adr_inter = (TextView) itemView.findViewById(R.id.adr_inter);
            time_inter = (TextView) itemView.findViewById(R.id.time_inter);
            checkBox = (CheckBox) itemView.findViewById(R.id.checkBox);
        }
    }
}