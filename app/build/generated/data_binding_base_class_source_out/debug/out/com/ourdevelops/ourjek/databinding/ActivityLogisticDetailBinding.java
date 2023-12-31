// Generated by view binder compiler. Do not edit!
package com.ourdevelops.ourjek.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import com.ourdevelops.ourjek.R;
import com.ourdevelops.ourjek.activity.logistic.holders.UserDetailView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLogisticDetailBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final RadioButton asap;

  @NonNull
  public final CardView cardTime;

  @NonNull
  public final RadioGroup deliveryTimeGroup;

  @NonNull
  public final EditText logisticsRemarks;

  @NonNull
  public final TextView next;

  @NonNull
  public final UserDetailView receiverDetail;

  @NonNull
  public final TextView remarksIncorrect;

  @NonNull
  public final RadioButton scheduled;

  @NonNull
  public final UserDetailView senderDetail;

  @NonNull
  public final ScrollView topView;

  @NonNull
  public final TextView tvChooseTime;

  @NonNull
  public final TextView tvLabel;

  private ActivityLogisticDetailBinding(@NonNull RelativeLayout rootView, @NonNull RadioButton asap,
      @NonNull CardView cardTime, @NonNull RadioGroup deliveryTimeGroup,
      @NonNull EditText logisticsRemarks, @NonNull TextView next,
      @NonNull UserDetailView receiverDetail, @NonNull TextView remarksIncorrect,
      @NonNull RadioButton scheduled, @NonNull UserDetailView senderDetail,
      @NonNull ScrollView topView, @NonNull TextView tvChooseTime, @NonNull TextView tvLabel) {
    this.rootView = rootView;
    this.asap = asap;
    this.cardTime = cardTime;
    this.deliveryTimeGroup = deliveryTimeGroup;
    this.logisticsRemarks = logisticsRemarks;
    this.next = next;
    this.receiverDetail = receiverDetail;
    this.remarksIncorrect = remarksIncorrect;
    this.scheduled = scheduled;
    this.senderDetail = senderDetail;
    this.topView = topView;
    this.tvChooseTime = tvChooseTime;
    this.tvLabel = tvLabel;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLogisticDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLogisticDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_logistic_detail, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLogisticDetailBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.asap;
      RadioButton asap = rootView.findViewById(id);
      if (asap == null) {
        break missingId;
      }

      id = R.id.cardTime;
      CardView cardTime = rootView.findViewById(id);
      if (cardTime == null) {
        break missingId;
      }

      id = R.id.deliveryTimeGroup;
      RadioGroup deliveryTimeGroup = rootView.findViewById(id);
      if (deliveryTimeGroup == null) {
        break missingId;
      }

      id = R.id.logisticsRemarks;
      EditText logisticsRemarks = rootView.findViewById(id);
      if (logisticsRemarks == null) {
        break missingId;
      }

      id = R.id.next;
      TextView next = rootView.findViewById(id);
      if (next == null) {
        break missingId;
      }

      id = R.id.receiverDetail;
      UserDetailView receiverDetail = rootView.findViewById(id);
      if (receiverDetail == null) {
        break missingId;
      }

      id = R.id.remarksIncorrect;
      TextView remarksIncorrect = rootView.findViewById(id);
      if (remarksIncorrect == null) {
        break missingId;
      }

      id = R.id.scheduled;
      RadioButton scheduled = rootView.findViewById(id);
      if (scheduled == null) {
        break missingId;
      }

      id = R.id.senderDetail;
      UserDetailView senderDetail = rootView.findViewById(id);
      if (senderDetail == null) {
        break missingId;
      }

      id = R.id.topView;
      ScrollView topView = rootView.findViewById(id);
      if (topView == null) {
        break missingId;
      }

      id = R.id.tv_chooseTime;
      TextView tvChooseTime = rootView.findViewById(id);
      if (tvChooseTime == null) {
        break missingId;
      }

      id = R.id.tvLabel;
      TextView tvLabel = rootView.findViewById(id);
      if (tvLabel == null) {
        break missingId;
      }

      return new ActivityLogisticDetailBinding((RelativeLayout) rootView, asap, cardTime,
          deliveryTimeGroup, logisticsRemarks, next, receiverDetail, remarksIncorrect, scheduled,
          senderDetail, topView, tvChooseTime, tvLabel);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
