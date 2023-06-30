package com.ourdevelops.ourjek.customviews.dialogs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0016B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0004J\u0016\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/ourdevelops/ourjek/customviews/dialogs/CustomDialogYesNo;", "", "()V", "btn_text_no", "", "btn_text_yes", "dialog", "Landroid/app/Dialog;", "message", "title", "dismiss", "", "setBtnTextNo", "text", "setBtnTextYes", "setMessage", "setTitle", "showYesNoDialog", "activity", "Landroid/app/Activity;", "callBack", "Lcom/ourdevelops/ourjek/customviews/dialogs/CustomDialogYesNo$dialogOnClickListener;", "dialogOnClickListener", "app_debug"})
public final class CustomDialogYesNo {
    private android.app.Dialog dialog;
    private java.lang.String title = "";
    private java.lang.String message = "";
    private java.lang.String btn_text_yes = "";
    private java.lang.String btn_text_no = "";
    
    public CustomDialogYesNo() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ourdevelops.ourjek.customviews.dialogs.CustomDialogYesNo setTitle(@org.jetbrains.annotations.Nullable()
    java.lang.String title) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ourdevelops.ourjek.customviews.dialogs.CustomDialogYesNo setMessage(@org.jetbrains.annotations.Nullable()
    java.lang.String message) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ourdevelops.ourjek.customviews.dialogs.CustomDialogYesNo setBtnTextYes(@org.jetbrains.annotations.Nullable()
    java.lang.String text) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ourdevelops.ourjek.customviews.dialogs.CustomDialogYesNo setBtnTextNo(@org.jetbrains.annotations.Nullable()
    java.lang.String text) {
        return null;
    }
    
    public final void showYesNoDialog(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.customviews.dialogs.CustomDialogYesNo.dialogOnClickListener callBack) {
    }
    
    public final void dismiss() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lcom/ourdevelops/ourjek/customviews/dialogs/CustomDialogYesNo$dialogOnClickListener;", "", "onClick", "", "onClose", "app_debug"})
    public static abstract interface dialogOnClickListener {
        
        public abstract void onClick();
        
        public abstract void onClose();
    }
}