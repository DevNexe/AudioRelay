package kotlinx.coroutines;

import defpackage.am0;
import defpackage.lm;
import defpackage.ms1;
import defpackage.ni0;
import defpackage.ps0;
import defpackage.rs1;
import defpackage.sd5;
import defpackage.ur1;
import defpackage.wm;
import defpackage.xm;
import defpackage.z80;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public final class QnHx<T> {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(QnHx.class, "notCompletedCount");
    public final ni0<T>[] a;
    volatile /* synthetic */ int notCompletedCount;

    public final class CQf extends lm {
        public final QnHx<T>.C0156QnHx[] w;

        public CQf(C0156QnHx[] c0156QnHxArr) {
            this.w = c0156QnHxArr;
        }

        @Override // defpackage.mm
        public final void a(Throwable th) {
            b();
        }

        public final void b() {
            for (QnHx<T>.C0156QnHx c0156QnHx : this.w) {
                am0 am0Var = c0156QnHx.B;
                if (am0Var == null) {
                    ur1.e("handle");
                    throw null;
                }
                am0Var.a();
            }
        }

        @Override // defpackage.j81
        public final sd5 invoke(Throwable th) {
            b();
            return sd5.a;
        }

        public final String toString() {
            return "DisposeHandlersOnCancel[" + this.w + ']';
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.QnHx$QnHx, reason: collision with other inner class name */
    public final class C0156QnHx extends rs1 {
        public final wm<List<? extends T>> A;
        public am0 B;
        private volatile /* synthetic */ Object _disposer = null;

        public C0156QnHx(xm xmVar) {
            this.A = xmVar;
        }

        @Override // defpackage.j81
        public final /* bridge */ /* synthetic */ sd5 invoke(Throwable th) {
            s(th);
            return sd5.a;
        }

        @Override // defpackage.ly
        public final void s(Throwable th) {
            if (th != null) {
                if (this.A.O(th) != null) {
                    this.A.u();
                    CQf cQf = (CQf) this._disposer;
                    if (cQf != null) {
                        cQf.b();
                        return;
                    }
                    return;
                }
                return;
            }
            if (QnHx.b.decrementAndGet(QnHx.this) == 0) {
                wm<List<? extends T>> wmVar = this.A;
                ni0<T>[] ni0VarArr = QnHx.this.a;
                ArrayList arrayList = new ArrayList(ni0VarArr.length);
                for (ni0<T> ni0Var : ni0VarArr) {
                    arrayList.add(ni0Var.s());
                }
                wmVar.x(arrayList);
            }
        }

        public final void u(QnHx<T>.CQf cQf) {
            this._disposer = cQf;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public QnHx(ni0<? extends T>[] ni0VarArr) {
        this.a = ni0VarArr;
        this.notCompletedCount = ni0VarArr.length;
    }

    public final Object a(z80<? super List<? extends T>> z80Var) {
        xm xmVar = new xm(1, ps0.L(z80Var));
        xmVar.r();
        ms1[] ms1VarArr = this.a;
        int length = ms1VarArr.length;
        C0156QnHx[] c0156QnHxArr = new C0156QnHx[length];
        for (int i = 0; i < length; i++) {
            ms1 ms1Var = ms1VarArr[i];
            ms1Var.start();
            C0156QnHx c0156QnHx = new C0156QnHx(xmVar);
            c0156QnHx.B = ms1Var.r0(c0156QnHx);
            sd5 sd5Var = sd5.a;
            c0156QnHxArr[i] = c0156QnHx;
        }
        QnHx<T>.CQf cQf = new CQf(c0156QnHxArr);
        for (int i2 = 0; i2 < length; i2++) {
            c0156QnHxArr[i2].u(cQf);
        }
        if (xmVar.t()) {
            cQf.b();
        } else {
            xmVar.B(cQf);
        }
        return xmVar.p();
    }
}
