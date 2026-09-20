package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qd5 {
    public final int a;
    public QnHx b;
    public QnHx c;
    public int d;
    public Long e;
    public boolean f;

    public static final class QnHx {
        public QnHx a;
        public x45 b;

        public QnHx(QnHx qnHx, x45 x45Var) {
            this.a = qnHx;
            this.b = x45Var;
        }
    }

    public qd5() {
        this(0);
    }

    public qd5(int i) {
        this.a = 100000;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0061  */
    public final void a(x45 x45Var) {
        QnHx qnHx;
        x45 x45Var2;
        this.f = false;
        QnHx qnHx2 = this.b;
        if (ur1.a(x45Var, qnHx2 != null ? qnHx2.b : null)) {
            return;
        }
        Z7jl z7jl = x45Var.a;
        String str = z7jl.w;
        QnHx qnHx3 = this.b;
        if (ur1.a(str, (qnHx3 == null || (x45Var2 = qnHx3.b) == null) ? null : x45Var2.a.w)) {
            QnHx qnHx4 = this.b;
            if (qnHx4 == null) {
                return;
            }
            qnHx4.b = x45Var;
            return;
        }
        this.b = new QnHx(this.b, x45Var);
        this.c = null;
        int length = z7jl.w.length() + this.d;
        this.d = length;
        if (length > this.a) {
            QnHx qnHx5 = this.b;
            if ((qnHx5 != null ? qnHx5.a : null) == null) {
                return;
            }
            while (true) {
                if (qnHx5 == null) {
                    qnHx = null;
                } else {
                    QnHx qnHx6 = qnHx5.a;
                    if (qnHx6 != null) {
                        qnHx = qnHx6.a;
                    } else {
                        qnHx = null;
                    }
                }
                if (qnHx == null) {
                    break;
                } else {
                    qnHx5 = qnHx5.a;
                }
            }
            if (qnHx5 == null) {
                return;
            }
            qnHx5.a = null;
        }
    }
}
