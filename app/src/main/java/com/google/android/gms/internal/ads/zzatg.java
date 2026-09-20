package com.google.android.gms.internal.ads;

import defpackage.a42;

/* JADX INFO: loaded from: classes3.dex */
public final class zzatg extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    public zzatg(int i, int i2, int i3) {
        StringBuilder sbA = a42.a("Unhandled format: ", i, " Hz, ", i2, " channels in encoding ");
        sbA.append(i3);
        super(sbA.toString());
    }
}
