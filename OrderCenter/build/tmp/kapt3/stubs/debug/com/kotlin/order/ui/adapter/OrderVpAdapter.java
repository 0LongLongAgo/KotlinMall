package com.kotlin.order.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\fH\u0016R\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\n\u00a8\u0006\u0012"}, d2 = {"Lcom/kotlin/order/ui/adapter/OrderVpAdapter;", "Landroid/support/v4/app/FragmentPagerAdapter;", "fm", "Landroid/support/v4/app/FragmentManager;", "context", "Landroid/content/Context;", "(Landroid/support/v4/app/FragmentManager;Landroid/content/Context;)V", "titles", "", "", "[Ljava/lang/String;", "getCount", "", "getItem", "Landroid/support/v4/app/Fragment;", "position", "getPageTitle", "", "OrderCenter_debug"})
public final class OrderVpAdapter extends android.support.v4.app.FragmentPagerAdapter {
    private final java.lang.String[] titles = {"\u5168\u90e8", "\u5f85\u4ed8\u6b3e", "\u5f85\u6536\u8d27", "\u5df2\u5b8c\u6210", "\u5df2\u53d6\u6d88"};
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.support.v4.app.Fragment getItem(int position) {
        return null;
    }
    
    @java.lang.Override()
    public int getCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.CharSequence getPageTitle(int position) {
        return null;
    }
    
    public OrderVpAdapter(@org.jetbrains.annotations.NotNull()
    android.support.v4.app.FragmentManager fm, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
}