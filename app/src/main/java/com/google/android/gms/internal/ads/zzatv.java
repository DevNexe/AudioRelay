package com.google.android.gms.internal.ads;

import defpackage.a42;

/* JADX INFO: loaded from: classes3.dex */
public final class zzatv extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    public zzatv(int i, int i2, int i3, int i4) {
        StringBuilder sbA = a42.a("AudioTrack init failed: ", i, ", Config(", i2, ", ");
        sbA.append(i3);
        sbA.append(", ");
        sbA.append(i4);
        sbA.append(")");
        super(sbA.toString());
    }
}
