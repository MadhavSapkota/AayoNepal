// Generated by view binder compiler. Do not edit!
package com.ourdevelops.ourjek.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import com.ourdevelops.ourjek.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class RowSetLocationBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final CardView cvTopmain;

  @NonNull
  public final ImageView imageSearch;

  @NonNull
  public final RelativeLayout layoutPickLocation;

  @NonNull
  public final LinearLayout llHome;

  @NonNull
  public final LinearLayout llOffice;

  @NonNull
  public final TextView tvAnotherLocation;

  @NonNull
  public final TextView tvFrom;

  @NonNull
  public final TextView tvTo;

  private RowSetLocationBinding(@NonNull LinearLayout rootView, @NonNull CardView cvTopmain,
      @NonNull ImageView imageSearch, @NonNull RelativeLayout layoutPickLocation,
      @NonNull LinearLayout llHome, @NonNull LinearLayout llOffice,
      @NonNull TextView tvAnotherLocation, @NonNull TextView tvFrom, @NonNull TextView tvTo) {
    this.rootView = rootView;
    this.cvTopmain = cvTopmain;
    this.imageSearch = imageSearch;
    this.layoutPickLocation = layoutPickLocation;
    this.llHome = llHome;
    this.llOffice = llOffice;
    this.tvAnotherLocation = tvAnotherLocation;
    this.tvFrom = tvFrom;
    this.tvTo = tvTo;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static RowSetLocationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RowSetLocationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.row_set_location, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RowSetLocationBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cv_topmain;
      CardView cvTopmain = rootView.findViewById(id);
      if (cvTopmain == null) {
        break missingId;
      }

      id = R.id.imageSearch;
      ImageView imageSearch = rootView.findViewById(id);
      if (imageSearch == null) {
        break missingId;
      }

      id = R.id.layoutPickLocation;
      RelativeLayout layoutPickLocation = rootView.findViewById(id);
      if (layoutPickLocation == null) {
        break missingId;
      }

      id = R.id.ll_home;
      LinearLayout llHome = rootView.findViewById(id);
      if (llHome == null) {
        break missingId;
      }

      id = R.id.ll_office;
      LinearLayout llOffice = rootView.findViewById(id);
      if (llOffice == null) {
        break missingId;
      }

      id = R.id.tv_another_location;
      TextView tvAnotherLocation = rootView.findViewById(id);
      if (tvAnotherLocation == null) {
        break missingId;
      }

      id = R.id.tv_from;
      TextView tvFrom = rootView.findViewById(id);
      if (tvFrom == null) {
        break missingId;
      }

      id = R.id.tv_to;
      TextView tvTo = rootView.findViewById(id);
      if (tvTo == null) {
        break missingId;
      }

      return new RowSetLocationBinding((LinearLayout) rootView, cvTopmain, imageSearch,
          layoutPickLocation, llHome, llOffice, tvAnotherLocation, tvFrom, tvTo);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
