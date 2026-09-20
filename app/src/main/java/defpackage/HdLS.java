package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.widget.EdgeEffect;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class HdLS implements tw2 {
    public final rw2 a;
    public final EdgeEffect b;
    public final EdgeEffect c;
    public final EdgeEffect d;
    public final EdgeEffect e;
    public final List<EdgeEffect> f;
    public final EdgeEffect g;
    public final EdgeEffect h;
    public final EdgeEffect i;
    public final EdgeEffect j;
    public final kz2 k;
    public final boolean l;
    public boolean m;
    public long n;
    public final kz2 o;
    public boolean p;
    public final pg2 q;

    public static final class QnHx extends cx1 implements j81<sp1, sd5> {
        public QnHx() {
            super(1);
        }

        @Override // defpackage.j81
        public final sd5 invoke(sp1 sp1Var) {
            long j = sp1Var.a;
            long J = C0239D.J(j);
            HdLS hdLS = HdLS.this;
            boolean z = !cm4.b(J, hdLS.n);
            hdLS.n = C0239D.J(j);
            if (z) {
                int i = (int) (j >> 32);
                hdLS.b.setSize(i, sp1.b(j));
                hdLS.c.setSize(i, sp1.b(j));
                hdLS.d.setSize(sp1.b(j), i);
                hdLS.e.setSize(sp1.b(j), i);
                hdLS.g.setSize(i, sp1.b(j));
                hdLS.h.setSize(i, sp1.b(j));
                hdLS.i.setSize(sp1.b(j), i);
                hdLS.j.setSize(sp1.b(j), i);
            }
            if (z) {
                hdLS.k();
                hdLS.g();
            }
            return sd5.a;
        }
    }

    public HdLS(Context context, rw2 rw2Var) {
        this.a = rw2Var;
        EdgeEffect edgeEffectB = ym.b(context);
        this.b = edgeEffectB;
        EdgeEffect edgeEffectB2 = ym.b(context);
        this.c = edgeEffectB2;
        EdgeEffect edgeEffectB3 = ym.b(context);
        this.d = edgeEffectB3;
        EdgeEffect edgeEffectB4 = ym.b(context);
        this.e = edgeEffectB4;
        List<EdgeEffect> listM = ps0.M(edgeEffectB3, edgeEffectB, edgeEffectB4, edgeEffectB2);
        this.f = listM;
        this.g = ym.b(context);
        this.h = ym.b(context);
        this.i = ym.b(context);
        this.j = ym.b(context);
        int size = listM.size();
        for (int i = 0; i < size; i++) {
            listM.get(i).setColor(hH.A(this.a.a));
        }
        this.k = ps0.Q(sd5.a, eo2.a);
        this.l = true;
        this.n = cm4.b;
        this.o = ps0.R(Boolean.FALSE);
        QnHx qnHx = new QnHx();
        pg2 pg2Var = JHf.b;
        wo1.QnHx qnHx2 = wo1.a;
        this.q = pg2Var.y(new xu2(qnHx)).y(new oo0(this));
    }

    /* JADX WARN: Code duplicated, block: B:90:0x00ef  */
    @Override // defpackage.tw2
    public final long a(long j, kt2 kt2Var) {
        float fO;
        float fN;
        boolean z = this.m;
        JGd jGd = JGd.a;
        EdgeEffect edgeEffect = this.c;
        EdgeEffect edgeEffect2 = this.b;
        EdgeEffect edgeEffect3 = this.e;
        EdgeEffect edgeEffect4 = this.d;
        float f = 0.0f;
        if (!z) {
            long jH = ps0.H(this.n);
            int i = Build.VERSION.SDK_INT;
            if (!((i >= 31 ? jGd.b(edgeEffect4) : 0.0f) == 0.0f)) {
                m(kt2.b, jH);
            }
            if (!((i >= 31 ? jGd.b(edgeEffect3) : 0.0f) == 0.0f)) {
                n(kt2.b, jH);
            }
            if (!((i >= 31 ? jGd.b(edgeEffect2) : 0.0f) == 0.0f)) {
                o(kt2.b, jH);
            }
            if (!((i >= 31 ? jGd.b(edgeEffect) : 0.0f) == 0.0f)) {
                l(kt2.b, jH);
            }
            this.m = true;
        }
        long jH2 = kt2Var != null ? kt2Var.a : ps0.H(this.n);
        if (kt2.d(j) == 0.0f) {
            fO = 0.0f;
        } else {
            int i2 = Build.VERSION.SDK_INT;
            if ((i2 >= 31 ? jGd.b(edgeEffect2) : 0.0f) == 0.0f) {
                if ((i2 >= 31 ? jGd.b(edgeEffect) : 0.0f) == 0.0f) {
                    fO = 0.0f;
                } else {
                    float fL = l(j, jH2);
                    if ((i2 >= 31 ? jGd.b(edgeEffect) : 0.0f) == 0.0f) {
                        edgeEffect.onRelease();
                    }
                    fO = fL;
                }
            } else {
                fO = o(j, jH2);
                if ((i2 >= 31 ? jGd.b(edgeEffect2) : 0.0f) == 0.0f) {
                    edgeEffect2.onRelease();
                }
            }
        }
        if (!(kt2.c(j) == 0.0f)) {
            int i3 = Build.VERSION.SDK_INT;
            if ((i3 >= 31 ? jGd.b(edgeEffect4) : 0.0f) == 0.0f) {
                if (!((i3 >= 31 ? jGd.b(edgeEffect3) : 0.0f) == 0.0f)) {
                    fN = n(j, jH2);
                    if ((i3 >= 31 ? jGd.b(edgeEffect3) : 0.0f) == 0.0f) {
                        edgeEffect3.onRelease();
                    }
                }
            } else {
                fN = m(j, jH2);
                if ((i3 >= 31 ? jGd.b(edgeEffect4) : 0.0f) == 0.0f) {
                    edgeEffect4.onRelease();
                }
            }
            f = fN;
        }
        long jA = X.a(f, fO);
        if (!kt2.a(jA, kt2.b)) {
            k();
        }
        return jA;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0040  */
    /* JADX WARN: Code duplicated, block: B:22:0x0048  */
    /* JADX WARN: Code duplicated, block: B:24:0x004e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0053  */
    /* JADX WARN: Code duplicated, block: B:28:0x0058  */
    /* JADX WARN: Code duplicated, block: B:29:0x005a  */
    /* JADX WARN: Code duplicated, block: B:31:0x005d  */
    /* JADX WARN: Code duplicated, block: B:38:0x007a  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d1  */
    @Override // defpackage.tw2
    public final mh5 b(long j) {
        float fB;
        int i;
        EdgeEffect edgeEffect;
        float fB2;
        boolean z;
        int i2;
        int i3;
        EdgeEffect edgeEffect2;
        float fB3;
        boolean z2;
        int i4;
        float fB4 = mh5.b(j);
        JGd jGd = JGd.a;
        float fC = 0.0f;
        if (fB4 > 0.0f) {
            int i5 = Build.VERSION.SDK_INT;
            EdgeEffect edgeEffect3 = this.d;
            if (!((i5 >= 31 ? jGd.b(edgeEffect3) : 0.0f) == 0.0f)) {
                int iC = sy4.c(mh5.b(j));
                if (i5 >= 31 || edgeEffect3.isFinished()) {
                    edgeEffect3.onAbsorb(iC);
                }
                fB = mh5.b(j);
            } else if (mh5.b(j) < 0.0f) {
                i = Build.VERSION.SDK_INT;
                edgeEffect = this.e;
                if (i >= 31) {
                    fB2 = jGd.b(edgeEffect);
                } else {
                    fB2 = 0.0f;
                }
                if (fB2 == 0.0f) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    fB = 0.0f;
                } else {
                    i2 = -sy4.c(mh5.b(j));
                    if (i < 31 || edgeEffect.isFinished()) {
                        edgeEffect.onAbsorb(i2);
                    }
                    fB = mh5.b(j);
                }
            } else {
                fB = 0.0f;
            }
        } else if (mh5.b(j) < 0.0f) {
            i = Build.VERSION.SDK_INT;
            edgeEffect = this.e;
            if (i >= 31) {
                fB2 = jGd.b(edgeEffect);
            } else {
                fB2 = 0.0f;
            }
            if (fB2 == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i2 = -sy4.c(mh5.b(j));
                if (i < 31) {
                    edgeEffect.onAbsorb(i2);
                } else {
                    edgeEffect.onAbsorb(i2);
                }
                fB = mh5.b(j);
            } else {
                fB = 0.0f;
            }
        } else {
            fB = 0.0f;
        }
        if (mh5.c(j) > 0.0f) {
            int i6 = Build.VERSION.SDK_INT;
            EdgeEffect edgeEffect4 = this.b;
            if (!((i6 >= 31 ? jGd.b(edgeEffect4) : 0.0f) == 0.0f)) {
                int iC2 = sy4.c(mh5.c(j));
                if (i6 >= 31 || edgeEffect4.isFinished()) {
                    edgeEffect4.onAbsorb(iC2);
                }
                fC = mh5.c(j);
            } else if (mh5.c(j) < 0.0f) {
                i3 = Build.VERSION.SDK_INT;
                edgeEffect2 = this.c;
                if (i3 >= 31) {
                    fB3 = jGd.b(edgeEffect2);
                } else {
                    fB3 = 0.0f;
                }
                if (fB3 == 0.0f) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    i4 = -sy4.c(mh5.c(j));
                    if (i3 < 31 || edgeEffect2.isFinished()) {
                        edgeEffect2.onAbsorb(i4);
                    }
                    fC = mh5.c(j);
                }
            }
        } else if (mh5.c(j) < 0.0f) {
            i3 = Build.VERSION.SDK_INT;
            edgeEffect2 = this.c;
            if (i3 >= 31) {
                fB3 = jGd.b(edgeEffect2);
            } else {
                fB3 = 0.0f;
            }
            if (fB3 == 0.0f) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                i4 = -sy4.c(mh5.c(j));
                if (i3 < 31) {
                    edgeEffect2.onAbsorb(i4);
                } else {
                    edgeEffect2.onAbsorb(i4);
                }
                fC = mh5.c(j);
            }
        }
        long jC = XTd3.c(fB, fC);
        if (!(jC == mh5.b)) {
            k();
        }
        return new mh5(jC);
    }

    @Override // defpackage.tw2
    public final pg2 c() {
        return this.q;
    }

    @Override // defpackage.tw2
    public final void d(long j, long j2, kt2 kt2Var, int i) {
        boolean z;
        boolean zIsFinished;
        if (i == 1) {
            long jH = kt2Var != null ? kt2Var.a : ps0.H(this.n);
            if (kt2.c(j2) > 0.0f) {
                m(j2, jH);
            } else if (kt2.c(j2) < 0.0f) {
                n(j2, jH);
            }
            if (kt2.d(j2) > 0.0f) {
                o(j2, jH);
            } else if (kt2.d(j2) < 0.0f) {
                l(j2, jH);
            }
            z = !kt2.a(j2, kt2.b);
        } else {
            z = false;
        }
        EdgeEffect edgeEffect = this.d;
        if (edgeEffect.isFinished() || kt2.c(j) >= 0.0f) {
            zIsFinished = false;
        } else {
            edgeEffect.onRelease();
            zIsFinished = edgeEffect.isFinished();
        }
        EdgeEffect edgeEffect2 = this.e;
        if (!edgeEffect2.isFinished() && kt2.c(j) > 0.0f) {
            edgeEffect2.onRelease();
            zIsFinished = zIsFinished || edgeEffect2.isFinished();
        }
        EdgeEffect edgeEffect3 = this.b;
        if (!edgeEffect3.isFinished() && kt2.d(j) < 0.0f) {
            edgeEffect3.onRelease();
            zIsFinished = zIsFinished || edgeEffect3.isFinished();
        }
        EdgeEffect edgeEffect4 = this.c;
        if (!edgeEffect4.isFinished() && kt2.d(j) > 0.0f) {
            edgeEffect4.onRelease();
            zIsFinished = zIsFinished || edgeEffect4.isFinished();
        }
        if (zIsFinished || z) {
            k();
        }
    }

    @Override // defpackage.tw2
    public final boolean e() {
        List<EdgeEffect> list = this.f;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!((Build.VERSION.SDK_INT >= 31 ? JGd.a.b(list.get(i)) : 0.0f) == 0.0f)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.tw2
    public final sd5 f(long j) {
        this.m = false;
        if (mh5.b(j) > 0.0f) {
            int iC = sy4.c(mh5.b(j));
            int i = Build.VERSION.SDK_INT;
            EdgeEffect edgeEffect = this.d;
            if (i >= 31 || edgeEffect.isFinished()) {
                edgeEffect.onAbsorb(iC);
            }
        } else if (mh5.b(j) < 0.0f) {
            int i2 = -sy4.c(mh5.b(j));
            int i3 = Build.VERSION.SDK_INT;
            EdgeEffect edgeEffect2 = this.e;
            if (i3 >= 31 || edgeEffect2.isFinished()) {
                edgeEffect2.onAbsorb(i2);
            }
        }
        if (mh5.c(j) > 0.0f) {
            int iC2 = sy4.c(mh5.c(j));
            int i4 = Build.VERSION.SDK_INT;
            EdgeEffect edgeEffect3 = this.b;
            if (i4 >= 31 || edgeEffect3.isFinished()) {
                edgeEffect3.onAbsorb(iC2);
            }
        } else if (mh5.c(j) < 0.0f) {
            int i5 = -sy4.c(mh5.c(j));
            int i6 = Build.VERSION.SDK_INT;
            EdgeEffect edgeEffect4 = this.c;
            if (i6 >= 31 || edgeEffect4.isFinished()) {
                edgeEffect4.onAbsorb(i5);
            }
        }
        if (!(j == mh5.b)) {
            k();
        }
        g();
        return sd5.a;
    }

    public final void g() {
        List<EdgeEffect> list = this.f;
        int size = list.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            EdgeEffect edgeEffect = list.get(i);
            edgeEffect.onRelease();
            z = edgeEffect.isFinished() || z;
        }
        if (z) {
            k();
        }
    }

    public final boolean h(ez1 ez1Var, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(180.0f);
        canvas.translate(-cm4.e(this.n), (-cm4.c(this.n)) + ez1Var.b0(this.a.b.a()));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    public final boolean i(ez1 ez1Var, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(270.0f);
        canvas.translate(-cm4.c(this.n), ez1Var.b0(this.a.b.b(ez1Var.getLayoutDirection())));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tw2
    public final boolean isEnabled() {
        return ((Boolean) this.o.getValue()).booleanValue();
    }

    public final boolean j(ez1 ez1Var, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        int iC = sy4.c(cm4.e(this.n));
        float fC = this.a.b.c(ez1Var.getLayoutDirection());
        canvas.rotate(90.0f);
        canvas.translate(0.0f, ez1Var.b0(fC) + (-iC));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    public final void k() {
        if (this.l) {
            this.k.setValue(sd5.a);
        }
    }

    public final float l(long j, long j2) {
        float fC = kt2.c(j2) / cm4.e(this.n);
        float fC2 = -(kt2.d(j) / cm4.c(this.n));
        float f = 1 - fC;
        int i = Build.VERSION.SDK_INT;
        EdgeEffect edgeEffect = this.c;
        if (i >= 31) {
            fC2 = JGd.a.c(edgeEffect, fC2, f);
        } else {
            edgeEffect.onPull(fC2, f);
        }
        return cm4.c(this.n) * (-fC2);
    }

    public final float m(long j, long j2) {
        float fD = kt2.d(j2) / cm4.c(this.n);
        float fC = kt2.c(j) / cm4.e(this.n);
        float f = 1 - fD;
        int i = Build.VERSION.SDK_INT;
        EdgeEffect edgeEffect = this.d;
        if (i >= 31) {
            fC = JGd.a.c(edgeEffect, fC, f);
        } else {
            edgeEffect.onPull(fC, f);
        }
        return cm4.e(this.n) * fC;
    }

    public final float n(long j, long j2) {
        float fD = kt2.d(j2) / cm4.c(this.n);
        float fC = -(kt2.c(j) / cm4.e(this.n));
        int i = Build.VERSION.SDK_INT;
        EdgeEffect edgeEffect = this.e;
        if (i >= 31) {
            fC = JGd.a.c(edgeEffect, fC, fD);
        } else {
            edgeEffect.onPull(fC, fD);
        }
        return cm4.e(this.n) * (-fC);
    }

    public final float o(long j, long j2) {
        float fC = kt2.c(j2) / cm4.e(this.n);
        float fD = kt2.d(j) / cm4.c(this.n);
        int i = Build.VERSION.SDK_INT;
        EdgeEffect edgeEffect = this.b;
        if (i >= 31) {
            fD = JGd.a.c(edgeEffect, fD, fC);
        } else {
            edgeEffect.onPull(fD, fC);
        }
        return cm4.c(this.n) * fD;
    }

    @Override // defpackage.tw2
    public final void setEnabled(boolean z) {
        boolean z2 = this.p != z;
        this.o.setValue(Boolean.valueOf(z));
        this.p = z;
        if (z2) {
            this.m = false;
            g();
        }
    }
}
