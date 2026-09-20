package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbnf extends zzarv implements zzbnh {
    public zzbnf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbnh
    public final void zze(zzbmu zzbmuVar) {
        Parcel parcelK0 = K0();
        zzarx.zzg(parcelK0, zzbmuVar);
        M0(parcelK0, 1);
    }
}
