package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzci;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class dy6 extends kj6 {
    public cy6 c;
    public ss3 d;
    public final CopyOnWriteArraySet e;
    public boolean f;
    public final AtomicReference g;
    public final Object h;
    public ww5 i;
    public int j;
    public final AtomicLong k;
    public long l;
    public int m;
    public final sa7 n;
    public boolean o;
    public final ta2 p;

    public dy6(dq6 dq6Var) {
        super(dq6Var);
        this.e = new CopyOnWriteArraySet();
        this.h = new Object();
        this.o = true;
        this.p = new ta2(this, 14);
        this.g = new AtomicReference();
        this.i = new ww5(null, null);
        this.j = 100;
        this.l = -1L;
        this.m = 100;
        this.k = new AtomicLong(0L);
        this.n = new sa7(dq6Var);
    }

    public static /* bridge */ /* synthetic */ void y(dy6 dy6Var, ww5 ww5Var, ww5 ww5Var2) {
        boolean z;
        hw5 hw5Var = hw5.ANALYTICS_STORAGE;
        hw5 hw5Var2 = hw5.AD_STORAGE;
        hw5[] hw5VarArr = {hw5Var, hw5Var2};
        int i = 0;
        while (true) {
            if (i >= 2) {
                z = false;
                break;
            }
            hw5 hw5Var3 = hw5VarArr[i];
            if (!ww5Var2.f(hw5Var3) && ww5Var.f(hw5Var3)) {
                z = true;
                break;
            }
            i++;
        }
        boolean zG = ww5Var.g(ww5Var2, hw5Var, hw5Var2);
        if (z || zG) {
            dy6Var.a.m().l();
        }
    }

    public static void z(dy6 dy6Var, ww5 ww5Var, int i, long j, boolean z, boolean z2) {
        dy6Var.e();
        dy6Var.f();
        long j2 = dy6Var.l;
        dq6 dq6Var = dy6Var.a;
        if (j <= j2) {
            int i2 = dy6Var.m;
            ww5 ww5Var2 = ww5.b;
            if (i2 <= i) {
                bi6 bi6Var = dq6Var.i;
                dq6.h(bi6Var);
                bi6Var.l.c(ww5Var, "Dropped out-of-date consent setting, proposed settings");
                return;
            }
        }
        xj6 xj6Var = dq6Var.h;
        dq6.f(xj6Var);
        xj6Var.e();
        if (!xj6Var.p(i)) {
            bi6 bi6Var2 = dq6Var.i;
            dq6.h(bi6Var2);
            bi6Var2.l.c(Integer.valueOf(i), "Lower precedence consent source ignored, proposed source");
            return;
        }
        SharedPreferences.Editor editorEdit = xj6Var.i().edit();
        editorEdit.putString("consent_settings", ww5Var.e());
        editorEdit.putInt("consent_source", i);
        editorEdit.apply();
        dy6Var.l = j;
        dy6Var.m = i;
        u07 u07VarQ = dq6Var.q();
        u07VarQ.e();
        u07VarQ.f();
        if (z) {
            dq6 dq6Var2 = u07VarQ.a;
            dq6Var2.getClass();
            dq6Var2.n().j();
        }
        if (u07VarQ.l()) {
            u07VarQ.q(new ta7(u07VarQ, u07VarQ.n(false), 14));
        }
        if (z2) {
            dq6Var.q().v(new AtomicReference());
        }
    }

    public final void A() {
        e();
        f();
        dq6 dq6Var = this.a;
        if (dq6Var.e()) {
            jg6 jg6Var = lg6.Y;
            vv5 vv5Var = dq6Var.g;
            if (vv5Var.n(null, jg6Var)) {
                vv5Var.a.getClass();
                Boolean boolM = vv5Var.m("google_analytics_deferred_deep_link_enabled");
                if (boolM != null && boolM.booleanValue()) {
                    bi6 bi6Var = dq6Var.i;
                    dq6.h(bi6Var);
                    bi6Var.m.b("Deferred Deep Link feature enabled.");
                    ro6 ro6Var = dq6Var.j;
                    dq6.h(ro6Var);
                    ro6Var.m(new o17(this, 6));
                }
            }
            u07 u07VarQ = dq6Var.q();
            u07VarQ.e();
            u07VarQ.f();
            p97 p97VarN = u07VarQ.n(true);
            u07VarQ.a.n().l(3, new byte[0]);
            u07VarQ.q(new kz6(u07VarQ, p97VarN, 1));
            this.o = false;
            xj6 xj6Var = dq6Var.h;
            dq6.f(xj6Var);
            xj6Var.e();
            String string = xj6Var.i().getString("previous_os_version", null);
            xj6Var.a.l().g();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor editorEdit = xj6Var.i().edit();
                editorEdit.putString("previous_os_version", str);
                editorEdit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            dq6Var.l().g();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            l(bundle, "auto", "_ou");
        }
    }

    @Override // defpackage.kj6
    public final boolean h() {
        return false;
    }

    public final void i(Bundle bundle, String str, String str2) {
        dq6 dq6Var = this.a;
        dq6Var.n.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        oa3.e(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString(MediationMetaData.KEY_NAME, str);
        bundle2.putLong("creation_timestamp", jCurrentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        ro6 ro6Var = dq6Var.j;
        dq6.h(ro6Var);
        ro6Var.m(new vw6(this, bundle2, 1));
    }

    public final void j() {
        dq6 dq6Var = this.a;
        if (!(dq6Var.a.getApplicationContext() instanceof Application) || this.c == null) {
            return;
        }
        ((Application) dq6Var.a.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f2, code lost:
    
        if (r3 > 100) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0124, code lost:
    
        if (r5 > 100) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(java.lang.String r21, java.lang.String r22, android.os.Bundle r23, boolean r24, boolean r25, long r26) {
        /*
            Method dump skipped, instruction units count: 479
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dy6.k(java.lang.String, java.lang.String, android.os.Bundle, boolean, boolean, long):void");
    }

    public final void l(Bundle bundle, String str, String str2) {
        e();
        this.a.n.getClass();
        m(System.currentTimeMillis(), bundle, str, str2);
    }

    public final void m(long j, Bundle bundle, String str, String str2) {
        e();
        n(str, str2, j, bundle, true, this.d == null || m37.P(str2), true, null);
    }

    /* JADX WARN: Code duplicated, block: B:125:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:144:0x0395  */
    /* JADX WARN: Code duplicated, block: B:48:0x010e  */
    public final void n(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        char c;
        boolean z4;
        boolean z5;
        String str4;
        dz6 dz6Var;
        boolean z6;
        boolean zL;
        boolean z7;
        Bundle[] bundleArr;
        boolean z8;
        boolean z9;
        int i;
        String str5 = str;
        oa3.e(str);
        oa3.h(bundle);
        e();
        f();
        dq6 dq6Var = this.a;
        boolean zD = dq6Var.d();
        bi6 bi6Var = dq6Var.i;
        if (!zD) {
            dq6.h(bi6Var);
            bi6Var.m.b("Event not sent since app measurement is disabled");
            return;
        }
        List list = dq6Var.m().i;
        if (list != null && !list.contains(str2)) {
            dq6.h(bi6Var);
            bi6Var.m.d(str2, "Dropping non-safelisted event. event name, origin", str5);
            return;
        }
        if (!this.f) {
            this.f = true;
            try {
                boolean z10 = dq6Var.e;
                Context context = dq6Var.a;
                try {
                    (!z10 ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, context.getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, context);
                } catch (Exception e) {
                    dq6.h(bi6Var);
                    bi6Var.i.c(e, "Failed to invoke Tag Manager's initialize() method");
                }
            } catch (ClassNotFoundException unused) {
                dq6.h(bi6Var);
                bi6Var.l.b("Tag Manager is not found and thus will not be used");
            }
        }
        boolean zEquals = "_cmp".equals(str2);
        jg0 jg0Var = dq6Var.n;
        if (zEquals && bundle.containsKey("gclid")) {
            String string = bundle.getString("gclid");
            jg0Var.getClass();
            c = 0;
            z4 = true;
            u(System.currentTimeMillis(), string, "auto", "_lgclid");
        } else {
            c = 0;
            z4 = true;
        }
        xj6 xj6Var = dq6Var.h;
        m37 m37Var = dq6Var.l;
        if (z && (m37.h[c].equals(str2) ^ z4)) {
            dq6.f(m37Var);
            dq6.f(xj6Var);
            m37Var.s(bundle, xj6Var.v.a());
        }
        ta2 ta2Var = this.p;
        lh6 lh6Var = dq6Var.m;
        if (!z3 && !"_iap".equals(str2)) {
            dq6.f(m37Var);
            if (!m37Var.L("event", str2)) {
                i = 2;
            } else if (m37Var.G("event", v3A.A, v3A.B, str2)) {
                m37Var.a.getClass();
                if (m37Var.F(40, "event", str2)) {
                    i = 0;
                } else {
                    i = 2;
                }
            } else {
                i = 13;
            }
            if (i != 0) {
                dq6.h(bi6Var);
                bi6Var.h.c(lh6Var.d(str2), "Invalid public event name. Event will not be logged (FE)");
                dq6.f(m37Var);
                m37Var.getClass();
                String strL = m37.l(z4, str2, 40);
                int length = str2 != null ? str2.length() : 0;
                dq6.f(m37Var);
                m37Var.getClass();
                m37.u(ta2Var, null, i, "_ev", strL, length);
                return;
            }
        }
        dz6 dz6Var2 = dq6Var.o;
        dq6.g(dz6Var2);
        qy6 qy6VarK = dz6Var2.k(false);
        if (qy6VarK != null && !bundle.containsKey("_sc")) {
            qy6VarK.d = z4;
        }
        m37.r(qy6VarK, bundle, z && !z3);
        boolean zEquals2 = "am".equals(str5);
        boolean zP = m37.P(str2);
        if (!z || this.d == null || zP) {
            z5 = zEquals2;
        } else {
            if (!zEquals2) {
                dq6.h(bi6Var);
                bi6Var.m.d(lh6Var.d(str2), "Passing event to registered event handler (FE)", lh6Var.b(bundle));
                oa3.h(this.d);
                ss3 ss3Var = this.d;
                ss3Var.getClass();
                try {
                    ((zzci) ss3Var.x).y(j, bundle, str, str2);
                    return;
                } catch (RemoteException e2) {
                    dq6 dq6Var2 = ((AppMeasurementDynamiteService) ss3Var.y).w;
                    if (dq6Var2 != null) {
                        bi6 bi6Var2 = dq6Var2.i;
                        dq6.h(bi6Var2);
                        bi6Var2.i.c(e2, "Event interceptor threw exception");
                        return;
                    }
                    return;
                }
            }
            z5 = true;
        }
        if (dq6Var.e()) {
            dq6.f(m37Var);
            int iA0 = m37Var.a0(str2);
            if (iA0 != 0) {
                dq6.h(bi6Var);
                bi6Var.h.c(lh6Var.d(str2), "Invalid event name. Event will not be logged (FE)");
                dq6.f(m37Var);
                m37Var.getClass();
                String strL2 = m37.l(true, str2, 40);
                int length2 = str2 != null ? str2.length() : 0;
                dq6.f(m37Var);
                m37Var.getClass();
                m37.u(ta2Var, str3, iA0, "_ev", strL2, length2);
                return;
            }
            List listUnmodifiableList = Collections.unmodifiableList(Arrays.asList("_o", "_sn", "_sc", "_si"));
            dq6.f(m37Var);
            Bundle bundleJ0 = m37Var.j0(str2, bundle, listUnmodifiableList, z3);
            oa3.h(bundleJ0);
            dq6.g(dz6Var2);
            qy6 qy6VarK2 = dz6Var2.k(false);
            w17 w17Var = dq6Var.k;
            if (qy6VarK2 == null || !"_ae".equals(str2)) {
                str4 = "_o";
                dz6Var = dz6Var2;
                z6 = z5;
            } else {
                dq6.g(w17Var);
                t17 t17Var = w17Var.e;
                t17Var.d.a.n.getClass();
                str4 = "_o";
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                dz6Var = dz6Var2;
                z6 = z5;
                long j2 = jElapsedRealtime - t17Var.b;
                t17Var.b = jElapsedRealtime;
                if (j2 > 0) {
                    dq6.f(m37Var);
                    m37Var.p(bundleJ0, j2);
                }
            }
            ((l67) k67.x.w.zza()).zza();
            if (dq6Var.g.n(null, lg6.d0)) {
                if (!"auto".equals(str5) && "_ssr".equals(str2)) {
                    dq6.f(m37Var);
                    String string2 = bundleJ0.getString("_ffr");
                    int i2 = cv4.a;
                    if (string2 == null || string2.trim().isEmpty()) {
                        string2 = null;
                    } else if (string2 != null) {
                        string2 = string2.trim();
                    }
                    xj6 xj6Var2 = m37Var.a.h;
                    dq6.f(xj6Var2);
                    String strA = xj6Var2.s.a();
                    if (string2 == strA) {
                        z8 = true;
                        z9 = z8;
                    } else if (string2 == null) {
                        z8 = false;
                        z9 = z8;
                    } else if (string2.equals(strA)) {
                        z8 = true;
                        z9 = z8;
                    } else {
                        z9 = false;
                    }
                    dq6 dq6Var3 = m37Var.a;
                    if (z9) {
                        bi6 bi6Var3 = dq6Var3.i;
                        dq6.h(bi6Var3);
                        bi6Var3.m.b("Not logging duplicate session_start_with_rollout event");
                        return;
                    } else {
                        xj6 xj6Var3 = dq6Var3.h;
                        dq6.f(xj6Var3);
                        xj6Var3.s.b(string2);
                    }
                } else if ("_ae".equals(str2)) {
                    dq6.f(m37Var);
                    xj6 xj6Var4 = m37Var.a.h;
                    dq6.f(xj6Var4);
                    String strA2 = xj6Var4.s.a();
                    if (!TextUtils.isEmpty(strA2)) {
                        bundleJ0.putString("_ffr", strA2);
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(bundleJ0);
            dq6.f(xj6Var);
            if (xj6Var.n.a() > 0) {
                dq6.f(xj6Var);
                if (xj6Var.o(j)) {
                    dq6.f(xj6Var);
                    if (xj6Var.p.b()) {
                        dq6.h(bi6Var);
                        bi6Var.n.b("Current session is expired, remove the session number, ID, and engagement time");
                        jg0Var.getClass();
                        u(System.currentTimeMillis(), null, "auto", "_sid");
                        jg0Var.getClass();
                        u(System.currentTimeMillis(), null, "auto", "_sno");
                        jg0Var.getClass();
                        u(System.currentTimeMillis(), null, "auto", "_se");
                    }
                }
            }
            if (bundleJ0.getLong("extend_session", 0L) == 1) {
                dq6.h(bi6Var);
                bi6Var.n.b("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                dq6.g(w17Var);
                w17Var.d.b(j, true);
            }
            ArrayList arrayList2 = new ArrayList(bundleJ0.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            for (int i3 = 0; i3 < size; i3++) {
                String str6 = (String) arrayList2.get(i3);
                if (str6 != null) {
                    dq6.f(m37Var);
                    Object obj = bundleJ0.get(str6);
                    if (obj instanceof Bundle) {
                        bundleArr = new Bundle[]{(Bundle) obj};
                    } else if (obj instanceof Parcelable[]) {
                        Parcelable[] parcelableArr = (Parcelable[]) obj;
                        bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList3 = (ArrayList) obj;
                        bundleArr = (Bundle[]) arrayList3.toArray(new Bundle[arrayList3.size()]);
                    } else {
                        bundleArr = null;
                    }
                    if (bundleArr != null) {
                        bundleJ0.putParcelableArray(str6, bundleArr);
                    }
                }
            }
            int i4 = 0;
            while (i4 < arrayList.size()) {
                ArrayList arrayList4 = arrayList;
                Bundle bundleI0 = (Bundle) arrayList4.get(i4);
                String str7 = i4 != 0 ? "_ep" : str2;
                String str8 = str4;
                bundleI0.putString(str8, str5);
                if (z2) {
                    dq6.f(m37Var);
                    bundleI0 = m37Var.i0(bundleI0);
                }
                Bundle bundle2 = bundleI0;
                m37 m37Var2 = m37Var;
                m16 m16Var = new m16(str7, new o06(bundle2), str, j);
                u07 u07VarQ = dq6Var.q();
                u07VarQ.getClass();
                u07VarQ.e();
                u07VarQ.f();
                dq6 dq6Var4 = u07VarQ.a;
                dq6Var4.getClass();
                gh6 gh6VarN = dq6Var4.n();
                gh6VarN.getClass();
                Parcel parcelObtain = Parcel.obtain();
                a26.a(m16Var, parcelObtain, 0);
                byte[] bArrMarshall = parcelObtain.marshall();
                parcelObtain.recycle();
                if (bArrMarshall.length > 131072) {
                    bi6 bi6Var4 = gh6VarN.a.i;
                    dq6.h(bi6Var4);
                    bi6Var4.g.b("Event is too long for local database. Sending event directly to service");
                    z7 = true;
                    zL = false;
                } else {
                    zL = gh6VarN.l(0, bArrMarshall);
                    z7 = true;
                }
                u07VarQ.q(new mx6(u07VarQ, u07VarQ.n(z7), zL, m16Var, str3));
                if (!z6) {
                    Iterator it = this.e.iterator();
                    while (it.hasNext()) {
                        ((kw6) it.next()).a(j, new Bundle(bundle2), str, str2);
                    }
                }
                i4++;
                str5 = str;
                m37Var = m37Var2;
                arrayList = arrayList4;
                str4 = str8;
            }
            dq6.g(dz6Var);
            if (dz6Var.k(false) == null || !"_ae".equals(str2)) {
                return;
            }
            dq6.g(w17Var);
            jg0Var.getClass();
            w17Var.e.a(SystemClock.elapsedRealtime(), true, true);
        }
    }

    public final void o(long j, boolean z) {
        e();
        f();
        dq6 dq6Var = this.a;
        bi6 bi6Var = dq6Var.i;
        dq6.h(bi6Var);
        bi6Var.m.b("Resetting analytics data (FE)");
        w17 w17Var = dq6Var.k;
        dq6.g(w17Var);
        w17Var.e();
        t17 t17Var = w17Var.e;
        t17Var.c.a();
        t17Var.a = 0L;
        t17Var.b = 0L;
        g87.a();
        jg6 jg6Var = lg6.q0;
        vv5 vv5Var = dq6Var.g;
        if (vv5Var.n(null, jg6Var)) {
            dq6Var.m().l();
        }
        boolean zD = dq6Var.d();
        xj6 xj6Var = dq6Var.h;
        dq6.f(xj6Var);
        xj6Var.e.b(j);
        dq6 dq6Var2 = xj6Var.a;
        xj6 xj6Var2 = dq6Var2.h;
        dq6.f(xj6Var2);
        if (!TextUtils.isEmpty(xj6Var2.s.a())) {
            xj6Var.s.b(null);
        }
        c77 c77Var = c77.x;
        ((e77) c77Var.w.zza()).zza();
        jg6 jg6Var2 = lg6.e0;
        vv5 vv5Var2 = dq6Var2.g;
        if (vv5Var2.n(null, jg6Var2)) {
            xj6Var.n.b(0L);
        }
        if (!vv5Var2.p()) {
            xj6Var.n(!zD);
        }
        xj6Var.t.b(null);
        xj6Var.u.b(0L);
        xj6Var.v.b(null);
        if (z) {
            u07 u07VarQ = dq6Var.q();
            u07VarQ.e();
            u07VarQ.f();
            p97 p97VarN = u07VarQ.n(false);
            dq6 dq6Var3 = u07VarQ.a;
            dq6Var3.getClass();
            dq6Var3.n().j();
            u07VarQ.q(new kz6(u07VarQ, p97VarN, 0));
        }
        ((e77) c77Var.w.zza()).zza();
        if (vv5Var.n(null, jg6Var2)) {
            dq6.g(w17Var);
            w17Var.d.a();
        }
        this.o = !zD;
    }

    public final void p(Bundle bundle, long j) {
        oa3.h(bundle);
        Bundle bundle2 = new Bundle(bundle);
        boolean zIsEmpty = TextUtils.isEmpty(bundle2.getString("app_id"));
        dq6 dq6Var = this.a;
        if (!zIsEmpty) {
            bi6 bi6Var = dq6Var.i;
            dq6.h(bi6Var);
            bi6Var.i.b("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        Th.Q(bundle2, "app_id", String.class, null);
        Th.Q(bundle2, "origin", String.class, null);
        Th.Q(bundle2, MediationMetaData.KEY_NAME, String.class, null);
        Th.Q(bundle2, "value", Object.class, null);
        Th.Q(bundle2, "trigger_event_name", String.class, null);
        Th.Q(bundle2, "trigger_timeout", Long.class, 0L);
        Th.Q(bundle2, "timed_out_event_name", String.class, null);
        Th.Q(bundle2, "timed_out_event_params", Bundle.class, null);
        Th.Q(bundle2, "triggered_event_name", String.class, null);
        Th.Q(bundle2, "triggered_event_params", Bundle.class, null);
        Th.Q(bundle2, "time_to_live", Long.class, 0L);
        Th.Q(bundle2, "expired_event_name", String.class, null);
        Th.Q(bundle2, "expired_event_params", Bundle.class, null);
        oa3.e(bundle2.getString(MediationMetaData.KEY_NAME));
        oa3.e(bundle2.getString("origin"));
        oa3.h(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j);
        String string = bundle2.getString(MediationMetaData.KEY_NAME);
        Object obj = bundle2.get("value");
        m37 m37Var = dq6Var.l;
        dq6.f(m37Var);
        int iD0 = m37Var.d0(string);
        lh6 lh6Var = dq6Var.m;
        bi6 bi6Var2 = dq6Var.i;
        if (iD0 != 0) {
            dq6.h(bi6Var2);
            bi6Var2.f.c(lh6Var.f(string), "Invalid conditional user property name");
            return;
        }
        m37 m37Var2 = dq6Var.l;
        dq6.f(m37Var2);
        if (m37Var2.Z(obj, string) != 0) {
            dq6.h(bi6Var2);
            bi6Var2.f.d(lh6Var.f(string), "Invalid conditional user property value", obj);
            return;
        }
        dq6.f(m37Var2);
        Object objJ = m37Var2.j(obj, string);
        if (objJ == null) {
            dq6.h(bi6Var2);
            bi6Var2.f.d(lh6Var.f(string), "Unable to normalize conditional user property value", obj);
            return;
        }
        Th.W(bundle2, objJ);
        long j2 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j2 > 15552000000L || j2 < 1)) {
            dq6.h(bi6Var2);
            bi6Var2.f.d(lh6Var.f(string), "Invalid conditional user property timeout", Long.valueOf(j2));
            return;
        }
        long j3 = bundle2.getLong("time_to_live");
        if (j3 <= 15552000000L && j3 >= 1) {
            ro6 ro6Var = dq6Var.j;
            dq6.h(ro6Var);
            ro6Var.m(new ta7(this, bundle2, 12));
        } else {
            dq6.h(bi6Var2);
            bi6Var2.f.d(lh6Var.f(string), "Invalid conditional user property time to live", Long.valueOf(j3));
        }
    }

    public final void q(Bundle bundle, int i, long j) {
        Object obj;
        String string;
        f();
        ww5 ww5Var = ww5.b;
        hw5[] hw5VarArrValues = hw5.values();
        int length = hw5VarArrValues.length;
        int i2 = 0;
        while (true) {
            obj = null;
            if (i2 >= length) {
                break;
            }
            hw5 hw5Var = hw5VarArrValues[i2];
            if (bundle.containsKey(hw5Var.w) && (string = bundle.getString(hw5Var.w)) != null) {
                if (string.equals("granted")) {
                    obj = Boolean.TRUE;
                } else if (string.equals("denied")) {
                    obj = Boolean.FALSE;
                }
                if (obj == null) {
                    obj = string;
                    break;
                }
            }
            i2++;
        }
        if (obj != null) {
            dq6 dq6Var = this.a;
            bi6 bi6Var = dq6Var.i;
            dq6.h(bi6Var);
            bi6Var.k.c(obj, "Ignoring invalid consent setting");
            bi6 bi6Var2 = dq6Var.i;
            dq6.h(bi6Var2);
            bi6Var2.k.b("Valid consent values are 'granted', 'denied'");
        }
        r(ww5.a(bundle), i, j);
    }

    public final void r(ww5 ww5Var, int i, long j) {
        ww5 ww5Var2;
        boolean z;
        boolean z2;
        boolean z3;
        ww5 ww5VarD = ww5Var;
        f();
        if (i != -10) {
            if (((Boolean) ww5VarD.a.get(hw5.AD_STORAGE)) == null) {
                if (((Boolean) ww5VarD.a.get(hw5.ANALYTICS_STORAGE)) == null) {
                    bi6 bi6Var = this.a.i;
                    dq6.h(bi6Var);
                    bi6Var.k.b("Discarding empty consent settings");
                    return;
                }
            }
        }
        synchronized (this.h) {
            try {
                ww5Var2 = this.i;
                int i2 = this.j;
                ww5 ww5Var3 = ww5.b;
                z = true;
                z2 = false;
                if (i <= i2) {
                    boolean zG = ww5VarD.g(ww5Var2, (hw5[]) ww5VarD.a.keySet().toArray(new hw5[0]));
                    hw5 hw5Var = hw5.ANALYTICS_STORAGE;
                    if (ww5VarD.f(hw5Var) && !this.i.f(hw5Var)) {
                        z2 = true;
                    }
                    ww5VarD = ww5VarD.d(this.i);
                    this.i = ww5VarD;
                    this.j = i;
                    z3 = z2;
                    z2 = zG;
                } else {
                    z = false;
                    z3 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z) {
            bi6 bi6Var2 = this.a.i;
            dq6.h(bi6Var2);
            bi6Var2.l.c(ww5VarD, "Ignoring lower-priority consent settings, proposed settings");
            return;
        }
        long andIncrement = this.k.getAndIncrement();
        if (z2) {
            this.g.set(null);
            ro6 ro6Var = this.a.j;
            dq6.h(ro6Var);
            ro6Var.n(new sx6(this, ww5VarD, j, i, andIncrement, z3, ww5Var2));
            return;
        }
        ux6 ux6Var = new ux6(this, ww5VarD, i, andIncrement, z3, ww5Var2);
        if (i == 30 || i == -10) {
            ro6 ro6Var2 = this.a.j;
            dq6.h(ro6Var2);
            ro6Var2.n(ux6Var);
        } else {
            ro6 ro6Var3 = this.a.j;
            dq6.h(ro6Var3);
            ro6Var3.m(ux6Var);
        }
    }

    public final void s(ww5 ww5Var) {
        e();
        boolean z = (ww5Var.f(hw5.ANALYTICS_STORAGE) && ww5Var.f(hw5.AD_STORAGE)) || this.a.q().l();
        dq6 dq6Var = this.a;
        ro6 ro6Var = dq6Var.j;
        dq6.h(ro6Var);
        ro6Var.e();
        if (z != dq6Var.D) {
            dq6 dq6Var2 = this.a;
            ro6 ro6Var2 = dq6Var2.j;
            dq6.h(ro6Var2);
            ro6Var2.e();
            dq6Var2.D = z;
            xj6 xj6Var = this.a.h;
            dq6.f(xj6Var);
            xj6Var.e();
            Boolean boolValueOf = xj6Var.i().contains("measurement_enabled_from_api") ? Boolean.valueOf(xj6Var.i().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z || boolValueOf == null || boolValueOf.booleanValue()) {
                v(Boolean.valueOf(z), false);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0040  */
    public final void t(String str, String str2, Object obj, boolean z, long j) {
        int iD0;
        int length;
        String str3 = str == null ? "app" : str;
        dq6 dq6Var = this.a;
        if (z) {
            m37 m37Var = dq6Var.l;
            dq6.f(m37Var);
            iD0 = m37Var.d0(str2);
        } else {
            m37 m37Var2 = dq6Var.l;
            dq6.f(m37Var2);
            if (!m37Var2.L("user property", str2)) {
                iD0 = 6;
            } else if (m37Var2.G("user property", fXUx.B, null, str2)) {
                m37Var2.a.getClass();
                if (m37Var2.F(24, "user property", str2)) {
                    iD0 = 0;
                } else {
                    iD0 = 6;
                }
            } else {
                iD0 = 15;
            }
        }
        ta2 ta2Var = this.p;
        if (iD0 != 0) {
            m37 m37Var3 = dq6Var.l;
            dq6.f(m37Var3);
            m37Var3.getClass();
            String strL = m37.l(true, str2, 24);
            length = str2 != null ? str2.length() : 0;
            m37 m37Var4 = dq6Var.l;
            dq6.f(m37Var4);
            m37Var4.getClass();
            m37.u(ta2Var, null, iD0, "_ev", strL, length);
            return;
        }
        if (obj == null) {
            ro6 ro6Var = dq6Var.j;
            dq6.h(ro6Var);
            ro6Var.m(new dx6(this, str3, str2, null, j, 0));
            return;
        }
        m37 m37Var5 = dq6Var.l;
        dq6.f(m37Var5);
        int iZ = m37Var5.Z(obj, str2);
        m37 m37Var6 = dq6Var.l;
        if (iZ != 0) {
            dq6.f(m37Var6);
            m37Var6.getClass();
            String strL2 = m37.l(true, str2, 24);
            length = ((obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0;
            dq6.f(m37Var6);
            m37Var6.getClass();
            m37.u(ta2Var, null, iZ, "_ev", strL2, length);
            return;
        }
        dq6.f(m37Var6);
        Object objJ = m37Var6.j(obj, str2);
        if (objJ != null) {
            ro6 ro6Var2 = dq6Var.j;
            dq6.h(ro6Var2);
            ro6Var2.m(new dx6(this, str3, str2, objJ, j, 0));
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0051 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0053  */
    public final void u(long j, Object obj, String str, String str2) {
        boolean zL;
        oa3.e(str);
        oa3.e(str2);
        e();
        f();
        boolean zEquals = "allow_personalized_ads".equals(str2);
        dq6 dq6Var = this.a;
        if (zEquals) {
            if (obj instanceof String) {
                String str3 = (String) obj;
                if (!TextUtils.isEmpty(str3)) {
                    Long lValueOf = Long.valueOf(true != "false".equals(str3.toLowerCase(Locale.ENGLISH)) ? 0L : 1L);
                    xj6 xj6Var = dq6Var.h;
                    dq6.f(xj6Var);
                    xj6Var.l.b(lValueOf.longValue() == 1 ? "true" : "false");
                    obj = lValueOf;
                } else if (obj == null) {
                    xj6 xj6Var2 = dq6Var.h;
                    dq6.f(xj6Var2);
                    xj6Var2.l.b("unset");
                    obj = obj;
                }
                str2 = "_npa";
            } else if (obj == null) {
                xj6 xj6Var3 = dq6Var.h;
                dq6.f(xj6Var3);
                xj6Var3.l.b("unset");
                obj = obj;
                str2 = "_npa";
            }
        }
        Object obj2 = obj;
        String str4 = str2;
        if (!dq6Var.d()) {
            bi6 bi6Var = dq6Var.i;
            dq6.h(bi6Var);
            bi6Var.n.b("User property not set since app measurement is disabled");
            return;
        }
        if (dq6Var.e()) {
            d37 d37Var = new d37(j, obj2, str4, str);
            u07 u07VarQ = dq6Var.q();
            u07VarQ.e();
            u07VarQ.f();
            dq6 dq6Var2 = u07VarQ.a;
            dq6Var2.getClass();
            gh6 gh6VarN = dq6Var2.n();
            gh6VarN.getClass();
            Parcel parcelObtain = Parcel.obtain();
            f37.a(d37Var, parcelObtain);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            if (bArrMarshall.length > 131072) {
                bi6 bi6Var2 = gh6VarN.a.i;
                dq6.h(bi6Var2);
                bi6Var2.g.b("User property too long for local database. Sending directly to service");
                zL = false;
            } else {
                zL = gh6VarN.l(1, bArrMarshall);
            }
            u07VarQ.q(new hz6(u07VarQ, u07VarQ.n(true), zL, d37Var));
        }
    }

    public final void v(Boolean bool, boolean z) {
        e();
        f();
        dq6 dq6Var = this.a;
        bi6 bi6Var = dq6Var.i;
        dq6.h(bi6Var);
        bi6Var.m.c(bool, "Setting app measurement enabled (FE)");
        xj6 xj6Var = dq6Var.h;
        dq6.f(xj6Var);
        xj6Var.m(bool);
        if (z) {
            xj6 xj6Var2 = dq6Var.h;
            dq6.f(xj6Var2);
            xj6Var2.e();
            SharedPreferences.Editor editorEdit = xj6Var2.i().edit();
            if (bool != null) {
                editorEdit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                editorEdit.remove("measurement_enabled_from_api");
            }
            editorEdit.apply();
        }
        ro6 ro6Var = dq6Var.j;
        dq6.h(ro6Var);
        ro6Var.e();
        if (dq6Var.D || !(bool == null || bool.booleanValue())) {
            w();
        }
    }

    public final void w() {
        e();
        dq6 dq6Var = this.a;
        xj6 xj6Var = dq6Var.h;
        dq6.f(xj6Var);
        String strA = xj6Var.l.a();
        if (strA != null) {
            boolean zEquals = "unset".equals(strA);
            jg0 jg0Var = dq6Var.n;
            if (zEquals) {
                jg0Var.getClass();
                u(System.currentTimeMillis(), null, "app", "_npa");
            } else {
                Long lValueOf = Long.valueOf(true != "true".equals(strA) ? 0L : 1L);
                jg0Var.getClass();
                u(System.currentTimeMillis(), lValueOf, "app", "_npa");
            }
        }
        boolean zD = dq6Var.d();
        bi6 bi6Var = dq6Var.i;
        if (!zD || !this.o) {
            dq6.h(bi6Var);
            bi6Var.m.b("Updating Scion state (FE)");
            u07 u07VarQ = dq6Var.q();
            u07VarQ.e();
            u07VarQ.f();
            u07VarQ.q(new tb7(u07VarQ, u07VarQ.n(true), 10));
            return;
        }
        dq6.h(bi6Var);
        bi6Var.m.b("Recording app launch after enabling measurement for the first time (FE)");
        A();
        ((e77) c77.x.w.zza()).zza();
        if (dq6Var.g.n(null, lg6.e0)) {
            w17 w17Var = dq6Var.k;
            dq6.g(w17Var);
            w17Var.d.a();
        }
        ro6 ro6Var = dq6Var.j;
        dq6.h(ro6Var);
        ro6Var.m(new zw6(this, 0));
    }

    public final String x() {
        return (String) this.g.get();
    }
}
