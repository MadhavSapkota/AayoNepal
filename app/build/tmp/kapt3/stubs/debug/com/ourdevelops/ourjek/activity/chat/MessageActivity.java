package com.ourdevelops.ourjek.activity.chat;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J\b\u0010\u001c\u001a\u00020\u0019H\u0002J\b\u0010\u001d\u001a\u00020\u0019H\u0002J\b\u0010\u001e\u001a\u00020\u0019H\u0014J\b\u0010\u001f\u001a\u00020\u0019H\u0014J\b\u0010 \u001a\u00020\u0019H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/ourdevelops/ourjek/activity/chat/MessageActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/ourdevelops/ourjek/databinding/ActivityMessageBinding;", "inboxArraylist", "Ljava/util/ArrayList;", "Lcom/ourdevelops/ourjek/models/MessageModels;", "inboxItem", "Lcom/ourdevelops/ourjek/item/MessageItem;", "inboxQuery", "Lcom/google/firebase/database/Query;", "loginUser", "Lcom/ourdevelops/ourjek/models/User;", "getLoginUser", "()Lcom/ourdevelops/ourjek/models/User;", "setLoginUser", "(Lcom/ourdevelops/ourjek/models/User;)V", "rootRef", "Lcom/google/firebase/database/DatabaseReference;", "valueEventListener", "Lcom/google/firebase/database/ValueEventListener;", "checkReadStoragepermission", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onHideProgress", "onShowProgress", "onStart", "onStop", "setUpViews", "app_debug"})
public final class MessageActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.ourdevelops.ourjek.databinding.ActivityMessageBinding binding;
    private java.util.ArrayList<com.ourdevelops.ourjek.models.MessageModels> inboxArraylist;
    private com.google.firebase.database.DatabaseReference rootRef;
    public com.ourdevelops.ourjek.models.User loginUser;
    private com.ourdevelops.ourjek.item.MessageItem inboxItem;
    private com.google.firebase.database.Query inboxQuery;
    private com.google.firebase.database.ValueEventListener valueEventListener;
    private java.util.HashMap _$_findViewCache;
    
    public MessageActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ourdevelops.ourjek.models.User getLoginUser() {
        return null;
    }
    
    public final void setLoginUser(@org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.models.User p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setUpViews() {
    }
    
    private final void onShowProgress() {
    }
    
    private final void onHideProgress() {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    private final boolean checkReadStoragepermission() {
        return false;
    }
}