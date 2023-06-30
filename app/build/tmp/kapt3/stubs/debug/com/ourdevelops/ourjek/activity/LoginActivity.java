package com.ourdevelops.ourjek.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J0\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0014H\u0002J\u0010\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\"\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0015J\b\u0010$\u001a\u00020\u0012H\u0016J\u0012\u0010%\u001a\u00020\u00122\b\u0010&\u001a\u0004\u0018\u00010\'H\u0014J\u0010\u0010(\u001a\u00020\u00122\u0006\u0010)\u001a\u00020*H\u0007J\b\u0010+\u001a\u00020\u0012H\u0002J\b\u0010,\u001a\u00020\u0012H\u0014J\u0012\u0010-\u001a\u00020\u00122\b\u0010.\u001a\u0004\u0018\u00010/H\u0002J\b\u00100\u001a\u00020\u0012H\u0002J\b\u00101\u001a\u00020\u0012H\u0002J\b\u00102\u001a\u000203H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00064"}, d2 = {"Lcom/ourdevelops/ourjek/activity/LoginActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/ourdevelops/ourjek/databinding/ActivityLoginBinding;", "fbCallbackManager", "Lcom/facebook/CallbackManager;", "firebaseAuth", "Lcom/google/firebase/auth/FirebaseAuth;", "loginWithGoogleLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroidx/activity/result/IntentSenderRequest;", "kotlin.jvm.PlatformType", "oneTapClient", "Lcom/google/android/gms/auth/api/identity/SignInClient;", "signInRequest", "Lcom/google/android/gms/auth/api/identity/BeginSignInRequest;", "checkForEmail", "", "id", "", "email", "imageUrl", "fullName", "getUserProfileGoogle", "account", "Lcom/google/android/gms/auth/api/identity/SignInCredential;", "handleFacebookAccessToken", "token", "Lcom/facebook/AccessToken;", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onMessageEvent", "response", "Lcom/ourdevelops/ourjek/models/FirebaseToken;", "onSignInClick", "onStart", "saveUser", "user", "Lcom/ourdevelops/ourjek/models/User;", "signInWithFb", "signInWithGoogle", "validate", "", "app_debug"})
public final class LoginActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.ourdevelops.ourjek.databinding.ActivityLoginBinding binding;
    private com.google.android.gms.auth.api.identity.SignInClient oneTapClient;
    private com.google.android.gms.auth.api.identity.BeginSignInRequest signInRequest;
    private com.google.firebase.auth.FirebaseAuth firebaseAuth;
    private com.facebook.CallbackManager fbCallbackManager;
    private final androidx.activity.result.ActivityResultLauncher<androidx.activity.result.IntentSenderRequest> loginWithGoogleLauncher = null;
    private java.util.HashMap _$_findViewCache;
    
    public LoginActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    private final void signInWithGoogle() {
    }
    
    private final void signInWithFb() {
    }
    
    @android.annotation.SuppressLint(value = {"MissingSuperCall"})
    @java.lang.Override()
    @java.lang.Deprecated()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void handleFacebookAccessToken(com.facebook.AccessToken token) {
    }
    
    private final void checkForEmail(java.lang.String id, java.lang.String email, java.lang.String imageUrl, java.lang.String fullName) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    private final boolean validate() {
        return false;
    }
    
    private final void onSignInClick() {
    }
    
    private final void getUserProfileGoogle(com.google.android.gms.auth.api.identity.SignInCredential account) {
    }
    
    private final void saveUser(com.ourdevelops.ourjek.models.User user) {
    }
    
    @org.greenrobot.eventbus.Subscribe(sticky = true, threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    public final void onMessageEvent(@org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.models.FirebaseToken response) {
    }
}