// Generated by view binder compiler. Do not edit!
package com.ourdevelops.ourjek.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.ourdevelops.ourjek.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemPromoBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LinearLayout content;

  @NonNull
  public final TextView expired;

  @NonNull
  public final ImageView image;

  @NonNull
  public final TextView ivAppyCode;

  @NonNull
  public final TextView kodepromo;

  @NonNull
  public final View margin;

  @NonNull
  public final TextView nama;

  @NonNull
  public final LinearLayout rootLayout;

  @NonNull
  public final TextView tvDiscountPercent;

  private ItemPromoBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout content,
      @NonNull TextView expired, @NonNull ImageView image, @NonNull TextView ivAppyCode,
      @NonNull TextView kodepromo, @NonNull View margin, @NonNull TextView nama,
      @NonNull LinearLayout rootLayout, @NonNull TextView tvDiscountPercent) {
    this.rootView = rootView;
    this.content = content;
    this.expired = expired;
    this.image = image;
    this.ivAppyCode = ivAppyCode;
    this.kodepromo = kodepromo;
    this.margin = margin;
    this.nama = nama;
    this.rootLayout = rootLayout;
    this.tvDiscountPercent = tvDiscountPercent;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemPromoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemPromoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_promo, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemPromoBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.content;
      LinearLayout content = rootView.findViewById(id);
      if (content == null) {
        break missingId;
      }

      id = R.id.expired;
      TextView expired = rootView.findViewById(id);
      if (expired == null) {
        break missingId;
      }

      id = R.id.image;
      ImageView image = rootView.findViewById(id);
      if (image == null) {
        break missingId;
      }

      id = R.id.iv_appyCode;
      TextView ivAppyCode = rootView.findViewById(id);
      if (ivAppyCode == null) {
        break missingId;
      }

      id = R.id.kodepromo;
      TextView kodepromo = rootView.findViewById(id);
      if (kodepromo == null) {
        break missingId;
      }

      id = R.id.margin;
      View margin = rootView.findViewById(id);
      if (margin == null) {
        break missingId;
      }

      id = R.id.nama;
      TextView nama = rootView.findViewById(id);
      if (nama == null) {
        break missingId;
      }

      LinearLayout rootLayout = (LinearLayout) rootView;

      id = R.id.tvDiscountPercent;
      TextView tvDiscountPercent = rootView.findViewById(id);
      if (tvDiscountPercent == null) {
        break missingId;
      }

      return new ItemPromoBinding((LinearLayout) rootView, content, expired, image, ivAppyCode,
          kodepromo, margin, nama, rootLayout, tvDiscountPercent);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
