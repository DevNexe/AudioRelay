package com.google.android.gms.internal.base;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes3.dex */
public class zaa implements IInterface {
    public final IBinder w;
    public final String x;

    public zaa(IBinder iBinder, String str) {
        this.w = iBinder;
        this.x = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.w;
    }
}
