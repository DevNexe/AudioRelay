package defpackage;

import com.google.android.gms.internal.ads.zzgnu;
import com.google.android.gms.internal.ads.zzgnz;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class wt6 {
    public static final Logger a = Logger.getLogger(zzgnu.class.getName());
    public static final String b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    public static zzgnz b() {
        String str;
        ClassLoader classLoader = wt6.class.getClassLoader();
        if (zzgnz.class.equals(zzgnz.class)) {
            str = b;
        } else {
            if (!zzgnz.class.getPackage().equals(wt6.class.getPackage())) {
                throw new IllegalArgumentException(zzgnz.class.getName());
            }
            str = String.format("%s.BlazeGenerated%sLoader", zzgnz.class.getPackage().getName(), "zzgnz");
        }
        try {
            try {
                try {
                    return (zzgnz) zzgnz.class.cast(((wt6) Class.forName(str, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).a());
                } catch (IllegalAccessException e) {
                    throw new IllegalStateException(e);
                } catch (InstantiationException e2) {
                    throw new IllegalStateException(e2);
                }
            } catch (NoSuchMethodException e3) {
                throw new IllegalStateException(e3);
            } catch (InvocationTargetException e4) {
                throw new IllegalStateException(e4);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(wt6.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add(zzgnz.class.cast(((wt6) it.next()).a()));
                } catch (ServiceConfigurationError e5) {
                    a.logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat("zzgnz"), (Throwable) e5);
                }
            }
            if (arrayList.size() == 1) {
                return (zzgnz) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (zzgnz) zzgnz.class.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e6) {
                throw new IllegalStateException(e6);
            } catch (NoSuchMethodException e7) {
                throw new IllegalStateException(e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException(e8);
            }
        }
    }

    public abstract zzgnz a();
}
