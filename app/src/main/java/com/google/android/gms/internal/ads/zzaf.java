package com.google.android.gms.internal.ads;

import defpackage.ry0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaf {
    public static final zzn zza;
    public int a;
    public final int zzA;
    public final int zzB;
    public final int zzC;
    public final int zzD;
    public final int zzE;
    public final int zzF;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final int zze;
    public final int zzf = 0;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final String zzj;
    public final zzbq zzk;
    public final String zzl;
    public final String zzm;
    public final int zzn;
    public final List zzo;
    public final zzx zzp;
    public final long zzq;
    public final int zzr;
    public final int zzs;
    public final float zzt;
    public final int zzu;
    public final float zzv;
    public final byte[] zzw;
    public final int zzx;
    public final zzq zzy;
    public final int zzz;

    static {
        new zzaf(new zzad());
        zza = new zzn() { // from class: com.google.android.gms.internal.ads.zzab
        };
    }

    public zzaf(zzad zzadVar) {
        this.zzb = zzadVar.a;
        this.zzc = zzadVar.b;
        this.zzd = zzel.zzP(zzadVar.c);
        this.zze = zzadVar.d;
        int i = zzadVar.e;
        this.zzg = i;
        int i2 = zzadVar.f;
        this.zzh = i2;
        this.zzi = i2 != -1 ? i2 : i;
        this.zzj = zzadVar.g;
        this.zzk = zzadVar.h;
        this.zzl = zzadVar.i;
        this.zzm = zzadVar.j;
        this.zzn = zzadVar.k;
        List list = zzadVar.l;
        this.zzo = list == null ? Collections.emptyList() : list;
        zzx zzxVar = zzadVar.m;
        this.zzp = zzxVar;
        this.zzq = zzadVar.n;
        this.zzr = zzadVar.o;
        this.zzs = zzadVar.p;
        this.zzt = zzadVar.q;
        int i3 = zzadVar.r;
        this.zzu = i3 == -1 ? 0 : i3;
        float f = zzadVar.s;
        this.zzv = f == -1.0f ? 1.0f : f;
        this.zzw = zzadVar.t;
        this.zzx = zzadVar.u;
        this.zzy = zzadVar.v;
        this.zzz = zzadVar.w;
        this.zzA = zzadVar.x;
        this.zzB = zzadVar.y;
        int i4 = zzadVar.z;
        this.zzC = i4 == -1 ? 0 : i4;
        int i5 = zzadVar.A;
        this.zzD = i5 != -1 ? i5 : 0;
        this.zzE = zzadVar.B;
        int i6 = zzadVar.C;
        if (i6 != 0 || zzxVar == null) {
            this.zzF = i6;
        } else {
            this.zzF = 1;
        }
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaf.class == obj.getClass()) {
            zzaf zzafVar = (zzaf) obj;
            int i2 = this.a;
            if ((i2 == 0 || (i = zzafVar.a) == 0 || i2 == i) && this.zze == zzafVar.zze && this.zzg == zzafVar.zzg && this.zzh == zzafVar.zzh && this.zzn == zzafVar.zzn && this.zzq == zzafVar.zzq && this.zzr == zzafVar.zzr && this.zzs == zzafVar.zzs && this.zzu == zzafVar.zzu && this.zzx == zzafVar.zzx && this.zzz == zzafVar.zzz && this.zzA == zzafVar.zzA && this.zzB == zzafVar.zzB && this.zzC == zzafVar.zzC && this.zzD == zzafVar.zzD && this.zzE == zzafVar.zzE && this.zzF == zzafVar.zzF && Float.compare(this.zzt, zzafVar.zzt) == 0 && Float.compare(this.zzv, zzafVar.zzv) == 0 && zzel.zzT(this.zzb, zzafVar.zzb) && zzel.zzT(this.zzc, zzafVar.zzc) && zzel.zzT(this.zzj, zzafVar.zzj) && zzel.zzT(this.zzl, zzafVar.zzl) && zzel.zzT(this.zzm, zzafVar.zzm) && zzel.zzT(this.zzd, zzafVar.zzd) && Arrays.equals(this.zzw, zzafVar.zzw) && zzel.zzT(this.zzk, zzafVar.zzk) && zzel.zzT(this.zzy, zzafVar.zzy) && zzel.zzT(this.zzp, zzafVar.zzp) && zzd(zzafVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        if (i != 0) {
            return i;
        }
        String str = this.zzb;
        int iHashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
        String str2 = this.zzc;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.zzd;
        int iHashCode3 = (((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.zze) * 961) + this.zzg) * 31) + this.zzh) * 31;
        String str4 = this.zzj;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        zzbq zzbqVar = this.zzk;
        int iHashCode5 = (iHashCode4 + (zzbqVar == null ? 0 : zzbqVar.hashCode())) * 31;
        String str5 = this.zzl;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.zzm;
        int iB = ((((((((((((((ry0.b(this.zzv, (ry0.b(this.zzt, (((((((((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.zzn) * 31) + ((int) this.zzq)) * 31) + this.zzr) * 31) + this.zzs) * 31, 31) + this.zzu) * 31, 31) + this.zzx) * 31) + this.zzz) * 31) + this.zzA) * 31) + this.zzB) * 31) + this.zzC) * 31) + this.zzD) * 31) + this.zzE) * 31) + this.zzF;
        this.a = iB;
        return iB;
    }

    public final String toString() {
        return "Format(" + this.zzb + ", " + this.zzc + ", " + this.zzl + ", " + this.zzm + ", " + this.zzj + ", " + this.zzi + ", " + this.zzd + ", [" + this.zzr + ", " + this.zzs + ", " + this.zzt + "], [" + this.zzz + ", " + this.zzA + "])";
    }

    public final int zza() {
        int i;
        int i2 = this.zzr;
        if (i2 == -1 || (i = this.zzs) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public final zzad zzb() {
        return new zzad(this);
    }

    public final zzaf zzc(int i) {
        zzad zzadVar = new zzad(this);
        zzadVar.zzA(i);
        return new zzaf(zzadVar);
    }

    public final boolean zzd(zzaf zzafVar) {
        if (this.zzo.size() != zzafVar.zzo.size()) {
            return false;
        }
        for (int i = 0; i < this.zzo.size(); i++) {
            if (!Arrays.equals((byte[]) this.zzo.get(i), (byte[]) zzafVar.zzo.get(i))) {
                return false;
            }
        }
        return true;
    }
}
