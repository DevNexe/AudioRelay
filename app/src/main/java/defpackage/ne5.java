package defpackage;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class ne5 {
    public final Context a;
    public final g5 b;
    public final mu0 c;
    public final xn5 d;
    public final Executor e;
    public final qy4 f;
    public final at g;
    public final at h;
    public final fs i;

    public ne5(Context context, g5 g5Var, mu0 mu0Var, xn5 xn5Var, Executor executor, qy4 qy4Var, at atVar, at atVar2, fs fsVar) {
        this.a = context;
        this.b = g5Var;
        this.c = mu0Var;
        this.d = xn5Var;
        this.e = executor;
        this.f = qy4Var;
        this.g = atVar;
        this.h = atVar2;
        this.i = fsVar;
    }

    public final void a(final ua5 ua5Var, int i) {
        l2 l2VarA;
        ta5 ta5Var = this.b.get(ua5Var.b());
        new l2(1, 0L);
        final long jMax = 0;
        while (true) {
            Z7O z7o = new Z7O(6, this, ua5Var);
            qy4 qy4Var = this.f;
            if (!((Boolean) qy4Var.e(z7o)).booleanValue()) {
                qy4Var.e(new qy4.QnHx() { // from class: me5
                    @Override // qy4.QnHx
                    public final Object e() {
                        ne5 ne5Var = this.w;
                        ne5Var.c.d0(ne5Var.g.a() + jMax, ua5Var);
                        return null;
                    }
                });
                return;
            }
            final Iterable iterable = (Iterable) qy4Var.e(new ke5(this, ua5Var));
            if (!iterable.iterator().hasNext()) {
                return;
            }
            int i2 = 4;
            int i3 = 3;
            if (ta5Var == null) {
                y52.a(ua5Var, "Uploader", "Unknown backend for %s, deleting event batch for it...");
                l2VarA = new l2(3, -1L);
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((v03) it.next()).a());
                }
                if (ua5Var.c() != null) {
                    fs fsVar = this.i;
                    Objects.requireNonNull(fsVar);
                    is isVar = (is) qy4Var.e(new sn1(fsVar, i2));
                    o3.QnHx qnHx = new o3.QnHx();
                    qnHx.f = new HashMap();
                    qnHx.d = Long.valueOf(this.g.a());
                    qnHx.e = Long.valueOf(this.h.a());
                    qnHx.d("GDT_CLIENT_METRICS");
                    os0 os0Var = new os0("proto");
                    isVar.getClass();
                    ig3 ig3Var = pf3.a;
                    ig3Var.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        ig3Var.a(isVar, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    qnHx.c(new ks0(os0Var, byteArrayOutputStream.toByteArray()));
                    arrayList.add(ta5Var.b(qnHx.b()));
                }
                l2VarA = ta5Var.a(new k2(arrayList, ua5Var.c()));
            }
            if (l2VarA.a == 2) {
                qy4Var.e(new qy4.QnHx() { // from class: le5
                    @Override // qy4.QnHx
                    public final Object e() {
                        ne5 ne5Var = this.w;
                        mu0 mu0Var = ne5Var.c;
                        mu0Var.u0(iterable);
                        mu0Var.d0(ne5Var.g.a() + jMax, ua5Var);
                        return null;
                    }
                });
                this.d.b(ua5Var, i + 1, true);
                return;
            }
            qy4Var.e(new Z7O(7, this, iterable));
            int i4 = l2VarA.a;
            if (i4 == 1) {
                jMax = Math.max(jMax, l2VarA.b);
                if (ua5Var.c() != null) {
                    qy4Var.e(new sn1(this, i3));
                }
            } else if (i4 == 4) {
                HashMap map = new HashMap();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    String strG = ((v03) it2.next()).a().g();
                    if (map.containsKey(strG)) {
                        map.put(strG, Integer.valueOf(((Integer) map.get(strG)).intValue() + 1));
                    } else {
                        map.put(strG, 1);
                    }
                }
                qy4Var.e(new ey0(this, map));
            }
        }
    }
}
