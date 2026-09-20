package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbvc extends zzbve {
    static {
        new zzbxc();
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final zzbvi zzb(String str) throws RemoteException {
        zzbwe zzbweVar;
        try {
            try {
                Class<?> cls = Class.forName(str, false, zzbvc.class.getClassLoader());
                if (MediationAdapter.class.isAssignableFrom(cls)) {
                    return new zzbwe((MediationAdapter) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
                if (Adapter.class.isAssignableFrom(cls)) {
                    return new zzbwe((Adapter) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
                zzcgn.zzj("Could not instantiate mediation adapter: " + str + " (not a valid adapter).");
                throw new RemoteException();
            } catch (Throwable unused) {
                zzcgn.zze("Reflection failed, retrying using direct instantiation");
                if (!"com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                    if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                        zzbweVar = new zzbwe(new CustomEventAdapter());
                    }
                    throw new RemoteException();
                }
                zzbweVar = new zzbwe(new AdMobAdapter());
                return zzbweVar;
            }
        } catch (Throwable th) {
            zzcgn.zzk("Could not instantiate mediation adapter: " + str + ". ", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final zzbwy zzc(String str) throws RemoteException {
        try {
            return new zzbxj((RtbAdapter) Class.forName(str, false, zzbxc.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (Throwable unused) {
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final boolean zzd(String str) {
        try {
            return Adapter.class.isAssignableFrom(Class.forName(str, false, zzbvc.class.getClassLoader()));
        } catch (Throwable unused) {
            zzcgn.zzj("Could not load custom event implementation class as Adapter: " + str + ", assuming old custom event implementation.");
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvf
    public final boolean zze(String str) {
        try {
            return CustomEvent.class.isAssignableFrom(Class.forName(str, false, zzbvc.class.getClassLoader()));
        } catch (Throwable unused) {
            zzcgn.zzj("Could not load custom event implementation class: " + str + ", trying Adapter implementation class.");
            return false;
        }
    }
}
