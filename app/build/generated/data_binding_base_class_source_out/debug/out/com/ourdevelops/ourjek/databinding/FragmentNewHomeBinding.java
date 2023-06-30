// Generated by view binder compiler. Do not edit!
package com.ourdevelops.ourjek.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import com.ourdevelops.ourjek.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentNewHomeBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ImageView appLogo;

  @NonNull
  public final ImageView btnNotificaion;

  @NonNull
  public final ProgressBar progress;

  @NonNull
  public final RecyclerView recyclerView;

  @NonNull
  public final SwipeRefreshLayout swipeRefresh;

  @NonNull
  public final RelativeLayout toolbar;

  @NonNull
  public final TextView tvCurrentLocation;

  @NonNull
  public final TextView tvDevelopers;

  private FragmentNewHomeBinding(@NonNull RelativeLayout rootView, @NonNull ImageView appLogo,
      @NonNull ImageView btnNotificaion, @NonNull ProgressBar progress,
      @NonNull RecyclerView recyclerView, @NonNull SwipeRefreshLayout swipeRefresh,
      @NonNull RelativeLayout toolbar, @NonNull TextView tvCurrentLocation,
      @NonNull TextView tvDevelopers) {
    this.rootView = rootView;
    this.appLogo = appLogo;
    this.btnNotificaion = btnNotificaion;
    this.progress = progress;
    this.recyclerView = recyclerView;
    this.swipeRefresh = swipeRefresh;
    this.toolbar = toolbar;
    this.tvCurrentLocation = tvCurrentLocation;
    this.tvDevelopers = tvDevelopers;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentNewHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentNewHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_new_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentNewHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.appLogo;
      ImageView appLogo = rootView.findViewById(id);
      if (appLogo == null) {
        break missingId;
      }

      id = R.id.btn_notificaion;
      ImageView btnNotificaion = rootView.findViewById(id);
      if (btnNotificaion == null) {
        break missingId;
      }

      id = R.id.progress;
      ProgressBar progress = rootView.findViewById(id);
      if (progress == null) {
        break missingId;
      }

      id = R.id.recyclerView;
      RecyclerView recyclerView = rootView.findViewById(id);
      if (recyclerView == null) {
        break missingId;
      }

      id = R.id.swipeRefresh;
      SwipeRefreshLayout swipeRefresh = rootView.findViewById(id);
      if (swipeRefresh == null) {
        break missingId;
      }

      id = R.id.toolbar;
      RelativeLayout toolbar = rootView.findViewById(id);
      if (toolbar == null) {
        break missingId;
      }

      id = R.id.tvCurrentLocation;
      TextView tvCurrentLocation = rootView.findViewById(id);
      if (tvCurrentLocation == null) {
        break missingId;
      }

      id = R.id.tvDevelopers;
      TextView tvDevelopers = rootView.findViewById(id);
      if (tvDevelopers == null) {
        break missingId;
      }

      return new FragmentNewHomeBinding((RelativeLayout) rootView, appLogo, btnNotificaion,
          progress, recyclerView, swipeRefresh, toolbar, tvCurrentLocation, tvDevelopers);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
