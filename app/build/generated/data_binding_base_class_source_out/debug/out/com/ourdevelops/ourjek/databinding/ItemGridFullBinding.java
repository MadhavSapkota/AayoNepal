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
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import com.ourdevelops.ourjek.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemGridFullBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final CardView cardView;

  @NonNull
  public final TextView category;

  @NonNull
  public final TextView content;

  @NonNull
  public final ImageView favourite;

  @NonNull
  public final ImageView image;

  @NonNull
  public final TextView namakategori;

  @NonNull
  public final LinearLayout rootLayout;

  private ItemGridFullBinding(@NonNull LinearLayout rootView, @NonNull CardView cardView,
      @NonNull TextView category, @NonNull TextView content, @NonNull ImageView favourite,
      @NonNull ImageView image, @NonNull TextView namakategori, @NonNull LinearLayout rootLayout) {
    this.rootView = rootView;
    this.cardView = cardView;
    this.category = category;
    this.content = content;
    this.favourite = favourite;
    this.image = image;
    this.namakategori = namakategori;
    this.rootLayout = rootLayout;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemGridFullBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemGridFullBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_grid_full, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemGridFullBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.card_view;
      CardView cardView = rootView.findViewById(id);
      if (cardView == null) {
        break missingId;
      }

      id = R.id.category;
      TextView category = rootView.findViewById(id);
      if (category == null) {
        break missingId;
      }

      id = R.id.content;
      TextView content = rootView.findViewById(id);
      if (content == null) {
        break missingId;
      }

      id = R.id.favourite;
      ImageView favourite = rootView.findViewById(id);
      if (favourite == null) {
        break missingId;
      }

      id = R.id.image;
      ImageView image = rootView.findViewById(id);
      if (image == null) {
        break missingId;
      }

      id = R.id.namakategori;
      TextView namakategori = rootView.findViewById(id);
      if (namakategori == null) {
        break missingId;
      }

      LinearLayout rootLayout = (LinearLayout) rootView;

      return new ItemGridFullBinding((LinearLayout) rootView, cardView, category, content,
          favourite, image, namakategori, rootLayout);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}