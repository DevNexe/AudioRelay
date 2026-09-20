package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import androidx.work.QnHx;
import androidx.work.impl.model.WorkSpec;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class wa1 implements d54, bn5, dv0 {
    public static final String E = s52.e("GreedyScheduler");
    public final wi0 A;
    public boolean B;
    public Boolean D;
    public final Context w;
    public final nn5 x;
    public final cn5 y;
    public final HashSet z = new HashSet();
    public final Object C = new Object();

    public wa1(Context context, QnHx qnHx, on5 on5Var, nn5 nn5Var) {
        this.w = context;
        this.x = nn5Var;
        this.y = new cn5(context, on5Var, this);
        this.A = new wi0(this, qnHx.e);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00e3  */
    @Override // defpackage.d54
    public final void a(WorkSpec... workSpecArr) {
        if (this.D == null) {
            this.D = Boolean.valueOf(ne3.a(this.w, this.x.x));
        }
        if (!this.D.booleanValue()) {
            s52.c().d(E, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        if (!this.B) {
            this.x.B.a(this);
            this.B = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (WorkSpec workSpec : workSpecArr) {
            long jA = workSpec.a();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (workSpec.b == kn5.ENQUEUED) {
                if (jCurrentTimeMillis < jA) {
                    wi0 wi0Var = this.A;
                    if (wi0Var != null) {
                        HashMap map = wi0Var.c;
                        Runnable runnable = (Runnable) map.remove(workSpec.a);
                        pq2 pq2Var = wi0Var.b;
                        if (runnable != null) {
                            ((Handler) pq2Var.w).removeCallbacks(runnable);
                        }
                        vi0 vi0Var = new vi0(wi0Var, workSpec);
                        map.put(workSpec.a, vi0Var);
                        ((Handler) pq2Var.w).postDelayed(vi0Var, workSpec.a() - System.currentTimeMillis());
                    }
                } else if (workSpec.b()) {
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 23 && workSpec.j.c) {
                        s52.c().a(E, String.format("Ignoring WorkSpec %s, Requires device idle.", workSpec), new Throwable[0]);
                    } else if (i < 24) {
                        hashSet.add(workSpec);
                        hashSet2.add(workSpec.a);
                    } else if (workSpec.j.h.a.size() > 0) {
                        s52.c().a(E, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", workSpec), new Throwable[0]);
                    } else {
                        hashSet.add(workSpec);
                        hashSet2.add(workSpec.a);
                    }
                } else {
                    s52.c().a(E, String.format("Starting work for %s", workSpec.a), new Throwable[0]);
                    this.x.a1(workSpec.a, null);
                }
            }
        }
        synchronized (this.C) {
            if (!hashSet.isEmpty()) {
                s52.c().a(E, String.format("Starting tracking for [%s]", TextUtils.join(",", hashSet2)), new Throwable[0]);
                this.z.addAll(hashSet);
                this.y.b(this.z);
            }
        }
    }

    @Override // defpackage.d54
    public final boolean b() {
        return false;
    }

    @Override // defpackage.dv0
    public final void c(String str, boolean z) {
        synchronized (this.C) {
            for (WorkSpec workSpec : this.z) {
                if (workSpec.a.equals(str)) {
                    s52.c().a(E, String.format("Stopping tracking for %s", str), new Throwable[0]);
                    this.z.remove(workSpec);
                    this.y.b(this.z);
                    break;
                }
            }
        }
    }

    @Override // defpackage.d54
    public final void d(String str) {
        Runnable runnable;
        Boolean bool = this.D;
        nn5 nn5Var = this.x;
        if (bool == null) {
            this.D = Boolean.valueOf(ne3.a(this.w, nn5Var.x));
        }
        boolean zBooleanValue = this.D.booleanValue();
        String str2 = E;
        if (!zBooleanValue) {
            s52.c().d(str2, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        if (!this.B) {
            nn5Var.B.a(this);
            this.B = true;
        }
        s52.c().a(str2, String.format("Cancelling work ID %s", str), new Throwable[0]);
        wi0 wi0Var = this.A;
        if (wi0Var != null && (runnable = (Runnable) wi0Var.c.remove(str)) != null) {
            ((Handler) wi0Var.b.w).removeCallbacks(runnable);
        }
        nn5Var.b1(str);
    }

    @Override // defpackage.bn5
    public final void e(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            s52.c().a(E, String.format("Constraints not met: Cancelling work ID %s", str), new Throwable[0]);
            this.x.b1(str);
        }
    }

    @Override // defpackage.bn5
    public final void f(List<String> list) {
        for (String str : (ArrayList) list) {
            s52.c().a(E, String.format("Constraints met: Scheduling work ID %s", str), new Throwable[0]);
            this.x.a1(str, null);
        }
    }
}
