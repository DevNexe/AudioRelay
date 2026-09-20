package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import defpackage.C1638jw;
import defpackage.ca7;
import defpackage.d60;
import defpackage.e76;
import defpackage.i57;
import defpackage.ma1;
import defpackage.nb7;
import defpackage.oa1;
import defpackage.oa3;
import defpackage.rp5;
import defpackage.sp5;
import defpackage.tw0;
import defpackage.uz6;
import defpackage.z50;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes.dex */
public abstract class QnHx<T extends IInterface> {
    public static final int CONNECT_STATE_CONNECTED = 4;
    public static final int CONNECT_STATE_DISCONNECTED = 1;
    public static final int CONNECT_STATE_DISCONNECTING = 5;
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final String KEY_PENDING_INTENT = "pendingIntent";
    public boolean A;
    public volatile uz6 B;
    public final AtomicInteger C;
    public int a;
    public long b;
    public long c;
    public int d;
    public long e;
    public volatile String f;
    public nb7 g;
    public final Context h;
    public final Looper i;
    public final ma1 j;
    public final oa1 k;
    public final auxFixed l;
    public final Object m;
    public final Object n;

    @GuardedBy("mServiceBrokerLock")
    public IGmsServiceBroker o;
    public F1 p;

    @GuardedBy("mLock")
    public IInterface q;
    public final ArrayList r;

    @GuardedBy("mLock")
    public T23 s;

    @GuardedBy("mLock")
    public int t;
    public final InterfaceC0075QnHx u;
    public final CQf v;
    public final int w;
    public final String x;
    public volatile String y;
    public z50 z;
    public static final tw0[] D = new tw0[0];
    public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = {"service_esmobile", "service_googleme"};

    public interface CQf {
        void onConnectionFailed(z50 z50Var);
    }

    public interface F1 {
        void a(z50 z50Var);
    }

    public class LPt8Fixed implements F1 {
        public LPt8Fixed() {
        }

        @Override // com.google.android.gms.common.internal.QnHx.F1
        public final void a(z50 z50Var) {
            boolean z = z50Var.x == 0;
            QnHx qnHx = QnHx.this;
            if (z) {
                qnHx.getRemoteService(null, qnHx.g());
                return;
            }
            CQf cQf = qnHx.v;
            if (cQf != null) {
                cQf.onConnectionFailed(z50Var);
            }
        }
    }

    public interface NUlFixed {
    }

    /* JADX INFO: renamed from: com.google.android.gms.common.internal.QnHx$QnHx, reason: collision with other inner class name */
    public interface InterfaceC0075QnHx {
        void onConnected(Bundle bundle);

        void onConnectionSuspended(int i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public QnHx(Context context, Looper looper, int i, InterfaceC0075QnHx interfaceC0075QnHx, CQf cQf) {
        ca7 ca7VarA = ma1.a(context);
        oa1 oa1Var = oa1.b;
        oa3.h(interfaceC0075QnHx);
        oa3.h(cQf);
        this(context, looper, ca7VarA, oa1Var, i, interfaceC0075QnHx, cQf, null);
    }

    public static /* bridge */ /* synthetic */ boolean l(QnHx qnHx, int i, int i2, IInterface iInterface) {
        synchronized (qnHx.m) {
            if (qnHx.t != i) {
                return false;
            }
            qnHx.m(i2, iInterface);
            return true;
        }
    }

    public void checkAvailabilityAndConnect() {
        int iC = this.k.c(this.h, getMinApkVersion());
        if (iC == 0) {
            connect(new LPt8Fixed());
            return;
        }
        m(1, null);
        this.p = new LPt8Fixed();
        int i = this.C.get();
        auxFixed auxVar = this.l;
        auxVar.sendMessage(auxVar.obtainMessage(3, i, iC, null));
    }

    public void connect(F1 f1) {
        if (f1 == null) {
            throw new NullPointerException("Connection progress callbacks cannot be null.");
        }
        this.p = f1;
        m(2, null);
    }

    public abstract T d(IBinder iBinder);

    public void disconnect() {
        this.C.incrementAndGet();
        synchronized (this.r) {
            try {
                int size = this.r.size();
                for (int i = 0; i < size; i++) {
                    e76 e76Var = (e76) this.r.get(i);
                    synchronized (e76Var) {
                        e76Var.a = null;
                    }
                }
                this.r.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.n) {
            this.o = null;
        }
        m(1, null);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i;
        IInterface iInterface;
        IGmsServiceBroker iGmsServiceBroker;
        synchronized (this.m) {
            i = this.t;
            iInterface = this.q;
        }
        synchronized (this.n) {
            iGmsServiceBroker = this.o;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i == 1) {
            printWriter.print("DISCONNECTED");
        } else if (i == 2) {
            printWriter.print("REMOTE_CONNECTING");
        } else if (i == 3) {
            printWriter.print("LOCAL_CONNECTING");
        } else if (i == 4) {
            printWriter.print("CONNECTED");
        } else if (i != 5) {
            printWriter.print("UNKNOWN");
        } else {
            printWriter.print("DISCONNECTING");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) h()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (iGmsServiceBroker == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(iGmsServiceBroker.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.c > 0) {
            PrintWriter printWriterAppend = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j = this.c;
            printWriterAppend.println(j + " " + simpleDateFormat.format(new Date(j)));
        }
        if (this.b > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i2 = this.a;
            if (i2 == 1) {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            } else if (i2 == 2) {
                printWriter.append("CAUSE_NETWORK_LOST");
            } else if (i2 != 3) {
                printWriter.append((CharSequence) String.valueOf(i2));
            } else {
                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
            }
            PrintWriter printWriterAppend2 = printWriter.append(" lastSuspendedTime=");
            long j2 = this.b;
            printWriterAppend2.println(j2 + " " + simpleDateFormat.format(new Date(j2)));
        }
        if (this.e > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) C1638jw.a(this.d));
            PrintWriter printWriterAppend3 = printWriter.append(" lastFailedTime=");
            long j3 = this.e;
            printWriterAppend3.println(j3 + " " + simpleDateFormat.format(new Date(j3)));
        }
    }

    public void e() {
    }

    public Bundle f() {
        return new Bundle();
    }

    public Set<Scope> g() {
        return Collections.emptySet();
    }

    public Account getAccount() {
        return null;
    }

    public tw0[] getApiFeatures() {
        return D;
    }

    public final tw0[] getAvailableFeatures() {
        uz6 uz6Var = this.B;
        if (uz6Var == null) {
            return null;
        }
        return uz6Var.x;
    }

    public Bundle getConnectionHint() {
        return null;
    }

    public final Context getContext() {
        return this.h;
    }

    public String getEndpointPackageName() {
        if (!isConnected() || this.g == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return "com.google.android.gms";
    }

    public int getGCoreServiceId() {
        return this.w;
    }

    public String getLastDisconnectMessage() {
        return this.f;
    }

    public final Looper getLooper() {
        return this.i;
    }

    public int getMinApkVersion() {
        return oa1.a;
    }

    public void getRemoteService(IAccountAccessor iAccountAccessor, Set<Scope> set) {
        Bundle bundleF = f();
        int i = this.w;
        String str = this.y;
        int i2 = oa1.a;
        Scope[] scopeArr = com.google.android.gms.common.internal.CQf.K;
        Bundle bundle = new Bundle();
        tw0[] tw0VarArr = com.google.android.gms.common.internal.CQf.L;
        com.google.android.gms.common.internal.CQf cQf = new com.google.android.gms.common.internal.CQf(6, i, i2, null, null, scopeArr, bundle, null, tw0VarArr, tw0VarArr, true, 0, false, str);
        cQf.z = this.h.getPackageName();
        cQf.C = bundleF;
        if (set != null) {
            cQf.B = (Scope[]) set.toArray(new Scope[0]);
        }
        if (requiresSignIn()) {
            Account account = getAccount();
            if (account == null) {
                account = new Account(DEFAULT_ACCOUNT, "com.google");
            }
            cQf.D = account;
            if (iAccountAccessor != null) {
                cQf.A = iAccountAccessor.asBinder();
            }
        } else if (requiresAccount()) {
            cQf.D = getAccount();
        }
        cQf.E = D;
        cQf.F = getApiFeatures();
        if (usesClientTelemetry()) {
            cQf.I = true;
        }
        try {
            synchronized (this.n) {
                IGmsServiceBroker iGmsServiceBroker = this.o;
                if (iGmsServiceBroker != null) {
                    iGmsServiceBroker.r(new zzd(this, this.C.get()), cQf);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            triggerConnectionSuspended(3);
        } catch (RemoteException e2) {
            e = e2;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i3 = this.C.get();
            byN byn = new byN(this, 8, null, null);
            auxFixed auxVar = this.l;
            auxVar.sendMessage(auxVar.obtainMessage(1, i3, -1, byn));
        } catch (SecurityException e3) {
            throw e3;
        } catch (RuntimeException e4) {
            e = e4;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i4 = this.C.get();
            byN byn2 = new byN(this, 8, null, null);
            auxFixed auxVar2 = this.l;
            auxVar2.sendMessage(auxVar2.obtainMessage(1, i4, -1, byn2));
        }
    }

    public final T getService() {
        T t;
        synchronized (this.m) {
            try {
                if (this.t == 5) {
                    throw new DeadObjectException();
                }
                if (!isConnected()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                t = (T) this.q;
                oa3.i(t, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return t;
    }

    public IBinder getServiceBrokerBinder() {
        synchronized (this.n) {
            IGmsServiceBroker iGmsServiceBroker = this.o;
            if (iGmsServiceBroker == null) {
                return null;
            }
            return iGmsServiceBroker.asBinder();
        }
    }

    public Intent getSignInIntent() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public d60 getTelemetryConfiguration() {
        uz6 uz6Var = this.B;
        if (uz6Var == null) {
            return null;
        }
        return uz6Var.z;
    }

    public abstract String h();

    public boolean hasConnectionInfo() {
        return this.B != null;
    }

    public abstract String i();

    public boolean isConnected() {
        boolean z;
        synchronized (this.m) {
            z = this.t == 4;
        }
        return z;
    }

    public boolean isConnecting() {
        boolean z;
        synchronized (this.m) {
            int i = this.t;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    public boolean j() {
        return getMinApkVersion() >= 211700000;
    }

    public final void k(z50 z50Var) {
        this.d = z50Var.x;
        this.e = System.currentTimeMillis();
    }

    public final void m(int i, IInterface iInterface) {
        nb7 nb7Var;
        oa3.b((i == 4) == (iInterface != null));
        synchronized (this.m) {
            try {
                this.t = i;
                this.q = iInterface;
                if (i == 1) {
                    T23 t23 = this.s;
                    if (t23 != null) {
                        ma1 ma1Var = this.j;
                        String str = this.g.a;
                        oa3.h(str);
                        this.g.getClass();
                        if (this.x == null) {
                            this.h.getClass();
                        }
                        ma1Var.b(str, "com.google.android.gms", 4225, t23, this.g.b);
                        this.s = null;
                    }
                } else if (i == 2 || i == 3) {
                    T23 t24 = this.s;
                    if (t24 != null && (nb7Var = this.g) != null) {
                        Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + nb7Var.a + " on com.google.android.gms");
                        ma1 ma1Var2 = this.j;
                        String str2 = this.g.a;
                        oa3.h(str2);
                        this.g.getClass();
                        if (this.x == null) {
                            this.h.getClass();
                        }
                        ma1Var2.b(str2, "com.google.android.gms", 4225, t24, this.g.b);
                        this.C.incrementAndGet();
                    }
                    T23 t25 = new T23(this, this.C.get());
                    this.s = t25;
                    String strI = i();
                    Object obj = ma1.a;
                    boolean zJ = j();
                    this.g = new nb7(strI, zJ);
                    if (zJ && getMinApkVersion() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.g.a)));
                    }
                    ma1 ma1Var3 = this.j;
                    String str3 = this.g.a;
                    oa3.h(str3);
                    this.g.getClass();
                    String name = this.x;
                    if (name == null) {
                        name = this.h.getClass().getName();
                    }
                    boolean z = this.g.b;
                    e();
                    if (!ma1Var3.c(new i57(str3, 4225, "com.google.android.gms", z), t25, name, null)) {
                        Log.w("GmsClient", "unable to connect to service: " + this.g.a + " on com.google.android.gms");
                        int i2 = this.C.get();
                        EQ eq = new EQ(this, 16);
                        auxFixed auxVar = this.l;
                        auxVar.sendMessage(auxVar.obtainMessage(7, i2, -1, eq));
                    }
                } else if (i == 4) {
                    oa3.h(iInterface);
                    this.c = System.currentTimeMillis();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void onUserSignOut(NUlFixed nUl) {
        sp5 sp5Var = (sp5) nUl;
        sp5Var.a.I.I.post(new rp5(sp5Var));
    }

    public boolean providesSignIn() {
        return false;
    }

    public boolean requiresAccount() {
        return false;
    }

    public boolean requiresGooglePlayServices() {
        return true;
    }

    public boolean requiresSignIn() {
        return false;
    }

    public void setAttributionTag(String str) {
        this.y = str;
    }

    public void triggerConnectionSuspended(int i) {
        int i2 = this.C.get();
        auxFixed auxVar = this.l;
        auxVar.sendMessage(auxVar.obtainMessage(6, i2, i));
    }

    public boolean usesClientTelemetry() {
        return false;
    }

    public QnHx(Context context, Looper looper, ca7 ca7Var, oa1 oa1Var, int i, InterfaceC0075QnHx interfaceC0075QnHx, CQf cQf, String str) {
        this.f = null;
        this.m = new Object();
        this.n = new Object();
        this.r = new ArrayList();
        this.t = 1;
        this.z = null;
        this.A = false;
        this.B = null;
        this.C = new AtomicInteger(0);
        if (context != null) {
            this.h = context;
            if (looper != null) {
                this.i = looper;
                if (ca7Var != null) {
                    this.j = ca7Var;
                    oa3.i(oa1Var, "API availability must not be null");
                    this.k = oa1Var;
                    this.l = new auxFixed(this, looper);
                    this.w = i;
                    this.u = interfaceC0075QnHx;
                    this.v = cQf;
                    this.x = str;
                    return;
                }
                throw new NullPointerException("Supervisor must not be null");
            }
            throw new NullPointerException("Looper must not be null");
        }
        throw new NullPointerException("Context must not be null");
    }

    public void disconnect(String str) {
        this.f = str;
        disconnect();
    }
}
