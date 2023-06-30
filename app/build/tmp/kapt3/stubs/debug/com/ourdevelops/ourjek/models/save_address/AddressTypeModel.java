package com.ourdevelops.ourjek.models.save_address;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\u0018\u00002\u00020\u0001B/\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\nB\u0005\u00a2\u0006\u0002\u0010\u000bR\u001a\u0010\f\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0015\"\u0004\b!\u0010\u0017R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u000e\"\u0004\b#\u0010\u0010\u00a8\u0006$"}, d2 = {"Lcom/ourdevelops/ourjek/models/save_address/AddressTypeModel;", "", "image", "", "title", "", "isSelected", "", "enableUserToAddName", "id", "(ILjava/lang/String;ZZI)V", "()V", "additionalInfo", "getAdditionalInfo", "()Ljava/lang/String;", "setAdditionalInfo", "(Ljava/lang/String;)V", "alternateName", "getAlternateName", "setAlternateName", "getEnableUserToAddName", "()Z", "setEnableUserToAddName", "(Z)V", "getId", "()I", "setId", "(I)V", "getImage", "()Ljava/lang/Integer;", "setImage", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "setSelected", "getTitle", "setTitle", "app_debug"})
public final class AddressTypeModel {
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer image = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String title = "";
    private boolean isSelected = false;
    private boolean enableUserToAddName = false;
    private int id = 0;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String alternateName = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String additionalInfo = "";
    
    public AddressTypeModel() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getImage() {
        return null;
    }
    
    public final void setImage(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final boolean isSelected() {
        return false;
    }
    
    public final void setSelected(boolean p0) {
    }
    
    public final boolean getEnableUserToAddName() {
        return false;
    }
    
    public final void setEnableUserToAddName(boolean p0) {
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAlternateName() {
        return null;
    }
    
    public final void setAlternateName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAdditionalInfo() {
        return null;
    }
    
    public final void setAdditionalInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public AddressTypeModel(int image, @org.jetbrains.annotations.NotNull()
    java.lang.String title, boolean isSelected, boolean enableUserToAddName, int id) {
        super();
    }
}