package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class zzezv {
    public static void zza(AtomicReference atomicReference, zzezu zzezuVar) {
        Object obj = atomicReference.get();
        if (obj == null) {
            return;
        }
        try {
            zzezuVar.zza(obj);
        } catch (RemoteException e) {
            zzcgn.zzl("#007 Could not call remote method.", e);
        } catch (NullPointerException e2) {
            zzcgn.zzk("NullPointerException occurs when invoking a method from a delegating listener.", e2);
        }
    }
}
