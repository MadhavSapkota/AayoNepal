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
import com.github.siyamed.shapeimageview.CircularImageView;
import com.ourdevelops.ourjek.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemOrderNewBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final ImageView asd;

  @NonNull
  public final View dashFour;

  @NonNull
  public final View dashOne;

  @NonNull
  public final View dashThree;

  @NonNull
  public final View dashTwo;

  @NonNull
  public final TextView destinationAddress;

  @NonNull
  public final TextView destinationTxt;

  @NonNull
  public final View divider;

  @NonNull
  public final ImageView greenCircle;

  @NonNull
  public final CircularImageView image;

  @NonNull
  public final CardView mainlayout;

  @NonNull
  public final LinearLayout oneWrapper;

  @NonNull
  public final TextView pickupAddress;

  @NonNull
  public final TextView pickupTxt;

  @NonNull
  public final TextView price;

  @NonNull
  public final ImageView redCircle;

  @NonNull
  public final TextView textket;

  @NonNull
  public final TextView texttanggal;

  private ItemOrderNewBinding(@NonNull CardView rootView, @NonNull ImageView asd,
      @NonNull View dashFour, @NonNull View dashOne, @NonNull View dashThree, @NonNull View dashTwo,
      @NonNull TextView destinationAddress, @NonNull TextView destinationTxt, @NonNull View divider,
      @NonNull ImageView greenCircle, @NonNull CircularImageView image,
      @NonNull CardView mainlayout, @NonNull LinearLayout oneWrapper,
      @NonNull TextView pickupAddress, @NonNull TextView pickupTxt, @NonNull TextView price,
      @NonNull ImageView redCircle, @NonNull TextView textket, @NonNull TextView texttanggal) {
    this.rootView = rootView;
    this.asd = asd;
    this.dashFour = dashFour;
    this.dashOne = dashOne;
    this.dashThree = dashThree;
    this.dashTwo = dashTwo;
    this.destinationAddress = destinationAddress;
    this.destinationTxt = destinationTxt;
    this.divider = divider;
    this.greenCircle = greenCircle;
    this.image = image;
    this.mainlayout = mainlayout;
    this.oneWrapper = oneWrapper;
    this.pickupAddress = pickupAddress;
    this.pickupTxt = pickupTxt;
    this.price = price;
    this.redCircle = redCircle;
    this.textket = textket;
    this.texttanggal = texttanggal;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemOrderNewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemOrderNewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_order_new, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemOrderNewBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.asd;
      ImageView asd = rootView.findViewById(id);
      if (asd == null) {
        break missingId;
      }

      id = R.id.dashFour;
      View dashFour = rootView.findViewById(id);
      if (dashFour == null) {
        break missingId;
      }

      id = R.id.dashOne;
      View dashOne = rootView.findViewById(id);
      if (dashOne == null) {
        break missingId;
      }

      id = R.id.dashThree;
      View dashThree = rootView.findViewById(id);
      if (dashThree == null) {
        break missingId;
      }

      id = R.id.dashTwo;
      View dashTwo = rootView.findViewById(id);
      if (dashTwo == null) {
        break missingId;
      }

      id = R.id.destinationAddress;
      TextView destinationAddress = rootView.findViewById(id);
      if (destinationAddress == null) {
        break missingId;
      }

      id = R.id.destinationTxt;
      TextView destinationTxt = rootView.findViewById(id);
      if (destinationTxt == null) {
        break missingId;
      }

      id = R.id.divider;
      View divider = rootView.findViewById(id);
      if (divider == null) {
        break missingId;
      }

      id = R.id.greenCircle;
      ImageView greenCircle = rootView.findViewById(id);
      if (greenCircle == null) {
        break missingId;
      }

      id = R.id.image;
      CircularImageView image = rootView.findViewById(id);
      if (image == null) {
        break missingId;
      }

      CardView mainlayout = (CardView) rootView;

      id = R.id.one_wrapper;
      LinearLayout oneWrapper = rootView.findViewById(id);
      if (oneWrapper == null) {
        break missingId;
      }

      id = R.id.pickupAddress;
      TextView pickupAddress = rootView.findViewById(id);
      if (pickupAddress == null) {
        break missingId;
      }

      id = R.id.pickupTxt;
      TextView pickupTxt = rootView.findViewById(id);
      if (pickupTxt == null) {
        break missingId;
      }

      id = R.id.price;
      TextView price = rootView.findViewById(id);
      if (price == null) {
        break missingId;
      }

      id = R.id.redCircle;
      ImageView redCircle = rootView.findViewById(id);
      if (redCircle == null) {
        break missingId;
      }

      id = R.id.textket;
      TextView textket = rootView.findViewById(id);
      if (textket == null) {
        break missingId;
      }

      id = R.id.texttanggal;
      TextView texttanggal = rootView.findViewById(id);
      if (texttanggal == null) {
        break missingId;
      }

      return new ItemOrderNewBinding((CardView) rootView, asd, dashFour, dashOne, dashThree,
          dashTwo, destinationAddress, destinationTxt, divider, greenCircle, image, mainlayout,
          oneWrapper, pickupAddress, pickupTxt, price, redCircle, textket, texttanggal);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
