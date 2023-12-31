// Generated by view binder compiler. Do not edit!
package com.ourdevelops.ourjek.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.ourdevelops.ourjek.R;
import customfonts.TextViewSFProDisplayMedium;
import customfonts.TextViewSFProDisplayRegular;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemChatOtherBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextViewSFProDisplayMedium datetxt;

  @NonNull
  public final TextViewSFProDisplayMedium messageseen;

  @NonNull
  public final TextViewSFProDisplayRegular msgtxt;

  private ItemChatOtherBinding(@NonNull RelativeLayout rootView,
      @NonNull TextViewSFProDisplayMedium datetxt, @NonNull TextViewSFProDisplayMedium messageseen,
      @NonNull TextViewSFProDisplayRegular msgtxt) {
    this.rootView = rootView;
    this.datetxt = datetxt;
    this.messageseen = messageseen;
    this.msgtxt = msgtxt;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemChatOtherBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemChatOtherBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_chat_other, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemChatOtherBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.datetxt;
      TextViewSFProDisplayMedium datetxt = rootView.findViewById(id);
      if (datetxt == null) {
        break missingId;
      }

      id = R.id.messageseen;
      TextViewSFProDisplayMedium messageseen = rootView.findViewById(id);
      if (messageseen == null) {
        break missingId;
      }

      id = R.id.msgtxt;
      TextViewSFProDisplayRegular msgtxt = rootView.findViewById(id);
      if (msgtxt == null) {
        break missingId;
      }

      return new ItemChatOtherBinding((RelativeLayout) rootView, datetxt, messageseen, msgtxt);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
