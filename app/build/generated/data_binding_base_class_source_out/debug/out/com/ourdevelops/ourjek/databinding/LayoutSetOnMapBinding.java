// Generated by view binder compiler. Do not edit!
package com.ourdevelops.ourjek.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.ourdevelops.ourjek.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class LayoutSetOnMapBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView addImage;

  @NonNull
  public final Button btnConfirmDestination;

  @NonNull
  public final ImageView imgSearch;

  @NonNull
  public final RelativeLayout layoutSearchDestination;

  @NonNull
  public final LinearLayout layoutSetOnMap;

  @NonNull
  public final ImageView mapImage;

  @NonNull
  public final TextView tvSearchDestination;

  private LayoutSetOnMapBinding(@NonNull LinearLayout rootView, @NonNull ImageView addImage,
      @NonNull Button btnConfirmDestination, @NonNull ImageView imgSearch,
      @NonNull RelativeLayout layoutSearchDestination, @NonNull LinearLayout layoutSetOnMap,
      @NonNull ImageView mapImage, @NonNull TextView tvSearchDestination) {
    this.rootView = rootView;
    this.addImage = addImage;
    this.btnConfirmDestination = btnConfirmDestination;
    this.imgSearch = imgSearch;
    this.layoutSearchDestination = layoutSearchDestination;
    this.layoutSetOnMap = layoutSetOnMap;
    this.mapImage = mapImage;
    this.tvSearchDestination = tvSearchDestination;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static LayoutSetOnMapBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LayoutSetOnMapBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.layout_set_on_map, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LayoutSetOnMapBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.addImage;
      ImageView addImage = rootView.findViewById(id);
      if (addImage == null) {
        break missingId;
      }

      id = R.id.btnConfirmDestination;
      Button btnConfirmDestination = rootView.findViewById(id);
      if (btnConfirmDestination == null) {
        break missingId;
      }

      id = R.id.imgSearch;
      ImageView imgSearch = rootView.findViewById(id);
      if (imgSearch == null) {
        break missingId;
      }

      id = R.id.layoutSearchDestination;
      RelativeLayout layoutSearchDestination = rootView.findViewById(id);
      if (layoutSearchDestination == null) {
        break missingId;
      }

      LinearLayout layoutSetOnMap = (LinearLayout) rootView;

      id = R.id.mapImage;
      ImageView mapImage = rootView.findViewById(id);
      if (mapImage == null) {
        break missingId;
      }

      id = R.id.tvSearchDestination;
      TextView tvSearchDestination = rootView.findViewById(id);
      if (tvSearchDestination == null) {
        break missingId;
      }

      return new LayoutSetOnMapBinding((LinearLayout) rootView, addImage, btnConfirmDestination,
          imgSearch, layoutSearchDestination, layoutSetOnMap, mapImage, tvSearchDestination);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
