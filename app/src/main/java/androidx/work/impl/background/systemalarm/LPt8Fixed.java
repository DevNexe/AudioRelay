package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import defpackage.ao5;
import defpackage.c15;
import defpackage.dv0;
import defpackage.il5;
import defpackage.nn5;
import defpackage.oe3;
import defpackage.on5;
import defpackage.s52;
import defpackage.va4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class LPt8Fixed implements dv0 {
    public static final String G = s52.e("SystemAlarmDispatcher");
    public final nn5 A;
    public final androidx.work.impl.background.systemalarm.QnHx B;
    public final Handler C;
    public final ArrayList D;
    public Intent E;
    public F1 F;
    public final Context w;
    public final c15 x;
    public final ao5 y;
    public final oe3 z;

    public static class CQf implements Runnable {
        public final LPt8Fixed w;
        public final Intent x;
        public final int y;

        public CQf(int i, Intent intent, LPt8Fixed lPt8) {
            this.w = lPt8;
            this.x = intent;
            this.y = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.w.a(this.x, this.y);
        }
    }

    public interface F1 {
    }

    /* JADX INFO: renamed from: androidx.work.impl.background.systemalarm.LPt8$LPt8, reason: collision with other inner class name */
    public static class RunnableC0034LPt8 implements Runnable {
        public final LPt8Fixed w;

        public RunnableC0034LPt8(LPt8Fixed lPt8) {
            this.w = lPt8;
        }

        /* JADX WARN: Code duplicated, block: B:36:0x0098 A[Catch: all -> 0x00a8, TryCatch #2 {, blocks: (B:4:0x0019, B:6:0x001e, B:8:0x0043, B:9:0x0047, B:10:0x004e, B:11:0x004f, B:12:0x0059, B:19:0x0068, B:21:0x0070, B:22:0x0072, B:29:0x0080, B:31:0x008f, B:39:0x00a3, B:35:0x0097, B:36:0x0098, B:38:0x00a0, B:43:0x00a7, B:23:0x0073, B:27:0x007d, B:13:0x005a, B:17:0x0065), top: B:51:0x0019, inners: #0, #1 }] */
        /* JADX WARN: Code duplicated, block: B:38:0x00a0 A[Catch: all -> 0x00a8, TryCatch #2 {, blocks: (B:4:0x0019, B:6:0x001e, B:8:0x0043, B:9:0x0047, B:10:0x004e, B:11:0x004f, B:12:0x0059, B:19:0x0068, B:21:0x0070, B:22:0x0072, B:29:0x0080, B:31:0x008f, B:39:0x00a3, B:35:0x0097, B:36:0x0098, B:38:0x00a0, B:43:0x00a7, B:23:0x0073, B:27:0x007d, B:13:0x005a, B:17:0x0065), top: B:51:0x0019, inners: #0, #1 }] */
        @Override // java.lang.Runnable
        public final void run() {
            boolean z;
            LPt8Fixed lPt8 = this.w;
            lPt8.getClass();
            s52 s52VarC = s52.c();
            String str = LPt8Fixed.G;
            s52VarC.a(str, "Checking if commands are complete.", new Throwable[0]);
            lPt8.b();
            synchronized (lPt8.D) {
                boolean z2 = true;
                if (lPt8.E != null) {
                    s52.c().a(str, String.format("Removing command %s", lPt8.E), new Throwable[0]);
                    if (!((Intent) lPt8.D.remove(0)).equals(lPt8.E)) {
                        throw new IllegalStateException("Dequeue-d command is not the first.");
                    }
                    lPt8.E = null;
                }
                va4 va4Var = ((on5) lPt8.x).a;
                androidx.work.impl.background.systemalarm.QnHx qnHx = lPt8.B;
                synchronized (qnHx.y) {
                    z = !qnHx.x.isEmpty();
                }
                if (!z && lPt8.D.isEmpty()) {
                    synchronized (va4Var.y) {
                        if (va4Var.w.isEmpty()) {
                            z2 = false;
                        }
                    }
                    if (!z2) {
                        s52.c().a(str, "No more commands & intents.", new Throwable[0]);
                        F1 f1 = lPt8.F;
                        if (f1 != null) {
                            ((SystemAlarmService) f1).b();
                        }
                    } else if (!lPt8.D.isEmpty()) {
                        lPt8.f();
                    }
                } else if (!lPt8.D.isEmpty()) {
                    lPt8.f();
                }
            }
        }
    }

    public class QnHx implements Runnable {
        public QnHx() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            LPt8Fixed lPt8;
            RunnableC0034LPt8 runnableC0034LPt8;
            synchronized (LPt8Fixed.this.D) {
                LPt8Fixed lPt9 = LPt8Fixed.this;
                lPt9.E = (Intent) lPt9.D.get(0);
            }
            Intent intent = LPt8Fixed.this.E;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = LPt8Fixed.this.E.getIntExtra("KEY_START_ID", 0);
                s52 s52VarC = s52.c();
                String str = LPt8Fixed.G;
                s52VarC.a(str, String.format("Processing command %s, %s", LPt8Fixed.this.E, Integer.valueOf(intExtra)), new Throwable[0]);
                PowerManager.WakeLock wakeLockA = il5.a(LPt8Fixed.this.w, String.format("%s (%s)", action, Integer.valueOf(intExtra)));
                try {
                    s52.c().a(str, String.format("Acquiring operation wake lock (%s) %s", action, wakeLockA), new Throwable[0]);
                    wakeLockA.acquire();
                    LPt8Fixed lPt10 = LPt8Fixed.this;
                    lPt10.B.d(intExtra, lPt10.E, lPt10);
                    s52.c().a(str, String.format("Releasing operation wake lock (%s) %s", action, wakeLockA), new Throwable[0]);
                    wakeLockA.release();
                    lPt8 = LPt8Fixed.this;
                    runnableC0034LPt8 = new RunnableC0034LPt8(lPt8);
                } catch (Throwable th) {
                    try {
                        s52 s52VarC2 = s52.c();
                        String str2 = LPt8Fixed.G;
                        s52VarC2.b(str2, "Unexpected error in onHandleIntent", th);
                        s52.c().a(str2, String.format("Releasing operation wake lock (%s) %s", action, wakeLockA), new Throwable[0]);
                        wakeLockA.release();
                        lPt8 = LPt8Fixed.this;
                        runnableC0034LPt8 = new RunnableC0034LPt8(lPt8);
                    } catch (Throwable th2) {
                        s52.c().a(LPt8Fixed.G, String.format("Releasing operation wake lock (%s) %s", action, wakeLockA), new Throwable[0]);
                        wakeLockA.release();
                        LPt8Fixed lPt11 = LPt8Fixed.this;
                        lPt11.e(new RunnableC0034LPt8(lPt11));
                        throw th2;
                    }
                }
                lPt8.e(runnableC0034LPt8);
            }
        }
    }

    public LPt8Fixed(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.w = applicationContext;
        this.B = new androidx.work.impl.background.systemalarm.QnHx(applicationContext);
        this.y = new ao5();
        nn5 nn5VarW0 = nn5.W0(context);
        this.A = nn5VarW0;
        oe3 oe3Var = nn5VarW0.B;
        this.z = oe3Var;
        this.x = nn5VarW0.z;
        oe3Var.a(this);
        this.D = new ArrayList();
        this.E = null;
        this.C = new Handler(Looper.getMainLooper());
    }

    public final void a(Intent intent, int i) {
        s52 s52VarC = s52.c();
        String str = G;
        boolean z = false;
        s52VarC.a(str, String.format("Adding command %s (%s)", intent, Integer.valueOf(i)), new Throwable[0]);
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            s52.c().f(str, "Unknown command. Ignoring", new Throwable[0]);
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            b();
            synchronized (this.D) {
                Iterator it = this.D.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                        z = true;
                        break;
                    }
                }
            }
            if (z) {
                return;
            }
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.D) {
            boolean z2 = !this.D.isEmpty();
            this.D.add(intent);
            if (!z2) {
                f();
            }
        }
    }

    public final void b() {
        if (this.C.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    @Override // defpackage.dv0
    public final void c(String str, boolean z) {
        String str2 = androidx.work.impl.background.systemalarm.QnHx.z;
        Intent intent = new Intent(this.w, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        e(new CQf(0, intent, this));
    }

    public final void d() {
        s52.c().a(G, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        oe3 oe3Var = this.z;
        synchronized (oe3Var.G) {
            oe3Var.F.remove(this);
        }
        ScheduledExecutorService scheduledExecutorService = this.y.a;
        if (!scheduledExecutorService.isShutdown()) {
            scheduledExecutorService.shutdownNow();
        }
        this.F = null;
    }

    public final void e(Runnable runnable) {
        this.C.post(runnable);
    }

    public final void f() {
        b();
        PowerManager.WakeLock wakeLockA = il5.a(this.w, "ProcessCommand");
        try {
            wakeLockA.acquire();
            ((on5) this.A.z).a(new QnHx());
        } finally {
            wakeLockA.release();
        }
    }
}
