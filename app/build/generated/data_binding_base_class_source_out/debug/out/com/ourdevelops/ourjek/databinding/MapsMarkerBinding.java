// Generated by view binder compiler. Do not edit!
package com.ourdevelops.ourjek.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.ourdevelops.ourjek.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class MapsMarkerBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView markerIcon;

  private MapsMarkerBinding(@NonNull LinearLayout rootView, @NonNull ImageView markerIcon) {
    this.rootView = rootView;
    this.markerIcon = markerIcon;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static MapsMarkerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static MapsMarkerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.maps_marker, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static MapsMarkerBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.marker_icon;
      ImageView markerIcon = rootView.findViewById(id);
      if (markerIcon == null) {
        break missingId;
      }

      return new MapsMarkerBinding((LinearLayout) rootView, markerIcon);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}