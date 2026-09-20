package defpackage;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.unity3d.ads.metadata.MediationMetaData;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class qx0 {
    public static final Object j = new Object();
    public static final F1 k = new F1();
    public static final Bt7j l = new Bt7j();
    public final Context a;
    public final String b;
    public final ay0 c;
    public final qz d;
    public final nz1<pe0> g;
    public final pg3<ah0> h;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final AtomicBoolean f = new AtomicBoolean();
    public final CopyOnWriteArrayList i = new CopyOnWriteArrayList();

    @TargetApi(14)
    public static class CQf implements l5.QnHx {
        public static final AtomicReference<CQf> a = new AtomicReference<>();

        @Override // l5.QnHx
        public final void a(boolean z) {
            synchronized (qx0.j) {
                for (qx0 qx0Var : new ArrayList(qx0.l.values())) {
                    if (qx0Var.e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator it = qx0Var.i.iterator();
                        while (it.hasNext()) {
                            ((QnHx) it.next()).a(z);
                        }
                    }
                }
            }
        }
    }

    public static class F1 implements Executor {
        public static final Handler w = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            w.post(runnable);
        }
    }

    @TargetApi(24)
    public static class LPt8Fixed extends BroadcastReceiver {
        public static final AtomicReference<LPt8Fixed> b = new AtomicReference<>();
        public final Context a;

        public LPt8Fixed(Context context) {
            this.a = context;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            synchronized (qx0.j) {
                Iterator it = ((g92.NUlFixed) qx0.l.values()).iterator();
                while (it.hasNext()) {
                    ((qx0) it.next()).d();
                }
            }
            this.a.unregisterReceiver(this);
        }
    }

    public interface QnHx {
        void a(boolean z);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0071  */
    /* JADX WARN: Code duplicated, block: B:15:0x007b  */
    /* JADX WARN: Code duplicated, block: B:18:0x008e  */
    /* JADX WARN: Code duplicated, block: B:26:0x00bc A[LOOP:0: B:24:0x00b6->B:26:0x00bc, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.util.List] */
    public qx0(final Context context, ay0 ay0Var, String str) {
        Bundle bundle;
        ?? arrayList;
        Iterator it;
        QnHx qnHx;
        int i = 0;
        new CopyOnWriteArrayList();
        this.a = context;
        oa3.e(str);
        this.b = str;
        this.c = ay0Var;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayList2 = new ArrayList();
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) ComponentDiscoveryService.class), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", ComponentDiscoveryService.class + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
                if (bundle == null) {
                    Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                    arrayList = Collections.emptyList();
                } else {
                    arrayList = new ArrayList();
                    for (String str2 : bundle.keySet()) {
                        if (!"com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2)) && str2.startsWith("com.google.firebase.components:")) {
                            arrayList.add(str2.substring(31));
                        }
                    }
                }
                it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new az((String) it.next(), i));
                }
                Trace.endSection();
                Trace.beginSection("Runtime");
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                arrayList3.addAll(arrayList2);
                final FirebaseCommonRegistrar firebaseCommonRegistrar = new FirebaseCommonRegistrar();
                arrayList3.add(new pg3() { // from class: pz
                    @Override // defpackage.pg3
                    public final Object get() {
                        return firebaseCommonRegistrar;
                    }
                });
                arrayList4.add(ry.b(context, Context.class, new Class[0]));
                arrayList4.add(ry.b(this, qx0.class, new Class[0]));
                arrayList4.add(ry.b(ay0Var, ay0.class, new Class[0]));
                qz qzVar = new qz(k, arrayList3, arrayList4, new jz());
                this.d = qzVar;
                Trace.endSection();
                this.g = new nz1<>(new pg3() { // from class: ox0
                    @Override // defpackage.pg3
                    public final Object get() {
                        qx0 qx0Var = this.a;
                        return new pe0(context, qx0Var.c(), (tg3) qx0Var.d.d(tg3.class));
                    }
                });
                this.h = qzVar.u(ah0.class);
                qnHx = new QnHx() { // from class: px0
                    @Override // qx0.QnHx
                    public final void a(boolean z) {
                        qx0 qx0Var = this.a;
                        if (z) {
                            qx0Var.getClass();
                        } else {
                            qx0Var.h.get().b();
                        }
                    }
                };
                a();
                if (this.e.get() && l5.A.w.get()) {
                    qnHx.a(true);
                }
                this.i.add(qnHx);
                Trace.endSection();
            }
            Log.w("ComponentDiscovery", "Context has no PackageManager.");
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        bundle = null;
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.emptyList();
        } else {
            arrayList = new ArrayList();
            while (r3.hasNext()) {
                if (!"com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2))) {
                }
            }
        }
        it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new az((String) it.next(), i));
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        arrayList5.addAll(arrayList2);
        final FirebaseCommonRegistrar firebaseCommonRegistrar2 = new FirebaseCommonRegistrar();
        arrayList5.add(new pg3() { // from class: pz
            @Override // defpackage.pg3
            public final Object get() {
                return firebaseCommonRegistrar2;
            }
        });
        arrayList6.add(ry.b(context, Context.class, new Class[0]));
        arrayList6.add(ry.b(this, qx0.class, new Class[0]));
        arrayList6.add(ry.b(ay0Var, ay0.class, new Class[0]));
        qz qzVar2 = new qz(k, arrayList5, arrayList6, new jz());
        this.d = qzVar2;
        Trace.endSection();
        this.g = new nz1<>(new pg3() { // from class: ox0
            @Override // defpackage.pg3
            public final Object get() {
                qx0 qx0Var = this.a;
                return new pe0(context, qx0Var.c(), (tg3) qx0Var.d.d(tg3.class));
            }
        });
        this.h = qzVar2.u(ah0.class);
        qnHx = new QnHx() { // from class: px0
            @Override // qx0.QnHx
            public final void a(boolean z) {
                qx0 qx0Var = this.a;
                if (z) {
                    qx0Var.getClass();
                } else {
                    qx0Var.h.get().b();
                }
            }
        };
        a();
        if (this.e.get()) {
            qnHx.a(true);
        }
        this.i.add(qnHx);
        Trace.endSection();
    }

    public static qx0 b() {
        qx0 qx0Var;
        synchronized (j) {
            qx0Var = (qx0) l.getOrDefault("[DEFAULT]", null);
            if (qx0Var == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + me3.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return qx0Var;
    }

    public static qx0 e(Context context, ay0 ay0Var) {
        qx0 qx0Var;
        boolean z;
        AtomicReference<CQf> atomicReference = CQf.a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference<CQf> atomicReference2 = CQf.a;
            if (atomicReference2.get() == null) {
                CQf cQf = new CQf();
                while (true) {
                    if (atomicReference2.compareAndSet(null, cQf)) {
                        z = true;
                        break;
                    }
                    if (atomicReference2.get() != null) {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    l5 l5Var = l5.A;
                    synchronized (l5Var) {
                        if (!l5Var.z) {
                            application.registerActivityLifecycleCallbacks(l5Var);
                            application.registerComponentCallbacks(l5Var);
                            l5Var.z = true;
                        }
                    }
                    l5Var.getClass();
                    synchronized (l5Var) {
                        l5Var.y.add(cQf);
                    }
                }
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (j) {
            Bt7j bt7j = l;
            oa3.j("FirebaseApp name [DEFAULT] already exists!", true ^ bt7j.containsKey("[DEFAULT]"));
            oa3.i(context, "Application context cannot be null.");
            qx0Var = new qx0(context, ay0Var, "[DEFAULT]");
            bt7j.put("[DEFAULT]", qx0Var);
        }
        qx0Var.d();
        return qx0Var;
    }

    public final void a() {
        oa3.j("FirebaseApp was deleted", !this.f.get());
    }

    public final String c() {
        StringBuilder sb = new StringBuilder();
        a();
        byte[] bytes = this.b.getBytes(Charset.defaultCharset());
        sb.append(bytes == null ? null : Base64.encodeToString(bytes, 11));
        sb.append("+");
        a();
        byte[] bytes2 = this.c.b.getBytes(Charset.defaultCharset());
        sb.append(bytes2 != null ? Base64.encodeToString(bytes2, 11) : null);
        return sb.toString();
    }

    public final void d() {
        HashMap map;
        boolean z = true;
        if (!(Build.VERSION.SDK_INT >= 24 ? ff5.a(this.a) : true)) {
            StringBuilder sb = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb.append(this.b);
            Log.i("FirebaseApp", sb.toString());
            Context context = this.a;
            AtomicReference<LPt8Fixed> atomicReference = LPt8Fixed.b;
            if (atomicReference.get() == null) {
                LPt8Fixed lPt8 = new LPt8Fixed(context);
                while (!atomicReference.compareAndSet(null, lPt8)) {
                    if (atomicReference.get() != null) {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    context.registerReceiver(lPt8, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                    return;
                }
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        a();
        sb2.append(this.b);
        Log.i("FirebaseApp", sb2.toString());
        qz qzVar = this.d;
        a();
        boolean zEquals = "[DEFAULT]".equals(this.b);
        AtomicReference<Boolean> atomicReference2 = qzVar.A;
        Boolean boolValueOf = Boolean.valueOf(zEquals);
        while (!atomicReference2.compareAndSet(null, boolValueOf)) {
            if (atomicReference2.get() != null) {
                z = false;
                break;
            }
        }
        if (z) {
            synchronized (qzVar) {
                map = new HashMap(qzVar.w);
            }
            qzVar.V0(map, zEquals);
        }
        this.h.get().b();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qx0)) {
            return false;
        }
        qx0 qx0Var = (qx0) obj;
        qx0Var.a();
        return this.b.equals(qx0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        tq2.QnHx qnHx = new tq2.QnHx(this);
        qnHx.a(this.b, MediationMetaData.KEY_NAME);
        qnHx.a(this.c, "options");
        return qnHx.toString();
    }
}
