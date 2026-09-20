package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class oe3 implements dv0, i51 {
    public static final String H = s52.e("Processor");
    public final WorkDatabase A;
    public final List<d54> D;
    public final Context x;
    public final androidx.work.QnHx y;
    public final c15 z;
    public final HashMap C = new HashMap();
    public final HashMap B = new HashMap();
    public final HashSet E = new HashSet();
    public final ArrayList F = new ArrayList();
    public PowerManager.WakeLock w = null;
    public final Object G = new Object();

    public static class QnHx implements Runnable {
        public final dv0 w;
        public final String x;
        public final j42<Boolean> y;

        public QnHx(dv0 dv0Var, String str, pg4 pg4Var) {
            this.w = dv0Var;
            this.x = str;
            this.y = pg4Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean zBooleanValue;
            try {
                zBooleanValue = ((Boolean) ((Xn1) this.y).get()).booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                zBooleanValue = true;
            }
            this.w.c(this.x, zBooleanValue);
        }
    }

    public oe3(Context context, androidx.work.QnHx qnHx, on5 on5Var, WorkDatabase workDatabase, List list) {
        this.x = context;
        this.y = qnHx;
        this.z = on5Var;
        this.A = workDatabase;
        this.D = list;
    }

    public static boolean b(String str, go5 go5Var) {
        boolean zIsDone;
        if (go5Var == null) {
            s52.c().a(H, String.format("WorkerWrapper could not be found for %s", str), new Throwable[0]);
            return false;
        }
        go5Var.O = true;
        go5Var.i();
        j42<ListenableWorker.QnHx> j42Var = go5Var.N;
        if (j42Var != null) {
            zIsDone = ((Xn1) j42Var).isDone();
            ((Xn1) go5Var.N).cancel(true);
        } else {
            zIsDone = false;
        }
        ListenableWorker listenableWorker = go5Var.B;
        if (listenableWorker == null || zIsDone) {
            s52.c().a(go5.P, String.format("WorkSpec %s is already done. Not interrupting.", go5Var.A), new Throwable[0]);
        } else {
            listenableWorker.stop();
        }
        s52.c().a(H, String.format("WorkerWrapper interrupted for %s", str), new Throwable[0]);
        return true;
    }

    public final void a(dv0 dv0Var) {
        synchronized (this.G) {
            this.F.add(dv0Var);
        }
    }

    @Override // defpackage.dv0
    public final void c(String str, boolean z) {
        synchronized (this.G) {
            this.C.remove(str);
            s52.c().a(H, String.format("%s %s executed; reschedule = %s", oe3.class.getSimpleName(), str, Boolean.valueOf(z)), new Throwable[0]);
            Iterator it = this.F.iterator();
            while (it.hasNext()) {
                ((dv0) it.next()).c(str, z);
            }
        }
    }

    public final boolean d(String str) {
        boolean z;
        synchronized (this.G) {
            z = this.C.containsKey(str) || this.B.containsKey(str);
        }
        return z;
    }

    public final void e(String str, g51 g51Var) {
        synchronized (this.G) {
            s52.c().d(H, String.format("Moving WorkSpec (%s) to the foreground", str), new Throwable[0]);
            go5 go5Var = (go5) this.C.remove(str);
            if (go5Var != null) {
                if (this.w == null) {
                    PowerManager.WakeLock wakeLockA = il5.a(this.x, "ProcessorForegroundLck");
                    this.w = wakeLockA;
                    wakeLockA.acquire();
                }
                this.B.put(str, go5Var);
                Intent intentB = androidx.work.impl.foreground.QnHx.b(this.x, str, g51Var);
                Context context = this.x;
                Object obj = r80.a;
                if (Build.VERSION.SDK_INT >= 26) {
                    r80.NUlFixed.b(context, intentB);
                } else {
                    context.startService(intentB);
                }
            }
        }
    }

    public final boolean f(String str, WorkerParameters.QnHx qnHx) {
        synchronized (this.G) {
            if (d(str)) {
                s52.c().a(H, String.format("Work %s is already enqueued for processing", str), new Throwable[0]);
                return false;
            }
            go5.QnHx qnHx2 = new go5.QnHx(this.x, this.y, this.z, this, this.A, str);
            qnHx2.g = this.D;
            if (qnHx != null) {
                qnHx2.h = qnHx;
            }
            go5 go5Var = new go5(qnHx2);
            pg4<Boolean> pg4Var = go5Var.M;
            pg4Var.b(new QnHx(this, str, pg4Var), ((on5) this.z).c);
            this.C.put(str, go5Var);
            ((on5) this.z).a.execute(go5Var);
            s52.c().a(H, String.format("%s: processing %s", oe3.class.getSimpleName(), str), new Throwable[0]);
            return true;
        }
    }

    public final void g() {
        synchronized (this.G) {
            if (!(!this.B.isEmpty())) {
                Context context = this.x;
                String str = androidx.work.impl.foreground.QnHx.F;
                Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                intent.setAction("ACTION_STOP_FOREGROUND");
                try {
                    this.x.startService(intent);
                } catch (Throwable th) {
                    s52.c().b(H, "Unable to stop foreground service", th);
                }
                PowerManager.WakeLock wakeLock = this.w;
                if (wakeLock != null) {
                    wakeLock.release();
                    this.w = null;
                }
            }
        }
    }

    public final boolean h(String str) {
        boolean zB;
        synchronized (this.G) {
            s52.c().a(H, String.format("Processor stopping foreground work %s", str), new Throwable[0]);
            zB = b(str, (go5) this.B.remove(str));
        }
        return zB;
    }

    public final boolean i(String str) {
        boolean zB;
        synchronized (this.G) {
            s52.c().a(H, String.format("Processor stopping background work %s", str), new Throwable[0]);
            zB = b(str, (go5) this.C.remove(str));
        }
        return zB;
    }
}
