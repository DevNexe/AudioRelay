package androidx.recyclerview.widget;

import defpackage.ok4;
import defpackage.q62;
import defpackage.tp1;

/* JADX INFO: loaded from: classes.dex */
public final class o_K {
    public final ok4<RecyclerView.qc, QnHx> a = new ok4<>();
    public final q62<RecyclerView.qc> b = new q62<>();

    public static class QnHx {
        public static final tp1 d = new tp1(20, 2);
        public int a;
        public RecyclerView.byN.F1 b;
        public RecyclerView.byN.F1 c;

        public static QnHx a() {
            QnHx qnHx = (QnHx) d.a();
            return qnHx == null ? new QnHx() : qnHx;
        }
    }

    public final void a(RecyclerView.qc qcVar, RecyclerView.byN.F1 f1) {
        ok4<RecyclerView.qc, QnHx> ok4Var = this.a;
        QnHx orDefault = ok4Var.getOrDefault(qcVar, null);
        if (orDefault == null) {
            orDefault = QnHx.a();
            ok4Var.put(qcVar, orDefault);
        }
        orDefault.c = f1;
        orDefault.a |= 8;
    }

    public final RecyclerView.byN.F1 b(RecyclerView.qc qcVar, int i) {
        QnHx qnHxK;
        RecyclerView.byN.F1 f1;
        ok4<RecyclerView.qc, QnHx> ok4Var = this.a;
        int iF = ok4Var.f(qcVar);
        if (iF >= 0 && (qnHxK = ok4Var.k(iF)) != null) {
            int i2 = qnHxK.a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                qnHxK.a = i3;
                if (i == 4) {
                    f1 = qnHxK.b;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    f1 = qnHxK.c;
                }
                if ((i3 & 12) == 0) {
                    ok4Var.j(iF);
                    qnHxK.a = 0;
                    qnHxK.b = null;
                    qnHxK.c = null;
                    QnHx.d.f(qnHxK);
                }
                return f1;
            }
        }
        return null;
    }

    public final void c(RecyclerView.qc qcVar) {
        QnHx orDefault = this.a.getOrDefault(qcVar, null);
        if (orDefault == null) {
            return;
        }
        orDefault.a &= -2;
    }

    public final void d(RecyclerView.qc qcVar) {
        q62<RecyclerView.qc> q62Var = this.b;
        if (q62Var.w) {
            q62Var.h();
        }
        for (int i = q62Var.z - 1; i >= 0; i--) {
            if (qcVar == q62Var.k(i)) {
                Object[] objArr = q62Var.y;
                Object obj = objArr[i];
                Object obj2 = q62.A;
                if (obj == obj2) {
                    break;
                }
                objArr[i] = obj2;
                q62Var.w = true;
                break;
            }
        }
        QnHx qnHxRemove = this.a.remove(qcVar);
        if (qnHxRemove != null) {
            qnHxRemove.a = 0;
            qnHxRemove.b = null;
            qnHxRemove.c = null;
            QnHx.d.f(qnHxRemove);
        }
    }
}
