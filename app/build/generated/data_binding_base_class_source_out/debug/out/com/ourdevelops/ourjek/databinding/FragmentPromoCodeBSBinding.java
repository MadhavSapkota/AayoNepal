// Generated by view binder compiler. Do not edit!
package com.ourdevelops.ourjek.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.ourdevelops.ourjek.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentPromoCodeBSBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LinearLayout llPromocode;

  @NonNull
  public final RecyclerView rvPromocodes;

  private FragmentPromoCodeBSBinding(@NonNull LinearLayout rootView,
      @NonNull LinearLayout llPromocode, @NonNull RecyclerView rvPromocodes) {
    this.rootView = rootView;
    this.llPromocode = llPromocode;
    this.rvPromocodes = rvPromocodes;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentPromoCodeBSBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentPromoCodeBSBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_promo_code_b_s, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentPromoCodeBSBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      LinearLayout llPromocode = (LinearLayout) rootView;

      id = R.id.rv_promocodes;
      RecyclerView rvPromocodes = rootView.findViewById(id);
      if (rvPromocodes == null) {
        break missingId;
      }

      return new FragmentPromoCodeBSBinding((LinearLayout) rootView, llPromocode, rvPromocodes);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
