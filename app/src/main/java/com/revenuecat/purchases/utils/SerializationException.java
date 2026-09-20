package com.revenuecat.purchases.utils;

import defpackage.kg0;

/* JADX INFO: loaded from: classes3.dex */
public class SerializationException extends RuntimeException {
    public SerializationException(String str, Throwable th) {
        super(str, th);
    }

    public /* synthetic */ SerializationException(String str, Throwable th, int i, kg0 kg0Var) {
        this(str, (i & 2) != 0 ? null : th);
    }
}
