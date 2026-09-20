package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public final class vb0 {
    public final Context a;
    public final oe0 b;
    public final ss3 c;
    public final long d;
    public ss3 e;
    public ss3 f;
    public boolean g;
    public rb0 h;
    public final th1 i;
    public final fx0 j;
    public final ze k;
    public final b2J l;
    public final ExecutorService m;
    public final db0 n;
    public final yb0 o;

    public class QnHx implements Callable<Boolean> {
        public QnHx() {
        }

        @Override // java.util.concurrent.Callable
        public final Boolean call() {
            try {
                ss3 ss3Var = vb0.this.e;
                fx0 fx0Var = (fx0) ss3Var.y;
                String str = (String) ss3Var.x;
                fx0Var.getClass();
                boolean zDelete = new File(fx0Var.b, str).delete();
                if (!zDelete) {
                    Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
                }
                return Boolean.valueOf(zDelete);
            } catch (Exception e) {
                Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e);
                return Boolean.FALSE;
            }
        }
    }

    public vb0(qx0 qx0Var, th1 th1Var, ac0 ac0Var, oe0 oe0Var, sn1 sn1Var, im3 im3Var, fx0 fx0Var, ExecutorService executorService) {
        this.b = oe0Var;
        qx0Var.a();
        this.a = qx0Var.a;
        this.i = th1Var;
        this.o = ac0Var;
        this.k = sn1Var;
        this.l = im3Var;
        this.m = executorService;
        this.j = fx0Var;
        this.n = new db0(executorService);
        this.d = System.currentTimeMillis();
        this.c = new ss3(21);
    }

    public static w05 a(final vb0 vb0Var, rh4 rh4Var) {
        w05 w05VarD;
        if (!Boolean.TRUE.equals(vb0Var.n.d.get())) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
        vb0Var.e.e();
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
        }
        try {
            try {
                vb0Var.k.b(new xe() { // from class: sb0
                    @Override // defpackage.xe
                    public final void a(String str) {
                        vb0 vb0Var2 = this.a;
                        vb0Var2.getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis() - vb0Var2.d;
                        rb0 rb0Var = vb0Var2.h;
                        rb0Var.getClass();
                        rb0Var.e.a(new nb0(rb0Var, jCurrentTimeMillis, str));
                    }
                });
                xg4 xg4Var = (xg4) rh4Var;
                if (xg4Var.h.get().b.a) {
                    if (!vb0Var.h.e(xg4Var)) {
                        Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                    }
                    w05VarD = vb0Var.h.g(xg4Var.i.get().a);
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                    }
                    w05VarD = k15.d(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
                }
            } catch (Exception e) {
                Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e);
                w05VarD = k15.d(e);
            }
            return w05VarD;
        } finally {
            vb0Var.c();
        }
    }

    public final void b(xg4 xg4Var) {
        Future<?> futureSubmit = this.m.submit(new ub0(this, xg4Var));
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.", null);
        }
        try {
            futureSubmit.get(4L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.e("FirebaseCrashlytics", "Crashlytics was interrupted during initialization.", e);
        } catch (ExecutionException e2) {
            Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during initialization.", e2);
        } catch (TimeoutException e3) {
            Log.e("FirebaseCrashlytics", "Crashlytics timed out during initialization.", e3);
        }
    }

    public final void c() {
        this.n.a(new QnHx());
    }

    public final void d(Boolean bool) {
        Boolean boolA;
        oe0 oe0Var = this.b;
        synchronized (oe0Var) {
            if (bool != null) {
                try {
                    oe0Var.f = false;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (bool != null) {
                boolA = bool;
            } else {
                qx0 qx0Var = oe0Var.b;
                qx0Var.a();
                boolA = oe0Var.a(qx0Var.a);
            }
            oe0Var.g = boolA;
            SharedPreferences.Editor editorEdit = oe0Var.a.edit();
            if (bool != null) {
                editorEdit.putBoolean("firebase_crashlytics_collection_enabled", bool.booleanValue());
            } else {
                editorEdit.remove("firebase_crashlytics_collection_enabled");
            }
            editorEdit.apply();
            synchronized (oe0Var.c) {
                if (oe0Var.b()) {
                    if (!oe0Var.e) {
                        oe0Var.d.c(null);
                        oe0Var.e = true;
                    }
                } else if (oe0Var.e) {
                    oe0Var.d = new z05<>();
                    oe0Var.e = false;
                }
            }
        }
    }

    public final void e(String str, String str2) {
        rb0 rb0Var = this.h;
        rb0Var.getClass();
        try {
            rb0Var.d.a(str, str2);
        } catch (IllegalArgumentException e) {
            Context context = rb0Var.a;
            if (context != null) {
                if ((context.getApplicationInfo().flags & 2) != 0) {
                    throw e;
                }
            }
            Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
        }
    }
}
