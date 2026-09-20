package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.os.Looper;
import defpackage.c32;
import defpackage.d32;
import defpackage.dS;
import defpackage.e24;
import defpackage.fc2;
import defpackage.g32;
import defpackage.sw0;
import defpackage.w61;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class T23 extends YKK {
    public final WeakReference<d32> d;
    public sw0<c32, QnHx> b = new sw0<>();
    public int e = 0;
    public boolean f = false;
    public boolean g = false;
    public final ArrayList<YKK.F1> h = new ArrayList<>();
    public YKK.F1 c = YKK.F1.INITIALIZED;
    public final boolean i = true;

    public static class QnHx {
        public YKK.F1 a;
        public final auxFixed b;

        public QnHx(c32 c32Var, YKK.F1 f1) {
            auxFixed reflectiveGenericLifecycleObserver;
            HashMap map = g32.a;
            boolean z = c32Var instanceof auxFixed;
            boolean z2 = c32Var instanceof w61;
            if (z && z2) {
                reflectiveGenericLifecycleObserver = new FullLifecycleObserverAdapter((w61) c32Var, (auxFixed) c32Var);
            } else if (z2) {
                reflectiveGenericLifecycleObserver = new FullLifecycleObserverAdapter((w61) c32Var, null);
            } else if (z) {
                reflectiveGenericLifecycleObserver = (auxFixed) c32Var;
            } else {
                Class<?> cls = c32Var.getClass();
                if (g32.c(cls) == 2) {
                    List list = (List) g32.b.get(cls);
                    if (list.size() == 1) {
                        reflectiveGenericLifecycleObserver = new SingleGeneratedAdapterObserver(g32.a((Constructor) list.get(0), c32Var));
                    } else {
                        F1[] f1Arr = new F1[list.size()];
                        for (int i = 0; i < list.size(); i++) {
                            f1Arr[i] = g32.a((Constructor) list.get(i), c32Var);
                        }
                        reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(f1Arr);
                    }
                } else {
                    reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(c32Var);
                }
            }
            this.b = reflectiveGenericLifecycleObserver;
            this.a = f1;
        }

        public final void a(d32 d32Var, YKK.CQf cQf) {
            YKK.F1 f1A = cQf.a();
            YKK.F1 f1 = this.a;
            if (f1A.compareTo(f1) < 0) {
                f1 = f1A;
            }
            this.a = f1;
            this.b.h(d32Var, cQf);
            this.a = f1A;
        }
    }

    public T23(d32 d32Var) {
        this.d = new WeakReference<>(d32Var);
    }

    @Override // androidx.lifecycle.YKK
    public final void a(c32 c32Var) {
        d32 d32Var;
        YKK.CQf cQf;
        e("addObserver");
        YKK.F1 f1 = this.c;
        YKK.F1 f2 = YKK.F1.DESTROYED;
        if (f1 != f2) {
            f2 = YKK.F1.INITIALIZED;
        }
        QnHx qnHx = new QnHx(c32Var, f2);
        if (this.b.b(c32Var, qnHx) == null && (d32Var = this.d.get()) != null) {
            boolean z = this.e != 0 || this.f;
            YKK.F1 f1D = d(c32Var);
            this.e++;
            while (qnHx.a.compareTo(f1D) < 0 && this.b.A.containsKey(c32Var)) {
                YKK.F1 f3 = qnHx.a;
                ArrayList<YKK.F1> arrayList = this.h;
                arrayList.add(f3);
                int iOrdinal = qnHx.a.ordinal();
                if (iOrdinal == 1) {
                    cQf = YKK.CQf.ON_CREATE;
                } else if (iOrdinal != 2) {
                    cQf = iOrdinal != 3 ? null : YKK.CQf.ON_RESUME;
                } else {
                    cQf = YKK.CQf.ON_START;
                }
                if (cQf == null) {
                    throw new IllegalStateException("no event up from " + qnHx.a);
                }
                qnHx.a(d32Var, cQf);
                arrayList.remove(arrayList.size() - 1);
                f1D = d(c32Var);
            }
            if (!z) {
                i();
            }
            this.e--;
        }
    }

    @Override // androidx.lifecycle.YKK
    public final YKK.F1 b() {
        return this.c;
    }

    @Override // androidx.lifecycle.YKK
    public final void c(c32 c32Var) {
        e("removeObserver");
        this.b.c(c32Var);
    }

    public final YKK.F1 d(c32 c32Var) {
        sw0<c32, QnHx> sw0Var = this.b;
        e24.F1<c32, QnHx> f1 = sw0Var.A.containsKey(c32Var) ? sw0Var.A.get(c32Var).z : null;
        YKK.F1 f2 = f1 != null ? f1.x.a : null;
        ArrayList<YKK.F1> arrayList = this.h;
        YKK.F1 f3 = arrayList.isEmpty() ? null : arrayList.get(arrayList.size() - 1);
        YKK.F1 f4 = this.c;
        if (f2 == null || f2.compareTo(f4) >= 0) {
            f2 = f4;
        }
        return (f3 == null || f3.compareTo(f2) >= 0) ? f2 : f3;
    }

    @SuppressLint({"RestrictedApi"})
    public final void e(String str) {
        if (this.i) {
            dS.V0().w.getClass();
            if (!(Looper.getMainLooper().getThread() == Thread.currentThread())) {
                throw new IllegalStateException(fc2.a("Method ", str, " must be called on the main thread"));
            }
        }
    }

    public final void f(YKK.CQf cQf) {
        e("handleLifecycleEvent");
        g(cQf.a());
    }

    public final void g(YKK.F1 f1) {
        YKK.F1 f2 = this.c;
        if (f2 == f1) {
            return;
        }
        YKK.F1 f3 = YKK.F1.INITIALIZED;
        YKK.F1 f4 = YKK.F1.DESTROYED;
        if (f2 == f3 && f1 == f4) {
            throw new IllegalStateException("no event down from " + this.c);
        }
        this.c = f1;
        if (this.f || this.e != 0) {
            this.g = true;
            return;
        }
        this.f = true;
        i();
        this.f = false;
        if (this.c == f4) {
            this.b = new sw0<>();
        }
    }

    public final void h(YKK.F1 f1) {
        e("setCurrentState");
        g(f1);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029  */
    public final void i() {
        boolean z;
        YKK.CQf cQf;
        YKK.CQf cQf2;
        d32 d32Var = this.d.get();
        if (d32Var == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            sw0<c32, QnHx> sw0Var = this.b;
            if (sw0Var.z == 0) {
                z = true;
            } else {
                YKK.F1 f1 = sw0Var.w.x.a;
                YKK.F1 f2 = sw0Var.x.x.a;
                if (f1 == f2 && this.c == f2) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (!z) {
                this.g = false;
                int iCompareTo = this.c.compareTo(sw0Var.w.x.a);
                ArrayList<YKK.F1> arrayList = this.h;
                if (iCompareTo < 0) {
                    sw0<c32, QnHx> sw0Var2 = this.b;
                    e24.CQf cQf3 = new e24.CQf(sw0Var2.x, sw0Var2.w);
                    sw0Var2.y.put(cQf3, Boolean.FALSE);
                    while (cQf3.hasNext() && !this.g) {
                        Map.Entry entry = (Map.Entry) cQf3.next();
                        QnHx qnHx = (QnHx) entry.getValue();
                        while (qnHx.a.compareTo(this.c) > 0 && !this.g) {
                            if (!this.b.A.containsKey((c32) entry.getKey())) {
                                break;
                            }
                            int iOrdinal = qnHx.a.ordinal();
                            if (iOrdinal == 2) {
                                cQf2 = YKK.CQf.ON_DESTROY;
                            } else if (iOrdinal != 3) {
                                cQf2 = iOrdinal != 4 ? null : YKK.CQf.ON_PAUSE;
                            } else {
                                cQf2 = YKK.CQf.ON_STOP;
                            }
                            if (cQf2 == null) {
                                throw new IllegalStateException("no event down from " + qnHx.a);
                            }
                            arrayList.add(cQf2.a());
                            qnHx.a(d32Var, cQf2);
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
                e24.F1<c32, QnHx> f3 = this.b.x;
                if (!this.g && f3 != null && this.c.compareTo(f3.x.a) > 0) {
                    sw0<c32, QnHx> sw0Var3 = this.b;
                    sw0Var3.getClass();
                    e24.LPt8Fixed lPt8 = new e24.LPt8Fixed();
                    sw0Var3.y.put(lPt8, Boolean.FALSE);
                    while (lPt8.hasNext() && !this.g) {
                        Map.Entry entry2 = (Map.Entry) lPt8.next();
                        QnHx qnHx2 = (QnHx) entry2.getValue();
                        while (qnHx2.a.compareTo(this.c) < 0 && !this.g) {
                            if (!this.b.A.containsKey((c32) entry2.getKey())) {
                                break;
                            }
                            arrayList.add(qnHx2.a);
                            int iOrdinal2 = qnHx2.a.ordinal();
                            if (iOrdinal2 == 1) {
                                cQf = YKK.CQf.ON_CREATE;
                            } else if (iOrdinal2 != 2) {
                                cQf = iOrdinal2 != 3 ? null : YKK.CQf.ON_RESUME;
                            } else {
                                cQf = YKK.CQf.ON_START;
                            }
                            if (cQf == null) {
                                throw new IllegalStateException("no event up from " + qnHx2.a);
                            }
                            qnHx2.a(d32Var, cQf);
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
            } else {
                this.g = false;
                return;
            }
        }
    }
}
