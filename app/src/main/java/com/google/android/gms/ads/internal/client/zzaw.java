package com.google.android.gms.ads.internal.client;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbnz;
import com.google.android.gms.internal.ads.zzboa;
import com.google.android.gms.internal.ads.zzbyx;
import com.google.android.gms.internal.ads.zzccv;
import com.google.android.gms.internal.ads.zzcgg;
import com.google.android.gms.internal.ads.zzcgt;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public final class zzaw {
    public static final zzaw f = new zzaw();
    public final zzcgg a;
    public final zzau b;
    public final String c;
    public final zzcgt d;
    public final Random e;

    public zzaw() {
        zzcgg zzcggVar = new zzcgg();
        zzau zzauVar = new zzau(new zzk(), new zzi(), new zzek(), new zzbnz(), new zzccv(), new zzbyx(), new zzboa());
        String strZzd = zzcgg.zzd();
        zzcgt zzcgtVar = new zzcgt(0, ModuleDescriptor.MODULE_VERSION, true, false, false);
        Random random = new Random();
        this.a = zzcggVar;
        this.b = zzauVar;
        this.c = strZzd;
        this.d = zzcgtVar;
        this.e = random;
    }

    public static zzau zza() {
        return f.b;
    }

    public static zzcgg zzb() {
        return f.a;
    }

    public static zzcgt zzc() {
        return f.d;
    }

    public static String zzd() {
        return f.c;
    }

    public static Random zze() {
        return f.e;
    }
}
