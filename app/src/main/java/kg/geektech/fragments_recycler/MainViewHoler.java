package kg.geektech.fragments_recycler;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MainViewHoler extends RecyclerView.ViewHolder {

    TextView textView;
   OnRecyclerClickInterface listener;
    String result;
    public MainViewHoler(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.holder_text_view);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onRecyclerClick(result);

            }
        });
    }
}