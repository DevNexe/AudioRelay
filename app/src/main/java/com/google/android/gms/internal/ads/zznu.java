package com.google.android.gms.internal.ads;

import defpackage.qc0;

/* JADX INFO: loaded from: classes3.dex */
public final class zznu extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    public zznu(long j, long j2) {
        StringBuilder sbB = qc0.b("Unexpected audio track timestamp discontinuity: expected ", j2, ", got ");
        sbB.append(j);
        super(sbB.toString());
    }
}
