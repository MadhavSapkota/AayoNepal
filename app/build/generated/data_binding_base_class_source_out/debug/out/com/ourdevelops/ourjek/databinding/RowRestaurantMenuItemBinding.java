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
import androidx.viewbinding.ViewBinding;
import com.ourdevelops.ourjek.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class RowRestaurantMenuItemBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView imgPromo;

  @NonNull
  public final RelativeLayout item;

  @NonNull
  public final LinearLayout layoutPrice;

  @NonNull
  public final TextView tvItem;

  @NonNull
  public final TextView tvItemDetail;

  @NonNull
  public final TextView tvItemPrice;

  @NonNull
  public final TextView tvObseletePrice;

  private RowRestaurantMenuItemBinding(@NonNull LinearLayout rootView, @NonNull ImageView imgPromo,
      @NonNull RelativeLayout item, @NonNull LinearLayout layoutPrice, @NonNull TextView tvItem,
      @NonNull TextView tvItemDetail, @NonNull TextView tvItemPrice,
      @NonNull TextView tvObseletePrice) {
    this.rootView = rootView;
    this.imgPromo = imgPromo;
    this.item = item;
    this.layoutPrice = layoutPrice;
    this.tvItem = tvItem;
    this.tvItemDetail = tvItemDetail;
    this.tvItemPrice = tvItemPrice;
    this.tvObseletePrice = tvObseletePrice;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static RowRestaurantMenuItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RowRestaurantMenuItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.row_restaurant_menu_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RowRestaurantMenuItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imgPromo;
      ImageView imgPromo = rootView.findViewById(id);
      if (imgPromo == null) {
        break missingId;
      }

      id = R.id.item;
      RelativeLayout item = rootView.findViewById(id);
      if (item == null) {
        break missingId;
      }

      id = R.id.layoutPrice;
      LinearLayout layoutPrice = rootView.findViewById(id);
      if (layoutPrice == null) {
        break missingId;
      }

      id = R.id.tvItem;
      TextView tvItem = rootView.findViewById(id);
      if (tvItem == null) {
        break missingId;
      }

      id = R.id.tvItemDetail;
      TextView tvItemDetail = rootView.findViewById(id);
      if (tvItemDetail == null) {
        break missingId;
      }

      id = R.id.tvItemPrice;
      TextView tvItemPrice = rootView.findViewById(id);
      if (tvItemPrice == null) {
        break missingId;
      }

      id = R.id.tvObseletePrice;
      TextView tvObseletePrice = rootView.findViewById(id);
      if (tvObseletePrice == null) {
        break missingId;
      }

      return new RowRestaurantMenuItemBinding((LinearLayout) rootView, imgPromo, item, layoutPrice,
          tvItem, tvItemDetail, tvItemPrice, tvObseletePrice);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
