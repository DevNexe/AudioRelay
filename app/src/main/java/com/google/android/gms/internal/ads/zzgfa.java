package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgfa {
    public HashMap a = new HashMap();

    public final zzgfc zza() {
        if (this.a == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        zzgfc zzgfcVar = new zzgfc(Collections.unmodifiableMap(this.a));
        this.a = null;
        return zzgfcVar;
    }
}
