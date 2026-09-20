package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import defpackage.bi5;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class CQf {
    public final InterfaceC0028CQf a;
    public final QnHx b = new QnHx();
    public final ArrayList c = new ArrayList();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.CQf$CQf, reason: collision with other inner class name */
    public interface InterfaceC0028CQf {
    }

    public static class QnHx {
        public long a = 0;
        public QnHx b;

        public final void a(int i) {
            if (i < 64) {
                this.a &= ~(1 << i);
                return;
            }
            QnHx qnHx = this.b;
            if (qnHx != null) {
                qnHx.a(i - 64);
            }
        }

        public final int b(int i) {
            QnHx qnHx = this.b;
            if (qnHx == null) {
                return i >= 64 ? Long.bitCount(this.a) : Long.bitCount(this.a & ((1 << i) - 1));
            }
            if (i < 64) {
                return Long.bitCount(this.a & ((1 << i) - 1));
            }
            return Long.bitCount(this.a) + qnHx.b(i - 64);
        }

        public final void c() {
            if (this.b == null) {
                this.b = new QnHx();
            }
        }

        public final boolean d(int i) {
            if (i < 64) {
                return (this.a & (1 << i)) != 0;
            }
            c();
            return this.b.d(i - 64);
        }

        public final void e(int i, boolean z) {
            if (i >= 64) {
                c();
                this.b.e(i - 64, z);
                return;
            }
            long j = this.a;
            boolean z2 = (Long.MIN_VALUE & j) != 0;
            long j2 = (1 << i) - 1;
            this.a = ((j & (~j2)) << 1) | (j & j2);
            if (z) {
                h(i);
            } else {
                a(i);
            }
            if (z2 || this.b != null) {
                c();
                this.b.e(0, z2);
            }
        }

        public final boolean f(int i) {
            if (i >= 64) {
                c();
                return this.b.f(i - 64);
            }
            long j = 1 << i;
            long j2 = this.a;
            boolean z = (j2 & j) != 0;
            long j3 = j2 & (~j);
            this.a = j3;
            long j4 = j - 1;
            this.a = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
            QnHx qnHx = this.b;
            if (qnHx != null) {
                if (qnHx.d(0)) {
                    h(63);
                }
                this.b.f(0);
            }
            return z;
        }

        public final void g() {
            this.a = 0L;
            QnHx qnHx = this.b;
            if (qnHx != null) {
                qnHx.g();
            }
        }

        public final void h(int i) {
            if (i < 64) {
                this.a |= 1 << i;
            } else {
                c();
                this.b.h(i - 64);
            }
        }

        public final String toString() {
            if (this.b == null) {
                return Long.toBinaryString(this.a);
            }
            return this.b.toString() + "xx" + Long.toBinaryString(this.a);
        }
    }

    public CQf(SjP sjP) {
        this.a = sjP;
    }

    public final void a(View view, int i, boolean z) {
        InterfaceC0028CQf interfaceC0028CQf = this.a;
        int iA = i < 0 ? ((SjP) interfaceC0028CQf).a() : f(i);
        this.b.e(iA, z);
        if (z) {
            i(view);
        }
        ((SjP) interfaceC0028CQf).a.addView(view, iA);
        RecyclerView.H(view);
    }

    public final void b(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        InterfaceC0028CQf interfaceC0028CQf = this.a;
        int iA = i < 0 ? ((SjP) interfaceC0028CQf).a() : f(i);
        this.b.e(iA, z);
        if (z) {
            i(view);
        }
        SjP sjP = (SjP) interfaceC0028CQf;
        sjP.getClass();
        RecyclerView.qc qcVarH = RecyclerView.H(view);
        RecyclerView recyclerView = sjP.a;
        if (qcVarH != null) {
            if (!qcVarH.k() && !qcVarH.o()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + qcVarH + recyclerView.x());
            }
            qcVarH.j &= -257;
        }
        recyclerView.attachViewToParent(view, iA, layoutParams);
    }

    public final void c(int i) {
        RecyclerView.qc qcVarH;
        int iF = f(i);
        this.b.f(iF);
        SjP sjP = (SjP) this.a;
        View childAt = sjP.a.getChildAt(iF);
        RecyclerView recyclerView = sjP.a;
        if (childAt != null && (qcVarH = RecyclerView.H(childAt)) != null) {
            if (qcVarH.k() && !qcVarH.o()) {
                throw new IllegalArgumentException("called detach on an already detached child " + qcVarH + recyclerView.x());
            }
            qcVarH.b(256);
        }
        recyclerView.detachViewFromParent(iF);
    }

    public final View d(int i) {
        return ((SjP) this.a).a.getChildAt(f(i));
    }

    public final int e() {
        return ((SjP) this.a).a() - this.c.size();
    }

    public final int f(int i) {
        if (i < 0) {
            return -1;
        }
        int iA = ((SjP) this.a).a();
        int i2 = i;
        while (i2 < iA) {
            QnHx qnHx = this.b;
            int iB = i - (i2 - qnHx.b(i2));
            if (iB == 0) {
                while (qnHx.d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += iB;
        }
        return -1;
    }

    public final View g(int i) {
        return ((SjP) this.a).a.getChildAt(i);
    }

    public final int h() {
        return ((SjP) this.a).a();
    }

    public final void i(View view) {
        this.c.add(view);
        SjP sjP = (SjP) this.a;
        sjP.getClass();
        RecyclerView.qc qcVarH = RecyclerView.H(view);
        if (qcVarH != null) {
            int i = qcVarH.q;
            View view2 = qcVarH.a;
            if (i != -1) {
                qcVarH.p = i;
            } else {
                Field field = bi5.a;
                qcVarH.p = bi5.LPt8Fixed.c(view2);
            }
            RecyclerView recyclerView = sjP.a;
            if (recyclerView.J()) {
                qcVarH.q = 4;
                recyclerView.L0.add(qcVarH);
            } else {
                Field field2 = bi5.a;
                bi5.LPt8Fixed.s(view2, 4);
            }
        }
    }

    public final boolean j(View view) {
        return this.c.contains(view);
    }

    public final void k(View view) {
        if (this.c.remove(view)) {
            SjP sjP = (SjP) this.a;
            sjP.getClass();
            RecyclerView.qc qcVarH = RecyclerView.H(view);
            if (qcVarH != null) {
                int i = qcVarH.p;
                RecyclerView recyclerView = sjP.a;
                if (recyclerView.J()) {
                    qcVarH.q = i;
                    recyclerView.L0.add(qcVarH);
                } else {
                    Field field = bi5.a;
                    bi5.LPt8Fixed.s(qcVarH.a, i);
                }
                qcVarH.p = 0;
            }
        }
    }

    public final String toString() {
        return this.b.toString() + ", hidden list:" + this.c.size();
    }
}
