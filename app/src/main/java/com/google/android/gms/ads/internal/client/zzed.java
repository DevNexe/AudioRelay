package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnAdInspectorClosedListener;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbiy;
import com.google.android.gms.internal.ads.zzbkm;
import com.google.android.gms.internal.ads.zzbrl;
import com.google.android.gms.internal.ads.zzbrt;
import com.google.android.gms.internal.ads.zzbru;
import com.google.android.gms.internal.ads.zzbuy;
import com.google.android.gms.internal.ads.zzbvc;
import com.google.android.gms.internal.ads.zzcgc;
import com.google.android.gms.internal.ads.zzcgn;
import com.google.android.gms.internal.ads.zzfsu;
import defpackage.bz5;
import defpackage.oa3;
import defpackage.wf6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes.dex */
public final class zzed {

    @GuardedBy("InternalMobileAds.class")
    public static zzed i;

    @GuardedBy("settingManagerLock")
    public zzcm f;
    public final Object a = new Object();

    @GuardedBy("stateLock")
    public boolean c = false;

    @GuardedBy("stateLock")
    public boolean d = false;
    public final Object e = new Object();

    @Nullable
    public OnAdInspectorClosedListener g = null;
    public RequestConfiguration h = new RequestConfiguration.Builder().build();

    @GuardedBy("stateLock")
    public final ArrayList b = new ArrayList();

    public static zzbru a(List list) {
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzbrl zzbrlVar = (zzbrl) it.next();
            map.put(zzbrlVar.zza, new zzbrt(zzbrlVar.zzb ? AdapterStatus.State.READY : AdapterStatus.State.NOT_READY, zzbrlVar.zzd, zzbrlVar.zzc));
        }
        return new zzbru(map);
    }

    public static zzed zzf() {
        zzed zzedVar;
        synchronized (zzed.class) {
            if (i == null) {
                i = new zzed();
            }
            zzedVar = i;
        }
        return zzedVar;
    }

    @GuardedBy("settingManagerLock")
    public final void b(Context context) {
        try {
            zzbuy.zza().zzb(context, null);
            this.f.zzj();
            this.f.zzk(null, new ObjectWrapper(null));
        } catch (RemoteException e) {
            zzcgn.zzk("MobileAdsSettingManager initialization failed", e);
        }
    }

    @GuardedBy("settingManagerLock")
    public final void c(Context context) {
        if (this.f == null) {
            this.f = (zzcm) new bz5(zzaw.zza(), context).d(context, false);
        }
    }

    public final float zza() {
        synchronized (this.e) {
            zzcm zzcmVar = this.f;
            float fZze = 1.0f;
            if (zzcmVar == null) {
                return 1.0f;
            }
            try {
                fZze = zzcmVar.zze();
            } catch (RemoteException e) {
                zzcgn.zzh("Unable to get app volume.", e);
            }
            return fZze;
        }
    }

    public final RequestConfiguration zzc() {
        return this.h;
    }

    public final InitializationStatus zze() {
        zzbru zzbruVarA;
        synchronized (this.e) {
            oa3.j("MobileAds.initialize() must be called prior to getting initialization status.", this.f != null);
            try {
                zzbruVarA = a(this.f.zzg());
            } catch (RemoteException unused) {
                zzcgn.zzg("Unable to get Initialization status.");
                return new InitializationStatus() { // from class: com.google.android.gms.ads.internal.client.zzdv
                    @Override // com.google.android.gms.ads.initialization.InitializationStatus
                    public final Map getAdapterStatusMap() {
                        HashMap map = new HashMap();
                        map.put("com.google.android.gms.ads.MobileAds", new wf6());
                        return map;
                    }
                };
            }
        }
        return zzbruVarA;
    }

    @Deprecated
    public final String zzh() {
        String strZzc;
        synchronized (this.e) {
            oa3.j("MobileAds.initialize() must be called prior to getting version string.", this.f != null);
            try {
                strZzc = zzfsu.zzc(this.f.zzf());
            } catch (RemoteException e) {
                zzcgn.zzh("Unable to get version string.", e);
                return "";
            }
        }
        return strZzc;
    }

    public final void zzl(Context context) {
        synchronized (this.e) {
            c(context);
            try {
                this.f.zzi();
            } catch (RemoteException unused) {
                zzcgn.zzg("Unable to disable mediation adapter initialization.");
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0086 A[Catch: all -> 0x0064, TryCatch #0 {, blocks: (B:23:0x002f, B:25:0x004f, B:37:0x0074, B:39:0x0086, B:41:0x0098, B:48:0x00db, B:42:0x00a8, B:44:0x00b6, B:46:0x00c8, B:47:0x00d3, B:27:0x0057, B:28:0x0059, B:33:0x0068, B:36:0x006f), top: B:57:0x002f, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0098 A[Catch: all -> 0x0064, TryCatch #0 {, blocks: (B:23:0x002f, B:25:0x004f, B:37:0x0074, B:39:0x0086, B:41:0x0098, B:48:0x00db, B:42:0x00a8, B:44:0x00b6, B:46:0x00c8, B:47:0x00d3, B:27:0x0057, B:28:0x0059, B:33:0x0068, B:36:0x006f), top: B:57:0x002f, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00a8 A[Catch: all -> 0x0064, TryCatch #0 {, blocks: (B:23:0x002f, B:25:0x004f, B:37:0x0074, B:39:0x0086, B:41:0x0098, B:48:0x00db, B:42:0x00a8, B:44:0x00b6, B:46:0x00c8, B:47:0x00d3, B:27:0x0057, B:28:0x0059, B:33:0x0068, B:36:0x006f), top: B:57:0x002f, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00b6 A[Catch: all -> 0x0064, TryCatch #0 {, blocks: (B:23:0x002f, B:25:0x004f, B:37:0x0074, B:39:0x0086, B:41:0x0098, B:48:0x00db, B:42:0x00a8, B:44:0x00b6, B:46:0x00c8, B:47:0x00d3, B:27:0x0057, B:28:0x0059, B:33:0x0068, B:36:0x006f), top: B:57:0x002f, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00c8 A[Catch: all -> 0x0064, TryCatch #0 {, blocks: (B:23:0x002f, B:25:0x004f, B:37:0x0074, B:39:0x0086, B:41:0x0098, B:48:0x00db, B:42:0x00a8, B:44:0x00b6, B:46:0x00c8, B:47:0x00d3, B:27:0x0057, B:28:0x0059, B:33:0x0068, B:36:0x006f), top: B:57:0x002f, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00d3 A[Catch: all -> 0x0064, TryCatch #0 {, blocks: (B:23:0x002f, B:25:0x004f, B:37:0x0074, B:39:0x0086, B:41:0x0098, B:48:0x00db, B:42:0x00a8, B:44:0x00b6, B:46:0x00c8, B:47:0x00d3, B:27:0x0057, B:28:0x0059, B:33:0x0068, B:36:0x006f), top: B:57:0x002f, inners: #1 }] */
    public final void zzm(final Context context, @Nullable String str, @Nullable final OnInitializationCompleteListener onInitializationCompleteListener) {
        final String str2;
        synchronized (this.a) {
            if (this.c) {
                if (onInitializationCompleteListener != null) {
                    this.b.add(onInitializationCompleteListener);
                }
                return;
            }
            if (this.d) {
                if (onInitializationCompleteListener != null) {
                    onInitializationCompleteListener.onInitializationComplete(zze());
                }
                return;
            }
            this.c = true;
            if (onInitializationCompleteListener != null) {
                this.b.add(onInitializationCompleteListener);
            }
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null.");
            }
            synchronized (this.e) {
                try {
                    c(context);
                    this.f.zzr(new zzec(this));
                    this.f.zzn(new zzbvc());
                    if (this.h.getTagForChildDirectedTreatment() == -1 && this.h.getTagForUnderAgeOfConsent() == -1) {
                        zzbiy.zzc(context);
                        str2 = null;
                        if (((Boolean) zzbkm.zza.zze()).booleanValue()) {
                            if (((Boolean) zzay.zzc().zzb(zzbiy.zziF)).booleanValue()) {
                                zzcgn.zze("Initializing on bg thread");
                                zzcgc.zza.execute(new Runnable(context, str2, onInitializationCompleteListener) { // from class: com.google.android.gms.ads.internal.client.zzdw
                                    public final /* synthetic */ Context zzb;
                                    public final /* synthetic */ OnInitializationCompleteListener zzc;

                                    {
                                        this.zzc = onInitializationCompleteListener;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        zzed zzedVar = this.zza;
                                        Context context2 = this.zzb;
                                        synchronized (zzedVar.e) {
                                            zzedVar.b(context2);
                                        }
                                    }
                                });
                            } else if (((Boolean) zzbkm.zzb.zze()).booleanValue()) {
                                if (((Boolean) zzay.zzc().zzb(zzbiy.zziF)).booleanValue()) {
                                    zzcgc.zzb.execute(new Runnable(context, str2, onInitializationCompleteListener) { // from class: com.google.android.gms.ads.internal.client.zzdx
                                        public final /* synthetic */ Context zzb;
                                        public final /* synthetic */ OnInitializationCompleteListener zzc;

                                        {
                                            this.zzc = onInitializationCompleteListener;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            zzed zzedVar = this.zza;
                                            Context context2 = this.zzb;
                                            synchronized (zzedVar.e) {
                                                zzedVar.b(context2);
                                            }
                                        }
                                    });
                                } else {
                                    zzcgn.zze("Initializing on calling thread");
                                    b(context);
                                }
                            } else {
                                zzcgn.zze("Initializing on calling thread");
                                b(context);
                            }
                        } else if (((Boolean) zzbkm.zzb.zze()).booleanValue()) {
                            if (((Boolean) zzay.zzc().zzb(zzbiy.zziF)).booleanValue()) {
                                zzcgc.zzb.execute(new Runnable(context, str2, onInitializationCompleteListener) { // from class: com.google.android.gms.ads.internal.client.zzdx
                                    public final /* synthetic */ Context zzb;
                                    public final /* synthetic */ OnInitializationCompleteListener zzc;

                                    {
                                        this.zzc = onInitializationCompleteListener;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        zzed zzedVar = this.zza;
                                        Context context2 = this.zzb;
                                        synchronized (zzedVar.e) {
                                            zzedVar.b(context2);
                                        }
                                    }
                                });
                            } else {
                                zzcgn.zze("Initializing on calling thread");
                                b(context);
                            }
                        } else {
                            zzcgn.zze("Initializing on calling thread");
                            b(context);
                        }
                    } else {
                        try {
                            this.f.zzs(new zzez(this.h));
                        } catch (RemoteException e) {
                            zzcgn.zzh("Unable to set request configuration parcel.", e);
                        }
                        zzbiy.zzc(context);
                        str2 = null;
                        if (((Boolean) zzbkm.zza.zze()).booleanValue()) {
                            if (((Boolean) zzay.zzc().zzb(zzbiy.zziF)).booleanValue()) {
                                zzcgn.zze("Initializing on bg thread");
                                zzcgc.zza.execute(new Runnable(context, str2, onInitializationCompleteListener) { // from class: com.google.android.gms.ads.internal.client.zzdw
                                    public final /* synthetic */ Context zzb;
                                    public final /* synthetic */ OnInitializationCompleteListener zzc;

                                    {
                                        this.zzc = onInitializationCompleteListener;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        zzed zzedVar = this.zza;
                                        Context context2 = this.zzb;
                                        synchronized (zzedVar.e) {
                                            zzedVar.b(context2);
                                        }
                                    }
                                });
                            } else if (((Boolean) zzbkm.zzb.zze()).booleanValue()) {
                                if (((Boolean) zzay.zzc().zzb(zzbiy.zziF)).booleanValue()) {
                                    zzcgc.zzb.execute(new Runnable(context, str2, onInitializationCompleteListener) { // from class: com.google.android.gms.ads.internal.client.zzdx
                                        public final /* synthetic */ Context zzb;
                                        public final /* synthetic */ OnInitializationCompleteListener zzc;

                                        {
                                            this.zzc = onInitializationCompleteListener;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            zzed zzedVar = this.zza;
                                            Context context2 = this.zzb;
                                            synchronized (zzedVar.e) {
                                                zzedVar.b(context2);
                                            }
                                        }
                                    });
                                } else {
                                    zzcgn.zze("Initializing on calling thread");
                                    b(context);
                                }
                            } else {
                                zzcgn.zze("Initializing on calling thread");
                                b(context);
                            }
                        } else if (((Boolean) zzbkm.zzb.zze()).booleanValue()) {
                            if (((Boolean) zzay.zzc().zzb(zzbiy.zziF)).booleanValue()) {
                                zzcgc.zzb.execute(new Runnable(context, str2, onInitializationCompleteListener) { // from class: com.google.android.gms.ads.internal.client.zzdx
                                    public final /* synthetic */ Context zzb;
                                    public final /* synthetic */ OnInitializationCompleteListener zzc;

                                    {
                                        this.zzc = onInitializationCompleteListener;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        zzed zzedVar = this.zza;
                                        Context context2 = this.zzb;
                                        synchronized (zzedVar.e) {
                                            zzedVar.b(context2);
                                        }
                                    }
                                });
                            } else {
                                zzcgn.zze("Initializing on calling thread");
                                b(context);
                            }
                        } else {
                            zzcgn.zze("Initializing on calling thread");
                            b(context);
                        }
                    }
                } catch (RemoteException e2) {
                    zzcgn.zzk("MobileAdsSettingManager initialization failed", e2);
                }
                throw th;
            }
        }
    }

    public final void zzp(Context context, OnAdInspectorClosedListener onAdInspectorClosedListener) {
        synchronized (this.e) {
            c(context);
            this.g = onAdInspectorClosedListener;
            try {
                this.f.zzl(new zzea());
            } catch (RemoteException unused) {
                zzcgn.zzg("Unable to open the ad inspector.");
                if (onAdInspectorClosedListener != null) {
                    onAdInspectorClosedListener.onAdInspectorClosed(new AdInspectorError(0, "Ad inspector had an internal error.", MobileAds.ERROR_DOMAIN));
                }
            }
        }
    }

    public final void zzq(Context context, String str) {
        synchronized (this.e) {
            oa3.j("MobileAds.initialize() must be called prior to opening debug menu.", this.f != null);
            try {
                this.f.zzm(new ObjectWrapper(context), str);
            } catch (RemoteException e) {
                zzcgn.zzh("Unable to open debug menu.", e);
            }
        }
    }

    public final void zzr(Class cls) {
        synchronized (this.e) {
            try {
                this.f.zzh(cls.getCanonicalName());
            } catch (RemoteException e) {
                zzcgn.zzh("Unable to register RtbAdapter", e);
            }
        }
    }

    public final void zzs(boolean z) {
        synchronized (this.e) {
            oa3.j("MobileAds.initialize() must be called prior to setting app muted state.", this.f != null);
            try {
                this.f.zzo(z);
            } catch (RemoteException e) {
                zzcgn.zzh("Unable to set app mute state.", e);
            }
        }
    }

    public final void zzt(float f) {
        oa3.a("The app volume must be a value between 0 and 1 inclusive.", f >= 0.0f && f <= 1.0f);
        synchronized (this.e) {
            oa3.j("MobileAds.initialize() must be called prior to setting the app volume.", this.f != null);
            try {
                this.f.zzp(f);
            } catch (RemoteException e) {
                zzcgn.zzh("Unable to set app volume.", e);
            }
        }
    }

    public final void zzu(RequestConfiguration requestConfiguration) {
        oa3.a("Null passed to setRequestConfiguration.", requestConfiguration != null);
        synchronized (this.e) {
            RequestConfiguration requestConfiguration2 = this.h;
            this.h = requestConfiguration;
            if (this.f == null) {
                return;
            }
            if (requestConfiguration2.getTagForChildDirectedTreatment() != requestConfiguration.getTagForChildDirectedTreatment() || requestConfiguration2.getTagForUnderAgeOfConsent() != requestConfiguration.getTagForUnderAgeOfConsent()) {
                try {
                    this.f.zzs(new zzez(requestConfiguration));
                } catch (RemoteException e) {
                    zzcgn.zzh("Unable to set request configuration parcel.", e);
                }
            }
        }
    }

    public final boolean zzv() {
        synchronized (this.e) {
            zzcm zzcmVar = this.f;
            boolean zZzt = false;
            if (zzcmVar == null) {
                return false;
            }
            try {
                zZzt = zzcmVar.zzt();
            } catch (RemoteException e) {
                zzcgn.zzh("Unable to get app mute state.", e);
            }
            return zZzt;
        }
    }
}
