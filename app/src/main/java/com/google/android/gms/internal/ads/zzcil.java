package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import defpackage.oa3;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcil {
    public final Context a;
    public final zzcmn b;
    public final ViewGroup c;
    public zzcik d;

    public zzcil(Context context, ViewGroup viewGroup, zzcmn zzcmnVar) {
        this.a = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.c = viewGroup;
        this.b = zzcmnVar;
        this.d = null;
    }

    public final zzcik zza() {
        return this.d;
    }

    public final void zzb(int i, int i2, int i3, int i4) {
        oa3.d("The underlay may only be modified from the UI thread.");
        zzcik zzcikVar = this.d;
        if (zzcikVar != null) {
            zzcikVar.zzE(i, i2, i3, i4);
        }
    }

    public final void zzc(int i, int i2, int i3, int i4, int i5, boolean z, zzciv zzcivVar) {
        if (this.d != null) {
            return;
        }
        zzcmn zzcmnVar = this.b;
        zzbjf.zza(zzcmnVar.zzo().zza(), zzcmnVar.zzn(), "vpr2");
        zzcik zzcikVar = new zzcik(this.a, zzcmnVar, i5, z, zzcmnVar.zzo().zza(), zzcivVar);
        this.d = zzcikVar;
        this.c.addView(zzcikVar, 0, new ViewGroup.LayoutParams(-1, -1));
        this.d.zzE(i, i2, i3, i4);
        zzcmnVar.zzB(false);
    }

    public final void zzd() {
        oa3.d("onDestroy must be called from the UI thread.");
        zzcik zzcikVar = this.d;
        if (zzcikVar != null) {
            zzcikVar.zzn();
            this.c.removeView(this.d);
            this.d = null;
        }
    }

    public final void zze() {
        oa3.d("onPause must be called from the UI thread.");
        zzcik zzcikVar = this.d;
        if (zzcikVar != null) {
            zzcikVar.zzt();
        }
    }

    public final void zzf(int i) {
        zzcik zzcikVar = this.d;
        if (zzcikVar != null) {
            zzcikVar.zzB(i);
        }
    }
}
