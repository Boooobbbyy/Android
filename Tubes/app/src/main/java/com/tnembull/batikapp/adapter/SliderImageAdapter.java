package com.tnembull.batikapp.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.tnembull.batikapp.R;
import com.tnembull.batikapp.model.ModelSlide;
import com.bumptech.glide.Glide;
import com.smarteist.autoimageslider.SliderViewAdapter;

import java.util.List;


/*
 * Ini Untuk Membuat slider image adapter recycler view
 * */

public class SliderImageAdapter extends SliderViewAdapter<SliderImageAdapter.SliderAdapterVH> {

    private Context mContext;
    private List<ModelSlide> mSliderItems;
    private int mCount;

    public SliderImageAdapter(Context mContext, List<ModelSlide> mSliderItems) {
        this.mContext = mContext;
        this.mSliderItems = mSliderItems;
    }

    public void setCount(int count) {
        this.mCount = count;
    }

    @Override
    public SliderAdapterVH onCreateViewHolder(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_slider, null);
        return new SliderAdapterVH(view);
    }

    @Override
    public void onBindViewHolder(SliderAdapterVH viewHolder, final int position) {

        ModelSlide sliderItem = mSliderItems.get(position);

        viewHolder.tvDescSlider.setText(sliderItem.getNamaBatik());
        viewHolder.tvDescSlider.setTextSize(12);
        viewHolder.tvDescSlider.setTextColor(Color.WHITE);
        Glide.with(viewHolder.itemView)
                .load(sliderItem.getLinkBatik())
                .fitCenter()
                .into(viewHolder.imgAutoSlider);

        /*viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });*/
    }

    public int getCount() {
        return mCount;
    }

    class SliderAdapterVH extends SliderViewAdapter.ViewHolder {

        View itemView;
        ImageView imgAutoSlider;
        TextView tvDescSlider;

        public SliderAdapterVH(View itemView) {
            super(itemView);
            imgAutoSlider = itemView.findViewById(R.id.imgAutoSlider);
            tvDescSlider = itemView.findViewById(R.id.tvDescSlider);
            this.itemView = itemView;
        }
    }
}
