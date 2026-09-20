package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.v36;
import defpackage.x36;
import defpackage.y36;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbei {
    public static final Future zza(Context context, zzbdx zzbdxVar) {
        zzbeh zzbehVar = new zzbeh(context);
        v36 v36Var = new v36(zzbehVar);
        x36 x36Var = new x36(zzbehVar, zzbdxVar, v36Var);
        y36 y36Var = new y36(zzbehVar, v36Var);
        synchronized (zzbehVar.c) {
            zzbdw zzbdwVar = new zzbdw(context, com.google.android.gms.ads.internal.zzt.zzu().zzb(), x36Var, y36Var);
            zzbehVar.a = zzbdwVar;
            zzbdwVar.checkAvailabilityAndConnect();
        }
        return v36Var;
    }
}
