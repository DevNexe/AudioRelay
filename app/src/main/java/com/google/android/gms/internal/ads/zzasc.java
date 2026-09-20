package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzasc implements zzasx, zzasy {
    public final int a;
    public zzasz b;
    public int c;
    public int d;
    public zzayk e;
    public long f;
    public boolean g = true;
    public boolean h;

    public zzasc(int i) {
        this.a = i;
    }

    public final int a(zzast zzastVar, zzaun zzaunVar, boolean z) {
        int iZzb = this.e.zzb(zzastVar, zzaunVar, z);
        if (iZzb == -4) {
            if (zzaunVar.zzf()) {
                this.g = true;
                return this.h ? -4 : -3;
            }
            zzaunVar.zzc += this.f;
        } else if (iZzb == -5) {
            zzass zzassVar = zzastVar.zza;
            long j = zzassVar.zzw;
            if (j != Long.MAX_VALUE) {
                zzastVar.zza = new zzass(zzassVar.zza, zzassVar.zze, zzassVar.zzf, zzassVar.zzc, zzassVar.zzb, zzassVar.zzg, zzassVar.zzj, zzassVar.zzk, zzassVar.zzl, zzassVar.zzm, zzassVar.zzn, zzassVar.zzp, zzassVar.zzo, zzassVar.zzq, zzassVar.zzr, zzassVar.zzs, zzassVar.zzt, zzassVar.zzu, zzassVar.zzv, zzassVar.zzx, zzassVar.zzy, zzassVar.zzz, j + this.f, zzassVar.zzh, zzassVar.zzi, zzassVar.zzd);
                return -5;
            }
        }
        return iZzb;
    }

    public void b() {
        throw null;
    }

    public void c(boolean z) {
    }

    public void d(long j, boolean z) {
        throw null;
    }

    public void e() {
    }

    public void f() {
    }

    public void g(zzass[] zzassVarArr, long j) {
    }

    @Override // com.google.android.gms.internal.ads.zzasx
    public final boolean zzA() {
        return this.g;
    }

    @Override // com.google.android.gms.internal.ads.zzasx
    public final boolean zzB() {
        return this.h;
    }

    @Override // com.google.android.gms.internal.ads.zzasx
    public final int zzb() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.ads.zzasx, com.google.android.gms.internal.ads.zzasy
    public final int zzc() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzasy
    public int zze() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzasx
    public final zzasy zzf() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzasx
    public final zzayk zzh() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.ads.zzasx
    public zzbac zzi() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzasx
    public final void zzj() {
        zzazy.zze(this.d == 1);
        this.d = 0;
        this.e = null;
        this.h = false;
        b();
    }

    @Override // com.google.android.gms.internal.ads.zzasx
    public final void zzk(zzasz zzaszVar, zzass[] zzassVarArr, zzayk zzaykVar, long j, boolean z, long j2) {
        zzazy.zze(this.d == 0);
        this.b = zzaszVar;
        this.d = 1;
        c(z);
        zzt(zzassVarArr, zzaykVar, j2);
        d(j, z);
    }

    @Override // com.google.android.gms.internal.ads.zzasg
    public void zzl(int i, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzasx
    public final void zzm() {
        this.e.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzasx
    public final void zzt(zzass[] zzassVarArr, zzayk zzaykVar, long j) {
        zzazy.zze(!this.h);
        this.e = zzaykVar;
        this.g = false;
        this.f = j;
        g(zzassVarArr, j);
    }

    @Override // com.google.android.gms.internal.ads.zzasx
    public final void zzu(long j) {
        this.h = false;
        this.g = false;
        d(j, false);
    }

    @Override // com.google.android.gms.internal.ads.zzasx
    public final void zzv() {
        this.h = true;
    }

    @Override // com.google.android.gms.internal.ads.zzasx
    public final void zzw(int i) {
        this.c = i;
    }

    @Override // com.google.android.gms.internal.ads.zzasx
    public final void zzy() {
        zzazy.zze(this.d == 1);
        this.d = 2;
        e();
    }

    @Override // com.google.android.gms.internal.ads.zzasx
    public final void zzz() {
        zzazy.zze(this.d == 2);
        this.d = 1;
        f();
    }
}
