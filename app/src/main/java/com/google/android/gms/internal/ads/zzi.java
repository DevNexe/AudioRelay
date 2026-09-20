package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import defpackage.hj6;
import defpackage.uq6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzi {
    public final AudioAttributes zza;

    public /* synthetic */ zzi() {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
        int i = zzel.zza;
        if (i >= 29) {
            hj6.a(usage, 1);
        }
        if (i >= 32) {
            uq6.a(usage, 0);
        }
        this.zza = usage.build();
    }
}
