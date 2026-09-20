package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.query.AdInfo;
import com.google.android.gms.ads.search.SearchAdRequest;
import com.google.android.gms.internal.ads.zzcgg;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* JADX INFO: loaded from: classes.dex */
public final class zzdr {
    public final Date a;
    public final String b;
    public final ArrayList c;
    public final int d;
    public final Set e;
    public final Bundle f;
    public final Map g;
    public final String h;
    public final String i;

    @NotOnlyInitialized
    public final SearchAdRequest j;
    public final int k;
    public final Set l;
    public final Bundle m;
    public final Set n;
    public final boolean o;
    public final AdInfo p;
    public final String q;
    public final int r;

    public zzdr(zzdq zzdqVar, SearchAdRequest searchAdRequest) {
        this.a = zzdqVar.g;
        this.b = zzdqVar.h;
        this.c = zzdqVar.i;
        this.d = zzdqVar.j;
        this.e = Collections.unmodifiableSet(zzdqVar.a);
        this.f = zzdqVar.b;
        this.g = Collections.unmodifiableMap(zzdqVar.c);
        this.h = zzdqVar.k;
        this.i = zzdqVar.l;
        this.j = searchAdRequest;
        this.k = zzdqVar.m;
        this.l = Collections.unmodifiableSet(zzdqVar.d);
        this.m = zzdqVar.e;
        this.n = Collections.unmodifiableSet(zzdqVar.f);
        this.o = zzdqVar.n;
        this.p = zzdqVar.o;
        this.q = zzdqVar.p;
        this.r = zzdqVar.q;
    }

    @Deprecated
    public final int zza() {
        return this.d;
    }

    public final int zzb() {
        return this.r;
    }

    public final int zzc() {
        return this.k;
    }

    public final Bundle zzd(Class cls) {
        Bundle bundle = this.f.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
        if (bundle != null) {
            return bundle.getBundle(cls.getName());
        }
        return null;
    }

    public final Bundle zze() {
        return this.m;
    }

    public final Bundle zzf(Class cls) {
        return this.f.getBundle(cls.getName());
    }

    public final Bundle zzg() {
        return this.f;
    }

    @Deprecated
    public final NetworkExtras zzh(Class cls) {
        return (NetworkExtras) this.g.get(cls);
    }

    public final AdInfo zzi() {
        return this.p;
    }

    public final SearchAdRequest zzj() {
        return this.j;
    }

    public final String zzk() {
        return this.q;
    }

    public final String zzl() {
        return this.b;
    }

    public final String zzm() {
        return this.h;
    }

    public final String zzn() {
        return this.i;
    }

    @Deprecated
    public final Date zzo() {
        return this.a;
    }

    public final List zzp() {
        return new ArrayList(this.c);
    }

    public final Set zzq() {
        return this.n;
    }

    public final Set zzr() {
        return this.e;
    }

    @Deprecated
    public final boolean zzs() {
        return this.o;
    }

    public final boolean zzt(Context context) {
        RequestConfiguration requestConfigurationZzc = zzed.zzf().zzc();
        zzaw.zzb();
        String strZzx = zzcgg.zzx(context);
        return this.l.contains(strZzx) || requestConfigurationZzc.getTestDeviceIds().contains(strZzx);
    }
}
