package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import defpackage.d32;

/* JADX INFO: loaded from: classes.dex */
public final class EQ implements d32 {
    public static final EQ E = new EQ();
    public Handler A;
    public int w = 0;
    public int x = 0;
    public boolean y = true;
    public boolean z = true;
    public final T23 B = new T23(this);
    public final QnHx C = new QnHx();
    public final CQf D = new CQf();

    public class CQf implements PRnFixed.QnHx {
        public CQf() {
        }
    }

    public static class F1 {
        public static void a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }

    public class QnHx implements Runnable {
        public QnHx() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            EQ eq = EQ.this;
            int i = eq.x;
            T23 t23 = eq.B;
            if (i == 0) {
                eq.y = true;
                t23.f(YKK.CQf.ON_PAUSE);
            }
            if (eq.w == 0 && eq.y) {
                t23.f(YKK.CQf.ON_STOP);
                eq.z = true;
            }
        }
    }

    public final void a() {
        int i = this.x + 1;
        this.x = i;
        if (i == 1) {
            if (!this.y) {
                this.A.removeCallbacks(this.C);
            } else {
                this.B.f(YKK.CQf.ON_RESUME);
                this.y = false;
            }
        }
    }

    @Override // defpackage.d32
    public final YKK c() {
        return this.B;
    }
}
