package com.google.android.gms.internal.ads;

import defpackage.wa7;
import defpackage.ya7;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class zzsy extends zzrp {
    public static final zzbg r;
    public final zzsi[] k;
    public final zzcn[] l;
    public final ArrayList m;
    public final zzfvg n;
    public int o;
    public long[][] p;
    public zzsx q;

    static {
        zzaj zzajVar = new zzaj();
        zzajVar.zza("MergingMediaSource");
        r = zzajVar.zzc();
    }

    public zzsy(boolean z, boolean z2, zzsi... zzsiVarArr) {
        new zzrr();
        this.k = zzsiVarArr;
        this.m = new ArrayList(Arrays.asList(zzsiVarArr));
        this.o = -1;
        this.l = new zzcn[zzsiVarArr.length];
        this.p = new long[0][];
        new HashMap();
        this.n = zzfvy.zzb(8).zzb(2).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzrp
    public final /* bridge */ /* synthetic */ zzsg d(Object obj, zzsg zzsgVar) {
        if (((Integer) obj).intValue() == 0) {
            return zzsgVar;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzrp
    public final /* bridge */ /* synthetic */ void e(Object obj, zzsi zzsiVar, zzcn zzcnVar) {
        int iZzb;
        if (this.q != null) {
            return;
        }
        if (this.o == -1) {
            iZzb = zzcnVar.zzb();
            this.o = iZzb;
        } else {
            int iZzb2 = zzcnVar.zzb();
            int i = this.o;
            if (iZzb2 != i) {
                this.q = new zzsx(0);
                return;
            }
            iZzb = i;
        }
        int length = this.p.length;
        zzcn[] zzcnVarArr = this.l;
        if (length == 0) {
            this.p = (long[][]) Array.newInstance((Class<?>) Long.TYPE, iZzb, zzcnVarArr.length);
        }
        ArrayList arrayList = this.m;
        arrayList.remove(zzsiVar);
        zzcnVarArr[((Integer) obj).intValue()] = zzcnVar;
        if (arrayList.isEmpty()) {
            c(zzcnVarArr[0]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final void zzB(zzse zzseVar) {
        ya7 ya7Var = (ya7) zzseVar;
        int i = 0;
        while (true) {
            zzsi[] zzsiVarArr = this.k;
            if (i >= zzsiVarArr.length) {
                return;
            }
            zzsi zzsiVar = zzsiVarArr[i];
            zzse zzseVar2 = ya7Var.w[i];
            if (zzseVar2 instanceof wa7) {
                zzseVar2 = ((wa7) zzseVar2).w;
            }
            zzsiVar.zzB(zzseVar2);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final zzse zzD(zzsg zzsgVar, zzwf zzwfVar, long j) {
        zzsi[] zzsiVarArr = this.k;
        int length = zzsiVarArr.length;
        zzse[] zzseVarArr = new zzse[length];
        zzcn[] zzcnVarArr = this.l;
        int iZza = zzcnVarArr[0].zza(zzsgVar.zza);
        for (int i = 0; i < length; i++) {
            zzseVarArr[i] = zzsiVarArr[i].zzD(zzsgVar.zzc(zzcnVarArr[i].zzf(iZza)), zzwfVar, j - this.p[iZza][i]);
        }
        return new ya7(this.p[iZza], zzseVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zzrp, com.google.android.gms.internal.ads.zzrh
    public final void zzn(zzfx zzfxVar) {
        super.zzn(zzfxVar);
        int i = 0;
        while (true) {
            zzsi[] zzsiVarArr = this.k;
            if (i >= zzsiVarArr.length) {
                return;
            }
            f(Integer.valueOf(i), zzsiVarArr[i]);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrp, com.google.android.gms.internal.ads.zzrh
    public final void zzq() {
        super.zzq();
        Arrays.fill(this.l, (Object) null);
        this.o = -1;
        this.q = null;
        ArrayList arrayList = this.m;
        arrayList.clear();
        Collections.addAll(arrayList, this.k);
    }

    @Override // com.google.android.gms.internal.ads.zzrp, com.google.android.gms.internal.ads.zzsi
    public final void zzw() throws zzsx {
        zzsx zzsxVar = this.q;
        if (zzsxVar != null) {
            throw zzsxVar;
        }
        super.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzsi
    public final zzbg zzz() {
        zzsi[] zzsiVarArr = this.k;
        return zzsiVarArr.length > 0 ? zzsiVarArr[0].zzz() : r;
    }
}
