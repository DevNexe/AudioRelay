package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class yq2<T, R> extends vq2<R> {
    public final boolean A = false;
    public final us2<? extends T>[] w;
    public final Iterable<? extends us2<? extends T>> x;
    public final i91<? super Object[], ? extends R> y;
    public final int z;

    public static final class CQf<T, R> extends AtomicInteger implements vl0 {
        public final jr4<Object[]> A;
        public final boolean B;
        public volatile boolean C;
        public volatile boolean D;
        public final s E = new s();
        public int F;
        public int G;
        public final ht2<? super R> w;
        public final i91<? super Object[], ? extends R> x;
        public final QnHx<T, R>[] y;
        public Object[] z;

        public CQf(int i, int i2, ht2 ht2Var, i91 i91Var, boolean z) {
            this.w = ht2Var;
            this.x = i91Var;
            this.B = z;
            this.z = new Object[i];
            QnHx<T, R>[] qnHxArr = new QnHx[i];
            for (int i3 = 0; i3 < i; i3++) {
                qnHxArr[i3] = new QnHx<>(this, i3);
            }
            this.y = qnHxArr;
            this.A = new jr4<>(i2);
        }

        @Override // defpackage.vl0
        public final void a() {
            if (this.C) {
                return;
            }
            this.C = true;
            b();
            if (getAndIncrement() == 0) {
                c(this.A);
            }
        }

        public final void b() {
            for (QnHx<T, R> qnHx : this.y) {
                qnHx.getClass();
                bm0.c(qnHx);
            }
        }

        public final void c(jr4<?> jr4Var) {
            synchronized (this) {
                this.z = null;
            }
            jr4Var.clear();
        }

        public final void d() {
            if (getAndIncrement() != 0) {
                return;
            }
            jr4<Object[]> jr4Var = this.A;
            ht2<? super R> ht2Var = this.w;
            boolean z = this.B;
            int iAddAndGet = 1;
            while (!this.C) {
                if (!z && this.E.get() != null) {
                    b();
                    c(jr4Var);
                    s sVar = this.E;
                    sVar.getClass();
                    ht2Var.onError(uu0.b(sVar));
                    return;
                }
                boolean z2 = this.D;
                Object[] objArrPoll = jr4Var.poll();
                boolean z3 = objArrPoll == null;
                if (z2 && z3) {
                    c(jr4Var);
                    s sVar2 = this.E;
                    sVar2.getClass();
                    Throwable thB = uu0.b(sVar2);
                    if (thB == null) {
                        ht2Var.b();
                        return;
                    } else {
                        ht2Var.onError(thB);
                        return;
                    }
                }
                if (z3) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    try {
                        R rApply = this.x.apply(objArrPoll);
                        mq2.b(rApply, "The combiner returned a null value");
                        ht2Var.g(rApply);
                    } catch (Throwable th) {
                        XTd3.w(th);
                        s sVar3 = this.E;
                        sVar3.getClass();
                        uu0.a(sVar3, th);
                        b();
                        c(jr4Var);
                        s sVar4 = this.E;
                        sVar4.getClass();
                        ht2Var.onError(uu0.b(sVar4));
                        return;
                    }
                }
            }
            c(jr4Var);
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return this.C;
        }
    }

    public static final class QnHx<T, R> extends AtomicReference<vl0> implements ht2<T> {
        public final CQf<T, R> w;
        public final int x;

        public QnHx(CQf<T, R> cQf, int i) {
            this.w = cQf;
            this.x = i;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001d A[Catch: all -> 0x0029, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x0009, B:8:0x000b, B:13:0x0015, B:16:0x001f, B:15:0x001d), top: B:24:0x0005 }] */
        @Override // defpackage.ht2
        public final void b() {
            CQf<T, R> cQf = this.w;
            int i = this.x;
            synchronized (cQf) {
                Object[] objArr = cQf.z;
                if (objArr == null) {
                    return;
                }
                boolean z = objArr[i] == null;
                if (z) {
                    cQf.D = true;
                } else {
                    int i2 = cQf.G + 1;
                    cQf.G = i2;
                    if (i2 == objArr.length) {
                        cQf.D = true;
                    }
                }
                if (z) {
                    cQf.b();
                }
                cQf.d();
            }
        }

        @Override // defpackage.ht2
        public final void c(vl0 vl0Var) {
            bm0.n(this, vl0Var);
        }

        @Override // defpackage.ht2
        public final void g(T t) {
            boolean z;
            CQf<T, R> cQf = this.w;
            int i = this.x;
            synchronized (cQf) {
                Object[] objArr = cQf.z;
                if (objArr == null) {
                    return;
                }
                Object obj = objArr[i];
                int i2 = cQf.F;
                if (obj == null) {
                    i2++;
                    cQf.F = i2;
                }
                objArr[i] = t;
                if (i2 == objArr.length) {
                    cQf.A.offer((Object[]) objArr.clone());
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    cQf.d();
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:18:0x002c A[Catch: all -> 0x0031, TryCatch #0 {, blocks: (B:7:0x0015, B:9:0x0019, B:11:0x001b, B:16:0x0024, B:19:0x002e, B:18:0x002c), top: B:29:0x0015 }] */
        @Override // defpackage.ht2
        public final void onError(Throwable th) {
            CQf<T, R> cQf = this.w;
            int i = this.x;
            s sVar = cQf.E;
            sVar.getClass();
            if (!uu0.a(sVar, th)) {
                m14.b(th);
                return;
            }
            boolean z = true;
            if (cQf.B) {
                synchronized (cQf) {
                    Object[] objArr = cQf.z;
                    if (objArr == null) {
                        return;
                    }
                    boolean z2 = objArr[i] == null;
                    if (z2) {
                        cQf.D = true;
                    } else {
                        int i2 = cQf.G + 1;
                        cQf.G = i2;
                        if (i2 == objArr.length) {
                            cQf.D = true;
                        }
                    }
                    z = z2;
                }
            }
            if (z) {
                cQf.b();
            }
            cQf.d();
        }
    }

    public yq2(us2[] us2VarArr, ArrayList arrayList, i91 i91Var, int i) {
        this.w = us2VarArr;
        this.x = arrayList;
        this.y = i91Var;
        this.z = i;
    }

    @Override // defpackage.vq2
    public final void z(ht2<? super R> ht2Var) {
        int length;
        us2<? extends T>[] us2VarArr = this.w;
        if (us2VarArr == null) {
            us2VarArr = new us2[8];
            length = 0;
            for (us2<? extends T> us2Var : this.x) {
                if (length == us2VarArr.length) {
                    us2<? extends T>[] us2VarArr2 = new us2[(length >> 2) + length];
                    System.arraycopy(us2VarArr, 0, us2VarArr2, 0, length);
                    us2VarArr = us2VarArr2;
                }
                us2VarArr[length] = us2Var;
                length++;
            }
        } else {
            length = us2VarArr.length;
        }
        if (length == 0) {
            ht2Var.c(yr0.INSTANCE);
            ht2Var.b();
            return;
        }
        CQf cQf = new CQf(length, this.z, ht2Var, this.y, this.A);
        QnHx<T, R>[] qnHxArr = cQf.y;
        int length2 = qnHxArr.length;
        cQf.w.c(cQf);
        for (int i = 0; i < length2 && !cQf.D && !cQf.C; i++) {
            us2VarArr[i].a(qnHxArr[i]);
        }
    }
}
