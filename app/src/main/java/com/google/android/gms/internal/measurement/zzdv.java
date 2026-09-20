package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import defpackage.kw6;

/* JADX INFO: loaded from: classes3.dex */
final class zzdv extends zzch {
    public final kw6 w;

    public zzdv(kw6 kw6Var) {
        this.w = kw6Var;
    }

    @Override // com.google.android.gms.internal.measurement.zzci
    public final void y(long j, Bundle bundle, String str, String str2) {
        this.w.a(j, bundle, str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.zzci
    public final int zzd() {
        return System.identityHashCode(this.w);
    }
}
