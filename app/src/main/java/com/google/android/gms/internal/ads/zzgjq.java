package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgjq extends zzgoj implements zzgpy {
    public zzgjq() {
        super(zzgjt.zzb);
    }

    public final zzgjq zza(zzgjs zzgjsVar) {
        if (this.y) {
            c();
            this.y = false;
        }
        zzgjt.o((zzgjt) this.x, zzgjsVar);
        return this;
    }

    public final zzgjq zzb(int i) {
        if (this.y) {
            c();
            this.y = false;
        }
        ((zzgjt) this.x).zze = i;
        return this;
    }

    public final List zzc() {
        return Collections.unmodifiableList(((zzgjt) this.x).zzh());
    }

    public /* synthetic */ zzgjq(int i) {
        super(zzgjt.zzb);
    }
}
