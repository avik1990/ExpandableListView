package com.rtstl.expandablelistview.adapter;

import android.support.annotation.NonNull;
import android.view.View;
import android.widget.TextView;

import com.bignerdranch.expandablerecyclerview.ChildViewHolder;
import com.rtstl.expandablelistview.R;
import com.rtstl.expandablelistview.model.DriverSchedule;

class KidViewHolder extends ChildViewHolder{

    private TextView mIngredientTextView;

    public KidViewHolder(@NonNull View itemView) {
        super(itemView);
        mIngredientTextView = (TextView) itemView.findViewById(R.id.tv_childname);
    }

    public void bind(@NonNull DriverSchedule.Alloted_kids ingredient) {
        mIngredientTextView.setText(ingredient.getKid_name());
    }
}

