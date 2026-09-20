package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import defpackage.i26;
import defpackage.iq5;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaxw implements zzaya, zzaxz {
    public final Handler A;
    public final zzaxv B;
    public final zzatb C = new zzatb();
    public final int D;
    public zzaxz E;
    public boolean F;
    public final Uri w;
    public final zzazh x;
    public final zzaux y;
    public final int z;

    public zzaxw(Uri uri, zzazh zzazhVar, zzaux zzauxVar, int i, Handler handler, zzaxv zzaxvVar, String str, int i2) {
        this.w = uri;
        this.x = zzazhVar;
        this.y = zzauxVar;
        this.z = i;
        this.A = handler;
        this.B = zzaxvVar;
        this.D = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    public final void zzb(zzasi zzasiVar, boolean z, zzaxz zzaxzVar) {
        this.E = zzaxzVar;
        zzaxzVar.zzg(new zzayn(-9223372036854775807L, false), null);
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    public final void zzc(zzaxy zzaxyVar) {
        i26 i26Var = (i26) zzaxyVar;
        i26Var.D.zzh(new iq5(2, i26Var, i26Var.E));
        i26Var.I.removeCallbacksAndMessages(null);
        i26Var.b0 = true;
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    public final void zzd() {
        this.E = null;
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    public final zzaxy zze(int i, zzazl zzazlVar) {
        zzazy.zzc(i == 0);
        return new i26(this.w, this.x.zza(), this.y.mo48zza(), this.z, this.A, this.B, this, zzazlVar, this.D);
    }

    @Override // com.google.android.gms.internal.ads.zzaxz
    public final void zzg(zzatd zzatdVar, Object obj) {
        zzatb zzatbVar = this.C;
        zzatdVar.zzd(0, zzatbVar, false);
        boolean z = zzatbVar.zzc != -9223372036854775807L;
        if (!this.F || z) {
            this.F = z;
            this.E.zzg(zzatdVar, null);
        }
    }
}
