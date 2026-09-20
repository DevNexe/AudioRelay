package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.initialization.AdapterStatus;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbrt implements AdapterStatus {
    public final AdapterStatus.State a;
    public final String b;
    public final int c;

    public zzbrt(AdapterStatus.State state, String str, int i) {
        this.a = state;
        this.b = str;
        this.c = i;
    }

    @Override // com.google.android.gms.ads.initialization.AdapterStatus
    public final String getDescription() {
        return this.b;
    }

    @Override // com.google.android.gms.ads.initialization.AdapterStatus
    public final AdapterStatus.State getInitializationState() {
        return this.a;
    }

    @Override // com.google.android.gms.ads.initialization.AdapterStatus
    public final int getLatency() {
        return this.c;
    }
}
