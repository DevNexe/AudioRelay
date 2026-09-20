package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfku {
    public static zzfku d;
    public float a = 0.0f;
    public zzfkm b;
    public zzfko c;

    public zzfku(zzfkn zzfknVar, zzfkl zzfklVar) {
    }

    public static zzfku zzb() {
        if (d == null) {
            d = new zzfku(new zzfkn(), new zzfkl());
        }
        return d;
    }

    public final float zza() {
        return this.a;
    }

    public final void zzc(Context context) {
        this.b = new zzfkm(new Handler(), context, new zzfkk(), this, null);
    }

    public final void zzd(float f) {
        this.a = f;
        if (this.c == null) {
            this.c = zzfko.zza();
        }
        Iterator it = this.c.zzb().iterator();
        while (it.hasNext()) {
            ((zzfkd) it.next()).zzg().zzh(f);
        }
    }

    public final void zze() {
        zzfkp.zza().zzd(this);
        zzfkp.zza().zzb();
        zzflq.zzd().zzi();
        this.b.zza();
    }

    public final void zzf() {
        zzflq.zzd().zzj();
        zzfkp.zza().zzc();
        this.b.zzb();
    }
}
