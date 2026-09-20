package defpackage;

import android.app.ActivityManager;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.QnHx;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.model.CQf;
import androidx.work.impl.utils.ForceStopRunnable;
import com.azefsw.audioconnect.R;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class nn5 extends B8C {
    public static nn5 F;
    public static nn5 G;
    public static final Object H;
    public List<d54> A;
    public oe3 B;
    public wa3 C;
    public boolean D;
    public BroadcastReceiver.PendingResult E;
    public Context w;
    public QnHx x;
    public WorkDatabase y;
    public c15 z;

    static {
        s52.e("WorkManagerImpl");
        F = null;
        G = null;
        H = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v28 */
    public nn5(Context context, QnHx qnHx, on5 on5Var) {
        at3.QnHx qnHx2;
        Executor executor;
        String str;
        ?? r6;
        int i;
        d54 ty4Var;
        boolean z = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        Context applicationContext = context.getApplicationContext();
        va4 va4Var = on5Var.a;
        int i2 = WorkDatabase.k;
        if (z) {
            qnHx2 = new at3.QnHx(applicationContext, null);
            qnHx2.h = true;
        } else {
            String str2 = gn5.a;
            qnHx2 = new at3.QnHx(applicationContext, "androidx.work.workdb");
            qnHx2.g = new en5(applicationContext);
        }
        qnHx2.e = va4Var;
        fn5 fn5Var = new fn5();
        if (qnHx2.d == null) {
            qnHx2.d = new ArrayList<>();
        }
        qnHx2.d.add(fn5Var);
        qnHx2.a(androidx.work.impl.QnHx.a);
        qnHx2.a(new androidx.work.impl.QnHx.T23(applicationContext, 2, 3));
        qnHx2.a(androidx.work.impl.QnHx.b);
        qnHx2.a(androidx.work.impl.QnHx.c);
        qnHx2.a(new androidx.work.impl.QnHx.T23(applicationContext, 5, 6));
        qnHx2.a(androidx.work.impl.QnHx.d);
        qnHx2.a(androidx.work.impl.QnHx.e);
        qnHx2.a(androidx.work.impl.QnHx.f);
        qnHx2.a(new androidx.work.impl.QnHx.byN(applicationContext));
        qnHx2.a(new androidx.work.impl.QnHx.T23(applicationContext, 10, 11));
        qnHx2.a(androidx.work.impl.QnHx.g);
        qnHx2.i = false;
        qnHx2.j = true;
        Context context2 = qnHx2.c;
        if (context2 == null) {
            throw new IllegalArgumentException("Cannot provide null context for the database.");
        }
        Class cls = qnHx2.a;
        if (cls == null) {
            throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
        }
        Executor executor2 = qnHx2.e;
        if (executor2 == null && qnHx2.f == null) {
            dS.QnHx qnHx3 = dS.y;
            qnHx2.f = qnHx3;
            qnHx2.e = qnHx3;
        } else if (executor2 != null && qnHx2.f == null) {
            qnHx2.f = executor2;
        } else if (executor2 == null && (executor = qnHx2.f) != null) {
            qnHx2.e = executor;
        }
        if (qnHx2.g == null) {
            qnHx2.g = new t61();
        }
        String str3 = qnHx2.b;
        dx4.F1 f1 = qnHx2.g;
        at3.F1 f2 = qnHx2.k;
        ArrayList<at3.CQf> arrayList = qnHx2.d;
        boolean z2 = qnHx2.h;
        ActivityManager activityManager = (ActivityManager) context2.getSystemService("activity");
        int i3 = (activityManager == null || activityManager.isLowRamDevice()) ? 2 : 3;
        Executor executor3 = qnHx2.e;
        cf0 cf0Var = new cf0(context2, str3, f1, f2, arrayList, z2, i3, executor3, qnHx2.f, qnHx2.i, qnHx2.j);
        String name = cls.getPackage().getName();
        String canonicalName = cls.getCanonicalName();
        String str4 = (name.isEmpty() ? canonicalName : canonicalName.substring(name.length() + 1)).replace('.', '_') + "_Impl";
        try {
            if (name.isEmpty()) {
                str = str4;
            } else {
                str = name + "." + str4;
            }
            at3 at3Var = (at3) Class.forName(str).newInstance();
            dx4 dx4VarE = at3Var.e(cf0Var);
            at3Var.c = dx4VarE;
            if (dx4VarE instanceof s14) {
                ((s14) dx4VarE).w = cf0Var;
            }
            boolean z3 = i3 == 3;
            dx4VarE.setWriteAheadLoggingEnabled(z3);
            at3Var.g = arrayList;
            at3Var.b = executor3;
            new ArrayDeque();
            at3Var.e = z2;
            at3Var.f = z3;
            WorkDatabase workDatabase = (WorkDatabase) at3Var;
            Context applicationContext2 = context.getApplicationContext();
            s52.QnHx qnHx4 = new s52.QnHx(qnHx.f);
            synchronized (s52.class) {
                s52.a = qnHx4;
            }
            d54[] d54VarArr = new d54[2];
            int i4 = Build.VERSION.SDK_INT;
            String str5 = k54.a;
            if (i4 >= 23) {
                ty4Var = new mz4(applicationContext2, this);
                r6 = 1;
                mx2.a(applicationContext2, SystemJobService.class, true);
                s52.c().a(str5, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
                i = 0;
            } else {
                try {
                    ty4Var = (d54) Class.forName("androidx.work.impl.background.gcm.GcmScheduler").getConstructor(Context.class).newInstance(applicationContext2);
                    s52.c().a(str5, String.format("Created %s", "androidx.work.impl.background.gcm.GcmScheduler"), new Throwable[0]);
                    r6 = 1;
                    i = 0;
                } catch (Throwable th) {
                    r6 = 1;
                    i = 0;
                    s52.c().a(str5, "Unable to create GCM Scheduler", th);
                    ty4Var = null;
                }
                if (ty4Var == null) {
                    ty4Var = new ty4(applicationContext2);
                    mx2.a(applicationContext2, SystemAlarmService.class, r6);
                    s52.c().a(str5, "Created SystemAlarmScheduler", new Throwable[i]);
                }
            }
            d54VarArr[i] = ty4Var;
            d54VarArr[r6] = new wa1(applicationContext2, qnHx, on5Var, this);
            List<d54> listAsList = Arrays.asList(d54VarArr);
            oe3 oe3Var = new oe3(context, qnHx, on5Var, workDatabase, listAsList);
            Context applicationContext3 = context.getApplicationContext();
            this.w = applicationContext3;
            this.x = qnHx;
            this.z = on5Var;
            this.y = workDatabase;
            this.A = listAsList;
            this.B = oe3Var;
            this.C = new wa3(workDatabase);
            this.D = false;
            if (Build.VERSION.SDK_INT >= 24 && applicationContext3.isDeviceProtectedStorage()) {
                throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
            }
            ((on5) this.z).a(new ForceStopRunnable(applicationContext3, this));
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("cannot find implementation for " + cls.getCanonicalName() + ". " + str4 + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor" + cls.getCanonicalName());
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + cls.getCanonicalName());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static nn5 W0(Context context) {
        nn5 nn5VarW0;
        Object obj = H;
        synchronized (obj) {
            synchronized (obj) {
                nn5VarW0 = F;
                if (nn5VarW0 == null) {
                    nn5VarW0 = G;
                }
            }
            return nn5VarW0;
        }
        if (nn5VarW0 == null) {
            Context applicationContext = context.getApplicationContext();
            if (!(applicationContext instanceof QnHx.CQf)) {
                throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
            }
            X0(applicationContext, ((QnHx.CQf) applicationContext).a());
            nn5VarW0 = W0(applicationContext);
        }
        return nn5VarW0;
    }

    public static void X0(Context context, QnHx qnHx) {
        synchronized (H) {
            nn5 nn5Var = F;
            if (nn5Var != null && G != null) {
                throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
            }
            if (nn5Var == null) {
                Context applicationContext = context.getApplicationContext();
                if (G == null) {
                    G = new nn5(applicationContext, qnHx, new on5(qnHx.b));
                }
                F = G;
            }
        }
    }

    public final qv2 V0(List list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        dn5 dn5Var = new dn5(this, list);
        if (dn5Var.D) {
            s52.c().f(dn5.F, String.format("Already enqueued work ids (%s)", TextUtils.join(", ", dn5Var.A)), new Throwable[0]);
        } else {
            ss0 ss0Var = new ss0(dn5Var);
            ((on5) this.z).a(ss0Var);
            dn5Var.E = ss0Var.x;
        }
        return dn5Var.E;
    }

    public final void Y0() {
        synchronized (H) {
            this.D = true;
            BroadcastReceiver.PendingResult pendingResult = this.E;
            if (pendingResult != null) {
                pendingResult.finish();
                this.E = null;
            }
        }
    }

    public final void Z0() {
        ArrayList arrayListF;
        if (Build.VERSION.SDK_INT >= 23) {
            Context context = this.w;
            String str = mz4.A;
            JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
            if (jobScheduler != null && (arrayListF = mz4.f(context, jobScheduler)) != null && !arrayListF.isEmpty()) {
                Iterator it = arrayListF.iterator();
                while (it.hasNext()) {
                    mz4.c(jobScheduler, ((JobInfo) it.next()).getId());
                }
            }
        }
        CQf cQf = (CQf) this.y.n();
        at3 at3Var = cQf.a;
        at3Var.b();
        CQf.T23 t23 = cQf.i;
        v61 v61VarA = t23.a();
        at3Var.c();
        try {
            v61VarA.h();
            at3Var.h();
            at3Var.f();
            t23.c(v61VarA);
            k54.a(this.x, this.y, this.A);
        } catch (Throwable th) {
            at3Var.f();
            t23.c(v61VarA);
            throw th;
        }
    }

    public final void a1(String str, WorkerParameters.QnHx qnHx) {
        ((on5) this.z).a(new tr4(this, str, qnHx));
    }

    public final void b1(String str) {
        ((on5) this.z).a(new yt4(this, str, false));
    }
}
