package com.ourdevelops.ourjek.models.profile;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bB\u0005\u00a2\u0006\u0002\u0010\fR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u0004\u00a8\u0006\u001d"}, d2 = {"Lcom/ourdevelops/ourjek/models/profile/ProfileObject;", "", "viewType", "Lcom/ourdevelops/ourjek/models/profile/ProfileViewType;", "(Lcom/ourdevelops/ourjek/models/profile/ProfileViewType;)V", "title", "", "image", "", "showArrowAtEnd", "", "(Lcom/ourdevelops/ourjek/models/profile/ProfileViewType;Ljava/lang/String;IZ)V", "()V", "getImage", "()Ljava/lang/Integer;", "setImage", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getShowArrowAtEnd", "()Z", "setShowArrowAtEnd", "(Z)V", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "getViewType", "()Lcom/ourdevelops/ourjek/models/profile/ProfileViewType;", "setViewType", "app_debug"})
public final class ProfileObject {
    @org.jetbrains.annotations.NotNull()
    private com.ourdevelops.ourjek.models.profile.ProfileViewType viewType = com.ourdevelops.ourjek.models.profile.ProfileViewType.head;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String title;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer image;
    private boolean showArrowAtEnd = false;
    
    public ProfileObject() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ourdevelops.ourjek.models.profile.ProfileViewType getViewType() {
        return null;
    }
    
    public final void setViewType(@org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.models.profile.ProfileViewType p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getImage() {
        return null;
    }
    
    public final void setImage(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    public final boolean getShowArrowAtEnd() {
        return false;
    }
    
    public final void setShowArrowAtEnd(boolean p0) {
    }
    
    public ProfileObject(@org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.models.profile.ProfileViewType viewType) {
        super();
    }
    
    public ProfileObject(@org.jetbrains.annotations.NotNull()
    com.ourdevelops.ourjek.models.profile.ProfileViewType viewType, @org.jetbrains.annotations.NotNull()
    java.lang.String title, int image, boolean showArrowAtEnd) {
        super();
    }
}