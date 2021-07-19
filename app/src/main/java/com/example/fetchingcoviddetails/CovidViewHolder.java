package com.example.fetchingcoviddetails;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class CovidViewHolder extends RecyclerView.ViewHolder {

    private TextView mDate;
    private TextView mPositive;
    private TextView mNegative;
    private TextView mHospitalizedCurrently;
    private TextView mDeath;
    private TextView mDateCheckedIn;
    private TextView mOnVentilator;
    private LinearLayout mLinearLayout;
    private ItemOnClick itemOnClick;

    public CovidViewHolder(@NonNull View itemView) {
        super(itemView);
        initView(itemView);
    }

    private void initView(View itemView){
        mDate=itemView.findViewById(R.id.tvDate);
        mPositive = itemView.findViewById(R.id.tvpPositive);
        mNegative = itemView.findViewById(R.id.tvNegative);
        mHospitalizedCurrently = itemView.findViewById(R.id.tvHospitalized);
        mDeath = itemView.findViewById(R.id.tvDeath);
        mDateCheckedIn = itemView.findViewById(R.id.tvDateCheckedIn);
        mOnVentilator = itemView.findViewById(R.id.tvOnVentilator);
    }

    private void setData(CovidModel covidModel){


    }
}
