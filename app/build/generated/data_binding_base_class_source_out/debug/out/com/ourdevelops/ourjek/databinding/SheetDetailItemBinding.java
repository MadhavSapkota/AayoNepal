// Generated by view binder compiler. Do not edit!
package com.ourdevelops.ourjek.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.ourdevelops.ourjek.R;
import customfonts.EditTextSFProDisplayRegular;
import customfonts.TextViewSFProDisplayMedium;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class SheetDetailItemBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextViewSFProDisplayMedium addQuantity;

  @NonNull
  public final Button btnAddCart;

  @NonNull
  public final Button btnCancel;

  @NonNull
  public final EditTextSFProDisplayRegular catatan;

  @NonNull
  public final WebView content;

  @NonNull
  public final TextViewSFProDisplayMedium harga;

  @NonNull
  public final TextViewSFProDisplayMedium hargapromo;

  @NonNull
  public final RelativeLayout lladdremove;

  @NonNull
  public final TextViewSFProDisplayMedium quantityText;

  @NonNull
  public final TextViewSFProDisplayMedium removeQuantity;

  @NonNull
  public final TextViewSFProDisplayMedium title;

  @NonNull
  public final View view;

  private SheetDetailItemBinding(@NonNull RelativeLayout rootView,
      @NonNull TextViewSFProDisplayMedium addQuantity, @NonNull Button btnAddCart,
      @NonNull Button btnCancel, @NonNull EditTextSFProDisplayRegular catatan,
      @NonNull WebView content, @NonNull TextViewSFProDisplayMedium harga,
      @NonNull TextViewSFProDisplayMedium hargapromo, @NonNull RelativeLayout lladdremove,
      @NonNull TextViewSFProDisplayMedium quantityText,
      @NonNull TextViewSFProDisplayMedium removeQuantity, @NonNull TextViewSFProDisplayMedium title,
      @NonNull View view) {
    this.rootView = rootView;
    this.addQuantity = addQuantity;
    this.btnAddCart = btnAddCart;
    this.btnCancel = btnCancel;
    this.catatan = catatan;
    this.content = content;
    this.harga = harga;
    this.hargapromo = hargapromo;
    this.lladdremove = lladdremove;
    this.quantityText = quantityText;
    this.removeQuantity = removeQuantity;
    this.title = title;
    this.view = view;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static SheetDetailItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static SheetDetailItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.sheet_detail_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static SheetDetailItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.add_quantity;
      TextViewSFProDisplayMedium addQuantity = rootView.findViewById(id);
      if (addQuantity == null) {
        break missingId;
      }

      id = R.id.btn_add_cart;
      Button btnAddCart = rootView.findViewById(id);
      if (btnAddCart == null) {
        break missingId;
      }

      id = R.id.btn_cancel;
      Button btnCancel = rootView.findViewById(id);
      if (btnCancel == null) {
        break missingId;
      }

      id = R.id.catatan;
      EditTextSFProDisplayRegular catatan = rootView.findViewById(id);
      if (catatan == null) {
        break missingId;
      }

      id = R.id.content;
      WebView content = rootView.findViewById(id);
      if (content == null) {
        break missingId;
      }

      id = R.id.harga;
      TextViewSFProDisplayMedium harga = rootView.findViewById(id);
      if (harga == null) {
        break missingId;
      }

      id = R.id.hargapromo;
      TextViewSFProDisplayMedium hargapromo = rootView.findViewById(id);
      if (hargapromo == null) {
        break missingId;
      }

      id = R.id.lladdremove;
      RelativeLayout lladdremove = rootView.findViewById(id);
      if (lladdremove == null) {
        break missingId;
      }

      id = R.id.quantity_text;
      TextViewSFProDisplayMedium quantityText = rootView.findViewById(id);
      if (quantityText == null) {
        break missingId;
      }

      id = R.id.remove_quantity;
      TextViewSFProDisplayMedium removeQuantity = rootView.findViewById(id);
      if (removeQuantity == null) {
        break missingId;
      }

      id = R.id.title;
      TextViewSFProDisplayMedium title = rootView.findViewById(id);
      if (title == null) {
        break missingId;
      }

      id = R.id.view;
      View view = rootView.findViewById(id);
      if (view == null) {
        break missingId;
      }

      return new SheetDetailItemBinding((RelativeLayout) rootView, addQuantity, btnAddCart,
          btnCancel, catatan, content, harga, hargapromo, lladdremove, quantityText, removeQuantity,
          title, view);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
