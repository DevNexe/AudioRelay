package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import defpackage.qz5;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeb {
    public static zzeb e;
    public final Handler a = new Handler(Looper.getMainLooper());
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public final Object c = new Object();
    public int d = 0;

    public zzeb(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        zzel.zzA(context, new qz5(this), intentFilter);
    }

    public static /* synthetic */ void a(zzeb zzebVar, int i) {
        synchronized (zzebVar.c) {
            if (zzebVar.d == i) {
                return;
            }
            zzebVar.d = i;
            for (WeakReference weakReference : zzebVar.b) {
                zzwg zzwgVar = (zzwg) weakReference.get();
                if (zzwgVar != null) {
                    zzwi.zzh(zzwgVar.zza, i);
                } else {
                    zzebVar.b.remove(weakReference);
                }
            }
        }
    }

    public static synchronized zzeb zzb(Context context) {
        if (e == null) {
            e = new zzeb(context);
        }
        return e;
    }

    public final int zza() {
        int i;
        synchronized (this.c) {
            i = this.d;
        }
        return i;
    }

    public final void zzd(final zzwg zzwgVar) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.b;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            if (weakReference.get() == null) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        copyOnWriteArrayList.add(new WeakReference(zzwgVar));
        final byte[] bArr = null;
        this.a.post(new Runnable(zzwgVar, bArr) { // from class: com.google.android.gms.internal.ads.zzdx
            public final /* synthetic */ zzwg zzb;

            @Override // java.lang.Runnable
            public final void run() {
                zzeb zzebVar = this.zza;
                zzwg zzwgVar2 = this.zzb;
                zzwi.zzh(zzwgVar2.zza, zzebVar.zza());
            }
        });
    }
}
