package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import defpackage.oa3;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfdl {
    public com.google.android.gms.ads.internal.client.zzl a;
    public com.google.android.gms.ads.internal.client.zzq b;
    public String c;
    public com.google.android.gms.ads.internal.client.zzff d;
    public boolean e;
    public ArrayList f;
    public ArrayList g;
    public zzblo h;
    public com.google.android.gms.ads.internal.client.zzw i;
    public AdManagerAdViewOptions j;
    public PublisherAdViewOptions k;
    public com.google.android.gms.ads.internal.client.zzbz l;
    public zzbrx n;
    public zzeno q;
    public com.google.android.gms.ads.internal.client.zzcd s;
    public int m = 1;
    public final zzfcy o = new zzfcy();
    public boolean p = false;
    public boolean r = false;

    public final zzfdl zzA(zzblo zzbloVar) {
        this.h = zzbloVar;
        return this;
    }

    public final zzfdl zzB(ArrayList arrayList) {
        this.f = arrayList;
        return this;
    }

    public final zzfdl zzC(ArrayList arrayList) {
        this.g = arrayList;
        return this;
    }

    public final zzfdl zzD(PublisherAdViewOptions publisherAdViewOptions) {
        this.k = publisherAdViewOptions;
        if (publisherAdViewOptions != null) {
            this.e = publisherAdViewOptions.zzc();
            this.l = publisherAdViewOptions.zza();
        }
        return this;
    }

    public final zzfdl zzE(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        this.a = zzlVar;
        return this;
    }

    public final zzfdl zzF(com.google.android.gms.ads.internal.client.zzff zzffVar) {
        this.d = zzffVar;
        return this;
    }

    public final zzfdn zzG() {
        oa3.i(this.c, "ad unit must not be null");
        oa3.i(this.b, "ad size must not be null");
        oa3.i(this.a, "ad request must not be null");
        return new zzfdn(this);
    }

    public final String zzI() {
        return this.c;
    }

    public final boolean zzO() {
        return this.p;
    }

    public final zzfdl zzQ(com.google.android.gms.ads.internal.client.zzcd zzcdVar) {
        this.s = zzcdVar;
        return this;
    }

    public final com.google.android.gms.ads.internal.client.zzl zze() {
        return this.a;
    }

    public final com.google.android.gms.ads.internal.client.zzq zzg() {
        return this.b;
    }

    public final zzfcy zzo() {
        return this.o;
    }

    public final zzfdl zzp(zzfdn zzfdnVar) {
        this.o.zza(zzfdnVar.zzo.zza);
        this.a = zzfdnVar.zzd;
        this.b = zzfdnVar.zze;
        this.s = zzfdnVar.zzr;
        this.c = zzfdnVar.zzf;
        this.d = zzfdnVar.zza;
        this.f = zzfdnVar.zzg;
        this.g = zzfdnVar.zzh;
        this.h = zzfdnVar.zzi;
        this.i = zzfdnVar.zzj;
        zzq(zzfdnVar.zzl);
        zzD(zzfdnVar.zzm);
        this.p = zzfdnVar.zzp;
        this.q = zzfdnVar.zzc;
        this.r = zzfdnVar.zzq;
        return this;
    }

    public final zzfdl zzq(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.j = adManagerAdViewOptions;
        if (adManagerAdViewOptions != null) {
            this.e = adManagerAdViewOptions.getManualImpressionsEnabled();
        }
        return this;
    }

    public final zzfdl zzr(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        this.b = zzqVar;
        return this;
    }

    public final zzfdl zzs(String str) {
        this.c = str;
        return this;
    }

    public final zzfdl zzt(com.google.android.gms.ads.internal.client.zzw zzwVar) {
        this.i = zzwVar;
        return this;
    }

    public final zzfdl zzu(zzeno zzenoVar) {
        this.q = zzenoVar;
        return this;
    }

    public final zzfdl zzv(zzbrx zzbrxVar) {
        this.n = zzbrxVar;
        this.d = new com.google.android.gms.ads.internal.client.zzff(false, true, false);
        return this;
    }

    public final zzfdl zzw(boolean z) {
        this.p = z;
        return this;
    }

    public final zzfdl zzx(boolean z) {
        this.r = true;
        return this;
    }

    public final zzfdl zzy(boolean z) {
        this.e = z;
        return this;
    }

    public final zzfdl zzz(int i) {
        this.m = i;
        return this;
    }
}
