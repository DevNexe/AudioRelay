package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.internal.ads_identifier.zzd;
import com.google.android.gms.internal.ads_identifier.zze;
import com.google.android.gms.internal.ads_identifier.zzf;
import defpackage.e60;
import defpackage.kb;
import defpackage.oa1;
import defpackage.oa3;
import defpackage.s26;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes.dex */
@ParametersAreNonnullByDefault
public class AdvertisingIdClient {

    @GuardedBy("this")
    public kb a;

    @GuardedBy("this")
    public zzf b;

    @GuardedBy("this")
    public boolean c;
    public final Object d;

    @GuardedBy("mAutoDisconnectTaskLock")
    public s26 e;

    @GuardedBy("this")
    public final Context f;
    public final long g;

    public static final class Info {
        public final String a;
        public final boolean b;

        @Deprecated
        public Info(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        public String getId() {
            return this.a;
        }

        public boolean isLimitAdTrackingEnabled() {
            return this.b;
        }

        public String toString() {
            String str = this.a;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(this.b);
            return sb.toString();
        }
    }

    public AdvertisingIdClient(Context context) {
        this(context, 30000L, false, false);
    }

    public static void b(Info info, long j, Throwable th) {
        if (Math.random() <= 0.0d) {
            HashMap map = new HashMap();
            map.put("app_context", "1");
            if (info != null) {
                map.put("limit_ad_tracking", true != info.isLimitAdTrackingEnabled() ? "0" : "1");
                String id = info.getId();
                if (id != null) {
                    map.put("ad_id_size", Integer.toString(id.length()));
                }
            }
            if (th != null) {
                map.put("error", th.getClass().getName());
            }
            map.put("tag", "AdvertisingIdClient");
            map.put("time_spent", Long.toString(j));
            new QnHx(map).start();
        }
    }

    public static Info getAdvertisingIdInfo(Context context) {
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, true, false);
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            advertisingIdClient.a(false);
            Info infoC = advertisingIdClient.c();
            b(infoC, SystemClock.elapsedRealtime() - jElapsedRealtime, null);
            advertisingIdClient.zza();
            return infoC;
        } catch (Throwable th) {
            try {
                b(null, -1L, th);
                throw th;
            } catch (Throwable th2) {
                advertisingIdClient.zza();
                throw th2;
            }
        }
    }

    public static boolean getIsAdIdFakeForDebugLogging(Context context) {
        boolean zZzd;
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, false, false);
        try {
            advertisingIdClient.a(false);
            oa3.g("Calling this from your main thread can lead to deadlock");
            synchronized (advertisingIdClient) {
                if (advertisingIdClient.c) {
                    oa3.h(advertisingIdClient.a);
                    oa3.h(advertisingIdClient.b);
                    zZzd = advertisingIdClient.b.zzd();
                } else {
                    synchronized (advertisingIdClient.d) {
                        s26 s26Var = advertisingIdClient.e;
                        if (s26Var == null || !s26Var.z) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        advertisingIdClient.a(false);
                        if (!advertisingIdClient.c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                        oa3.h(advertisingIdClient.a);
                        oa3.h(advertisingIdClient.b);
                        try {
                            zZzd = advertisingIdClient.b.zzd();
                        } catch (RemoteException e) {
                            Log.i("AdvertisingIdClient", "GMS remote exception ", e);
                            throw new IOException("Remote exception");
                        }
                    } catch (Exception e2) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e2);
                    }
                }
                throw th;
            }
            advertisingIdClient.d();
            advertisingIdClient.zza();
            return zZzd;
        } catch (Throwable th) {
            advertisingIdClient.zza();
            throw th;
        }
    }

    public static void setShouldSkipGmsCoreVersionCheck(boolean z) {
    }

    public final void a(boolean z) {
        oa3.g("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.c) {
                zza();
            }
            Context context = this.f;
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                int iC = oa1.b.c(context, 12451000);
                if (iC != 0 && iC != 2) {
                    throw new IOException("Google Play services not available");
                }
                kb kbVar = new kb();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                try {
                    if (!e60.b().a(context, intent, kbVar, 1)) {
                        throw new IOException("Connection failure");
                    }
                    this.a = kbVar;
                    try {
                        IBinder iBinderA = kbVar.a(TimeUnit.MILLISECONDS);
                        int i = zze.w;
                        IInterface iInterfaceQueryLocalInterface = iBinderA.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                        this.b = iInterfaceQueryLocalInterface instanceof zzf ? (zzf) iInterfaceQueryLocalInterface : new zzd(iBinderA);
                        this.c = true;
                        if (z) {
                            d();
                        }
                    } catch (InterruptedException unused) {
                        throw new IOException("Interrupted exception");
                    } catch (Throwable th) {
                        throw new IOException(th);
                    }
                } catch (Throwable th2) {
                    throw new IOException(th2);
                }
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new GooglePlayServicesNotAvailableException();
            }
        }
    }

    public final Info c() {
        Info info;
        oa3.g("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.c) {
                oa3.h(this.a);
                oa3.h(this.b);
                info = new Info(this.b.zzc(), this.b.zze());
            } else {
                synchronized (this.d) {
                    s26 s26Var = this.e;
                    if (s26Var == null || !s26Var.z) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    a(false);
                    if (!this.c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                    oa3.h(this.a);
                    oa3.h(this.b);
                    try {
                        info = new Info(this.b.zzc(), this.b.zze());
                    } catch (RemoteException e) {
                        Log.i("AdvertisingIdClient", "GMS remote exception ", e);
                        throw new IOException("Remote exception");
                    }
                } catch (Exception e2) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e2);
                }
            }
            throw th;
        }
        d();
        return info;
    }

    public final void d() {
        synchronized (this.d) {
            s26 s26Var = this.e;
            if (s26Var != null) {
                s26Var.y.countDown();
                try {
                    this.e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j = this.g;
            if (j > 0) {
                this.e = new s26(this, j);
            }
        }
    }

    public final void finalize() throws Throwable {
        zza();
        super.finalize();
    }

    public Info getInfo() {
        return c();
    }

    public void start() {
        a(true);
    }

    public final void zza() {
        oa3.g("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f == null || this.a == null) {
                return;
            }
            try {
                if (this.c) {
                    e60.b().c(this.f, this.a);
                }
            } catch (Throwable th) {
                Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
            }
            this.c = false;
            this.b = null;
            this.a = null;
        }
    }

    public AdvertisingIdClient(Context context, long j, boolean z, boolean z2) {
        Context applicationContext;
        this.d = new Object();
        oa3.h(context);
        if (z && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f = context;
        this.c = false;
        this.g = j;
    }
}
