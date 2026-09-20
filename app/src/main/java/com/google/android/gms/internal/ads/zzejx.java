package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import defpackage.ft;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzejx {
    public final ft a;
    public final zzejy b;
    public final zzfju c;
    public final List d = Collections.synchronizedList(new ArrayList());
    public final boolean e = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzfS)).booleanValue();
    public final zzegp f;

    public zzejx(ft ftVar, zzejy zzejyVar, zzegp zzegpVar, zzfju zzfjuVar) {
        this.a = ftVar;
        this.b = zzejyVar;
        this.f = zzegpVar;
        this.c = zzfjuVar;
    }

    public static /* bridge */ /* synthetic */ void a(zzejx zzejxVar, String str, int i, long j, String str2) {
        String strA = str + "." + i + "." + j;
        if (!TextUtils.isEmpty(str2)) {
            strA = defpackage.LPt6Fixed.a(strA, ".", str2);
        }
        zzejxVar.d.add(strA);
    }

    public final String zzf() {
        return TextUtils.join("_", this.d);
    }
}
