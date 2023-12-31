// Generated by view binder compiler. Do not edit!
package com.ourdevelops.ourjek.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.ourdevelops.ourjek.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentRecycleBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ImageView filter;

  @NonNull
  public final RecyclerView inboxlist;

  @NonNull
  public final ImageView nodataimage;

  @NonNull
  public final TextView orderHeading;

  @NonNull
  public final RelativeLayout rlnodata;

  @NonNull
  public final RelativeLayout rlprogress;

  @NonNull
  public final Toolbar tvToolbar;

  private FragmentRecycleBinding(@NonNull RelativeLayout rootView, @NonNull ImageView filter,
      @NonNull RecyclerView inboxlist, @NonNull ImageView nodataimage,
      @NonNull TextView orderHeading, @NonNull RelativeLayout rlnodata,
      @NonNull RelativeLayout rlprogress, @NonNull Toolbar tvToolbar) {
    this.rootView = rootView;
    this.filter = filter;
    this.inboxlist = inboxlist;
    this.nodataimage = nodataimage;
    this.orderHeading = orderHeading;
    this.rlnodata = rlnodata;
    this.rlprogress = rlprogress;
    this.tvToolbar = tvToolbar;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentRecycleBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentRecycleBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_recycle, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentRecycleBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.filter;
      ImageView filter = rootView.findViewById(id);
      if (filter == null) {
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

      id = R.id.orderHeading;
      TextView orderHeading = rootView.findViewById(id);
      if (orderHeading == null) {
        break missingId;
      }

      id = R.id.rlnodata;
      RelativeLayout rlnodata = rootView.findViewById(id);
      if (rlnodata == null) {
        break missingId;
      }

      id = R.id.rlprogress;
      RelativeLayout rlprogress = rootView.findViewById(id);
      if (rlprogress == null) {
        break missingId;
      }

      id = R.id.tvToolbar;
      Toolbar tvToolbar = rootView.findViewById(id);
      if (tvToolbar == null) {
        break missingId;
      }

      return new FragmentRecycleBinding((RelativeLayout) rootView, filter, inboxlist, nodataimage,
          orderHeading, rlnodata, rlprogress, tvToolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
