package com.google.android.gms.ads.mediation;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class zza {
    public int a;

    public final Bundle zza() {
        Bundle bundle = new Bundle();
        bundle.putInt("capabilities", this.a);
        return bundle;
    }

    public final zza zzb(int i) {
        this.a = 1;
        return this;
    }
}
