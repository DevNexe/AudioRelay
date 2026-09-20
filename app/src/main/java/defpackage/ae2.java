package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ae2 implements g5 {
    public final QnHx a;
    public final lc0 b;
    public final HashMap c;

    public static class QnHx {
        public final Context a;
        public Map<String, String> b = null;

        public QnHx(Context context) {
            this.a = context;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x003a  */
        /* JADX WARN: Code duplicated, block: B:17:0x0044  */
        /* JADX WARN: Code duplicated, block: B:20:0x0057  */
        public final f5 a(String str) {
            Bundle bundle;
            Map<String, String> mapEmptyMap;
            Object obj;
            if (this.b == null) {
                Context context = this.a;
                try {
                    PackageManager packageManager = context.getPackageManager();
                    if (packageManager == null) {
                        Log.w("BackendRegistry", "Context has no PackageManager.");
                    } else {
                        ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                        if (serviceInfo == null) {
                            Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                        } else {
                            bundle = serviceInfo.metaData;
                        }
                        if (bundle == null) {
                            Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                            mapEmptyMap = Collections.emptyMap();
                        } else {
                            HashMap map = new HashMap();
                            for (String str2 : bundle.keySet()) {
                                obj = bundle.get(str2);
                                if (!(obj instanceof String) && str2.startsWith("backend:")) {
                                    for (String str3 : ((String) obj).split(",", -1)) {
                                        String strTrim = str3.trim();
                                        if (!strTrim.isEmpty()) {
                                            map.put(strTrim, str2.substring(8));
                                        }
                                    }
                                }
                            }
                            mapEmptyMap = map;
                        }
                        this.b = mapEmptyMap;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    Log.w("BackendRegistry", "Application info not found.");
                }
                bundle = null;
                if (bundle == null) {
                    Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                    mapEmptyMap = Collections.emptyMap();
                } else {
                    HashMap map2 = new HashMap();
                    while (r7.hasNext()) {
                        obj = bundle.get(str2);
                        if (!(obj instanceof String)) {
                        }
                    }
                    mapEmptyMap = map2;
                }
                this.b = mapEmptyMap;
            }
            String str4 = this.b.get(str);
            if (str4 == null) {
                return null;
            }
            try {
                return (f5) Class.forName(str4).asSubclass(f5.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e) {
                Log.w("BackendRegistry", String.format("Class %s is not found.", str4), e);
                return null;
            } catch (IllegalAccessException e2) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str4), e2);
                return null;
            } catch (InstantiationException e3) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str4), e3);
                return null;
            } catch (NoSuchMethodException e4) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str4), e4);
                return null;
            } catch (InvocationTargetException e5) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str4), e5);
                return null;
            }
        }
    }

    public ae2(Context context, lc0 lc0Var) {
        QnHx qnHx = new QnHx(context);
        this.c = new HashMap();
        this.a = qnHx;
        this.b = lc0Var;
    }

    @Override // defpackage.g5
    public final synchronized ta5 get(String str) {
        if (this.c.containsKey(str)) {
            return (ta5) this.c.get(str);
        }
        f5 f5VarA = this.a.a(str);
        if (f5VarA == null) {
            return null;
        }
        lc0 lc0Var = this.b;
        ta5 ta5VarCreate = f5VarA.create(new m3(lc0Var.a, lc0Var.b, lc0Var.c, str));
        this.c.put(str, ta5VarCreate);
        return ta5VarCreate;
    }
}
