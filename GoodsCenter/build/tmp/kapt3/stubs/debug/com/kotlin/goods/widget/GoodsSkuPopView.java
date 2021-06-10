package com.kotlin.goods.widget;

import java.lang.System;

@android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u0010J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tH\u0016J\u000e\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0010J\u000e\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0010J\u000e\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0019J\u0014\u0010\u001a\u001a\u00020\u00122\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/kotlin/goods/widget/GoodsSkuPopView;", "Landroid/widget/PopupWindow;", "Landroid/view/View$OnClickListener;", "context", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "mContext", "Landroid/content/Context;", "mRootView", "Landroid/view/View;", "mSkuViewList", "Ljava/util/ArrayList;", "Lcom/kotlin/goods/widget/SkuView;", "getSelectCount", "", "getSelectSku", "", "initView", "", "onClick", "v", "setGoodsCode", "text", "setGoodsIcon", "setGoodsPrice", "", "setSkuData", "list", "", "Lcom/kotlin/goods/data/protocol/GoodsSku;", "GoodsCenter_debug"})
public final class GoodsSkuPopView extends android.widget.PopupWindow implements android.view.View.OnClickListener {
    private final android.view.View mRootView = null;
    private final android.content.Context mContext = null;
    private final java.util.ArrayList<com.kotlin.goods.widget.SkuView> mSkuViewList = null;
    
    private final void initView() {
    }
    
    public final void setGoodsIcon(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    public final void setGoodsPrice(long text) {
    }
    
    public final void setGoodsCode(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    public final void setSkuData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.kotlin.goods.data.protocol.GoodsSku> list) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSelectSku() {
        return null;
    }
    
    public final int getSelectCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    android.view.View v) {
    }
    
    public GoodsSkuPopView(@org.jetbrains.annotations.NotNull()
    android.app.Activity context) {
        super(null);
    }
}