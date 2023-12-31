// Generated by view binder compiler. Do not edit!
package com.ourdevelops.ourjek.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.ourdevelops.ourjek.R;
import com.ourdevelops.ourjek.customviews.PromoView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityCheckoutBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final RadioButton asap;

  @NonNull
  public final RelativeLayout btnApplyPromoCode;

  @NonNull
  public final TextView btnPlaceOrder;

  @NonNull
  public final CardView cardLocation;

  @NonNull
  public final CardView cardTime;

  @NonNull
  public final TextView cost;

  @NonNull
  public final RadioGroup deliveryTimeGroup;

  @NonNull
  public final ImageView imgBack;

  @NonNull
  public final LinearLayout layoutAddress;

  @NonNull
  public final LinearLayout llDeliverycost;

  @NonNull
  public final PromoView llPromo;

  @NonNull
  public final LinearLayout llpayment;

  @NonNull
  public final RecyclerView rvPaymentMethods;

  @NonNull
  public final RadioButton scheduled;

  @NonNull
  public final RelativeLayout toolbar;

  @NonNull
  public final TextView tvAddress;

  @NonNull
  public final TextView tvChooseTime;

  @NonNull
  public final TextView tvContactNumber;

  @NonNull
  public final TextView tvDiscountPrice;

  @NonNull
  public final TextView tvLabel;

  @NonNull
  public final TextView tvPromo;

  @NonNull
  public final TextView tvTItle;

  @NonNull
  public final TextView tvTotalPrice;

  private ActivityCheckoutBinding(@NonNull RelativeLayout rootView, @NonNull RadioButton asap,
      @NonNull RelativeLayout btnApplyPromoCode, @NonNull TextView btnPlaceOrder,
      @NonNull CardView cardLocation, @NonNull CardView cardTime, @NonNull TextView cost,
      @NonNull RadioGroup deliveryTimeGroup, @NonNull ImageView imgBack,
      @NonNull LinearLayout layoutAddress, @NonNull LinearLayout llDeliverycost,
      @NonNull PromoView llPromo, @NonNull LinearLayout llpayment,
      @NonNull RecyclerView rvPaymentMethods, @NonNull RadioButton scheduled,
      @NonNull RelativeLayout toolbar, @NonNull TextView tvAddress, @NonNull TextView tvChooseTime,
      @NonNull TextView tvContactNumber, @NonNull TextView tvDiscountPrice,
      @NonNull TextView tvLabel, @NonNull TextView tvPromo, @NonNull TextView tvTItle,
      @NonNull TextView tvTotalPrice) {
    this.rootView = rootView;
    this.asap = asap;
    this.btnApplyPromoCode = btnApplyPromoCode;
    this.btnPlaceOrder = btnPlaceOrder;
    this.cardLocation = cardLocation;
    this.cardTime = cardTime;
    this.cost = cost;
    this.deliveryTimeGroup = deliveryTimeGroup;
    this.imgBack = imgBack;
    this.layoutAddress = layoutAddress;
    this.llDeliverycost = llDeliverycost;
    this.llPromo = llPromo;
    this.llpayment = llpayment;
    this.rvPaymentMethods = rvPaymentMethods;
    this.scheduled = scheduled;
    this.toolbar = toolbar;
    this.tvAddress = tvAddress;
    this.tvChooseTime = tvChooseTime;
    this.tvContactNumber = tvContactNumber;
    this.tvDiscountPrice = tvDiscountPrice;
    this.tvLabel = tvLabel;
    this.tvPromo = tvPromo;
    this.tvTItle = tvTItle;
    this.tvTotalPrice = tvTotalPrice;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityCheckoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityCheckoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_checkout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityCheckoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.asap;
      RadioButton asap = rootView.findViewById(id);
      if (asap == null) {
        break missingId;
      }

      id = R.id.btnApplyPromoCode;
      RelativeLayout btnApplyPromoCode = rootView.findViewById(id);
      if (btnApplyPromoCode == null) {
        break missingId;
      }

      id = R.id.btnPlaceOrder;
      TextView btnPlaceOrder = rootView.findViewById(id);
      if (btnPlaceOrder == null) {
        break missingId;
      }

      id = R.id.cardLocation;
      CardView cardLocation = rootView.findViewById(id);
      if (cardLocation == null) {
        break missingId;
      }

      id = R.id.cardTime;
      CardView cardTime = rootView.findViewById(id);
      if (cardTime == null) {
        break missingId;
      }

      id = R.id.cost;
      TextView cost = rootView.findViewById(id);
      if (cost == null) {
        break missingId;
      }

      id = R.id.deliveryTimeGroup;
      RadioGroup deliveryTimeGroup = rootView.findViewById(id);
      if (deliveryTimeGroup == null) {
        break missingId;
      }

      id = R.id.imgBack;
      ImageView imgBack = rootView.findViewById(id);
      if (imgBack == null) {
        break missingId;
      }

      id = R.id.layoutAddress;
      LinearLayout layoutAddress = rootView.findViewById(id);
      if (layoutAddress == null) {
        break missingId;
      }

      id = R.id.ll_deliverycost;
      LinearLayout llDeliverycost = rootView.findViewById(id);
      if (llDeliverycost == null) {
        break missingId;
      }

      id = R.id.llPromo;
      PromoView llPromo = rootView.findViewById(id);
      if (llPromo == null) {
        break missingId;
      }

      id = R.id.llpayment;
      LinearLayout llpayment = rootView.findViewById(id);
      if (llpayment == null) {
        break missingId;
      }

      id = R.id.rvPaymentMethods;
      RecyclerView rvPaymentMethods = rootView.findViewById(id);
      if (rvPaymentMethods == null) {
        break missingId;
      }

      id = R.id.scheduled;
      RadioButton scheduled = rootView.findViewById(id);
      if (scheduled == null) {
        break missingId;
      }

      id = R.id.toolbar;
      RelativeLayout toolbar = rootView.findViewById(id);
      if (toolbar == null) {
        break missingId;
      }

      id = R.id.tvAddress;
      TextView tvAddress = rootView.findViewById(id);
      if (tvAddress == null) {
        break missingId;
      }

      id = R.id.tv_chooseTime;
      TextView tvChooseTime = rootView.findViewById(id);
      if (tvChooseTime == null) {
        break missingId;
      }

      id = R.id.tvContactNumber;
      TextView tvContactNumber = rootView.findViewById(id);
      if (tvContactNumber == null) {
        break missingId;
      }

      id = R.id.tvDiscountPrice;
      TextView tvDiscountPrice = rootView.findViewById(id);
      if (tvDiscountPrice == null) {
        break missingId;
      }

      id = R.id.tvLabel;
      TextView tvLabel = rootView.findViewById(id);
      if (tvLabel == null) {
        break missingId;
      }

      id = R.id.tv_promo;
      TextView tvPromo = rootView.findViewById(id);
      if (tvPromo == null) {
        break missingId;
      }

      id = R.id.tvTItle;
      TextView tvTItle = rootView.findViewById(id);
      if (tvTItle == null) {
        break missingId;
      }

      id = R.id.tvTotalPrice;
      TextView tvTotalPrice = rootView.findViewById(id);
      if (tvTotalPrice == null) {
        break missingId;
      }

      return new ActivityCheckoutBinding((RelativeLayout) rootView, asap, btnApplyPromoCode,
          btnPlaceOrder, cardLocation, cardTime, cost, deliveryTimeGroup, imgBack, layoutAddress,
          llDeliverycost, llPromo, llpayment, rvPaymentMethods, scheduled, toolbar, tvAddress,
          tvChooseTime, tvContactNumber, tvDiscountPrice, tvLabel, tvPromo, tvTItle, tvTotalPrice);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
