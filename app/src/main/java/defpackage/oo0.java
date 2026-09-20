package defpackage;

import android.graphics.Canvas;
import android.widget.EdgeEffect;

/* JADX INFO: loaded from: classes.dex */
public final class oo0 extends zo1 implements mo0 {
    public final HdLS x;

    public oo0(HdLS hdLS) {
        super(wo1.a);
        this.x = hdLS;
    }

    @Override // defpackage.pg2
    public final /* synthetic */ boolean B(f30.F1 f1) {
        return dj.a(this, f1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oo0)) {
            return false;
        }
        return ur1.a(this.x, ((oo0) obj).x);
    }

    public final int hashCode() {
        return this.x.hashCode();
    }

    @Override // defpackage.pg2
    public final Object m0(Object obj, x81 x81Var) {
        return x81Var.invoke(obj, this);
    }

    @Override // defpackage.mo0
    public final void o0(ez1 ez1Var) {
        boolean zI;
        ez1Var.B0();
        HdLS hdLS = this.x;
        hdLS.getClass();
        dn dnVarB = ez1Var.w.x.b();
        hdLS.k.getValue();
        Canvas canvas = F6mt.a;
        Canvas canvas2 = ((ZCR) dnVarB).a;
        EdgeEffect edgeEffect = hdLS.i;
        boolean z = true;
        if (!(ym.c(edgeEffect) == 0.0f)) {
            hdLS.j(ez1Var, edgeEffect, canvas2);
            edgeEffect.finish();
        }
        EdgeEffect edgeEffect2 = hdLS.d;
        if (edgeEffect2.isFinished()) {
            zI = false;
        } else {
            zI = hdLS.i(ez1Var, edgeEffect2, canvas2);
            ym.e(edgeEffect, ym.c(edgeEffect2));
        }
        EdgeEffect edgeEffect3 = hdLS.g;
        if (!(ym.c(edgeEffect3) == 0.0f)) {
            hdLS.h(ez1Var, edgeEffect3, canvas2);
            edgeEffect3.finish();
        }
        EdgeEffect edgeEffect4 = hdLS.b;
        boolean zIsFinished = edgeEffect4.isFinished();
        rw2 rw2Var = hdLS.a;
        if (!zIsFinished) {
            int iSave = canvas2.save();
            canvas2.translate(0.0f, ez1Var.b0(rw2Var.b.d()));
            boolean zDraw = edgeEffect4.draw(canvas2);
            canvas2.restoreToCount(iSave);
            zI = zDraw || zI;
            ym.e(edgeEffect3, ym.c(edgeEffect4));
        }
        EdgeEffect edgeEffect5 = hdLS.j;
        if (!(ym.c(edgeEffect5) == 0.0f)) {
            hdLS.i(ez1Var, edgeEffect5, canvas2);
            edgeEffect5.finish();
        }
        EdgeEffect edgeEffect6 = hdLS.e;
        if (!edgeEffect6.isFinished()) {
            zI = hdLS.j(ez1Var, edgeEffect6, canvas2) || zI;
            ym.e(edgeEffect5, ym.c(edgeEffect6));
        }
        EdgeEffect edgeEffect7 = hdLS.h;
        if (!(ym.c(edgeEffect7) == 0.0f)) {
            int iSave2 = canvas2.save();
            canvas2.translate(0.0f, ez1Var.b0(rw2Var.b.d()));
            edgeEffect7.draw(canvas2);
            canvas2.restoreToCount(iSave2);
            edgeEffect7.finish();
        }
        EdgeEffect edgeEffect8 = hdLS.c;
        if (!edgeEffect8.isFinished()) {
            if (!hdLS.h(ez1Var, edgeEffect8, canvas2) && !zI) {
                z = false;
            }
            ym.e(edgeEffect7, ym.c(edgeEffect8));
            zI = z;
        }
        if (zI) {
            hdLS.k();
        }
    }

    public final String toString() {
        return "DrawOverscrollModifier(overscrollEffect=" + this.x + ')';
    }

    @Override // defpackage.pg2
    public final /* synthetic */ pg2 y(pg2 pg2Var) {
        return hj0.b(this, pg2Var);
    }

    @Override // defpackage.pg2
    public final Object z(Object obj, x81 x81Var) {
        return x81Var.invoke(this, obj);
    }
}
