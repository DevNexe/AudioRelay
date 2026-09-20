package defpackage;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.CQf;
import com.google.android.gms.common.api.QnHx;
import com.google.android.gms.common.api.QnHx.F1;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.api.internal.zact;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* JADX INFO: loaded from: classes.dex */
public final class tp5<O extends QnHx.F1> implements com.google.android.gms.common.api.F1.QnHx, com.google.android.gms.common.api.F1.CQf {
    public final int C;
    public final zact D;
    public boolean E;
    public final /* synthetic */ pa1 I;

    @NotOnlyInitialized
    public final QnHx.NUlFixed x;
    public final Hp<O> y;
    public final gp5 z;
    public final LinkedList w = new LinkedList();
    public final HashSet A = new HashSet();
    public final HashMap B = new HashMap();
    public final ArrayList F = new ArrayList();
    public z50 G = null;
    public int H = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public tp5(pa1 pa1Var, CQf<O> cQf) {
        this.I = pa1Var;
        Looper looper = pa1Var.I.getLooper();
        os.QnHx qnHxB = cQf.b();
        os osVar = new os(qnHxB.a, qnHxB.b, qnHxB.c, qnHxB.d);
        QnHx.AbstractC0074QnHx<?, O> abstractC0074QnHx = cQf.c.a;
        oa3.h(abstractC0074QnHx);
        QnHx.NUlFixed nUlB = abstractC0074QnHx.b(cQf.a, looper, osVar, cQf.d, this, this);
        String str = cQf.b;
        if (str != null && (nUlB instanceof com.google.android.gms.common.internal.QnHx)) {
            ((com.google.android.gms.common.internal.QnHx) nUlB).setAttributionTag(str);
        }
        if (str != null && (nUlB instanceof ep2)) {
            ((ep2) nUlB).getClass();
        }
        this.x = nUlB;
        this.y = cQf.e;
        this.z = new gp5();
        this.C = cQf.f;
        if (!nUlB.requiresSignIn()) {
            this.D = null;
            return;
        }
        mr5 mr5Var = pa1Var.I;
        os.QnHx qnHxB2 = cQf.b();
        this.D = new zact(pa1Var.A, mr5Var, new os(qnHxB2.a, qnHxB2.b, qnHxB2.c, qnHxB2.d));
    }

    public final void a(z50 z50Var) {
        HashSet hashSet = this.A;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
            return;
        }
        er5 er5Var = (er5) it.next();
        if (tq2.a(z50Var, z50.A)) {
            this.x.getEndpointPackageName();
        }
        er5Var.getClass();
        throw null;
    }

    public final void b(Status status) {
        oa3.c(this.I.I);
        c(status, null, false);
    }

    public final void c(Status status, RuntimeException runtimeException, boolean z) {
        oa3.c(this.I.I);
        if ((status == null) == (runtimeException == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.w.iterator();
        while (it.hasNext()) {
            xq5 xq5Var = (xq5) it.next();
            if (!z || xq5Var.a == 2) {
                if (status != null) {
                    xq5Var.a(status);
                } else {
                    xq5Var.b(runtimeException);
                }
                it.remove();
            }
        }
    }

    public final void d() {
        LinkedList linkedList = this.w;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            xq5 xq5Var = (xq5) arrayList.get(i);
            if (!this.x.isConnected()) {
                return;
            }
            if (h(xq5Var)) {
                linkedList.remove(xq5Var);
            }
        }
    }

    public final void e() {
        pa1 pa1Var = this.I;
        oa3.c(pa1Var.I);
        this.G = null;
        a(z50.A);
        if (this.E) {
            mr5 mr5Var = pa1Var.I;
            Hp<O> hp = this.y;
            mr5Var.removeMessages(11, hp);
            pa1Var.I.removeMessages(9, hp);
            this.E = false;
        }
        Iterator it = this.B.values().iterator();
        if (it.hasNext()) {
            ((hq5) it.next()).getClass();
            throw null;
        }
        d();
        g();
    }

    public final void f(int i) {
        pa1 pa1Var = this.I;
        oa3.c(pa1Var.I);
        this.G = null;
        this.E = true;
        String lastDisconnectMessage = this.x.getLastDisconnectMessage();
        gp5 gp5Var = this.z;
        gp5Var.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (lastDisconnectMessage != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(lastDisconnectMessage);
        }
        gp5Var.a(true, new Status(20, sb.toString()));
        mr5 mr5Var = pa1Var.I;
        Hp<O> hp = this.y;
        mr5Var.sendMessageDelayed(Message.obtain(mr5Var, 9, hp), 5000L);
        mr5 mr5Var2 = pa1Var.I;
        mr5Var2.sendMessageDelayed(Message.obtain(mr5Var2, 11, hp), 120000L);
        pa1Var.C.a.clear();
        Iterator it = this.B.values().iterator();
        if (it.hasNext()) {
            ((hq5) it.next()).getClass();
            throw null;
        }
    }

    public final void g() {
        pa1 pa1Var = this.I;
        mr5 mr5Var = pa1Var.I;
        Hp<O> hp = this.y;
        mr5Var.removeMessages(12, hp);
        mr5 mr5Var2 = pa1Var.I;
        mr5Var2.sendMessageDelayed(mr5Var2.obtainMessage(12, hp), pa1Var.w);
    }

    public final boolean h(xq5 xq5Var) {
        tw0 tw0Var;
        if (!(xq5Var instanceof zp5)) {
            QnHx.NUlFixed nUl = this.x;
            xq5Var.d(this.z, nUl.requiresSignIn());
            try {
                xq5Var.c(this);
            } catch (DeadObjectException unused) {
                onConnectionSuspended(1);
                nUl.disconnect("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        zp5 zp5Var = (zp5) xq5Var;
        tw0[] tw0VarArrG = zp5Var.g(this);
        if (tw0VarArrG == null || tw0VarArrG.length == 0) {
            tw0Var = null;
            break;
        }
        tw0[] availableFeatures = this.x.getAvailableFeatures();
        if (availableFeatures == null) {
            availableFeatures = new tw0[0];
        }
        Bt7j bt7j = new Bt7j(availableFeatures.length);
        for (tw0 tw0Var2 : availableFeatures) {
            bt7j.put(tw0Var2.w, Long.valueOf(tw0Var2.b()));
        }
        int length = tw0VarArrG.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                tw0Var = null;
                break;
            }
            tw0Var = tw0VarArrG[i];
            Long l = (Long) bt7j.getOrDefault(tw0Var.w, null);
            if (l == null || l.longValue() < tw0Var.b()) {
                break;
            }
            i++;
        }
        if (tw0Var == null) {
            QnHx.NUlFixed nUl2 = this.x;
            xq5Var.d(this.z, nUl2.requiresSignIn());
            try {
                xq5Var.c(this);
            } catch (DeadObjectException unused2) {
                onConnectionSuspended(1);
                nUl2.disconnect("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        String name = this.x.getClass().getName();
        String str = tw0Var.w;
        long jB = tw0Var.b();
        StringBuilder sb = new StringBuilder(name.length() + 77 + String.valueOf(str).length());
        sb.append(name);
        sb.append(" could not execute call because it requires feature (");
        sb.append(str);
        sb.append(", ");
        sb.append(jB);
        sb.append(").");
        Log.w("GoogleApiManager", sb.toString());
        if (!this.I.J || !zp5Var.f(this)) {
            zp5Var.b(new UnsupportedApiCallException(tw0Var));
            return true;
        }
        up5 up5Var = new up5(this.y, tw0Var);
        int iIndexOf = this.F.indexOf(up5Var);
        if (iIndexOf >= 0) {
            up5 up5Var2 = (up5) this.F.get(iIndexOf);
            this.I.I.removeMessages(15, up5Var2);
            mr5 mr5Var = this.I.I;
            Message messageObtain = Message.obtain(mr5Var, 15, up5Var2);
            this.I.getClass();
            mr5Var.sendMessageDelayed(messageObtain, 5000L);
        } else {
            this.F.add(up5Var);
            mr5 mr5Var2 = this.I.I;
            Message messageObtain2 = Message.obtain(mr5Var2, 15, up5Var);
            this.I.getClass();
            mr5Var2.sendMessageDelayed(messageObtain2, 5000L);
            mr5 mr5Var3 = this.I.I;
            Message messageObtain3 = Message.obtain(mr5Var3, 16, up5Var);
            this.I.getClass();
            mr5Var3.sendMessageDelayed(messageObtain3, 120000L);
            z50 z50Var = new z50(2, null);
            if (!i(z50Var)) {
                this.I.b(z50Var, this.C);
            }
        }
        return false;
    }

    public final boolean i(z50 z50Var) {
        synchronized (pa1.M) {
            this.I.getClass();
        }
        return false;
    }

    public final boolean j(boolean z) {
        oa3.c(this.I.I);
        QnHx.NUlFixed nUl = this.x;
        if (!nUl.isConnected() || this.B.size() != 0) {
            return false;
        }
        gp5 gp5Var = this.z;
        if (!((gp5Var.a.isEmpty() && gp5Var.b.isEmpty()) ? false : true)) {
            nUl.disconnect("Timing out service connection.");
            return true;
        }
        if (z) {
            g();
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [com.google.android.gms.common.api.QnHx$NUl, pq5] */
    public final void k() {
        pa1 pa1Var = this.I;
        oa3.c(pa1Var.I);
        QnHx.NUlFixed nUl = this.x;
        if (nUl.isConnected() || nUl.isConnecting()) {
            return;
        }
        try {
            ar5 ar5Var = pa1Var.C;
            Context context = pa1Var.A;
            ar5Var.getClass();
            oa3.h(context);
            int iC = 0;
            if (nUl.requiresGooglePlayServices()) {
                int minApkVersion = nUl.getMinApkVersion();
                SparseIntArray sparseIntArray = ar5Var.a;
                int i = sparseIntArray.get(minApkVersion, -1);
                if (i != -1) {
                    iC = i;
                } else {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= sparseIntArray.size()) {
                            iC = -1;
                            break;
                        }
                        int iKeyAt = sparseIntArray.keyAt(i2);
                        if (iKeyAt > minApkVersion && sparseIntArray.get(iKeyAt) == 0) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (iC == -1) {
                        iC = ar5Var.b.c(context, minApkVersion);
                    }
                    sparseIntArray.put(minApkVersion, iC);
                }
            }
            if (iC != 0) {
                z50 z50Var = new z50(iC, null);
                String name = nUl.getClass().getName();
                String string = z50Var.toString();
                StringBuilder sb = new StringBuilder(name.length() + 35 + string.length());
                sb.append("The service for ");
                sb.append(name);
                sb.append(" is not available: ");
                sb.append(string);
                Log.w("GoogleApiManager", sb.toString());
                m(z50Var, null);
                return;
            }
            wp5 wp5Var = new wp5(pa1Var, nUl, this.y);
            if (nUl.requiresSignIn()) {
                zact zactVar = this.D;
                oa3.h(zactVar);
                pq5 pq5Var = zactVar.B;
                if (pq5Var != null) {
                    pq5Var.disconnect();
                }
                Integer numValueOf = Integer.valueOf(System.identityHashCode(zactVar));
                os osVar = zactVar.A;
                osVar.i = numValueOf;
                ep5 ep5Var = zactVar.y;
                Context context2 = zactVar.w;
                Handler handler = zactVar.x;
                zactVar.B = ep5Var.b(context2, handler.getLooper(), osVar, osVar.h, zactVar, zactVar);
                zactVar.C = wp5Var;
                Set<Scope> set = zactVar.z;
                if (set == null || set.isEmpty()) {
                    handler.post(new o17(zactVar, 4));
                } else {
                    zactVar.B.c();
                }
            }
            try {
                nUl.connect(wp5Var);
            } catch (SecurityException e) {
                m(new z50(10), e);
            }
        } catch (IllegalStateException e2) {
            m(new z50(10), e2);
        }
    }

    public final void l(xq5 xq5Var) {
        oa3.c(this.I.I);
        boolean zIsConnected = this.x.isConnected();
        LinkedList linkedList = this.w;
        if (zIsConnected) {
            if (h(xq5Var)) {
                g();
                return;
            } else {
                linkedList.add(xq5Var);
                return;
            }
        }
        linkedList.add(xq5Var);
        z50 z50Var = this.G;
        if (z50Var != null) {
            if ((z50Var.x == 0 || z50Var.y == null) ? false : true) {
                m(z50Var, null);
                return;
            }
        }
        k();
    }

    public final void m(z50 z50Var, RuntimeException runtimeException) {
        pq5 pq5Var;
        oa3.c(this.I.I);
        zact zactVar = this.D;
        if (zactVar != null && (pq5Var = zactVar.B) != null) {
            pq5Var.disconnect();
        }
        oa3.c(this.I.I);
        this.G = null;
        this.I.C.a.clear();
        a(z50Var);
        if ((this.x instanceof kr5) && z50Var.x != 24) {
            pa1 pa1Var = this.I;
            pa1Var.x = true;
            mr5 mr5Var = pa1Var.I;
            mr5Var.sendMessageDelayed(mr5Var.obtainMessage(19), 300000L);
        }
        if (z50Var.x == 4) {
            b(pa1.L);
            return;
        }
        if (this.w.isEmpty()) {
            this.G = z50Var;
            return;
        }
        if (runtimeException != null) {
            oa3.c(this.I.I);
            c(null, runtimeException, false);
            return;
        }
        if (!this.I.J) {
            b(pa1.c(this.y, z50Var));
            return;
        }
        c(pa1.c(this.y, z50Var), null, true);
        if (this.w.isEmpty() || i(z50Var) || this.I.b(z50Var, this.C)) {
            return;
        }
        if (z50Var.x == 18) {
            this.E = true;
        }
        if (!this.E) {
            b(pa1.c(this.y, z50Var));
            return;
        }
        mr5 mr5Var2 = this.I.I;
        Message messageObtain = Message.obtain(mr5Var2, 9, this.y);
        this.I.getClass();
        mr5Var2.sendMessageDelayed(messageObtain, 5000L);
    }

    public final void n() {
        oa3.c(this.I.I);
        Status status = pa1.K;
        b(status);
        gp5 gp5Var = this.z;
        gp5Var.getClass();
        gp5Var.a(false, status);
        for (k42 k42Var : (k42[]) this.B.keySet().toArray(new k42[0])) {
            l(new vq5(k42Var, new z05()));
        }
        a(new z50(4));
        QnHx.NUlFixed nUl = this.x;
        if (nUl.isConnected()) {
            nUl.onUserSignOut(new sp5(this));
        }
    }

    @Override // defpackage.v50
    public final void onConnected() {
        Looper looperMyLooper = Looper.myLooper();
        pa1 pa1Var = this.I;
        if (looperMyLooper == pa1Var.I.getLooper()) {
            e();
        } else {
            pa1Var.I.post(new o17(this, 3));
        }
    }

    @Override // defpackage.lu2
    public final void onConnectionFailed(z50 z50Var) {
        m(z50Var, null);
    }

    @Override // defpackage.v50
    public final void onConnectionSuspended(int i) {
        Looper looperMyLooper = Looper.myLooper();
        pa1 pa1Var = this.I;
        if (looperMyLooper == pa1Var.I.getLooper()) {
            f(i);
        } else {
            pa1Var.I.post(new qp5(this, i));
        }
    }
}
