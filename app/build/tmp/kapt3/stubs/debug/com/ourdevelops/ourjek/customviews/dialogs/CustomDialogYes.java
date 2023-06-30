package com.ourdevelops.ourjek.customviews.dialogs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0007J\u0012\u0010\u000b\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0007J\u0012\u0010\f\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0007J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/ourdevelops/ourjek/customviews/dialogs/CustomDialogYes;", "", "()V", "btn_text", "", "dialog", "Landroid/app/Dialog;", "message", "title", "setBtnText", "text", "setMessage", "setTitle", "showYesDialog", "", "activity", "Landroid/app/Activity;", "callBack", "Lcom/ourdevelops/ourjek/customviews/dialogs/CustomDialogYes$dialogOnClickListener;", "dialogOnClickListener", "app_debug"})
public final class CustomDialogYes {
    @org.jetbrains.annotations.NotNull()
    public static final com.ourdevelops.ourjek.customviews.dialogs.CustomDialogYes INSTANCE = null;
    private static android.app.Dialog dialog;
    private static java.lang.String title = "";
    private static java.lang.String message = "";
    private static java.lang.String btn_text = "";
    
    private CustomDialogYes() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final com.ourdevelops.ourjek.customviews.dialogs.CustomDialogYes setTitle(@org.jetbrains.annotations.Nullable()
    java.lang.String title) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final com.ourdevelops.ourjek.customviews.dialogs.CustomDialogYes setMessage(@org.jetbrains.annotations.Nullable()
    java.lang.String message) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final com.ourdevelops.ourjek.customviews.dialogs.CustomDialogYes setBtnText(@org.jetbrains.annotations.Nullable()
    java.lang.String text) {
        return null;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void showYesDialog(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.customviews.dialogs.CustomDialogYes.dialogOnClickListener callBack) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lcom/ourdevelops/ourjek/customviews/dialogs/CustomDialogYes$dialogOnClickListener;", "", "onClick", "", "onClose", "app_debug"})
    public static abstract interface dialogOnClickListener {
        
        public abstract void onClick();
        
        public abstract void onClose();
    }
}