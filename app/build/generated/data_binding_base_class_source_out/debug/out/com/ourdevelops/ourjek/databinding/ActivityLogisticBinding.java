// Generated by view binder compiler. Do not edit!
package com.ourdevelops.ourjek.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import com.ourdevelops.ourjek.R;
import com.ourdevelops.ourjek.customviews.CustomFrameLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLogisticBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final FrameLayout fragmentContainer;

  @NonNull
  public final ImageView imgBack;

  @NonNull
  public final LayoutPickLocationBottomSheetBinding layoutSearchSet;

  @NonNull
  public final ProgressBar loader;

  @NonNull
  public final CustomFrameLayout mapFrame;

  @NonNull
  public final ImageView pinImage;

  @NonNull
  public final TextView tvDragMessage;

  private ActivityLogisticBinding(@NonNull CoordinatorLayout rootView,
      @NonNull FrameLayout fragmentContainer, @NonNull ImageView imgBack,
      @NonNull LayoutPickLocationBottomSheetBinding layoutSearchSet, @NonNull ProgressBar loader,
      @NonNull CustomFrameLayout mapFrame, @NonNull ImageView pinImage,
      @NonNull TextView tvDragMessage) {
    this.rootView = rootView;
    this.fragmentContainer = fragmentContainer;
    this.imgBack = imgBack;
    this.layoutSearchSet = layoutSearchSet;
    this.loader = loader;
    this.mapFrame = mapFrame;
    this.pinImage = pinImage;
    this.tvDragMessage = tvDragMessage;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLogisticBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLogisticBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_logistic, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLogisticBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.fragmentContainer;
      FrameLayout fragmentContainer = rootView.findViewById(id);
      if (fragmentContainer == null) {
        break missingId;
      }

      id = R.id.imgBack;
      ImageView imgBack = rootView.findViewById(id);
      if (imgBack == null) {
        break missingId;
      }

      id = R.id.layoutSearchSet;
      View layoutSearchSet = rootView.findViewById(id);
      if (layoutSearchSet == null) {
        break missingId;
      }
      LayoutPickLocationBottomSheetBinding binding_layoutSearchSet = LayoutPickLocationBottomSheetBinding.bind(layoutSearchSet);

      id = R.id.loader;
      ProgressBar loader = rootView.findViewById(id);
      if (loader == null) {
        break missingId;
      }

      id = R.id.mapFrame;
      CustomFrameLayout mapFrame = rootView.findViewById(id);
      if (mapFrame == null) {
        break missingId;
      }

      id = R.id.pinImage;
      ImageView pinImage = rootView.findViewById(id);
      if (pinImage == null) {
        break missingId;
      }

      id = R.id.tvDragMessage;
      TextView tvDragMessage = rootView.findViewById(id);
      if (tvDragMessage == null) {
        break missingId;
      }

      return new ActivityLogisticBinding((CoordinatorLayout) rootView, fragmentContainer, imgBack,
          binding_layoutSearchSet, loader, mapFrame, pinImage, tvDragMessage);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
