package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.VV;
import defpackage.be6;
import defpackage.nd6;
import defpackage.qb6;
import defpackage.rd6;
import defpackage.va6;
import defpackage.ve6;
import defpackage.we6;
import defpackage.zb6;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbuv extends zzcod {
    public final VV w;

    public zzbuv(VV vv) {
        this.w = vv;
    }

    @Override // com.google.android.gms.internal.ads.zzcoe
    public final int zzb(String str) {
        return this.w.a.d(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcoe
    public final long zzc() {
        return this.w.a.e();
    }

    @Override // com.google.android.gms.internal.ads.zzcoe
    public final Bundle zzd(Bundle bundle) {
        com.google.android.gms.internal.measurement.CQf cQf = this.w.a;
        cQf.getClass();
        com.google.android.gms.internal.measurement.zzbz zzbzVar = new com.google.android.gms.internal.measurement.zzbz();
        cQf.c(new be6(cQf, bundle, zzbzVar));
        return zzbzVar.L0(5000L);
    }

    @Override // com.google.android.gms.internal.ads.zzcoe
    public final String zze() {
        return this.w.a.f;
    }

    @Override // com.google.android.gms.internal.ads.zzcoe
    public final String zzf() {
        com.google.android.gms.internal.measurement.CQf cQf = this.w.a;
        cQf.getClass();
        com.google.android.gms.internal.measurement.zzbz zzbzVar = new com.google.android.gms.internal.measurement.zzbz();
        cQf.c(new rd6(cQf, zzbzVar, 0));
        return zzbzVar.M0(50L);
    }

    @Override // com.google.android.gms.internal.ads.zzcoe
    public final String zzg() {
        com.google.android.gms.internal.measurement.CQf cQf = this.w.a;
        cQf.getClass();
        com.google.android.gms.internal.measurement.zzbz zzbzVar = new com.google.android.gms.internal.measurement.zzbz();
        cQf.c(new rd6(cQf, zzbzVar, 1));
        return zzbzVar.M0(500L);
    }

    @Override // com.google.android.gms.internal.ads.zzcoe
    public final String zzh() {
        com.google.android.gms.internal.measurement.CQf cQf = this.w.a;
        cQf.getClass();
        com.google.android.gms.internal.measurement.zzbz zzbzVar = new com.google.android.gms.internal.measurement.zzbz();
        cQf.c(new nd6(cQf, zzbzVar, 1));
        return zzbzVar.M0(500L);
    }

    @Override // com.google.android.gms.internal.ads.zzcoe
    public final String zzi() {
        com.google.android.gms.internal.measurement.CQf cQf = this.w.a;
        cQf.getClass();
        com.google.android.gms.internal.measurement.zzbz zzbzVar = new com.google.android.gms.internal.measurement.zzbz();
        cQf.c(new nd6(cQf, zzbzVar, 0));
        return zzbzVar.M0(500L);
    }

    @Override // com.google.android.gms.internal.ads.zzcoe
    public final List zzj(String str, String str2) {
        return this.w.a.g(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcoe
    public final Map zzk(String str, String str2, boolean z) {
        return this.w.a.h(str, str2, z);
    }

    @Override // com.google.android.gms.internal.ads.zzcoe
    public final void zzl(String str) {
        com.google.android.gms.internal.measurement.CQf cQf = this.w.a;
        cQf.getClass();
        cQf.c(new zb6(cQf, str, 1));
    }

    @Override // com.google.android.gms.internal.ads.zzcoe
    public final void zzm(String str, String str2, Bundle bundle) {
        com.google.android.gms.internal.measurement.CQf cQf = this.w.a;
        cQf.getClass();
        cQf.c(new va6(cQf, str, str2, bundle));
    }

    @Override // com.google.android.gms.internal.ads.zzcoe
    public final void zzn(String str) {
        com.google.android.gms.internal.measurement.CQf cQf = this.w.a;
        cQf.getClass();
        cQf.c(new com.google.android.gms.internal.measurement.QnHx(cQf, str, 2));
    }

    @Override // com.google.android.gms.internal.ads.zzcoe
    public final void zzo(String str, String str2, Bundle bundle) {
        com.google.android.gms.internal.measurement.CQf cQf = this.w.a;
        cQf.getClass();
        cQf.c(new ve6(cQf, str, str2, bundle, true));
    }

    @Override // com.google.android.gms.internal.ads.zzcoe
    public final void zzp(Bundle bundle) {
        com.google.android.gms.internal.measurement.CQf cQf = this.w.a;
        cQf.getClass();
        cQf.c(new be6(cQf, bundle, new com.google.android.gms.internal.measurement.zzbz()));
    }

    @Override // com.google.android.gms.internal.ads.zzcoe
    public final void zzq(Bundle bundle) {
        com.google.android.gms.internal.measurement.CQf cQf = this.w.a;
        cQf.getClass();
        cQf.c(new nd6(cQf, bundle, 2));
    }

    @Override // com.google.android.gms.internal.ads.zzcoe
    public final void zzr(Bundle bundle) {
        com.google.android.gms.internal.measurement.CQf cQf = this.w.a;
        cQf.getClass();
        cQf.c(new com.google.android.gms.internal.measurement.QnHx(cQf, bundle, 1));
    }

    @Override // com.google.android.gms.internal.ads.zzcoe
    public final void zzs(IObjectWrapper iObjectWrapper, String str, String str2) {
        Activity activity = iObjectWrapper != null ? (Activity) ObjectWrapper.M0(iObjectWrapper) : null;
        com.google.android.gms.internal.measurement.CQf cQf = this.w.a;
        cQf.getClass();
        cQf.c(new qb6(cQf, activity, str, str2));
    }

    @Override // com.google.android.gms.internal.ads.zzcoe
    public final void zzt(String str, String str2, IObjectWrapper iObjectWrapper) {
        Object objM0 = iObjectWrapper != null ? ObjectWrapper.M0(iObjectWrapper) : null;
        com.google.android.gms.internal.measurement.CQf cQf = this.w.a;
        cQf.getClass();
        cQf.c(new we6(cQf, str, str2, objM0, true));
    }
}
