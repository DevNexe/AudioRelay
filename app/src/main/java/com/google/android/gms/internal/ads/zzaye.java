package com.google.android.gms.internal.ads;

import defpackage.e16;
import defpackage.l26;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaye implements zzaya {
    public zzatd A;
    public zzayd C;
    public final zzaya[] w;
    public final ArrayList x;
    public zzaxz z;
    public final zzatc y = new zzatc();
    public int B = -1;

    public zzaye(zzaya... zzayaVarArr) {
        this.w = zzayaVarArr;
        this.x = new ArrayList(Arrays.asList(zzayaVarArr));
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    public final void zza() throws zzayd {
        zzayd zzaydVar = this.C;
        if (zzaydVar != null) {
            throw zzaydVar;
        }
        for (zzaya zzayaVar : this.w) {
            zzayaVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    public final void zzb(zzasi zzasiVar, boolean z, zzaxz zzaxzVar) {
        this.z = zzaxzVar;
        int i = 0;
        while (true) {
            zzaya[] zzayaVarArr = this.w;
            if (i >= zzayaVarArr.length) {
                return;
            }
            zzayaVarArr[i].zzb(zzasiVar, false, new e16(this, i));
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    public final void zzc(zzaxy zzaxyVar) {
        l26 l26Var = (l26) zzaxyVar;
        int i = 0;
        while (true) {
            zzaya[] zzayaVarArr = this.w;
            if (i >= zzayaVarArr.length) {
                return;
            }
            zzayaVarArr[i].zzc(l26Var.w[i]);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    public final void zzd() {
        for (zzaya zzayaVar : this.w) {
            zzayaVar.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    public final zzaxy zze(int i, zzazl zzazlVar) {
        zzaya[] zzayaVarArr = this.w;
        int length = zzayaVarArr.length;
        zzaxy[] zzaxyVarArr = new zzaxy[length];
        for (int i2 = 0; i2 < length; i2++) {
            zzaxyVarArr[i2] = zzayaVarArr[i2].zze(i, zzazlVar);
        }
        return new l26(zzaxyVarArr);
    }
}
