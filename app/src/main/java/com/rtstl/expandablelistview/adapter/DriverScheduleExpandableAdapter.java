package com.rtstl.expandablelistview.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bignerdranch.expandablerecyclerview.ExpandableRecyclerAdapter;
import com.rtstl.expandablelistview.R;
import com.rtstl.expandablelistview.model.DriverSchedule;

import java.util.List;

public class DriverScheduleExpandableAdapter extends ExpandableRecyclerAdapter<DriverSchedule.Schedules, DriverSchedule.Alloted_kids, RouteViewHolder, KidViewHolder> {

    private LayoutInflater mInflater;
    private List<DriverSchedule.Schedules> mRecipeList;
    private static final int PARENT_NORMAL = 1;
    private static final int CHILD_NORMAL = 3;

    public DriverScheduleExpandableAdapter(Context mContext, @NonNull List<DriverSchedule.Schedules> parentList) {
        super(parentList);
        mRecipeList = parentList;
        mInflater = LayoutInflater.from(mContext);
    }

    @NonNull
    @Override
    public RouteViewHolder onCreateParentViewHolder(@NonNull ViewGroup parentViewGroup, int viewType) {
        View recipeView;
        switch (viewType) {
            default:
            case PARENT_NORMAL:
                recipeView = mInflater.inflate(R.layout.group_item, parentViewGroup, false);
                break;
        }
        return new RouteViewHolder(recipeView);
    }

    @NonNull
    @Override
    public KidViewHolder onCreateChildViewHolder(@NonNull ViewGroup childViewGroup, int viewType) {
        View ingredientView;
        switch (viewType) {
            default:
            case CHILD_NORMAL:
                ingredientView = mInflater.inflate(R.layout.child_item, childViewGroup, false);
                break;
        }
        return new KidViewHolder(ingredientView);
    }

    @Override
    public void onBindParentViewHolder(@NonNull RouteViewHolder parentViewHolder, int parentPosition, @NonNull DriverSchedule.Schedules parent) {
        parentViewHolder.bind(parent);
    }

    @Override
    public void onBindChildViewHolder(@NonNull KidViewHolder childViewHolder, int parentPosition, int childPosition, @NonNull DriverSchedule.Alloted_kids child) {
        childViewHolder.bind(child);
    }

    @Override
    public int getParentViewType(int parentPosition) {
        return PARENT_NORMAL;
    }

    @Override
    public int getChildViewType(int parentPosition, int childPosition) {
        return CHILD_NORMAL;
    }

    @Override
    public boolean isParentViewType(int viewType) {
        return viewType == PARENT_NORMAL;
    }
}
