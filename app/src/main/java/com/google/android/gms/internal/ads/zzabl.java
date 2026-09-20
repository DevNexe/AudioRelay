package com.google.android.gms.internal.ads;

import android.net.Uri;
import defpackage.ts5;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzabl implements zzzf {
    public static final zzzm zza = new zzzm() { // from class: com.google.android.gms.internal.ads.zzabk
        @Override // com.google.android.gms.internal.ads.zzzm
        public final zzzf[] zza() {
            return new zzzf[]{new zzabl(0)};
        }

        @Override // com.google.android.gms.internal.ads.zzzm
        public final /* synthetic */ zzzf[] zzb(Uri uri, Map map) {
            return zzzl.zza(this, uri, map);
        }
    };
    public final byte[] a;
    public final zzed b;
    public final zzzn c;
    public zzzi d;
    public zzaam e;
    public int f;
    public zzbq g;
    public zzzs h;
    public int i;
    public int j;
    public ts5 k;
    public int l;
    public long m;

    public zzabl() {
        this(0);
    }

    public zzabl(int i) {
        this.a = new byte[42];
        this.b = new zzed(new byte[32768], 0);
        this.c = new zzzn();
        this.f = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final int zza(zzzg zzzgVar, zzaaf zzaafVar) throws zzbu, EOFException, InterruptedIOException {
        boolean zZzl;
        zzaai zzaahVar;
        boolean z;
        long j;
        boolean zZzc;
        int i = this.f;
        if (i == 0) {
            zzzgVar.zzj();
            long jZze = zzzgVar.zze();
            zzbq zzbqVarZza = zzzp.zza(zzzgVar, true);
            ((zzyv) zzzgVar).zzo((int) (zzzgVar.zze() - jZze), false);
            this.g = zzbqVarZza;
            this.f = 1;
            return 0;
        }
        byte[] bArr = this.a;
        if (i == 1) {
            ((zzyv) zzzgVar).zzm(bArr, 0, 42, false);
            zzzgVar.zzj();
            this.f = 2;
            return 0;
        }
        if (i == 2) {
            zzed zzedVar = new zzed(4);
            ((zzyv) zzzgVar).zzn(zzedVar.zzH(), 0, 4, false);
            if (zzedVar.zzs() != 1716281667) {
                throw zzbu.zza("Failed to read FLAC stream marker.", null);
            }
            this.f = 3;
            return 0;
        }
        if (i == 3) {
            zzzs zzzsVarZze = this.h;
            do {
                zzzgVar.zzj();
                zzec zzecVar = new zzec(new byte[4], 4);
                zzyv zzyvVar = (zzyv) zzzgVar;
                zzyvVar.zzm(zzecVar.zza, 0, 4, false);
                zZzl = zzecVar.zzl();
                int iZzc = zzecVar.zzc(7);
                int iZzc2 = zzecVar.zzc(24) + 4;
                if (iZzc == 0) {
                    byte[] bArr2 = new byte[38];
                    zzyvVar.zzn(bArr2, 0, 38, false);
                    zzzsVarZze = new zzzs(bArr2, 4);
                } else {
                    if (zzzsVarZze == null) {
                        throw new IllegalArgumentException();
                    }
                    if (iZzc == 3) {
                        zzed zzedVar2 = new zzed(iZzc2);
                        zzyvVar.zzn(zzedVar2.zzH(), 0, iZzc2, false);
                        zzzsVarZze = zzzsVarZze.zzf(zzzp.zzb(zzedVar2));
                    } else if (iZzc == 4) {
                        zzed zzedVar3 = new zzed(iZzc2);
                        zzyvVar.zzn(zzedVar3.zzH(), 0, iZzc2, false);
                        zzedVar3.zzG(4);
                        zzzsVarZze = zzzsVarZze.zzg(Arrays.asList(zzaas.zzc(zzedVar3, false, false).zzb));
                    } else if (iZzc == 6) {
                        zzed zzedVar4 = new zzed(iZzc2);
                        zzyvVar.zzn(zzedVar4.zzH(), 0, iZzc2, false);
                        zzedVar4.zzG(4);
                        zzzsVarZze = zzzsVarZze.zze(zzfuv.zzp(zzacf.zzb(zzedVar4)));
                    } else {
                        zzyvVar.zzo(iZzc2, false);
                    }
                }
                int i2 = zzel.zza;
                this.h = zzzsVarZze;
            } while (!zZzl);
            zzzsVarZze.getClass();
            this.i = Math.max(zzzsVarZze.zzc, 6);
            this.e.zzk(this.h.zzc(bArr, this.g));
            this.f = 4;
            return 0;
        }
        if (i == 4) {
            zzzgVar.zzj();
            zzed zzedVar5 = new zzed(2);
            ((zzyv) zzzgVar).zzm(zzedVar5.zzH(), 0, 2, false);
            int iZzo = zzedVar5.zzo();
            if ((iZzo >> 2) != 16382) {
                zzzgVar.zzj();
                throw zzbu.zza("First frame does not start with sync code.", null);
            }
            zzzgVar.zzj();
            this.j = iZzo;
            zzzi zzziVar = this.d;
            int i3 = zzel.zza;
            long jZzf = zzzgVar.zzf();
            long jZzd = zzzgVar.zzd();
            zzzs zzzsVar = this.h;
            zzzsVar.getClass();
            if (zzzsVar.zzk != null) {
                zzaahVar = new zzzq(zzzsVar, jZzf);
            } else if (jZzd == -1 || zzzsVar.zzj <= 0) {
                zzaahVar = new zzaah(zzzsVar.zza(), 0L);
            } else {
                ts5 ts5Var = new ts5(zzzsVar, this.j, jZzf, jZzd);
                this.k = ts5Var;
                zzaahVar = ts5Var.zzb();
            }
            zzziVar.zzL(zzaahVar);
            this.f = 5;
            return 0;
        }
        this.e.getClass();
        zzzs zzzsVar2 = this.h;
        zzzsVar2.getClass();
        ts5 ts5Var2 = this.k;
        if (ts5Var2 != null && ts5Var2.zze()) {
            return ts5Var2.zza(zzzgVar, zzaafVar);
        }
        if (this.m == -1) {
            this.m = zzzo.zzb(zzzgVar, zzzsVar2);
            return 0;
        }
        zzed zzedVar6 = this.b;
        int iZzd = zzedVar6.zzd();
        if (iZzd < 32768) {
            int iZza = zzzgVar.zza(zzedVar6.zzH(), iZzd, 32768 - iZzd);
            z = iZza == -1;
            if (!z) {
                zzedVar6.zzE(iZzd + iZza);
            } else if (zzedVar6.zza() == 0) {
                long j2 = this.m;
                zzzs zzzsVar3 = this.h;
                int i4 = zzel.zza;
                this.e.zzs((j2 * 1000000) / ((long) zzzsVar3.zze), 1, this.l, 0, null);
                return -1;
            }
        } else {
            z = false;
        }
        int iZzc3 = zzedVar6.zzc();
        int i5 = this.l;
        int i6 = this.i;
        if (i5 < i6) {
            zzedVar6.zzG(Math.min(i6 - i5, zzedVar6.zza()));
        }
        this.h.getClass();
        int iZzc4 = zzedVar6.zzc();
        while (true) {
            int iZzd2 = zzedVar6.zzd() - 16;
            zzzn zzznVar = this.c;
            if (iZzc4 > iZzd2) {
                if (z) {
                    while (true) {
                        if (iZzc4 <= zzedVar6.zzd() - this.i) {
                            zzedVar6.zzF(iZzc4);
                            try {
                                zZzc = zzzo.zzc(zzedVar6, this.h, this.j, zzznVar);
                            } catch (IndexOutOfBoundsException unused) {
                                zZzc = false;
                            }
                            if (zzedVar6.zzc() <= zzedVar6.zzd() && zZzc) {
                                zzedVar6.zzF(iZzc4);
                                j = zzznVar.zza;
                                break;
                            }
                            iZzc4++;
                        } else {
                            zzedVar6.zzF(zzedVar6.zzd());
                        }
                    }
                } else {
                    zzedVar6.zzF(iZzc4);
                }
                j = -1;
                break;
            }
            zzedVar6.zzF(iZzc4);
            if (zzzo.zzc(zzedVar6, this.h, this.j, zzznVar)) {
                zzedVar6.zzF(iZzc4);
                j = zzznVar.zza;
                break;
            }
            iZzc4++;
        }
        int iZzc5 = zzedVar6.zzc() - iZzc3;
        zzedVar6.zzF(iZzc3);
        zzaak.zzb(this.e, zzedVar6, iZzc5);
        int i7 = this.l + iZzc5;
        this.l = i7;
        if (j != -1) {
            long j3 = this.m;
            zzzs zzzsVar4 = this.h;
            int i8 = zzel.zza;
            this.e.zzs((j3 * 1000000) / ((long) zzzsVar4.zze), 1, i7, 0, null);
            this.l = 0;
            this.m = j;
        }
        if (zzedVar6.zza() >= 16) {
            return 0;
        }
        int iZza2 = zzedVar6.zza();
        System.arraycopy(zzedVar6.zzH(), zzedVar6.zzc(), zzedVar6.zzH(), 0, iZza2);
        zzedVar6.zzF(0);
        zzedVar6.zzE(iZza2);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final void zzb(zzzi zzziVar) {
        this.d = zzziVar;
        this.e = zzziVar.zzv(0, 1);
        zzziVar.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final void zzc(long j, long j2) {
        if (j == 0) {
            this.f = 0;
        } else {
            ts5 ts5Var = this.k;
            if (ts5Var != null) {
                ts5Var.zzd(j2);
            }
        }
        this.m = j2 != 0 ? -1L : 0L;
        this.l = 0;
        this.b.zzC(0);
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final boolean zzd(zzzg zzzgVar) {
        zzzp.zza(zzzgVar, false);
        zzed zzedVar = new zzed(4);
        ((zzyv) zzzgVar).zzm(zzedVar.zzH(), 0, 4, false);
        return zzedVar.zzs() == 1716281667;
    }
}
