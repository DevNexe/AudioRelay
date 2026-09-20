package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzzs {
    public final zzbq a;
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final long zzj;
    public final zzzr zzk;

    public zzzs(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, zzzr zzzrVar, zzbq zzbqVar) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
        this.zze = i5;
        this.zzf = b(i5);
        this.zzg = i6;
        this.zzh = i7;
        this.zzi = a(i7);
        this.zzj = j;
        this.zzk = zzzrVar;
        this.a = zzbqVar;
    }

    public zzzs(byte[] bArr, int i) {
        zzec zzecVar = new zzec(bArr, bArr.length);
        zzecVar.zzh(i * 8);
        this.zza = zzecVar.zzc(16);
        this.zzb = zzecVar.zzc(16);
        this.zzc = zzecVar.zzc(24);
        this.zzd = zzecVar.zzc(24);
        int iZzc = zzecVar.zzc(20);
        this.zze = iZzc;
        this.zzf = b(iZzc);
        this.zzg = zzecVar.zzc(3) + 1;
        int iZzc2 = zzecVar.zzc(5) + 1;
        this.zzh = iZzc2;
        this.zzi = a(iZzc2);
        this.zzj = zzel.zzy(zzecVar.zzc(4), zzecVar.zzc(32));
        this.zzk = null;
        this.a = null;
    }

    public static int a(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i != 20) {
            return i != 24 ? -1 : 6;
        }
        return 5;
    }

    public static int b(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long zza() {
        long j = this.zzj;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / ((long) this.zze);
    }

    public final long zzb(long j) {
        return zzel.zzr((j * ((long) this.zze)) / 1000000, 0L, this.zzj - 1);
    }

    public final zzaf zzc(byte[] bArr, zzbq zzbqVar) {
        bArr[4] = -128;
        int i = this.zzd;
        if (i <= 0) {
            i = -1;
        }
        zzbq zzbqVarZzd = zzd(zzbqVar);
        zzad zzadVar = new zzad();
        zzadVar.zzS("audio/flac");
        zzadVar.zzL(i);
        zzadVar.zzw(this.zzg);
        zzadVar.zzT(this.zze);
        zzadVar.zzI(Collections.singletonList(bArr));
        zzadVar.zzM(zzbqVarZzd);
        return zzadVar.zzY();
    }

    public final zzbq zzd(zzbq zzbqVar) {
        zzbq zzbqVar2 = this.a;
        return zzbqVar2 == null ? zzbqVar : zzbqVar2.zzd(zzbqVar);
    }

    public final zzzs zze(List list) {
        return new zzzs(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, this.zzk, zzd(new zzbq(list)));
    }

    public final zzzs zzf(zzzr zzzrVar) {
        return new zzzs(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, zzzrVar, this.a);
    }

    public final zzzs zzg(List list) {
        return new zzzs(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, this.zzk, zzd(zzaas.zzb(list)));
    }
}
