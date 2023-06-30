// Generated by view binder compiler. Do not edit!
package com.ourdevelops.ourjek.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import com.ourdevelops.ourjek.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class CustomDialogboxYesnoBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView btnNegative;

  @NonNull
  public final LinearLayout btnNo;

  @NonNull
  public final TextView btnPositive;

  @NonNull
  public final LinearLayout btnYes;

  @NonNull
  public final CardView cardErrorDialog;

  @NonNull
  public final TextView tvDialogMessage;

  @NonNull
  public final TextView tvDialogTitle;

  private CustomDialogboxYesnoBinding(@NonNull RelativeLayout rootView,
      @NonNull TextView btnNegative, @NonNull LinearLayout btnNo, @NonNull TextView btnPositive,
      @NonNull LinearLayout btnYes, @NonNull CardView cardErrorDialog,
      @NonNull TextView tvDialogMessage, @NonNull TextView tvDialogTitle) {
    this.rootView = rootView;
    this.btnNegative = btnNegative;
    this.btnNo = btnNo;
    this.btnPositive = btnPositive;
    this.btnYes = btnYes;
    this.cardErrorDialog = cardErrorDialog;
    this.tvDialogMessage = tvDialogMessage;
    this.tvDialogTitle = tvDialogTitle;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static CustomDialogboxYesnoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CustomDialogboxYesnoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.custom_dialogbox_yesno, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CustomDialogboxYesnoBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_negative;
      TextView btnNegative = rootView.findViewById(id);
      if (btnNegative == null) {
        break missingId;
      }

      id = R.id.btn_no;
      LinearLayout btnNo = rootView.findViewById(id);
      if (btnNo == null) {
        break missingId;
      }

      id = R.id.btn_positive;
      TextView btnPositive = rootView.findViewById(id);
      if (btnPositive == null) {
        break missingId;
      }

      id = R.id.btn_yes;
      LinearLayout btnYes = rootView.findViewById(id);
      if (btnYes == null) {
        break missingId;
      }

      id = R.id.card_error_dialog;
      CardView cardErrorDialog = rootView.findViewById(id);
      if (cardErrorDialog == null) {
        break missingId;
      }

      id = R.id.tv_dialog_message;
      TextView tvDialogMessage = rootView.findViewById(id);
      if (tvDialogMessage == null) {
        break missingId;
      }

      id = R.id.tv_dialog_title;
      TextView tvDialogTitle = rootView.findViewById(id);
      if (tvDialogTitle == null) {
        break missingId;
      }

      return new CustomDialogboxYesnoBinding((RelativeLayout) rootView, btnNegative, btnNo,
          btnPositive, btnYes, cardErrorDialog, tvDialogMessage, tvDialogTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
