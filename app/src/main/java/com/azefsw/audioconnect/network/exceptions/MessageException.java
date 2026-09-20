package com.azefsw.audioconnect.network.exceptions;

import defpackage.XTd3;
import defpackage.ed2;

/* JADX INFO: loaded from: classes.dex */
public final class MessageException extends RuntimeException {
    public static final /* synthetic */ int x = 0;
    public final boolean w;

    public static final class QnHx {
        public static MessageException a(Throwable th) {
            return new MessageException(th, XTd3.r(th, ed2.a));
        }

        public static MessageException b() {
            return new MessageException(null, true);
        }
    }

    public MessageException(Throwable th, boolean z) {
        super(th);
        this.w = z;
    }
}
