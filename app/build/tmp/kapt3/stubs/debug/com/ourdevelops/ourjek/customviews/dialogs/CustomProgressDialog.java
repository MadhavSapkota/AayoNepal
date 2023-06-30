package com.ourdevelops.ourjek.customviews.dialogs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007J&\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007J&\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\rH\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/ourdevelops/ourjek/customviews/dialogs/CustomProgressDialog;", "", "()V", "dialog", "Landroid/app/Dialog;", "dismissDialog", "", "showDialog", "message", "", "title", "context", "Landroid/app/Activity;", "Landroid/content/Context;", "app_debug"})
public final class CustomProgressDialog {
    @org.jetbrains.annotations.NotNull()
    public static final com.ourdevelops.ourjek.customviews.dialogs.CustomProgressDialog INSTANCE = null;
    private static android.app.Dialog dialog;
    
    private CustomProgressDialog() {
        super();
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void showDialog(@org.jetbrains.annotations.Nullable()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    android.content.Context context) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void showDialog(@org.jetbrains.annotations.Nullable()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    android.app.Activity context) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void dismissDialog() {
    }
}