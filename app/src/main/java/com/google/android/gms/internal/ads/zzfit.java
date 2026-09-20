package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfit implements zzfir {
    public final Context a;
    public final int l;
    public long b = 0;
    public long c = -1;
    public boolean d = false;
    public int m = 2;
    public int n = 2;
    public int e = 0;
    public String f = "";
    public String g = "";
    public String h = "";
    public String i = "";
    public boolean j = false;
    public boolean k = false;

    public zzfit(Context context, int i) {
        this.a = context;
        this.l = i;
    }

    public final synchronized zzfit zzA(int i) {
        this.m = i;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfir
    public final /* bridge */ /* synthetic */ zzfir zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzo(zzeVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfir
    public final /* bridge */ /* synthetic */ zzfir zzb(zzfdd zzfddVar) {
        zzp(zzfddVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfir
    public final /* bridge */ /* synthetic */ zzfir zzc(String str) {
        zzq(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfir
    public final /* bridge */ /* synthetic */ zzfir zzd(String str) {
        zzr(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfir
    public final /* bridge */ /* synthetic */ zzfir zze(boolean z) {
        zzs(z);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfir
    public final /* bridge */ /* synthetic */ zzfir zzf() {
        zzt();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfir
    public final /* bridge */ /* synthetic */ zzfir zzg() {
        zzu();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfir
    public final synchronized boolean zzh() {
        return this.k;
    }

    @Override // com.google.android.gms.internal.ads.zzfir
    public final boolean zzi() {
        return !TextUtils.isEmpty(this.h);
    }

    @Override // com.google.android.gms.internal.ads.zzfir
    public final synchronized zzfiv zzj() {
        if (this.j) {
            return null;
        }
        this.j = true;
        if (!this.k) {
            zzt();
        }
        if (this.c < 0) {
            zzu();
        }
        return new zzfiv(this);
    }

    @Override // com.google.android.gms.internal.ads.zzfir
    public final /* bridge */ /* synthetic */ zzfir zzk(int i) {
        zzA(i);
        return this;
    }

    public final synchronized zzfit zzo(com.google.android.gms.ads.internal.client.zze zzeVar) {
        IBinder iBinder = zzeVar.zze;
        if (iBinder == null) {
            return this;
        }
        zzdcr zzdcrVar = (zzdcr) iBinder;
        String strZzj = zzdcrVar.zzj();
        if (!TextUtils.isEmpty(strZzj)) {
            this.f = strZzj;
        }
        String strZzh = zzdcrVar.zzh();
        if (!TextUtils.isEmpty(strZzh)) {
            this.g = strZzh;
        }
        return this;
    }

    public final synchronized zzfit zzp(zzfdd zzfddVar) {
        if (!TextUtils.isEmpty(zzfddVar.zzb.zzb)) {
            this.f = zzfddVar.zzb.zzb;
        }
        for (zzfcs zzfcsVar : zzfddVar.zza) {
            if (!TextUtils.isEmpty(zzfcsVar.zzac)) {
                this.g = zzfcsVar.zzac;
                break;
            }
        }
        return this;
    }

    public final synchronized zzfit zzq(String str) {
        this.h = str;
        return this;
    }

    public final synchronized zzfit zzr(String str) {
        this.i = str;
        return this;
    }

    public final synchronized zzfit zzs(boolean z) {
        this.d = z;
        return this;
    }

    public final synchronized zzfit zzt() {
        Configuration configuration;
        this.e = com.google.android.gms.ads.internal.zzt.zzr().zzl(this.a);
        Resources resources = this.a.getResources();
        int i = 2;
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            i = configuration.orientation == 2 ? 4 : 3;
        }
        this.n = i;
        this.b = com.google.android.gms.ads.internal.zzt.zzB().c();
        this.k = true;
        return this;
    }

    public final synchronized zzfit zzu() {
        this.c = com.google.android.gms.ads.internal.zzt.zzB().c();
        return this;
    }
}
