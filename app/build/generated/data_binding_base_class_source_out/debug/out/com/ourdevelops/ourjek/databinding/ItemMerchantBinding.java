// Generated by view binder compiler. Do not edit!
package com.ourdevelops.ourjek.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.ourdevelops.ourjek.R;
import customfonts.TextViewSFProDisplayMedium;
import customfonts.TextViewSFProDisplayRegular;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemMerchantBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final CardView cardView;

  @NonNull
  public final TextViewSFProDisplayRegular content;

  @NonNull
  public final TextViewSFProDisplayMedium distance;

  @NonNull
  public final ImageView image;

  @NonNull
  public final TextViewSFProDisplayMedium namakategori;

  @NonNull
  public final FrameLayout promobadge;

  @NonNull
  public final RelativeLayout rootLayout;

  @NonNull
  public final ShimmerFrameLayout shimreview;

  private ItemMerchantBinding(@NonNull RelativeLayout rootView, @NonNull CardView cardView,
      @NonNull TextViewSFProDisplayRegular content, @NonNull TextViewSFProDisplayMedium distance,
      @NonNull ImageView image, @NonNull TextViewSFProDisplayMedium namakategori,
      @NonNull FrameLayout promobadge, @NonNull RelativeLayout rootLayout,
      @NonNull ShimmerFrameLayout shimreview) {
    this.rootView = rootView;
    this.cardView = cardView;
    this.content = content;
    this.distance = distance;
    this.image = image;
    this.namakategori = namakategori;
    this.promobadge = promobadge;
    this.rootLayout = rootLayout;
    this.shimreview = shimreview;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemMerchantBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemMerchantBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_merchant, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemMerchantBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.card_view;
      CardView cardView = rootView.findViewById(id);
      if (cardView == null) {
        break missingId;
      }

      id = R.id.content;
      TextViewSFProDisplayRegular content = rootView.findViewById(id);
      if (content == null) {
        break missingId;
      }

      id = R.id.distance;
      TextViewSFProDisplayMedium distance = rootView.findViewById(id);
      if (distance == null) {
        break missingId;
      }

      id = R.id.image;
      ImageView image = rootView.findViewById(id);
      if (image == null) {
        break missingId;
      }

      id = R.id.namakategori;
      TextViewSFProDisplayMedium namakategori = rootView.findViewById(id);
      if (namakategori == null) {
        break missingId;
      }

      id = R.id.promobadge;
      FrameLayout promobadge = rootView.findViewById(id);
      if (promobadge == null) {
        break missingId;
      }

      RelativeLayout rootLayout = (RelativeLayout) rootView;

      id = R.id.shimreview;
      ShimmerFrameLayout shimreview = rootView.findViewById(id);
      if (shimreview == null) {
        break missingId;
      }

      return new ItemMerchantBinding((RelativeLayout) rootView, cardView, content, distance, image,
          namakategori, promobadge, rootLayout, shimreview);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
