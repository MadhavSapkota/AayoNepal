// Generated by view binder compiler. Do not edit!
package com.ourdevelops.ourjek.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.ourdevelops.ourjek.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityPicklocationBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ImageView backBtn;

  @NonNull
  public final LinearLayout bottomView;

  @NonNull
  public final LinearLayout llHome;

  @NonNull
  public final LinearLayout llOffice;

  @NonNull
  public final TextView locationPickerAutoCompleteText;

  @NonNull
  public final LinearLayout locationPickerContainer;

  @NonNull
  public final TextView locationPickerCurrentAddress;

  @NonNull
  public final TextView locationPickerDestinationButton;

  @NonNull
  public final Space locationPickerSpace;

  @NonNull
  public final TextView tvFrom;

  @NonNull
  public final TextView tvTo;

  private ActivityPicklocationBinding(@NonNull RelativeLayout rootView, @NonNull ImageView backBtn,
      @NonNull LinearLayout bottomView, @NonNull LinearLayout llHome,
      @NonNull LinearLayout llOffice, @NonNull TextView locationPickerAutoCompleteText,
      @NonNull LinearLayout locationPickerContainer, @NonNull TextView locationPickerCurrentAddress,
      @NonNull TextView locationPickerDestinationButton, @NonNull Space locationPickerSpace,
      @NonNull TextView tvFrom, @NonNull TextView tvTo) {
    this.rootView = rootView;
    this.backBtn = backBtn;
    this.bottomView = bottomView;
    this.llHome = llHome;
    this.llOffice = llOffice;
    this.locationPickerAutoCompleteText = locationPickerAutoCompleteText;
    this.locationPickerContainer = locationPickerContainer;
    this.locationPickerCurrentAddress = locationPickerCurrentAddress;
    this.locationPickerDestinationButton = locationPickerDestinationButton;
    this.locationPickerSpace = locationPickerSpace;
    this.tvFrom = tvFrom;
    this.tvTo = tvTo;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityPicklocationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityPicklocationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_picklocation, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityPicklocationBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.backBtn;
      ImageView backBtn = rootView.findViewById(id);
      if (backBtn == null) {
        break missingId;
      }

      id = R.id.bottomView;
      LinearLayout bottomView = rootView.findViewById(id);
      if (bottomView == null) {
        break missingId;
      }

      id = R.id.llHome;
      LinearLayout llHome = rootView.findViewById(id);
      if (llHome == null) {
        break missingId;
      }

      id = R.id.llOffice;
      LinearLayout llOffice = rootView.findViewById(id);
      if (llOffice == null) {
        break missingId;
      }

      id = R.id.locationPickerAutoCompleteText;
      TextView locationPickerAutoCompleteText = rootView.findViewById(id);
      if (locationPickerAutoCompleteText == null) {
        break missingId;
      }

      id = R.id.locationPicker_container;
      LinearLayout locationPickerContainer = rootView.findViewById(id);
      if (locationPickerContainer == null) {
        break missingId;
      }

      id = R.id.locationPickerCurrentAddress;
      TextView locationPickerCurrentAddress = rootView.findViewById(id);
      if (locationPickerCurrentAddress == null) {
        break missingId;
      }

      id = R.id.locationPickerDestinationButton;
      TextView locationPickerDestinationButton = rootView.findViewById(id);
      if (locationPickerDestinationButton == null) {
        break missingId;
      }

      id = R.id.locationPicker_space;
      Space locationPickerSpace = rootView.findViewById(id);
      if (locationPickerSpace == null) {
        break missingId;
      }

      id = R.id.tvFrom;
      TextView tvFrom = rootView.findViewById(id);
      if (tvFrom == null) {
        break missingId;
      }

      id = R.id.tv_to;
      TextView tvTo = rootView.findViewById(id);
      if (tvTo == null) {
        break missingId;
      }

      return new ActivityPicklocationBinding((RelativeLayout) rootView, backBtn, bottomView, llHome,
          llOffice, locationPickerAutoCompleteText, locationPickerContainer,
          locationPickerCurrentAddress, locationPickerDestinationButton, locationPickerSpace,
          tvFrom, tvTo);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}