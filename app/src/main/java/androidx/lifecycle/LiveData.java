package androidx.lifecycle;

import android.os.Looper;
import android.util.Log;
import android.view.View;
import defpackage.d32;
import defpackage.dS;
import defpackage.e24;
import defpackage.fc2;
import defpackage.it2;
import defpackage.nk0;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class LiveData<T> {
    public static final Object k = new Object();
    public final Object a = new Object();
    public final e24<it2<? super T>, LiveData<T>.F1> b = new e24<>();
    public int c = 0;
    public boolean d;
    public volatile Object e;
    public volatile Object f;
    public int g;
    public boolean h;
    public boolean i;
    public final QnHx j;

    public class CQf extends LiveData<T>.F1 {
        public CQf(LiveData liveData, nk0.LPt8Fixed lPt8) {
            super(lPt8);
        }

        @Override // androidx.lifecycle.LiveData.F1
        public final boolean c() {
            return true;
        }
    }

    public abstract class F1 {
        public final it2<? super T> w;
        public boolean x;
        public int y = -1;

        public F1(nk0.LPt8Fixed lPt8) {
            this.w = lPt8;
        }

        public final void a(boolean z) {
            if (z == this.x) {
                return;
            }
            this.x = z;
            int i = z ? 1 : -1;
            LiveData liveData = LiveData.this;
            int i2 = liveData.c;
            liveData.c = i + i2;
            if (!liveData.d) {
                liveData.d = true;
                while (true) {
                    try {
                        int i3 = liveData.c;
                        if (i2 == i3) {
                            break;
                        }
                        boolean z2 = i2 == 0 && i3 > 0;
                        boolean z3 = i2 > 0 && i3 == 0;
                        if (z2) {
                            liveData.e();
                        } else if (z3) {
                            liveData.f();
                        }
                        i2 = i3;
                    } catch (Throwable th) {
                        liveData.d = false;
                        throw th;
                    }
                }
                liveData.d = false;
            }
            if (this.x) {
                liveData.c(this);
            }
        }

        public void b() {
        }

        public abstract boolean c();
    }

    public class LifecycleBoundObserver extends LiveData<T>.F1 implements auxFixed {
        public LifecycleBoundObserver() {
            throw null;
        }

        @Override // androidx.lifecycle.LiveData.F1
        public final void b() {
            throw null;
        }

        @Override // androidx.lifecycle.LiveData.F1
        public final boolean c() {
            throw null;
        }

        @Override // androidx.lifecycle.auxFixed
        public final void h(d32 d32Var, YKK.CQf cQf) {
            throw null;
        }
    }

    public class QnHx implements Runnable {
        public QnHx() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            Object obj;
            synchronized (LiveData.this.a) {
                obj = LiveData.this.f;
                LiveData.this.f = LiveData.k;
            }
            LiveData.this.h(obj);
        }
    }

    public LiveData() {
        Object obj = k;
        this.f = obj;
        this.j = new QnHx();
        this.e = obj;
        this.g = -1;
    }

    public static void a(String str) {
        dS.V0().w.getClass();
        if (!(Looper.getMainLooper().getThread() == Thread.currentThread())) {
            throw new IllegalStateException(fc2.a("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(LiveData<T>.F1 f1) {
        if (f1.x) {
            if (!f1.c()) {
                f1.a(false);
                return;
            }
            int i = f1.y;
            int i2 = this.g;
            if (i >= i2) {
                return;
            }
            f1.y = i2;
            it2<? super T> it2Var = f1.w;
            Object obj = this.e;
            nk0.LPt8Fixed lPt8 = (nk0.LPt8Fixed) it2Var;
            lPt8.getClass();
            if (((d32) obj) != null) {
                nk0 nk0Var = nk0.this;
                if (nk0Var.v0) {
                    View viewJ = nk0Var.J();
                    if (viewJ.getParent() != null) {
                        throw new IllegalStateException("DialogFragment can not be attached to a container view");
                    }
                    if (nk0Var.z0 != null) {
                        if (androidx.fragment.app.RBi.H(3)) {
                            Log.d("FragmentManager", "DialogFragment " + lPt8 + " setting the content view on " + nk0Var.z0);
                        }
                        nk0Var.z0.setContentView(viewJ);
                    }
                }
            }
        }
    }

    public final void c(LiveData<T>.F1 f1) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (f1 != null) {
                b(f1);
                f1 = null;
            } else {
                e24<it2<? super T>, LiveData<T>.F1> e24Var = this.b;
                e24Var.getClass();
                e24.LPt8Fixed lPt8 = new e24.LPt8Fixed();
                e24Var.y.put(lPt8, Boolean.FALSE);
                while (lPt8.hasNext()) {
                    b((F1) ((Map.Entry) lPt8.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.h = false;
    }

    public final void d(nk0.LPt8Fixed lPt8) {
        a("observeForever");
        CQf cQf = new CQf(this, lPt8);
        LiveData<T>.F1 f1B = this.b.b(lPt8, cQf);
        if (f1B instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (f1B != null) {
            return;
        }
        cQf.a(true);
    }

    public void e() {
    }

    public void f() {
    }

    public void g(it2<? super T> it2Var) {
        a("removeObserver");
        LiveData<T>.F1 f1C = this.b.c(it2Var);
        if (f1C == null) {
            return;
        }
        f1C.b();
        f1C.a(false);
    }

    public abstract void h(T t);
}
