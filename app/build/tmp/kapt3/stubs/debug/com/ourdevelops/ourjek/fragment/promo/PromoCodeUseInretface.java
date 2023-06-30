package com.ourdevelops.ourjek.fragment.promo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H&J(\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H&J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0007H&\u00a8\u0006\r"}, d2 = {"Lcom/ourdevelops/ourjek/fragment/promo/PromoCodeUseInretface;", "", "changeTotal", "", "position", "", "discountTotal", "", "discount", "grandTotal", "onComplimentaryApplied", "total", "onFreeDeliveryApplied", "app_debug"})
public abstract interface PromoCodeUseInretface {
    
    public abstract void changeTotal(int position, double discountTotal, double discount, double grandTotal);
    
    public abstract void onComplimentaryApplied(int position, double discountTotal, double discount, double total);
    
    public abstract void onFreeDeliveryApplied(int position, double total);
}