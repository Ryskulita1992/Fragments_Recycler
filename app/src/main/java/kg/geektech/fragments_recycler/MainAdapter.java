package kg.geektech.fragments_recycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter <MainViewHoler> {
OnRecyclerClickInterface listener;
ArrayList <String> data=new ArrayList<>();





    @NonNull
    @Override
    public MainViewHoler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.viewholder_main,parent, false);
        MainViewHoler mainViewHoler=new MainViewHoler(view);
        mainViewHoler.listener=listener;
        return mainViewHoler;
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHoler holder, int position) {
        holder.textView.setText(data.get(position));
        holder.result=holder.textView.getText().toString();

    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
