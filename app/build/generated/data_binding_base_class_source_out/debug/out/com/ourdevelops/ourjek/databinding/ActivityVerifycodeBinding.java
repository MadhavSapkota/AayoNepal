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
import androidx.appcompat.widget.AppCompatEditText;
import androidx.viewbinding.ViewBinding;
import com.ourdevelops.ourjek.R;
import customfonts.TextViewSFProDisplayRegular;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityVerifycodeBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ImageView backBtnVerify;

  @NonNull
  public final AppCompatEditText five;

  @NonNull
  public final AppCompatEditText four;

  @NonNull
  public final TextView number;

  @NonNull
  public final AppCompatEditText one;

  @NonNull
  public final TextView resendCode;

  @NonNull
  public final TextView resendCodeIn;

  @NonNull
  public final RelativeLayout rlnotif2;

  @NonNull
  public final AppCompatEditText six;

  @NonNull
  public final TextViewSFProDisplayRegular textnotif2;

  @NonNull
  public final AppCompatEditText three;

  @NonNull
  public final RelativeLayout toolbar;

  @NonNull
  public final AppCompatEditText two;

  private ActivityVerifycodeBinding(@NonNull RelativeLayout rootView,
      @NonNull ImageView backBtnVerify, @NonNull AppCompatEditText five,
      @NonNull AppCompatEditText four, @NonNull TextView number, @NonNull AppCompatEditText one,
      @NonNull TextView resendCode, @NonNull TextView resendCodeIn,
      @NonNull RelativeLayout rlnotif2, @NonNull AppCompatEditText six,
      @NonNull TextViewSFProDisplayRegular textnotif2, @NonNull AppCompatEditText three,
      @NonNull RelativeLayout toolbar, @NonNull AppCompatEditText two) {
    this.rootView = rootView;
    this.backBtnVerify = backBtnVerify;
    this.five = five;
    this.four = four;
    this.number = number;
    this.one = one;
    this.resendCode = resendCode;
    this.resendCodeIn = resendCodeIn;
    this.rlnotif2 = rlnotif2;
    this.six = six;
    this.textnotif2 = textnotif2;
    this.three = three;
    this.toolbar = toolbar;
    this.two = two;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityVerifycodeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityVerifycodeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_verifycode, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityVerifycodeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.back_btn_verify;
      ImageView backBtnVerify = rootView.findViewById(id);
      if (backBtnVerify == null) {
        break missingId;
      }

      id = R.id.five;
      AppCompatEditText five = rootView.findViewById(id);
      if (five == null) {
        break missingId;
      }

      id = R.id.four;
      AppCompatEditText four = rootView.findViewById(id);
      if (four == null) {
        break missingId;
      }

      id = R.id.number;
      TextView number = rootView.findViewById(id);
      if (number == null) {
        break missingId;
      }

      id = R.id.one;
      AppCompatEditText one = rootView.findViewById(id);
      if (one == null) {
        break missingId;
      }

      id = R.id.resendCode;
      TextView resendCode = rootView.findViewById(id);
      if (resendCode == null) {
        break missingId;
      }

      id = R.id.resendCodeIn;
      TextView resendCodeIn = rootView.findViewById(id);
      if (resendCodeIn == null) {
        break missingId;
      }

      id = R.id.rlnotif2;
      RelativeLayout rlnotif2 = rootView.findViewById(id);
      if (rlnotif2 == null) {
        break missingId;
      }

      id = R.id.six;
      AppCompatEditText six = rootView.findViewById(id);
      if (six == null) {
        break missingId;
      }

      id = R.id.textnotif2;
      TextViewSFProDisplayRegular textnotif2 = rootView.findViewById(id);
      if (textnotif2 == null) {
        break missingId;
      }

      id = R.id.three;
      AppCompatEditText three = rootView.findViewById(id);
      if (three == null) {
        break missingId;
      }

      id = R.id.toolbar;
      RelativeLayout toolbar = rootView.findViewById(id);
      if (toolbar == null) {
        break missingId;
      }

      id = R.id.two;
      AppCompatEditText two = rootView.findViewById(id);
      if (two == null) {
        break missingId;
      }

      return new ActivityVerifycodeBinding((RelativeLayout) rootView, backBtnVerify, five, four,
          number, one, resendCode, resendCodeIn, rlnotif2, six, textnotif2, three, toolbar, two);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
