package com.google.android.gms.internal.ads;

import android.net.Uri;
import defpackage.us5;
import defpackage.vs5;
import defpackage.xs5;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzabo implements zzzf {
    public static final zzzm zza = new zzzm() { // from class: com.google.android.gms.internal.ads.zzabn
        @Override // com.google.android.gms.internal.ads.zzzm
        public final zzzf[] zza() {
            return new zzzf[]{new zzabo()};
        }

        @Override // com.google.android.gms.internal.ads.zzzm
        public final /* synthetic */ zzzf[] zzb(Uri uri, Map map) {
            return zzzl.zza(this, uri, map);
        }
    };
    public zzzi f;
    public boolean h;
    public long i;
    public int j;
    public int k;
    public int l;
    public long m;
    public boolean n;
    public us5 o;
    public xs5 p;
    public final zzed a = new zzed(4);
    public final zzed b = new zzed(9);
    public final zzed c = new zzed(11);
    public final zzed d = new zzed();
    public final vs5 e = new vs5();
    public int g = 1;

    public final zzed a(zzzg zzzgVar) throws EOFException, InterruptedIOException {
        int i = this.l;
        zzed zzedVar = this.d;
        if (i > zzedVar.zzb()) {
            int iZzb = zzedVar.zzb();
            zzedVar.zzD(new byte[Math.max(iZzb + iZzb, this.l)], 0);
        } else {
            zzedVar.zzF(0);
        }
        zzedVar.zzE(this.l);
        ((zzyv) zzzgVar).zzn(zzedVar.zzH(), 0, this.l, false);
        return zzedVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0061  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:53:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:82:0x00dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x0009 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzzf
    public final int zza(zzzg zzzgVar, zzaaf zzaafVar) throws EOFException, InterruptedIOException {
        long j;
        boolean z;
        boolean z2;
        zzdd.zzb(this.f);
        while (true) {
            int i = this.g;
            int i2 = 8;
            if (i == 1) {
                zzed zzedVar = this.b;
                if (!zzzgVar.zzn(zzedVar.zzH(), 0, 9, true)) {
                    return -1;
                }
                zzedVar.zzF(0);
                zzedVar.zzG(4);
                int iZzk = zzedVar.zzk();
                int i3 = iZzk & 1;
                if ((4 & iZzk) != 0 && this.o == null) {
                    this.o = new us5(this.f.zzv(8, 1));
                }
                if (i3 != 0 && this.p == null) {
                    this.p = new xs5(this.f.zzv(9, 2));
                }
                this.f.zzB();
                this.j = zzedVar.zze() - 5;
                this.g = 2;
            } else if (i == 2) {
                ((zzyv) zzzgVar).zzo(this.j, false);
                this.j = 0;
                this.g = 3;
            } else if (i == 3) {
                zzed zzedVar2 = this.c;
                if (!zzzgVar.zzn(zzedVar2.zzH(), 0, 11, true)) {
                    return -1;
                }
                zzedVar2.zzF(0);
                this.k = zzedVar2.zzk();
                this.l = zzedVar2.zzm();
                this.m = zzedVar2.zzm();
                this.m = (((long) (zzedVar2.zzk() << 24)) | this.m) * 1000;
                zzedVar2.zzG(3);
                this.g = 4;
            } else {
                if (i != 4) {
                    throw new IllegalStateException();
                }
                boolean z3 = this.h;
                vs5 vs5Var = this.e;
                if (z3) {
                    j = this.i + this.m;
                } else {
                    j = vs5Var.x == -9223372036854775807L ? 0L : this.m;
                }
                int i4 = this.k;
                if (i4 == 8) {
                    if (this.o != null) {
                        if (!this.n) {
                            this.f.zzL(new zzaah(-9223372036854775807L, 0L));
                            this.n = true;
                        }
                        us5 us5Var = this.o;
                        zzed zzedVarA = a(zzzgVar);
                        us5Var.b(zzedVarA);
                        if (us5Var.c(j, zzedVarA)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        z2 = true;
                    }
                    if (!this.h && z) {
                        this.h = true;
                        this.i = vs5Var.x == -9223372036854775807L ? -this.m : 0L;
                    }
                    this.j = 4;
                    this.g = 2;
                    if (z2) {
                        return 0;
                    }
                } else {
                    i2 = i4;
                }
                if (i2 == 9) {
                    if (this.p != null) {
                        if (!this.n) {
                            this.f.zzL(new zzaah(-9223372036854775807L, 0L));
                            this.n = true;
                        }
                        xs5 xs5Var = this.p;
                        zzed zzedVarA2 = a(zzzgVar);
                        if (xs5Var.b(zzedVarA2) && xs5Var.c(j, zzedVarA2)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        z2 = true;
                    } else {
                        ((zzyv) zzzgVar).zzo(this.l, false);
                        z = false;
                        z2 = false;
                    }
                    if (!this.h) {
                        this.h = true;
                        this.i = vs5Var.x == -9223372036854775807L ? -this.m : 0L;
                    }
                    this.j = 4;
                    this.g = 2;
                    if (z2) {
                        return 0;
                    }
                } else {
                    if (i2 != 18 || this.n) {
                        ((zzyv) zzzgVar).zzo(this.l, false);
                        z = false;
                        z2 = false;
                    } else {
                        zzed zzedVarA3 = a(zzzgVar);
                        vs5Var.getClass();
                        vs5Var.b(j, zzedVarA3);
                        long j2 = vs5Var.x;
                        if (j2 != -9223372036854775807L) {
                            this.f.zzL(new zzzx(vs5Var.z, vs5Var.y, j2));
                            this.n = true;
                        }
                        z = false;
                        z2 = true;
                    }
                    if (!this.h) {
                        this.h = true;
                        this.i = vs5Var.x == -9223372036854775807L ? -this.m : 0L;
                    }
                    this.j = 4;
                    this.g = 2;
                    if (z2) {
                        return 0;
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final void zzb(zzzi zzziVar) {
        this.f = zzziVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final void zzc(long j, long j2) {
        if (j == 0) {
            this.g = 1;
            this.h = false;
        } else {
            this.g = 3;
        }
        this.j = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final boolean zzd(zzzg zzzgVar) throws EOFException, InterruptedIOException {
        zzed zzedVar = this.a;
        zzyv zzyvVar = (zzyv) zzzgVar;
        zzyvVar.zzm(zzedVar.zzH(), 0, 3, false);
        zzedVar.zzF(0);
        if (zzedVar.zzm() != 4607062) {
            return false;
        }
        zzyvVar.zzm(zzedVar.zzH(), 0, 2, false);
        zzedVar.zzF(0);
        if ((zzedVar.zzo() & 250) != 0) {
            return false;
        }
        zzyvVar.zzm(zzedVar.zzH(), 0, 4, false);
        zzedVar.zzF(0);
        int iZze = zzedVar.zze();
        zzzgVar.zzj();
        zzyv zzyvVar2 = (zzyv) zzzgVar;
        zzyvVar2.zzl(iZze, false);
        zzyvVar2.zzm(zzedVar.zzH(), 0, 4, false);
        zzedVar.zzF(0);
        return zzedVar.zze() == 0;
    }
}
