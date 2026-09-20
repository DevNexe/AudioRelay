package defpackage;

import android.database.Cursor;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.model.CQf;
import androidx.work.impl.model.Dependency;
import androidx.work.impl.model.QnHx;
import androidx.work.impl.model.WorkName;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkTag;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class ss0 implements Runnable {
    public static final String y = s52.e("EnqueueRunnable");
    public final dn5 w;
    public final qv2 x = new qv2();

    public ss0(dn5 dn5Var) {
        this.w = dn5Var;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x020e  */
    /* JADX WARN: Code duplicated, block: B:156:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:157:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:162:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:164:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:173:0x031b  */
    /* JADX WARN: Code duplicated, block: B:180:0x034b  */
    /* JADX WARN: Code duplicated, block: B:227:0x0373 A[SYNTHETIC] */
    public static boolean a(dn5 dn5Var) throws Throwable {
        boolean zA;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        nn5 nn5Var;
        kn5 kn5Var;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        nn5 nn5Var2;
        boolean z11;
        kn5 kn5Var2;
        boolean z12;
        at3 at3Var;
        UUID uuid;
        at3 at3Var2;
        at3 at3Var3;
        int length;
        int i;
        at3 at3Var4;
        boolean z13;
        List listEmptyList;
        boolean z14;
        List<dn5> list = dn5Var.C;
        String str = y;
        if (list != null) {
            zA = false;
            for (dn5 dn5Var2 : list) {
                if (dn5Var2.D) {
                    s52.c().f(str, String.format("Already enqueued work ids (%s).", TextUtils.join(", ", dn5Var2.A)), new Throwable[0]);
                } else {
                    zA |= a(dn5Var2);
                }
            }
        } else {
            zA = false;
        }
        String[] strArr = (String[]) dn5.W0(dn5Var).toArray(new String[0]);
        long jCurrentTimeMillis = System.currentTimeMillis();
        nn5 nn5Var3 = dn5Var.w;
        WorkDatabase workDatabase = nn5Var3.y;
        boolean z15 = strArr != null && strArr.length > 0;
        kn5 kn5Var3 = kn5.SUCCEEDED;
        kn5 kn5Var4 = kn5.CANCELLED;
        kn5 kn5Var5 = kn5.FAILED;
        if (z15) {
            int length2 = strArr.length;
            int i2 = 0;
            z = true;
            z2 = false;
            z3 = false;
            while (true) {
                if (i2 < length2) {
                    String str2 = strArr[i2];
                    WorkSpec workSpecI = ((CQf) workDatabase.n()).i(str2);
                    if (workSpecI == null) {
                        s52.c().b(str, String.format("Prerequisite %s doesn't exist; not enqueuing", str2), new Throwable[0]);
                        z5 = zA;
                    } else {
                        kn5 kn5Var6 = workSpecI.b;
                        z &= kn5Var6 == kn5Var3;
                        if (kn5Var6 == kn5Var5) {
                            z3 = true;
                        } else if (kn5Var6 == kn5Var4) {
                            z2 = true;
                        }
                        i2++;
                    }
                }
                z9 = true;
                z8 = false;
                dn5Var.D = z9;
                return z5 | z8;
            }
        }
        z = true;
        z2 = false;
        z3 = false;
        String str3 = dn5Var.x;
        boolean z16 = !TextUtils.isEmpty(str3);
        boolean z17 = z16 && !z15;
        kn5 kn5Var7 = kn5.ENQUEUED;
        if (z17) {
            ArrayList arrayListJ = ((CQf) workDatabase.n()).j(str3);
            if (arrayListJ.isEmpty()) {
                z4 = z16;
                z5 = zA;
                nn5Var = nn5Var3;
                kn5Var = kn5Var7;
                z6 = z15;
            } else {
                boolean z18 = z15;
                z5 = zA;
                int i3 = dn5Var.y;
                if (i3 == 3 || i3 == 4) {
                    mj0 mj0VarI = workDatabase.i();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = arrayListJ.iterator();
                    while (it.hasNext()) {
                        Iterator it2 = it;
                        WorkSpec.QnHx qnHx = (WorkSpec.QnHx) it.next();
                        boolean z19 = z16;
                        String str4 = qnHx.a;
                        kn5 kn5Var8 = kn5Var7;
                        nj0 nj0Var = (nj0) mj0VarI;
                        nj0Var.getClass();
                        mj0 mj0Var = mj0VarI;
                        nn5 nn5Var4 = nn5Var3;
                        ct3 ct3VarE = ct3.e(1, "SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?");
                        if (str4 == null) {
                            ct3VarE.g(1);
                        } else {
                            ct3VarE.h(1, str4);
                        }
                        at3 at3Var5 = nj0Var.a;
                        at3Var5.b();
                        Cursor cursorG = at3Var5.g(ct3VarE);
                        try {
                            boolean z20 = cursorG.moveToFirst() && cursorG.getInt(0) != 0;
                            cursorG.close();
                            ct3VarE.i();
                            if (!z20) {
                                kn5 kn5Var9 = qnHx.b;
                                boolean z21 = z & (kn5Var9 == kn5Var3);
                                if (kn5Var9 == kn5Var5) {
                                    z14 = z2;
                                    z3 = true;
                                } else {
                                    z14 = kn5Var9 == kn5Var4 ? true : z2;
                                }
                                arrayList.add(qnHx.a);
                                z2 = z14;
                                z = z21;
                            }
                            mj0VarI = mj0Var;
                            it = it2;
                            z16 = z19;
                            kn5Var7 = kn5Var8;
                            nn5Var3 = nn5Var4;
                        } catch (Throwable th) {
                            cursorG.close();
                            ct3VarE.i();
                            throw th;
                        }
                    }
                    z4 = z16;
                    nn5Var = nn5Var3;
                    kn5Var = kn5Var7;
                    if (i3 == 4 && (z2 || z3)) {
                        CQf cQf = (CQf) workDatabase.n();
                        Iterator it3 = cQf.j(str3).iterator();
                        while (it3.hasNext()) {
                            cQf.a(((WorkSpec.QnHx) it3.next()).a);
                        }
                        z13 = false;
                        z3 = false;
                        listEmptyList = Collections.emptyList();
                    } else {
                        z13 = z2;
                        listEmptyList = arrayList;
                    }
                    strArr = (String[]) listEmptyList.toArray(strArr);
                    z2 = z13;
                    z6 = strArr.length > 0;
                } else {
                    if (i3 == 2) {
                        Iterator it4 = arrayListJ.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                kn5 kn5Var10 = ((WorkSpec.QnHx) it4.next()).b;
                                if (kn5Var10 == kn5Var7 || kn5Var10 == kn5.RUNNING) {
                                    z9 = true;
                                    z8 = false;
                                    dn5Var.D = z9;
                                    return z5 | z8;
                                }
                            }
                        }
                    }
                    new pm(nn5Var3, str3).run();
                    QnHx qnHxN = workDatabase.n();
                    Iterator it5 = arrayListJ.iterator();
                    while (it5.hasNext()) {
                        ((CQf) qnHxN).a(((WorkSpec.QnHx) it5.next()).a);
                    }
                    z4 = z16;
                    nn5Var = nn5Var3;
                    kn5Var = kn5Var7;
                    z6 = z18;
                    z7 = true;
                }
            }
            z7 = false;
        } else {
            z4 = z16;
            z5 = zA;
            nn5Var = nn5Var3;
            kn5Var = kn5Var7;
            z6 = z15;
            z7 = false;
        }
        Iterator<? extends wn5> it6 = dn5Var.z.iterator();
        while (it6.hasNext()) {
            wn5 next = it6.next();
            WorkSpec workSpec = next.b;
            if (!z6 || z) {
                if (workSpec.c()) {
                    workSpec.n = 0L;
                } else {
                    workSpec.n = jCurrentTimeMillis;
                }
            } else if (z3) {
                workSpec.b = kn5Var5;
            } else if (z2) {
                workSpec.b = kn5Var4;
            } else {
                workSpec.b = kn5.BLOCKED;
            }
            int i4 = Build.VERSION.SDK_INT;
            try {
                if (i4 < 23 || i4 > 25) {
                    if (i4 <= 22) {
                        try {
                            Class<?> cls = Class.forName("androidx.work.impl.background.gcm.GcmScheduler");
                            nn5Var2 = nn5Var;
                            try {
                                Iterator<d54> it7 = nn5Var2.A.iterator();
                                while (true) {
                                    if (!it7.hasNext()) {
                                        z10 = z7;
                                        z11 = false;
                                        break;
                                    }
                                    z10 = z7;
                                    try {
                                        if (cls.isAssignableFrom(it7.next().getClass())) {
                                            z11 = true;
                                            break;
                                        }
                                        z7 = z10;
                                    } catch (ClassNotFoundException unused) {
                                        z11 = false;
                                        break;
                                    }
                                }
                            } catch (ClassNotFoundException unused2) {
                                z10 = z7;
                            }
                        } catch (ClassNotFoundException unused3) {
                            z10 = z7;
                            nn5Var2 = nn5Var;
                        }
                        if (z11) {
                            b(workSpec);
                        }
                    }
                    kn5Var2 = kn5Var;
                    if (workSpec.b == kn5Var2) {
                        z12 = true;
                    } else {
                        z12 = z10;
                    }
                    CQf cQf2 = (CQf) workDatabase.n();
                    boolean z22 = z12;
                    at3Var = cQf2.a;
                    at3Var.b();
                    at3Var.c();
                    cQf2.b.e(workSpec);
                    at3Var.h();
                    at3Var.f();
                    uuid = next.a;
                    if (z6) {
                        length = strArr.length;
                        i = 0;
                        while (i < length) {
                            Iterator<? extends wn5> it8 = it6;
                            String[] strArr2 = strArr;
                            long j = jCurrentTimeMillis;
                            Dependency dependency = new Dependency(uuid.toString(), strArr[i]);
                            nj0 nj0Var2 = (nj0) workDatabase.i();
                            at3Var4 = nj0Var2.a;
                            at3Var4.b();
                            at3Var4.c();
                            try {
                                nj0Var2.b.e(dependency);
                                at3Var4.h();
                                at3Var4.f();
                                i++;
                                it6 = it8;
                                strArr = strArr2;
                                jCurrentTimeMillis = j;
                            } catch (Throwable th2) {
                                at3Var4.f();
                                throw th2;
                            }
                        }
                    }
                    String[] strArr3 = strArr;
                    Iterator<? extends wn5> it9 = it6;
                    long j2 = jCurrentTimeMillis;
                    for (String str5 : next.c) {
                        yn5 yn5VarO = workDatabase.o();
                        WorkTag workTag = new WorkTag(str5, uuid.toString());
                        zn5 zn5Var = (zn5) yn5VarO;
                        at3Var3 = zn5Var.a;
                        at3Var3.b();
                        at3Var3.c();
                        try {
                            zn5Var.b.e(workTag);
                            at3Var3.h();
                            at3Var3.f();
                        } catch (Throwable th3) {
                            at3Var3.f();
                            throw th3;
                        }
                    }
                    if (z4) {
                        pn5 pn5VarL = workDatabase.l();
                        WorkName workName = new WorkName(str3, uuid.toString());
                        qn5 qn5Var = (qn5) pn5VarL;
                        at3Var2 = qn5Var.a;
                        at3Var2.b();
                        at3Var2.c();
                        try {
                            qn5Var.b.e(workName);
                            at3Var2.h();
                            at3Var2.f();
                        } catch (Throwable th4) {
                            at3Var2.f();
                            throw th4;
                        }
                    }
                    z7 = z22;
                    it6 = it9;
                    strArr = strArr3;
                    jCurrentTimeMillis = j2;
                    kn5Var = kn5Var2;
                    nn5Var = nn5Var2;
                } else {
                    b(workSpec);
                }
                cQf2.b.e(workSpec);
                at3Var.h();
                at3Var.f();
                uuid = next.a;
                if (z6) {
                    length = strArr.length;
                    i = 0;
                    while (i < length) {
                        Iterator<? extends wn5> it10 = it6;
                        String[] strArr4 = strArr;
                        long j3 = jCurrentTimeMillis;
                        Dependency dependency2 = new Dependency(uuid.toString(), strArr[i]);
                        nj0 nj0Var3 = (nj0) workDatabase.i();
                        at3Var4 = nj0Var3.a;
                        at3Var4.b();
                        at3Var4.c();
                        nj0Var3.b.e(dependency2);
                        at3Var4.h();
                        at3Var4.f();
                        i++;
                        it6 = it10;
                        strArr = strArr4;
                        jCurrentTimeMillis = j3;
                    }
                }
                String[] strArr5 = strArr;
                Iterator<? extends wn5> it11 = it6;
                long j4 = jCurrentTimeMillis;
                while (r1.hasNext()) {
                    yn5 yn5VarO2 = workDatabase.o();
                    WorkTag workTag2 = new WorkTag(str5, uuid.toString());
                    zn5 zn5Var2 = (zn5) yn5VarO2;
                    at3Var3 = zn5Var2.a;
                    at3Var3.b();
                    at3Var3.c();
                    zn5Var2.b.e(workTag2);
                    at3Var3.h();
                    at3Var3.f();
                }
                if (z4) {
                    pn5 pn5VarL2 = workDatabase.l();
                    WorkName workName2 = new WorkName(str3, uuid.toString());
                    qn5 qn5Var2 = (qn5) pn5VarL2;
                    at3Var2 = qn5Var2.a;
                    at3Var2.b();
                    at3Var2.c();
                    qn5Var2.b.e(workName2);
                    at3Var2.h();
                    at3Var2.f();
                }
                z7 = z22;
                it6 = it11;
                strArr = strArr5;
                jCurrentTimeMillis = j4;
                kn5Var = kn5Var2;
                nn5Var = nn5Var2;
            } catch (Throwable th5) {
                at3Var.f();
                throw th5;
            }
            z10 = z7;
            nn5Var2 = nn5Var;
            kn5Var2 = kn5Var;
            if (workSpec.b == kn5Var2) {
                z12 = true;
            } else {
                z12 = z10;
            }
            CQf cQf3 = (CQf) workDatabase.n();
            boolean z23 = z12;
            at3Var = cQf3.a;
            at3Var.b();
            at3Var.c();
        }
        z8 = z7;
        z9 = true;
        dn5Var.D = z9;
        return z5 | z8;
    }

    public static void b(WorkSpec workSpec) throws Throwable {
        h70 h70Var = workSpec.j;
        String str = workSpec.c;
        if (str.equals(ConstraintTrackingWorker.class.getName())) {
            return;
        }
        if (h70Var.d || h70Var.e) {
            androidx.work.CQf.QnHx qnHx = new androidx.work.CQf.QnHx();
            qnHx.a(workSpec.e.a);
            HashMap map = qnHx.a;
            map.put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
            workSpec.c = ConstraintTrackingWorker.class.getName();
            androidx.work.CQf cQf = new androidx.work.CQf(map);
            androidx.work.CQf.b(cQf);
            workSpec.e = cQf;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        qv2 qv2Var = this.x;
        dn5 dn5Var = this.w;
        try {
            dn5Var.getClass();
            nn5 nn5Var = dn5Var.w;
            if (dn5.V0(dn5Var, new HashSet())) {
                throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", dn5Var));
            }
            WorkDatabase workDatabase = nn5Var.y;
            workDatabase.c();
            try {
                boolean zA = a(dn5Var);
                workDatabase.h();
                workDatabase.f();
                if (zA) {
                    mx2.a(nn5Var.w, RescheduleReceiver.class, true);
                    k54.a(nn5Var.x, nn5Var.y, nn5Var.A);
                }
                qv2Var.a(pv2.a);
            } catch (Throwable th) {
                workDatabase.f();
                throw th;
            }
        } catch (Throwable th2) {
            qv2Var.a(new pv2.QnHx.C0183QnHx(th2));
        }
    }
}
