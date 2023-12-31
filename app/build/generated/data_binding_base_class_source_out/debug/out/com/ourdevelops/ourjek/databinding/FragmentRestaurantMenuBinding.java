// Generated by view binder compiler. Do not edit!
package com.ourdevelops.ourjek.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.ourdevelops.ourjek.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentRestaurantMenuBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final RecyclerView merchantnear;

  @NonNull
  public final NestedScrollView nestedScrollViewRestaurant;

  @NonNull
  public final ProgressBar rlprogress;

  private FragmentRestaurantMenuBinding(@NonNull RelativeLayout rootView,
      @NonNull RecyclerView merchantnear, @NonNull NestedScrollView nestedScrollViewRestaurant,
      @NonNull ProgressBar rlprogress) {
    this.rootView = rootView;
    this.merchantnear = merchantnear;
    this.nestedScrollViewRestaurant = nestedScrollViewRestaurant;
    this.rlprogress = rlprogress;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentRestaurantMenuBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentRestaurantMenuBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_restaurant_menu, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentRestaurantMenuBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.merchantnear;
      RecyclerView merchantnear = rootView.findViewById(id);
      if (merchantnear == null) {
        break missingId;
      }

      id = R.id.nestedScrollViewRestaurant;
      NestedScrollView nestedScrollViewRestaurant = rootView.findViewById(id);
      if (nestedScrollViewRestaurant == null) {
        break missingId;
      }

      id = R.id.rlprogress;
      ProgressBar rlprogress = rootView.findViewById(id);
      if (rlprogress == null) {
        break missingId;
      }

      return new FragmentRestaurantMenuBinding((RelativeLayout) rootView, merchantnear,
          nestedScrollViewRestaurant, rlprogress);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
