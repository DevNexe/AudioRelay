package com.google.android.gms.internal.appset;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes3.dex */
public class zza implements IInterface {
    public final IBinder w;

    public zza(IBinder iBinder) {
        this.w = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.w;
    }
}
