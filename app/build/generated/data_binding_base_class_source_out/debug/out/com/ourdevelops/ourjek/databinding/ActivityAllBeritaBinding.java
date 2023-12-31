// Generated by view binder compiler. Do not edit!
package com.ourdevelops.ourjek.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.ourdevelops.ourjek.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAllBeritaBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ImageView backBtn;

  @NonNull
  public final FrameLayout header;

  @NonNull
  public final RecyclerView inboxlist;

  @NonNull
  public final ImageView nodataimage;

  @NonNull
  public final RelativeLayout rlnodata;

  @NonNull
  public final ProgressBar rlprogress;

  @NonNull
  public final Toolbar toolbar;

  private ActivityAllBeritaBinding(@NonNull RelativeLayout rootView, @NonNull ImageView backBtn,
      @NonNull FrameLayout header, @NonNull RecyclerView inboxlist, @NonNull ImageView nodataimage,
      @NonNull RelativeLayout rlnodata, @NonNull ProgressBar rlprogress, @NonNull Toolbar toolbar) {
    this.rootView = rootView;
    this.backBtn = backBtn;
    this.header = header;
    this.inboxlist = inboxlist;
    this.nodataimage = nodataimage;
    this.rlnodata = rlnodata;
    this.rlprogress = rlprogress;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAllBeritaBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAllBeritaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_all_berita, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAllBeritaBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.back_btn;
      ImageView backBtn = rootView.findViewById(id);
      if (backBtn == null) {
        break missingId;
      }

      id = R.id.header;
      FrameLayout header = rootView.findViewById(id);
      if (header == null) {
        break missingId;
      }

      id = R.id.inboxlist;
      RecyclerView inboxlist = rootView.findViewById(id);
      if (inboxlist == null) {
        break missingId;
      }

      id = R.id.nodataimage;
      ImageView nodataimage = rootView.findViewById(id);
      if (nodataimage == null) {
        break missingId;
      }

      id = R.id.rlnodata;
      RelativeLayout rlnodata = rootView.findViewById(id);
      if (rlnodata == null) {
        break missingId;
      }

      id = R.id.rlprogress;
      ProgressBar rlprogress = rootView.findViewById(id);
      if (rlprogress == null) {
        break missingId;
      }

      id = R.id.toolbar;
      Toolbar toolbar = rootView.findViewById(id);
      if (toolbar == null) {
        break missingId;
      }

      return new ActivityAllBeritaBinding((RelativeLayout) rootView, backBtn, header, inboxlist,
          nodataimage, rlnodata, rlprogress, toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
