package defpackage;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class f9 {
    public final ArrayList<e70> a = new ArrayList<>();
    public final QnHx b = new QnHx();
    public final f70 c;

    public interface CQf {
    }

    public static class QnHx {
        public int a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public boolean h;
        public boolean i;
        public boolean j;
    }

    public f9(f70 f70Var) {
        this.c = f70Var;
    }

    public final boolean a(CQf cQf, e70 e70Var, boolean z) {
        int[] iArr = e70Var.J;
        int i = iArr[0];
        QnHx qnHx = this.b;
        qnHx.a = i;
        qnHx.b = iArr[1];
        qnHx.c = e70Var.j();
        qnHx.d = e70Var.g();
        qnHx.i = false;
        qnHx.j = z;
        boolean z2 = qnHx.a == 3;
        boolean z3 = qnHx.b == 3;
        boolean z4 = z2 && e70Var.N > 0.0f;
        boolean z5 = z3 && e70Var.N > 0.0f;
        int[] iArr2 = e70Var.l;
        if (z4 && iArr2[0] == 4) {
            qnHx.a = 1;
        }
        if (z5 && iArr2[1] == 4) {
            qnHx.b = 1;
        }
        ((ConstraintLayout.CQf) cQf).a(e70Var, qnHx);
        e70Var.v(qnHx.e);
        e70Var.s(qnHx.f);
        e70Var.w = qnHx.h;
        int i2 = qnHx.g;
        e70Var.R = i2;
        e70Var.w = i2 > 0;
        qnHx.j = false;
        return qnHx.i;
    }

    public final void b(f70 f70Var, int i, int i2) {
        int i3 = f70Var.S;
        int i4 = f70Var.T;
        f70Var.S = 0;
        f70Var.T = 0;
        f70Var.v(i);
        f70Var.s(i2);
        if (i3 < 0) {
            f70Var.S = 0;
        } else {
            f70Var.S = i3;
        }
        if (i4 < 0) {
            f70Var.T = 0;
        } else {
            f70Var.T = i4;
        }
        this.c.y();
    }
}
