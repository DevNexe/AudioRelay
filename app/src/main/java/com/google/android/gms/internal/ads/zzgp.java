package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzgp implements zzjy, zzjz {
    public zzmz A;
    public int B;
    public zztw C;
    public zzaf[] D;
    public long E;
    public boolean G;
    public boolean H;
    public final int w;
    public zzka y;
    public int z;
    public final zzje x = new zzje();
    public long F = Long.MIN_VALUE;

    public zzgp(int i) {
        this.w = i;
    }

    public final int a(zzje zzjeVar, zzgg zzggVar, int i) {
        zztw zztwVar = this.C;
        zztwVar.getClass();
        int iZza = zztwVar.zza(zzjeVar, zzggVar, i);
        if (iZza == -4) {
            if (zzggVar.zzg()) {
                this.F = Long.MIN_VALUE;
                return this.G ? -4 : -3;
            }
            long j = zzggVar.zzd + this.E;
            zzggVar.zzd = j;
            this.F = Math.max(this.F, j);
        } else if (iZza == -5) {
            zzaf zzafVar = zzjeVar.zza;
            zzafVar.getClass();
            long j2 = zzafVar.zzq;
            if (j2 != Long.MAX_VALUE) {
                zzad zzadVarZzb = zzafVar.zzb();
                zzadVarZzb.zzW(j2 + this.E);
                zzjeVar.zza = zzadVarZzb.zzY();
                return -5;
            }
        }
        return iZza;
    }

    public final zzgy b(zzaf zzafVar, Exception exc, boolean z, int i) {
        int i2;
        if (zzafVar == null || this.H) {
            i2 = 4;
        } else {
            this.H = true;
            try {
                int iZzO = zzO(zzafVar) & 7;
                this.H = false;
                i2 = iZzO;
            } catch (zzgy unused) {
                this.H = false;
                i2 = 4;
            } catch (Throwable th) {
                this.H = false;
                throw th;
            }
        }
        return zzgy.zzb(exc, zzK(), this.z, zzafVar, i2, z, i);
    }

    public void c() {
        throw null;
    }

    public void d(boolean z, boolean z2) {
    }

    public void e(long j, boolean z) {
        throw null;
    }

    public void f() {
    }

    public void g() {
    }

    public void h() {
    }

    public void i(long j, long j2) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzjy
    public final void zzA() {
        zzdd.zzf(this.B == 0);
        zzje zzjeVar = this.x;
        zzjeVar.zzb = null;
        zzjeVar.zza = null;
        f();
    }

    @Override // com.google.android.gms.internal.ads.zzjy
    public final void zzB(long j) {
        this.G = false;
        this.F = j;
        e(j, false);
    }

    @Override // com.google.android.gms.internal.ads.zzjy
    public final void zzC() {
        this.G = true;
    }

    @Override // com.google.android.gms.internal.ads.zzjy
    public /* synthetic */ void zzD(float f, float f2) {
    }

    @Override // com.google.android.gms.internal.ads.zzjy
    public final void zzE() {
        zzdd.zzf(this.B == 1);
        this.B = 2;
        g();
    }

    @Override // com.google.android.gms.internal.ads.zzjy
    public final void zzF() {
        zzdd.zzf(this.B == 2);
        this.B = 1;
        h();
    }

    @Override // com.google.android.gms.internal.ads.zzjy
    public final boolean zzG() {
        return this.F == Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzjy
    public final boolean zzH() {
        return this.G;
    }

    @Override // com.google.android.gms.internal.ads.zzjy, com.google.android.gms.internal.ads.zzjz
    public final int zzb() {
        return this.w;
    }

    @Override // com.google.android.gms.internal.ads.zzjy
    public final int zzbe() {
        return this.B;
    }

    @Override // com.google.android.gms.internal.ads.zzjz
    public int zze() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzjy
    public final long zzf() {
        return this.F;
    }

    @Override // com.google.android.gms.internal.ads.zzjy
    public zzjg zzi() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzjy
    public final zzjz zzj() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzjy
    public final zztw zzm() {
        return this.C;
    }

    @Override // com.google.android.gms.internal.ads.zzjy
    public final void zzn() {
        zzdd.zzf(this.B == 1);
        zzje zzjeVar = this.x;
        zzjeVar.zzb = null;
        zzjeVar.zza = null;
        this.B = 0;
        this.C = null;
        this.D = null;
        this.G = false;
        c();
    }

    @Override // com.google.android.gms.internal.ads.zzjy
    public final void zzo(zzka zzkaVar, zzaf[] zzafVarArr, zztw zztwVar, long j, boolean z, boolean z2, long j2, long j3) {
        zzdd.zzf(this.B == 0);
        this.y = zzkaVar;
        this.B = 1;
        d(z, z2);
        zzz(zzafVarArr, zztwVar, j2, j3);
        this.G = false;
        this.F = j;
        e(j, z);
    }

    @Override // com.google.android.gms.internal.ads.zzju
    public void zzp(int i, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzjy
    public final void zzq(int i, zzmz zzmzVar) {
        this.z = i;
        this.A = zzmzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzjy
    public final void zzr() {
        zztw zztwVar = this.C;
        zztwVar.getClass();
        zztwVar.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzjy
    public final void zzz(zzaf[] zzafVarArr, zztw zztwVar, long j, long j2) {
        zzdd.zzf(!this.G);
        this.C = zztwVar;
        if (this.F == Long.MIN_VALUE) {
            this.F = j;
        }
        this.D = zzafVarArr;
        this.E = j2;
        i(j, j2);
    }
}
