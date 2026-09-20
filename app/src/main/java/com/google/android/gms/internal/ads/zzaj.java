package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaj {
    public String a;
    public Uri b;
    public final List c;
    public final zzfuv d;
    public final zzbd e;

    public zzaj() {
        new zzal();
        new zzar(0);
        this.c = Collections.emptyList();
        this.d = zzfuv.zzo();
        new zzau();
        this.e = zzbd.zza;
    }

    public final zzaj zza(String str) {
        this.a = str;
        return this;
    }

    public final zzaj zzb(Uri uri) {
        this.b = uri;
        return this;
    }

    public final zzbg zzc() {
        Uri uri = this.b;
        zzba zzbaVar = uri != null ? new zzba(uri, this.c, this.d) : null;
        String str = this.a;
        if (str == null) {
            str = "";
        }
        return new zzbg(str, new zzap(0), zzbaVar, new zzaw(), zzbm.zza, this.e);
    }
}
