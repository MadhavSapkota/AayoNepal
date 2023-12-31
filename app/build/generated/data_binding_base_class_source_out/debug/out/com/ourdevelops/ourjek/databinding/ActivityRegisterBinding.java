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
import androidx.viewbinding.ViewBinding;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.ourdevelops.ourjek.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityRegisterBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ImageView backBtn;

  @NonNull
  public final TextInputEditText cpassword;

  @NonNull
  public final TextInputLayout cpasswordtil;

  @NonNull
  public final ImageView editfoto;

  @NonNull
  public final TextInputEditText email;

  @NonNull
  public final TextInputLayout emailTil;

  @NonNull
  public final CircleImageView foto;

  @NonNull
  public final TextInputEditText nama;

  @NonNull
  public final TextInputLayout namaTil;

  @NonNull
  public final TextInputEditText password;

  @NonNull
  public final TextInputLayout passwordtil;

  @NonNull
  public final TextInputEditText phonenumber;

  @NonNull
  public final TextInputLayout phonenumberTil;

  @NonNull
  public final RelativeLayout register;

  @NonNull
  public final MaterialButton submit;

  @NonNull
  public final TextView tanggal;

  @NonNull
  public final TextView tanggalError;

  @NonNull
  public final RelativeLayout toolbar;

  private ActivityRegisterBinding(@NonNull RelativeLayout rootView, @NonNull ImageView backBtn,
      @NonNull TextInputEditText cpassword, @NonNull TextInputLayout cpasswordtil,
      @NonNull ImageView editfoto, @NonNull TextInputEditText email,
      @NonNull TextInputLayout emailTil, @NonNull CircleImageView foto,
      @NonNull TextInputEditText nama, @NonNull TextInputLayout namaTil,
      @NonNull TextInputEditText password, @NonNull TextInputLayout passwordtil,
      @NonNull TextInputEditText phonenumber, @NonNull TextInputLayout phonenumberTil,
      @NonNull RelativeLayout register, @NonNull MaterialButton submit, @NonNull TextView tanggal,
      @NonNull TextView tanggalError, @NonNull RelativeLayout toolbar) {
    this.rootView = rootView;
    this.backBtn = backBtn;
    this.cpassword = cpassword;
    this.cpasswordtil = cpasswordtil;
    this.editfoto = editfoto;
    this.email = email;
    this.emailTil = emailTil;
    this.foto = foto;
    this.nama = nama;
    this.namaTil = namaTil;
    this.password = password;
    this.passwordtil = passwordtil;
    this.phonenumber = phonenumber;
    this.phonenumberTil = phonenumberTil;
    this.register = register;
    this.submit = submit;
    this.tanggal = tanggal;
    this.tanggalError = tanggalError;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_register, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRegisterBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.back_btn;
      ImageView backBtn = rootView.findViewById(id);
      if (backBtn == null) {
        break missingId;
      }

      id = R.id.cpassword;
      TextInputEditText cpassword = rootView.findViewById(id);
      if (cpassword == null) {
        break missingId;
      }

      id = R.id.cpasswordtil;
      TextInputLayout cpasswordtil = rootView.findViewById(id);
      if (cpasswordtil == null) {
        break missingId;
      }

      id = R.id.editfoto;
      ImageView editfoto = rootView.findViewById(id);
      if (editfoto == null) {
        break missingId;
      }

      id = R.id.email;
      TextInputEditText email = rootView.findViewById(id);
      if (email == null) {
        break missingId;
      }

      id = R.id.emailTil;
      TextInputLayout emailTil = rootView.findViewById(id);
      if (emailTil == null) {
        break missingId;
      }

      id = R.id.foto;
      CircleImageView foto = rootView.findViewById(id);
      if (foto == null) {
        break missingId;
      }

      id = R.id.nama;
      TextInputEditText nama = rootView.findViewById(id);
      if (nama == null) {
        break missingId;
      }

      id = R.id.namaTil;
      TextInputLayout namaTil = rootView.findViewById(id);
      if (namaTil == null) {
        break missingId;
      }

      id = R.id.password;
      TextInputEditText password = rootView.findViewById(id);
      if (password == null) {
        break missingId;
      }

      id = R.id.passwordtil;
      TextInputLayout passwordtil = rootView.findViewById(id);
      if (passwordtil == null) {
        break missingId;
      }

      id = R.id.phonenumber;
      TextInputEditText phonenumber = rootView.findViewById(id);
      if (phonenumber == null) {
        break missingId;
      }

      id = R.id.phonenumberTil;
      TextInputLayout phonenumberTil = rootView.findViewById(id);
      if (phonenumberTil == null) {
        break missingId;
      }

      RelativeLayout register = (RelativeLayout) rootView;

      id = R.id.submit;
      MaterialButton submit = rootView.findViewById(id);
      if (submit == null) {
        break missingId;
      }

      id = R.id.tanggal;
      TextView tanggal = rootView.findViewById(id);
      if (tanggal == null) {
        break missingId;
      }

      id = R.id.tanggalError;
      TextView tanggalError = rootView.findViewById(id);
      if (tanggalError == null) {
        break missingId;
      }

      id = R.id.toolbar;
      RelativeLayout toolbar = rootView.findViewById(id);
      if (toolbar == null) {
        break missingId;
      }

      return new ActivityRegisterBinding((RelativeLayout) rootView, backBtn, cpassword,
          cpasswordtil, editfoto, email, emailTil, foto, nama, namaTil, password, passwordtil,
          phonenumber, phonenumberTil, register, submit, tanggal, tanggalError, toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
