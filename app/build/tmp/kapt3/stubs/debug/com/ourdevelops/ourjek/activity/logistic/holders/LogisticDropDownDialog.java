package com.ourdevelops.ourjek.activity.logistic.holders;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0014B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J(\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u0010H\u0002J.\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u00102\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/ourdevelops/ourjek/activity/logistic/holders/LogisticDropDownDialog;", "", "()V", "binding", "Lcom/ourdevelops/ourjek/databinding/LogisticDropDownDialogBinding;", "dialog", "Landroid/app/Dialog;", "position", "", "setUpSpinner", "", "context", "Landroid/content/Context;", "mList", "Ljava/util/ArrayList;", "Lcom/ourdevelops/ourjek/activity/logistic/data/LogisticWeightModel;", "Lkotlin/collections/ArrayList;", "showDialog", "callback", "Lcom/ourdevelops/ourjek/activity/logistic/holders/LogisticDropDownDialog$DialogButtonClick;", "DialogButtonClick", "app_debug"})
public final class LogisticDropDownDialog {
    @org.jetbrains.annotations.NotNull()
    public static final com.ourdevelops.ourjek.activity.logistic.holders.LogisticDropDownDialog INSTANCE = null;
    private static android.app.Dialog dialog;
    private static com.ourdevelops.ourjek.databinding.LogisticDropDownDialogBinding binding;
    private static int position = 0;
    
    private LogisticDropDownDialog() {
        super();
    }
    
    public final void showDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.ourdevelops.ourjek.activity.logistic.data.LogisticWeightModel> mList, @org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.activity.logistic.holders.LogisticDropDownDialog.DialogButtonClick callback) {
    }
    
    private final void setUpSpinner(android.content.Context context, java.util.ArrayList<com.ourdevelops.ourjek.activity.logistic.data.LogisticWeightModel> mList) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/ourdevelops/ourjek/activity/logistic/holders/LogisticDropDownDialog$DialogButtonClick;", "", "onConfirm", "", "position", "", "app_debug"})
    public static abstract interface DialogButtonClick {
        
        public abstract void onConfirm(int position);
    }
}