package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbeh {

    @GuardedBy("lock")
    public zzbdw a;

    @GuardedBy("lock")
    public boolean b;
    public final Object c = new Object();

    public zzbeh(Context context) {
    }

    public static /* bridge */ /* synthetic */ void a(zzbeh zzbehVar) {
        synchronized (zzbehVar.c) {
            zzbdw zzbdwVar = zzbehVar.a;
            if (zzbdwVar == null) {
                return;
            }
            zzbdwVar.disconnect();
            zzbehVar.a = null;
            Binder.flushPendingCommands();
        }
    }
}
