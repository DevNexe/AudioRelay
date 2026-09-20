package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Looper;
import defpackage.hb7;
import defpackage.ib7;

/* JADX INFO: loaded from: classes3.dex */
public final class zztn extends zzrh {
    public final zzbg h;
    public final zzay i;
    public final zzeu j;
    public final zzpo k;
    public final int l;
    public boolean m;
    public long n;
    public boolean o;
    public boolean p;
    public zzfx q;
    public final zztk r;

    public /* synthetic */ zztn(zzbg zzbgVar, zzeu zzeuVar, zztk zztkVar, zzpo zzpoVar, zzwj zzwjVar, int i) {
        zzay zzayVar = zzbgVar.zzd;
        zzayVar.getClass();
        this.i = zzayVar;
        this.h = zzbgVar;
        this.j = zzeuVar;
        this.r = zztkVar;
        this.k = zzpoVar;
        this.l = i;
        this.m = true;
        this.n = -9223372036854775807L;
    }

    public final void d() {
        long j = this.n;
        boolean z = this.o;
        boolean z2 = this.p;
        zzbg zzbgVar = this.h;
        zzua zzuaVar = new zzua(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j, j, 0L, 0L, z, false, false, null, zzbgVar, z2 ? zzbgVar.zzf : null);
        c(this.m ? new ib7(zzuaVar) : zzuaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final void zzB(zzse zzseVar) {
        hb7 hb7Var = (hb7) zzseVar;
        if (hb7Var.N) {
            for (zztv zztvVar : hb7Var.K) {
                zztvVar.zzn();
            }
        }
        hb7Var.C.zzj(hb7Var);
        hb7Var.H.removeCallbacksAndMessages(null);
        hb7Var.I = null;
        hb7Var.d0 = true;
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final zzse zzD(zzsg zzsgVar, zzwf zzwfVar, long j) {
        zzev zzevVarZza = this.j.zza();
        zzfx zzfxVar = this.q;
        if (zzfxVar != null) {
            zzevVarZza.zzf(zzfxVar);
        }
        Uri uri = this.i.zza;
        zzdd.zzb(this.g);
        return new hb7(uri, zzevVarZza, new zzrj(this.r.zza), this.k, this.d.zza(0, zzsgVar), this.c.zza(0, zzsgVar, 0L), this, zzwfVar, this.l);
    }

    public final void zza(long j, boolean z, boolean z2) {
        if (j == -9223372036854775807L) {
            j = this.n;
        }
        if (!this.m && this.n == j && this.o == z && this.p == z2) {
            return;
        }
        this.n = j;
        this.o = z;
        this.p = z2;
        this.m = false;
        d();
    }

    @Override // com.google.android.gms.internal.ads.zzrh
    public final void zzn(zzfx zzfxVar) {
        this.q = zzfxVar;
        Looper.myLooper().getClass();
        zzdd.zzb(this.g);
        d();
    }

    @Override // com.google.android.gms.internal.ads.zzrh
    public final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final void zzw() {
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final zzbg zzz() {
        return this.h;
    }
}
