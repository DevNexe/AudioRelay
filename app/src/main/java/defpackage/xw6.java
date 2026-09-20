package defpackage;

import android.content.ContentResolver;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Binder;
import android.os.StrictMode;
import android.util.Log;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class xw6 implements ex6 {
    public static final Bt7j h = new Bt7j();
    public static final String[] i = {SubscriberAttributeKt.JSON_NAME_KEY, "value"};
    public final ContentResolver a;
    public final Uri b;
    public final Runnable c;
    public final ww6 d;
    public final Object e;
    public volatile Map f;
    public final ArrayList g;

    public xw6(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        ww6 ww6Var = new ww6(this);
        this.d = ww6Var;
        this.e = new Object();
        this.g = new ArrayList();
        contentResolver.getClass();
        uri.getClass();
        this.a = contentResolver;
        this.b = uri;
        this.c = runnable;
        contentResolver.registerContentObserver(uri, false, ww6Var);
    }

    public static xw6 a(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        xw6 xw6Var;
        synchronized (xw6.class) {
            Bt7j bt7j = h;
            xw6Var = (xw6) bt7j.getOrDefault(uri, null);
            if (xw6Var == null) {
                try {
                    xw6 xw6Var2 = new xw6(contentResolver, uri, runnable);
                    try {
                        bt7j.put(uri, xw6Var2);
                    } catch (SecurityException unused) {
                    }
                    xw6Var = xw6Var2;
                } catch (SecurityException unused2) {
                }
            }
        }
        return xw6Var;
    }

    public static synchronized void c() {
        for (xw6 xw6Var : (g92.NUlFixed) h.values()) {
            xw6Var.a.unregisterContentObserver(xw6Var.d);
        }
        h.clear();
    }

    public final Map b() {
        Map map;
        Object objJ;
        Map map2 = this.f;
        if (map2 == null) {
            synchronized (this.e) {
                map2 = this.f;
                if (map2 == null) {
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        try {
                            ta2 ta2Var = new ta2(this, 12);
                            try {
                                objJ = ta2Var.j();
                            } catch (SecurityException unused) {
                                long jClearCallingIdentity = Binder.clearCallingIdentity();
                                try {
                                    objJ = ta2Var.j();
                                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                                } catch (Throwable th) {
                                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                                    throw th;
                                }
                            }
                            map = (Map) objJ;
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        } catch (SQLiteException | IllegalStateException | SecurityException unused2) {
                            Log.e("ConfigurationContentLdr", "PhenotypeFlag unable to load ContentProvider, using default values");
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            map = null;
                        }
                        this.f = map;
                        map2 = map;
                    } catch (Throwable th2) {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        throw th2;
                    }
                }
            }
        }
        return map2 != null ? map2 : Collections.emptyMap();
    }

    @Override // defpackage.ex6
    public final /* bridge */ /* synthetic */ Object zzb(String str) {
        return (String) b().get(str);
    }
}
