// Generated by view binder compiler. Do not edit!
package com.ourdevelops.ourjek.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;
import com.github.ornolfr.ratingview.RatingView;
import com.ourdevelops.ourjek.R;
import customfonts.TextViewSFProDisplayMedium;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityDriverDetailBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageButton btnCross;

  @NonNull
  public final ImageView ivDriver;

  @NonNull
  public final RatingView ratingView;

  @NonNull
  public final Toolbar toolbar;

  @NonNull
  public final TextViewSFProDisplayMedium tvColor;

  @NonNull
  public final TextViewSFProDisplayMedium tvDriverName;

  @NonNull
  public final TextViewSFProDisplayMedium tvMerek;

  @NonNull
  public final TextViewSFProDisplayMedium tvMobile;

  @NonNull
  public final TextViewSFProDisplayMedium tvVehicleNumber;

  private ActivityDriverDetailBinding(@NonNull LinearLayout rootView, @NonNull ImageButton btnCross,
      @NonNull ImageView ivDriver, @NonNull RatingView ratingView, @NonNull Toolbar toolbar,
      @NonNull TextViewSFProDisplayMedium tvColor, @NonNull TextViewSFProDisplayMedium tvDriverName,
      @NonNull TextViewSFProDisplayMedium tvMerek, @NonNull TextViewSFProDisplayMedium tvMobile,
      @NonNull TextViewSFProDisplayMedium tvVehicleNumber) {
    this.rootView = rootView;
    this.btnCross = btnCross;
    this.ivDriver = ivDriver;
    this.ratingView = ratingView;
    this.toolbar = toolbar;
    this.tvColor = tvColor;
    this.tvDriverName = tvDriverName;
    this.tvMerek = tvMerek;
    this.tvMobile = tvMobile;
    this.tvVehicleNumber = tvVehicleNumber;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDriverDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDriverDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_driver_detail, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDriverDetailBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnCross;
      ImageButton btnCross = rootView.findViewById(id);
      if (btnCross == null) {
        break missingId;
      }

      id = R.id.ivDriver;
      ImageView ivDriver = rootView.findViewById(id);
      if (ivDriver == null) {
        break missingId;
      }

      id = R.id.ratingView;
      RatingView ratingView = rootView.findViewById(id);
      if (ratingView == null) {
        break missingId;
      }

      id = R.id.toolbar;
      Toolbar toolbar = rootView.findViewById(id);
      if (toolbar == null) {
        break missingId;
      }

      id = R.id.tvColor;
      TextViewSFProDisplayMedium tvColor = rootView.findViewById(id);
      if (tvColor == null) {
        break missingId;
      }

      id = R.id.tvDriverName;
      TextViewSFProDisplayMedium tvDriverName = rootView.findViewById(id);
      if (tvDriverName == null) {
        break missingId;
      }

      id = R.id.tvMerek;
      TextViewSFProDisplayMedium tvMerek = rootView.findViewById(id);
      if (tvMerek == null) {
        break missingId;
      }

      id = R.id.tvMobile;
      TextViewSFProDisplayMedium tvMobile = rootView.findViewById(id);
      if (tvMobile == null) {
        break missingId;
      }

      id = R.id.tvVehicleNumber;
      TextViewSFProDisplayMedium tvVehicleNumber = rootView.findViewById(id);
      if (tvVehicleNumber == null) {
        break missingId;
      }

      return new ActivityDriverDetailBinding((LinearLayout) rootView, btnCross, ivDriver,
          ratingView, toolbar, tvColor, tvDriverName, tvMerek, tvMobile, tvVehicleNumber);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
