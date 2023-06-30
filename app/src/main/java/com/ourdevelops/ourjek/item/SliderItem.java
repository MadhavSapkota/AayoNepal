package com.ourdevelops.ourjek.item;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.bumptech.glide.Glide;
import com.ourdevelops.ourjek.R;
import com.ourdevelops.ourjek.activity.NewDetailMerchantActivity;
import com.ourdevelops.ourjek.constants.Constants;
import com.ourdevelops.ourjek.models.PromoModel;
import com.ourdevelops.ourjek.utils.PicassoTrustAll;

import java.util.List;

import static com.facebook.FacebookSdk.getApplicationContext;


public class SliderItem extends PagerAdapter {

    private List<PromoModel> models;
    private Context context;

    public SliderItem(List<PromoModel> models, Context context) {
        this.models = models;
        this.context = context;
    }

    @Override
    public int getCount() {
        return models.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, final int position) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.item_slider, container, false);

        ImageView imageSlider;
        RelativeLayout slider;

        imageSlider = view.findViewById(R.id.image);
        slider = view.findViewById(R.id.slider);

        final PromoModel propertyModels = models.get(position);
        if(propertyModels.getFoto().contains(".gif")){
            Glide.with(context).load(Constants.IMAGESSLIDER + propertyModels.getFoto()).placeholder(R.drawable.image_placeholder).into(imageSlider);

        }else {
            PicassoTrustAll.getInstance(context)
                    .load(Constants.IMAGESSLIDER + propertyModels.getFoto())
                    .placeholder(R.drawable.image_placeholder)
                    .into(imageSlider);
        }



            slider.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    if (propertyModels.getId_fitur() != null) {
                        if (propertyModels.getId_fitur().equals("21")) {
                            Intent i = new Intent(getApplicationContext(), NewDetailMerchantActivity.class);
                            i.putExtra("lat", propertyModels.getLatitude_merchant());
                            i.putExtra("lon", propertyModels.getLongitude_merchant());
                            i.putExtra("id", propertyModels.getId_merchant());
                            context.startActivity(i);
                        }
                    }

                }
            });
        container.addView(view, 0);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}

