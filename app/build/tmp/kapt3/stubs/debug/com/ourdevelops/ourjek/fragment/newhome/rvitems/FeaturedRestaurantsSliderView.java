package com.ourdevelops.ourjek.fragment.newhome.rvitems;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0010\u001a\u00020\u0011J\u001e\u0010\u0012\u001a\u00020\u00112\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u0013J\b\u0010\u0014\u001a\u00020\u0011H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/ourdevelops/ourjek/fragment/newhome/rvitems/FeaturedRestaurantsSliderView;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "adapter", "Lcom/ourdevelops/ourjek/utils/ImageSliderAdapter;", "binding", "Lcom/ourdevelops/ourjek/databinding/RowFeaturedRestaurantsSliderBinding;", "countDowntimer", "Landroid/os/CountDownTimer;", "currentPage", "", "mlist", "Ljava/util/ArrayList;", "Lcom/ourdevelops/ourjek/models/PromoModel;", "initiateCountDownTimer", "", "setupViews", "Lkotlin/collections/ArrayList;", "viewPagerListener", "app_debug"})
public final class FeaturedRestaurantsSliderView extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    private final com.ourdevelops.ourjek.databinding.RowFeaturedRestaurantsSliderBinding binding = null;
    private com.ourdevelops.ourjek.utils.ImageSliderAdapter adapter;
    private android.os.CountDownTimer countDowntimer;
    private int currentPage = 0;
    private java.util.ArrayList<com.ourdevelops.ourjek.models.PromoModel> mlist;
    
    public FeaturedRestaurantsSliderView(@org.jetbrains.annotations.NotNull()
    android.view.View itemView) {
        super(null);
    }
    
    public final void setupViews(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.ourdevelops.ourjek.models.PromoModel> mlist) {
    }
    
    public final void initiateCountDownTimer() {
    }
    
    private final void viewPagerListener() {
    }
}