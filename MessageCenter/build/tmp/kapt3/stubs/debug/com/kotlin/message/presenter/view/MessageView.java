package com.kotlin.message.presenter.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/kotlin/message/presenter/view/MessageView;", "Lcom/kotlin/base/presenter/view/BaseView;", "onGetMessageResult", "", "result", "", "Lcom/kotlin/message/data/protocol/Message;", "MessageCenter_debug"})
public abstract interface MessageView extends com.kotlin.base.presenter.view.BaseView {
    
    public abstract void onGetMessageResult(@org.jetbrains.annotations.Nullable()
    java.util.List<com.kotlin.message.data.protocol.Message> result);
}