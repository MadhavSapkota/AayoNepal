// Generated by view binder compiler. Do not edit!
package com.ourdevelops.ourjek.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.ourdevelops.ourjek.R;
import customfonts.TextViewSFProDisplayMedium;
import customfonts.TextViewSFProDisplayRegular;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemChatAudioOtherBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final LinearLayout audiobubble;

  @NonNull
  public final TextViewSFProDisplayMedium datetxt;

  @NonNull
  public final TextViewSFProDisplayMedium messageseen;

  @NonNull
  public final ImageView notsend;

  @NonNull
  public final ImageView playbtn;

  @NonNull
  public final ProgressBar progress;

  @NonNull
  public final SeekBar seekbar;

  @NonNull
  public final TextViewSFProDisplayRegular totaltime;

  private ItemChatAudioOtherBinding(@NonNull RelativeLayout rootView,
      @NonNull LinearLayout audiobubble, @NonNull TextViewSFProDisplayMedium datetxt,
      @NonNull TextViewSFProDisplayMedium messageseen, @NonNull ImageView notsend,
      @NonNull ImageView playbtn, @NonNull ProgressBar progress, @NonNull SeekBar seekbar,
      @NonNull TextViewSFProDisplayRegular totaltime) {
    this.rootView = rootView;
    this.audiobubble = audiobubble;
    this.datetxt = datetxt;
    this.messageseen = messageseen;
    this.notsend = notsend;
    this.playbtn = playbtn;
    this.progress = progress;
    this.seekbar = seekbar;
    this.totaltime = totaltime;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemChatAudioOtherBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemChatAudioOtherBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_chat_audio_other, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemChatAudioOtherBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.audiobubble;
      LinearLayout audiobubble = rootView.findViewById(id);
      if (audiobubble == null) {
        break missingId;
      }

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

      id = R.id.notsend;
      ImageView notsend = rootView.findViewById(id);
      if (notsend == null) {
        break missingId;
      }

      id = R.id.playbtn;
      ImageView playbtn = rootView.findViewById(id);
      if (playbtn == null) {
        break missingId;
      }

      id = R.id.progress;
      ProgressBar progress = rootView.findViewById(id);
      if (progress == null) {
        break missingId;
      }

      id = R.id.seekbar;
      SeekBar seekbar = rootView.findViewById(id);
      if (seekbar == null) {
        break missingId;
      }

      id = R.id.totaltime;
      TextViewSFProDisplayRegular totaltime = rootView.findViewById(id);
      if (totaltime == null) {
        break missingId;
      }

      return new ItemChatAudioOtherBinding((RelativeLayout) rootView, audiobubble, datetxt,
          messageseen, notsend, playbtn, progress, seekbar, totaltime);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
