package defpackage;

import android.content.Context;
import android.database.Cursor;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.model.CQf;
import androidx.work.impl.model.WorkSpec;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class go5 implements Runnable {
    public static final String P = s52.e("WorkerWrapper");
    public WorkSpec A;
    public final c15 C;
    public final androidx.work.QnHx E;
    public final i51 F;
    public final WorkDatabase G;
    public final androidx.work.impl.model.QnHx H;
    public final mj0 I;
    public final yn5 J;
    public ArrayList K;
    public String L;
    public volatile boolean O;
    public final Context w;
    public final String x;
    public final List<d54> y;
    public final WorkerParameters.QnHx z;
    public ListenableWorker.QnHx D = new ListenableWorker.QnHx.C0031QnHx();
    public final pg4<Boolean> M = new pg4<>();
    public j42<ListenableWorker.QnHx> N = null;
    public ListenableWorker B = null;

    public static class QnHx {
        public final Context a;
        public final i51 b;
        public final c15 c;
        public final androidx.work.QnHx d;
        public final WorkDatabase e;
        public final String f;
        public List<d54> g;
        public WorkerParameters.QnHx h = new WorkerParameters.QnHx();

        public QnHx(Context context, androidx.work.QnHx qnHx, c15 c15Var, i51 i51Var, WorkDatabase workDatabase, String str) {
            this.a = context.getApplicationContext();
            this.c = c15Var;
            this.b = i51Var;
            this.d = qnHx;
            this.e = workDatabase;
            this.f = str;
        }
    }

    public go5(QnHx qnHx) {
        this.w = qnHx.a;
        this.C = qnHx.c;
        this.F = qnHx.b;
        this.x = qnHx.f;
        this.y = qnHx.g;
        this.z = qnHx.h;
        this.E = qnHx.d;
        WorkDatabase workDatabase = qnHx.e;
        this.G = workDatabase;
        this.H = workDatabase.n();
        this.I = workDatabase.i();
        this.J = workDatabase.o();
    }

    public final void a(ListenableWorker.QnHx qnHx) {
        boolean z = qnHx instanceof ListenableWorker.QnHx.F1;
        String str = P;
        if (!z) {
            if (qnHx instanceof ListenableWorker.QnHx.CQf) {
                s52.c().d(str, String.format("Worker result RETRY for %s", this.L), new Throwable[0]);
                d();
                return;
            }
            s52.c().d(str, String.format("Worker result FAILURE for %s", this.L), new Throwable[0]);
            if (this.A.c()) {
                e();
                return;
            } else {
                h();
                return;
            }
        }
        s52.c().d(str, String.format("Worker result SUCCESS for %s", this.L), new Throwable[0]);
        if (this.A.c()) {
            e();
            return;
        }
        mj0 mj0Var = this.I;
        String str2 = this.x;
        androidx.work.impl.model.QnHx qnHx2 = this.H;
        WorkDatabase workDatabase = this.G;
        workDatabase.c();
        try {
            ((CQf) qnHx2).n(kn5.SUCCEEDED, str2);
            ((CQf) qnHx2).l(str2, ((ListenableWorker.QnHx.F1) this.D).a);
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (String str3 : ((nj0) mj0Var).a(str2)) {
                if (((CQf) qnHx2).f(str3) == kn5.BLOCKED && ((nj0) mj0Var).b(str3)) {
                    s52.c().d(str, String.format("Setting status to enqueued for %s", str3), new Throwable[0]);
                    ((CQf) qnHx2).n(kn5.ENQUEUED, str3);
                    ((CQf) qnHx2).m(str3, jCurrentTimeMillis);
                }
            }
            workDatabase.h();
        } finally {
            workDatabase.f();
            f(false);
        }
    }

    public final void b(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            CQf cQf = (CQf) this.H;
            if (cQf.f(str2) != kn5.CANCELLED) {
                cQf.n(kn5.FAILED, str2);
            }
            linkedList.addAll(((nj0) this.I).a(str2));
        }
    }

    public final void c() {
        boolean zI = i();
        String str = this.x;
        WorkDatabase workDatabase = this.G;
        if (!zI) {
            workDatabase.c();
            try {
                kn5 kn5VarF = ((CQf) this.H).f(str);
                sn5 sn5Var = (sn5) workDatabase.m();
                at3 at3Var = sn5Var.a;
                at3Var.b();
                sn5.CQf cQf = sn5Var.c;
                v61 v61VarA = cQf.a();
                if (str == null) {
                    v61VarA.f(1);
                } else {
                    v61VarA.g(1, str);
                }
                at3Var.c();
                try {
                    v61VarA.h();
                    at3Var.h();
                    at3Var.f();
                    cQf.c(v61VarA);
                    if (kn5VarF == null) {
                        f(false);
                    } else if (kn5VarF == kn5.RUNNING) {
                        a(this.D);
                    } else if (!kn5VarF.a()) {
                        d();
                    }
                    workDatabase.h();
                    workDatabase.f();
                } catch (Throwable th) {
                    at3Var.f();
                    cQf.c(v61VarA);
                    throw th;
                }
            } catch (Throwable th2) {
                workDatabase.f();
                throw th2;
            }
        }
        List<d54> list = this.y;
        if (list != null) {
            Iterator<d54> it = list.iterator();
            while (it.hasNext()) {
                it.next().d(str);
            }
            k54.a(this.E, workDatabase, list);
        }
    }

    public final void d() {
        String str = this.x;
        androidx.work.impl.model.QnHx qnHx = this.H;
        WorkDatabase workDatabase = this.G;
        workDatabase.c();
        try {
            ((CQf) qnHx).n(kn5.ENQUEUED, str);
            ((CQf) qnHx).m(str, System.currentTimeMillis());
            ((CQf) qnHx).k(str, -1L);
            workDatabase.h();
        } finally {
            workDatabase.f();
            f(true);
        }
    }

    public final void e() {
        String str = this.x;
        androidx.work.impl.model.QnHx qnHx = this.H;
        WorkDatabase workDatabase = this.G;
        workDatabase.c();
        try {
            ((CQf) qnHx).m(str, System.currentTimeMillis());
            ((CQf) qnHx).n(kn5.ENQUEUED, str);
            CQf cQf = (CQf) qnHx;
            at3 at3Var = cQf.a;
            at3Var.b();
            CQf.YKK ykk = cQf.g;
            v61 v61VarA = ykk.a();
            if (str == null) {
                v61VarA.f(1);
            } else {
                v61VarA.g(1, str);
            }
            at3Var.c();
            try {
                v61VarA.h();
                at3Var.h();
                at3Var.f();
                ykk.c(v61VarA);
                ((CQf) qnHx).k(str, -1L);
                workDatabase.h();
                workDatabase.f();
                f(false);
            } catch (Throwable th) {
                at3Var.f();
                ykk.c(v61VarA);
                throw th;
            }
        } catch (Throwable th2) {
            workDatabase.f();
            f(false);
            throw th2;
        }
    }

    public final void f(boolean z) {
        ListenableWorker listenableWorker;
        this.G.c();
        try {
            CQf cQf = (CQf) this.G.n();
            cQf.getClass();
            ct3 ct3VarE = ct3.e(0, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
            at3 at3Var = cQf.a;
            at3Var.b();
            Cursor cursorG = at3Var.g(ct3VarE);
            try {
                boolean z2 = cursorG.moveToFirst() && cursorG.getInt(0) != 0;
                cursorG.close();
                ct3VarE.i();
                if (!z2) {
                    mx2.a(this.w, RescheduleReceiver.class, false);
                }
                if (z) {
                    ((CQf) this.H).n(kn5.ENQUEUED, this.x);
                    ((CQf) this.H).k(this.x, -1L);
                }
                if (this.A != null && (listenableWorker = this.B) != null && listenableWorker.isRunInForeground()) {
                    i51 i51Var = this.F;
                    String str = this.x;
                    oe3 oe3Var = (oe3) i51Var;
                    synchronized (oe3Var.G) {
                        oe3Var.B.remove(str);
                        oe3Var.g();
                    }
                }
                this.G.h();
                this.G.f();
                this.M.i(Boolean.valueOf(z));
            } catch (Throwable th) {
                cursorG.close();
                ct3VarE.i();
                throw th;
            }
        } catch (Throwable th2) {
            this.G.f();
            throw th2;
        }
    }

    public final void g() {
        CQf cQf = (CQf) this.H;
        String str = this.x;
        kn5 kn5VarF = cQf.f(str);
        kn5 kn5Var = kn5.RUNNING;
        String str2 = P;
        if (kn5VarF == kn5Var) {
            s52.c().a(str2, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", str), new Throwable[0]);
            f(true);
        } else {
            s52.c().a(str2, String.format("Status for %s is %s; not doing any work", str, kn5VarF), new Throwable[0]);
            f(false);
        }
    }

    public final void h() {
        String str = this.x;
        WorkDatabase workDatabase = this.G;
        workDatabase.c();
        try {
            b(str);
            ((CQf) this.H).l(str, ((ListenableWorker.QnHx.C0031QnHx) this.D).a);
            workDatabase.h();
        } finally {
            workDatabase.f();
            f(false);
        }
    }

    public final boolean i() {
        if (!this.O) {
            return false;
        }
        s52.c().a(P, String.format("Work interrupted for %s", this.L), new Throwable[0]);
        kn5 kn5VarF = ((CQf) this.H).f(this.x);
        if (kn5VarF == null) {
            f(false);
        } else {
            f(!kn5VarF.a());
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00b1 A[Catch: all -> 0x02d8, TryCatch #2 {all -> 0x02d8, blocks: (B:14:0x0050, B:17:0x005d, B:18:0x0078, B:21:0x007e, B:22:0x009c, B:24:0x00a2, B:26:0x00a8, B:40:0x00ee, B:31:0x00b1, B:36:0x00c4, B:38:0x00cc), top: B:108:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c1  */
    @Override // java.lang.Runnable
    public final void run() {
        WorkSpec workSpec;
        boolean z;
        ho1 ho1Var;
        androidx.work.CQf cQfA;
        boolean z2;
        zn5 zn5Var = (zn5) this.J;
        String str = this.x;
        ArrayList<String> arrayListA = zn5Var.a(str);
        this.K = arrayListA;
        StringBuilder sbA = N.a("Work [ id=", str, ", tags={ ");
        boolean z3 = true;
        for (String str2 : arrayListA) {
            if (z3) {
                z3 = false;
            } else {
                sbA.append(", ");
            }
            sbA.append(str2);
        }
        sbA.append(" } ]");
        this.L = sbA.toString();
        androidx.work.impl.model.QnHx qnHx = this.H;
        if (i()) {
            return;
        }
        WorkDatabase workDatabase = this.G;
        workDatabase.c();
        try {
            WorkSpec workSpecI = ((CQf) qnHx).i(str);
            this.A = workSpecI;
            String str3 = P;
            if (workSpecI == null) {
                s52.c().b(str3, String.format("Didn't find WorkSpec for id %s", str), new Throwable[0]);
                f(false);
                workDatabase.h();
            } else {
                kn5 kn5Var = workSpecI.b;
                kn5 kn5Var2 = kn5.ENQUEUED;
                if (kn5Var == kn5Var2) {
                    if (workSpecI.c()) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        workSpec = this.A;
                        if (workSpec.n == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            s52.c().a(str3, String.format("Delaying execution for %s because it is being executed before schedule.", this.A.c), new Throwable[0]);
                            f(true);
                            workDatabase.h();
                        }
                    } else {
                        WorkSpec workSpec2 = this.A;
                        if (workSpec2.b == kn5Var2 && workSpec2.k > 0) {
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            workSpec = this.A;
                            if (workSpec.n == 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!z && jCurrentTimeMillis2 < workSpec.a()) {
                                s52.c().a(str3, String.format("Delaying execution for %s because it is being executed before schedule.", this.A.c), new Throwable[0]);
                                f(true);
                                workDatabase.h();
                            }
                        }
                    }
                    workDatabase.h();
                    workDatabase.f();
                    boolean zC = this.A.c();
                    androidx.work.QnHx qnHx2 = this.E;
                    if (zC) {
                        cQfA = this.A.e;
                    } else {
                        io1 io1Var = qnHx2.d;
                        String str4 = this.A.d;
                        io1Var.getClass();
                        String str5 = ho1.a;
                        try {
                            ho1Var = (ho1) Class.forName(str4).newInstance();
                        } catch (Exception e) {
                            s52.c().b(ho1.a, b70.a("Trouble instantiating + ", str4), e);
                            ho1Var = null;
                        }
                        if (ho1Var == null) {
                            s52.c().b(str3, String.format("Could not create Input Merger %s", this.A.d), new Throwable[0]);
                            h();
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(this.A.e);
                        CQf cQf = (CQf) qnHx;
                        cQf.getClass();
                        ct3 ct3VarE = ct3.e(1, "SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
                        if (str == null) {
                            ct3VarE.g(1);
                        } else {
                            ct3VarE.h(1, str);
                        }
                        at3 at3Var = cQf.a;
                        at3Var.b();
                        Cursor cursorG = at3Var.g(ct3VarE);
                        try {
                            ArrayList arrayList2 = new ArrayList(cursorG.getCount());
                            while (cursorG.moveToNext()) {
                                arrayList2.add(androidx.work.CQf.a(cursorG.getBlob(0)));
                            }
                            cursorG.close();
                            ct3VarE.i();
                            arrayList.addAll(arrayList2);
                            cQfA = ho1Var.a(arrayList);
                        } catch (Throwable th) {
                            cursorG.close();
                            ct3VarE.i();
                            throw th;
                        }
                    }
                    androidx.work.CQf cQf2 = cQfA;
                    UUID uuidFromString = UUID.fromString(str);
                    ArrayList arrayList3 = this.K;
                    WorkerParameters.QnHx qnHx3 = this.z;
                    int i = this.A.k;
                    ExecutorService executorService = qnHx2.a;
                    c15 c15Var = this.C;
                    co5 co5Var = qnHx2.c;
                    c15 c15Var2 = this.C;
                    WorkerParameters workerParameters = new WorkerParameters(uuidFromString, cQf2, arrayList3, qnHx3, i, executorService, c15Var, co5Var, new un5(workDatabase, c15Var2), new jn5(workDatabase, this.F, c15Var2));
                    if (this.B == null) {
                        this.B = co5Var.a(this.w, this.A.c, workerParameters);
                    }
                    ListenableWorker listenableWorker = this.B;
                    if (listenableWorker == null) {
                        s52.c().b(str3, String.format("Could not create Worker %s", this.A.c), new Throwable[0]);
                        h();
                        return;
                    }
                    if (listenableWorker.isUsed()) {
                        s52.c().b(str3, String.format("Received an already-used Worker %s; WorkerFactory should return new instances", this.A.c), new Throwable[0]);
                        h();
                        return;
                    }
                    this.B.setUsed();
                    workDatabase.c();
                    try {
                        if (((CQf) qnHx).f(str) == kn5Var2) {
                            ((CQf) qnHx).n(kn5.RUNNING, str);
                            CQf cQf3 = (CQf) qnHx;
                            at3 at3Var2 = cQf3.a;
                            at3Var2.b();
                            CQf.NUlFixed nUl = cQf3.f;
                            v61 v61VarA = nUl.a();
                            if (str == null) {
                                v61VarA.f(1);
                            } else {
                                v61VarA.g(1, str);
                            }
                            at3Var2.c();
                            try {
                                v61VarA.h();
                                at3Var2.h();
                                at3Var2.f();
                                nUl.c(v61VarA);
                                z2 = true;
                            } catch (Throwable th2) {
                                at3Var2.f();
                                nUl.c(v61VarA);
                                throw th2;
                            }
                        } else {
                            z2 = false;
                        }
                        workDatabase.h();
                        workDatabase.f();
                        if (!z2) {
                            g();
                            return;
                        }
                        if (i()) {
                            return;
                        }
                        pg4 pg4Var = new pg4();
                        hn5 hn5Var = new hn5(this.w, this.A, this.B, workerParameters.j, this.C);
                        on5 on5Var = (on5) c15Var2;
                        on5Var.c.execute(hn5Var);
                        pg4<Void> pg4Var2 = hn5Var.w;
                        pg4Var2.b(new eo5(this, pg4Var2, pg4Var), on5Var.c);
                        pg4Var.b(new fo5(this, pg4Var, this.L), on5Var.a);
                        return;
                    } catch (Throwable th3) {
                        workDatabase.f();
                        throw th3;
                    }
                }
                g();
                workDatabase.h();
                s52.c().a(str3, String.format("%s is not in ENQUEUED state. Nothing more to do.", this.A.c), new Throwable[0]);
            }
            workDatabase.f();
        } catch (Throwable th4) {
            workDatabase.f();
            throw th4;
        }
    }
}
