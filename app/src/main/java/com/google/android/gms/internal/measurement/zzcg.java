package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import defpackage.w46;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcg extends zzbm implements zzci {
    public zzcg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.zzci
    public final void y(long j, Bundle bundle, String str, String str2) {
        Parcel parcelK0 = K0();
        parcelK0.writeString(str);
        parcelK0.writeString(str2);
        w46.c(parcelK0, bundle);
        parcelK0.writeLong(j);
        M0(parcelK0, 1);
    }

    @Override // com.google.android.gms.internal.measurement.zzci
    public final int zzd() {
        Parcel parcelL0 = L0(K0(), 2);
        int i = parcelL0.readInt();
        parcelL0.recycle();
        return i;
    }
}
