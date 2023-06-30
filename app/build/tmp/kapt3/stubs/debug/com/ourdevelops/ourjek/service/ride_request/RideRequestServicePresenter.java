package com.ourdevelops.ourjek.service.ride_request;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\u0002\u0010\u000bJ\u0006\u0010\u001f\u001a\u00020 J\u0006\u0010!\u001a\u00020 J\b\u0010\"\u001a\u00020\u001aH\u0002J\u0006\u0010#\u001a\u00020 J\u0006\u0010$\u001a\u00020 J\u0010\u0010%\u001a\u00020 2\b\u0010&\u001a\u0004\u0018\u00010\'J\u001a\u0010(\u001a\u00020 2\b\u0010&\u001a\u0004\u0018\u00010\'2\b\u0010)\u001a\u0004\u0018\u00010*J\u0010\u0010+\u001a\u00020 2\b\u0010&\u001a\u0004\u0018\u00010\'J\u0010\u0010,\u001a\u00020 2\b\u0010&\u001a\u0004\u0018\u00010\'J\u0010\u0010-\u001a\u00020 2\b\u0010&\u001a\u0004\u0018\u00010\'J\u001a\u0010.\u001a\u00020 2\b\u0010&\u001a\u0004\u0018\u00010\'2\b\u0010)\u001a\u0004\u0018\u00010*J\u0010\u0010/\u001a\u00020 2\b\u0010&\u001a\u0004\u0018\u00010\'J\b\u00100\u001a\u00020 H\u0016J\u0010\u00101\u001a\u00020 2\u0006\u00102\u001a\u00020\'H\u0002J\u0010\u00103\u001a\u00020 2\u0006\u00104\u001a\u000205H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n \u0016*\u0004\u0018\u00010\u00150\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e\u00a8\u00066"}, d2 = {"Lcom/ourdevelops/ourjek/service/ride_request/RideRequestServicePresenter;", "Lcom/ourdevelops/ourjek/service/ride_request/RideReqeustServiceContractor$Presenter;", "context", "Landroid/content/Context;", "view", "Lcom/ourdevelops/ourjek/service/ride_request/RideReqeustServiceContractor$View;", "initTripDetail", "Lcom/ourdevelops/ourjek/models/TransaksiModel;", "initRiderList", "Ljava/util/ArrayList;", "Lcom/ourdevelops/ourjek/models/DriverModel;", "(Landroid/content/Context;Lcom/ourdevelops/ourjek/service/ride_request/RideReqeustServiceContractor$View;Lcom/ourdevelops/ourjek/models/TransaksiModel;Ljava/util/ArrayList;)V", "getContext", "()Landroid/content/Context;", "currentIndex", "", "getInitRiderList", "()Ljava/util/ArrayList;", "setInitRiderList", "(Ljava/util/ArrayList;)V", "loggedInUser", "Lcom/ourdevelops/ourjek/models/User;", "kotlin.jvm.PlatformType", "notificationData", "Lcom/ourdevelops/ourjek/json/ride_request/DriverRequestBody;", "requestOnProgress", "", "timer", "Landroid/os/CountDownTimer;", "getView", "()Lcom/ourdevelops/ourjek/service/ride_request/RideReqeustServiceContractor$View;", "cancelRideServer", "", "cancelRiderSearch", "checkIfCurrentIndexValid", "checkRiderToRequest", "createNotificationBody", "moveCurrentDriverToLastIndex", "token", "", "onDriverAccepted", "riderDetail", "Lcom/ourdevelops/ourjek/models/ride_request/EnglishDriverModel;", "onDriverAcknowledgedRequest", "onDriverCancelled", "onDriverRejected", "onHardDriveraAccept", "onRideFinished", "searchAgain", "sendNotification", "rideRequestType", "startTimer", "expireTime", "", "app_debug"})
public final class RideRequestServicePresenter implements com.ourdevelops.ourjek.service.ride_request.RideReqeustServiceContractor.Presenter {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final com.ourdevelops.ourjek.service.ride_request.RideReqeustServiceContractor.View view = null;
    private com.ourdevelops.ourjek.models.TransaksiModel initTripDetail;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.ourdevelops.ourjek.models.DriverModel> initRiderList;
    private int currentIndex = 0;
    private final com.ourdevelops.ourjek.json.ride_request.DriverRequestBody notificationData = null;
    private android.os.CountDownTimer timer;
    private final com.ourdevelops.ourjek.models.User loggedInUser = null;
    private boolean requestOnProgress = false;
    
    public RideRequestServicePresenter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.service.ride_request.RideReqeustServiceContractor.View view, @org.jetbrains.annotations.Nullable()
    com.ourdevelops.ourjek.models.TransaksiModel initTripDetail, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.ourdevelops.ourjek.models.DriverModel> initRiderList) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ourdevelops.ourjek.service.ride_request.RideReqeustServiceContractor.View getView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.ourdevelops.ourjek.models.DriverModel> getInitRiderList() {
        return null;
    }
    
    public final void setInitRiderList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.ourdevelops.ourjek.models.DriverModel> p0) {
    }
    
    @java.lang.Override()
    public void searchAgain() {
    }
    
    public final void createNotificationBody() {
    }
    
    public final void checkRiderToRequest() {
    }
    
    public final void onDriverAcknowledgedRequest(@org.jetbrains.annotations.Nullable()
    java.lang.String token) {
    }
    
    public final void onDriverAccepted(@org.jetbrains.annotations.Nullable()
    java.lang.String token, @org.jetbrains.annotations.Nullable()
    com.ourdevelops.ourjek.models.ride_request.EnglishDriverModel riderDetail) {
    }
    
    public final void onHardDriveraAccept(@org.jetbrains.annotations.Nullable()
    java.lang.String token, @org.jetbrains.annotations.Nullable()
    com.ourdevelops.ourjek.models.ride_request.EnglishDriverModel riderDetail) {
    }
    
    private final boolean checkIfCurrentIndexValid() {
        return false;
    }
    
    public final void onDriverRejected(@org.jetbrains.annotations.Nullable()
    java.lang.String token) {
    }
    
    public final void onDriverCancelled(@org.jetbrains.annotations.Nullable()
    java.lang.String token) {
    }
    
    public final void cancelRiderSearch() {
    }
    
    public final void cancelRideServer() {
    }
    
    private final void startTimer(long expireTime) {
    }
    
    private final void sendNotification(java.lang.String rideRequestType) {
    }
    
    public final void onRideFinished(@org.jetbrains.annotations.Nullable()
    java.lang.String token) {
    }
    
    public final void moveCurrentDriverToLastIndex(@org.jetbrains.annotations.Nullable()
    java.lang.String token) {
    }
}