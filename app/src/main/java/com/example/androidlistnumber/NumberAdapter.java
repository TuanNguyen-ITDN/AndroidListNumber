package com.example.androidlistnumber;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NumberAdapter extends RecyclerView.Adapter<NumberAdapter.NumberViewHolder> {

    int[] numbers;

    @NonNull
    @Override
    public NumberViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_number, parent, false);
        return new NumberViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NumberAdapter.NumberViewHolder holder, int position) {
        holder.tvNumber.setText("Number: " + numbers[position]);
    }

    @Override
    public int getItemCount() {
        return numbers.length;
    }

    class NumberViewHolder extends RecyclerView.ViewHolder {

        TextView tvNumber;

        public NumberViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNumber = itemView.findViewById(R.id.tvNumber);
        }
    }
}
