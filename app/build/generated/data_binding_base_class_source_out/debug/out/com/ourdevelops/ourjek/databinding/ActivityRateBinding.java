// Generated by view binder compiler. Do not edit!
package com.ourdevelops.ourjek.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.github.ornolfr.ratingview.RatingView;
import com.ourdevelops.ourjek.R;
import customfonts.Button_SF_Pro_Display_Medium;
import customfonts.EditTextSFProDisplayRegular;
import customfonts.TextViewSFProDisplayMedium;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityRateBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final EditTextSFProDisplayRegular addComment;

  @NonNull
  public final CircleImageView image;

  @NonNull
  public final TextViewSFProDisplayMedium namadriver;

  @NonNull
  public final RatingView ratingView;

  @NonNull
  public final ShimmerFrameLayout shimmername;

  @NonNull
  public final Button_SF_Pro_Display_Medium submit;

  private ActivityRateBinding(@NonNull RelativeLayout rootView,
      @NonNull EditTextSFProDisplayRegular addComment, @NonNull CircleImageView image,
      @NonNull TextViewSFProDisplayMedium namadriver, @NonNull RatingView ratingView,
      @NonNull ShimmerFrameLayout shimmername, @NonNull Button_SF_Pro_Display_Medium submit) {
    this.rootView = rootView;
    this.addComment = addComment;
    this.image = image;
    this.namadriver = namadriver;
    this.ratingView = ratingView;
    this.shimmername = shimmername;
    this.submit = submit;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRateBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRateBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_rate, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRateBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.addComment;
      EditTextSFProDisplayRegular addComment = rootView.findViewById(id);
      if (addComment == null) {
        break missingId;
      }

      id = R.id.image;
      CircleImageView image = rootView.findViewById(id);
      if (image == null) {
        break missingId;
      }

      id = R.id.namadriver;
      TextViewSFProDisplayMedium namadriver = rootView.findViewById(id);
      if (namadriver == null) {
        break missingId;
      }

      id = R.id.ratingView;
      RatingView ratingView = rootView.findViewById(id);
      if (ratingView == null) {
        break missingId;
      }

      id = R.id.shimmername;
      ShimmerFrameLayout shimmername = rootView.findViewById(id);
      if (shimmername == null) {
        break missingId;
      }

      id = R.id.submit;
      Button_SF_Pro_Display_Medium submit = rootView.findViewById(id);
      if (submit == null) {
        break missingId;
      }

      return new ActivityRateBinding((RelativeLayout) rootView, addComment, image, namadriver,
          ratingView, shimmername, submit);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
