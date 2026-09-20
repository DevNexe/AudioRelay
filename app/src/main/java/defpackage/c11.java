package defpackage;

import io.reactivex.exceptions.CompositeException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class c11<T> extends a11<T> {
    public final sg3<? extends T>[] x;
    public final boolean y = false;

    public static final class QnHx<T> extends nw4 implements v11<T> {
        public final gw4<? super T> E;
        public final sg3<? extends T>[] F;
        public final boolean G;
        public final AtomicInteger H = new AtomicInteger();
        public int I;
        public ArrayList J;
        public long K;

        public QnHx(sg3<? extends T>[] sg3VarArr, boolean z, gw4<? super T> gw4Var) {
            this.E = gw4Var;
            this.F = sg3VarArr;
            this.G = z;
        }

        @Override // defpackage.gw4
        public final void b() {
            AtomicInteger atomicInteger = this.H;
            if (atomicInteger.getAndIncrement() != 0) {
                return;
            }
            sg3<? extends T>[] sg3VarArr = this.F;
            int length = sg3VarArr.length;
            int i = this.I;
            while (true) {
                gw4<? super T> gw4Var = this.E;
                if (i == length) {
                    ArrayList arrayList = this.J;
                    if (arrayList == null) {
                        gw4Var.b();
                        return;
                    } else if (arrayList.size() == 1) {
                        gw4Var.onError((Throwable) arrayList.get(0));
                        return;
                    } else {
                        gw4Var.onError(new CompositeException(arrayList));
                        return;
                    }
                }
                sg3<? extends T> sg3Var = sg3VarArr[i];
                if (sg3Var == null) {
                    NullPointerException nullPointerException = new NullPointerException("A Publisher entry is null");
                    if (!this.G) {
                        gw4Var.onError(nullPointerException);
                        return;
                    }
                    ArrayList arrayList2 = this.J;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList((length - i) + 1);
                        this.J = arrayList2;
                    }
                    arrayList2.add(nullPointerException);
                    i++;
                } else {
                    long j = this.K;
                    if (j != 0) {
                        this.K = 0L;
                        f(j);
                    }
                    sg3Var.a(this);
                    i++;
                    this.I = i;
                    if (atomicInteger.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // defpackage.v11, defpackage.gw4
        public final void d(mw4 mw4Var) {
            h(mw4Var);
        }

        @Override // defpackage.gw4
        public final void g(T t) {
            this.K++;
            this.E.g(t);
        }

        @Override // defpackage.gw4
        public final void onError(Throwable th) {
            if (!this.G) {
                this.E.onError(th);
                return;
            }
            ArrayList arrayList = this.J;
            if (arrayList == null) {
                arrayList = new ArrayList((this.F.length - this.I) + 1);
                this.J = arrayList;
            }
            arrayList.add(th);
            b();
        }
    }

    public c11(sg3[] sg3VarArr) {
        this.x = sg3VarArr;
    }

    @Override // defpackage.a11
    public final void f(gw4<? super T> gw4Var) {
        QnHx qnHx = new QnHx(this.x, this.y, gw4Var);
        gw4Var.d(qnHx);
        qnHx.b();
    }
}
