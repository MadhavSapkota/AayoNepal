// Generated by view binder compiler. Do not edit!
package com.ourdevelops.ourjek.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
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

public final class FragmentEnablelocationBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final Button enableLocationBtn;

  @NonNull
  public final TextView enableLocationTxt;

  @NonNull
  public final LinearLayout lllogo;

  @NonNull
  public final ImageView logo;

  @NonNull
  public final RelativeLayout rlprogress;

  @NonNull
  public final TextView tvSkip;

  private FragmentEnablelocationBinding(@NonNull FrameLayout rootView,
      @NonNull Button enableLocationBtn, @NonNull TextView enableLocationTxt,
      @NonNull LinearLayout lllogo, @NonNull ImageView logo, @NonNull RelativeLayout rlprogress,
      @NonNull TextView tvSkip) {
    this.rootView = rootView;
    this.enableLocationBtn = enableLocationBtn;
    this.enableLocationTxt = enableLocationTxt;
    this.lllogo = lllogo;
    this.logo = logo;
    this.rlprogress = rlprogress;
    this.tvSkip = tvSkip;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentEnablelocationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentEnablelocationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_enablelocation, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentEnablelocationBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.enable_location_btn;
      Button enableLocationBtn = rootView.findViewById(id);
      if (enableLocationBtn == null) {
        break missingId;
      }

      id = R.id.enable_location_txt;
      TextView enableLocationTxt = rootView.findViewById(id);
      if (enableLocationTxt == null) {
        break missingId;
      }

      id = R.id.lllogo;
      LinearLayout lllogo = rootView.findViewById(id);
      if (lllogo == null) {
        break missingId;
      }

      id = R.id.logo;
      ImageView logo = rootView.findViewById(id);
      if (logo == null) {
        break missingId;
      }

      id = R.id.rlprogress;
      RelativeLayout rlprogress = rootView.findViewById(id);
      if (rlprogress == null) {
        break missingId;
      }

      id = R.id.tvSkip;
      TextView tvSkip = rootView.findViewById(id);
      if (tvSkip == null) {
        break missingId;
      }

      return new FragmentEnablelocationBinding((FrameLayout) rootView, enableLocationBtn,
          enableLocationTxt, lllogo, logo, rlprogress, tvSkip);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
