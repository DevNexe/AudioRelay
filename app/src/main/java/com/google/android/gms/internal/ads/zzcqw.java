package com.google.android.gms.internal.ads;

import defpackage.eb6;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcqw {
    public zzcon a;
    public zzcsj b;
    public zzfht c;
    public zzcsw d;
    public zzfen e;

    public zzcqw() {
    }

    public /* synthetic */ zzcqw(int i) {
    }

    public final zzcok zza() {
        zzguz.zzc(this.a, zzcon.class);
        zzguz.zzc(this.b, zzcsj.class);
        if (this.c == null) {
            this.c = new zzfht();
        }
        if (this.d == null) {
            this.d = new zzcsw();
        }
        if (this.e == null) {
            this.e = new zzfen();
        }
        return new eb6(this.a, this.b, this.c, this.d, this.e);
    }

    public final zzcqw zzb(zzcon zzconVar) {
        this.a = zzconVar;
        return this;
    }

    public final zzcqw zzc(zzcsj zzcsjVar) {
        this.b = zzcsjVar;
        return this;
    }
}
