package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public final class TQ2_ implements qz2 {
    public final Path a;
    public final RectF b;
    public final float[] c;
    public final Matrix d;

    public TQ2_() {
        this(0);
    }

    public TQ2_(Path path) {
        this.a = path;
        this.b = new RectF();
        this.c = new float[8];
        this.d = new Matrix();
    }

    @Override // defpackage.qz2
    public final boolean a() {
        return this.a.isConvex();
    }

    @Override // defpackage.qz2
    public final void b(float f, float f2) {
        this.a.rMoveTo(f, f2);
    }

    @Override // defpackage.qz2
    public final void c(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a.rCubicTo(f, f2, f3, f4, f5, f6);
    }

    @Override // defpackage.qz2
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.qz2
    public final void d(float f, float f2, float f3, float f4) {
        this.a.quadTo(f, f2, f3, f4);
    }

    @Override // defpackage.qz2
    public final void e(float f, float f2, float f3, float f4) {
        this.a.rQuadTo(f, f2, f3, f4);
    }

    @Override // defpackage.qz2
    public final boolean f(qz2 qz2Var, qz2 qz2Var2, int i) {
        Path.Op op;
        if (i == 0) {
            op = Path.Op.DIFFERENCE;
        } else {
            if (i == 1) {
                op = Path.Op.INTERSECT;
            } else {
                if (i == 4) {
                    op = Path.Op.REVERSE_DIFFERENCE;
                } else {
                    op = i == 2 ? Path.Op.UNION : Path.Op.XOR;
                }
            }
        }
        if (!(qz2Var instanceof TQ2_)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        TQ2_ tq2_ = (TQ2_) qz2Var;
        if (qz2Var2 instanceof TQ2_) {
            return this.a.op(tq2_.a, ((TQ2_) qz2Var2).a, op);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // defpackage.qz2
    public final void g(float f, float f2) {
        this.a.moveTo(f, f2);
    }

    @Override // defpackage.qz2
    public final void h(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a.cubicTo(f, f2, f3, f4, f5, f6);
    }

    @Override // defpackage.qz2
    public final void i(ku3 ku3Var) {
        RectF rectF = this.b;
        rectF.set(ku3Var.a, ku3Var.b, ku3Var.c, ku3Var.d);
        long j = ku3Var.e;
        float fB = ha0.b(j);
        float[] fArr = this.c;
        fArr[0] = fB;
        fArr[1] = ha0.c(j);
        long j2 = ku3Var.f;
        fArr[2] = ha0.b(j2);
        fArr[3] = ha0.c(j2);
        long j3 = ku3Var.g;
        fArr[4] = ha0.b(j3);
        fArr[5] = ha0.c(j3);
        long j4 = ku3Var.h;
        fArr[6] = ha0.b(j4);
        fArr[7] = ha0.c(j4);
        this.a.addRoundRect(rectF, fArr, Path.Direction.CCW);
    }

    @Override // defpackage.qz2
    public final void j(float f, float f2) {
        this.a.rLineTo(f, f2);
    }

    @Override // defpackage.qz2
    public final void k(float f, float f2) {
        this.a.lineTo(f, f2);
    }

    public final void l(qz2 qz2Var, long j) {
        if (!(qz2Var instanceof TQ2_)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        this.a.addPath(((TQ2_) qz2Var).a, kt2.c(j), kt2.d(j));
    }

    public final void m(dl3 dl3Var) {
        float f = dl3Var.a;
        if (!(!Float.isNaN(f))) {
            throw new IllegalStateException("Rect.left is NaN".toString());
        }
        float f2 = dl3Var.b;
        if (!(!Float.isNaN(f2))) {
            throw new IllegalStateException("Rect.top is NaN".toString());
        }
        float f3 = dl3Var.c;
        if (!(!Float.isNaN(f3))) {
            throw new IllegalStateException("Rect.right is NaN".toString());
        }
        float f4 = dl3Var.d;
        if (!(!Float.isNaN(f4))) {
            throw new IllegalStateException("Rect.bottom is NaN".toString());
        }
        RectF rectF = this.b;
        rectF.set(new RectF(f, f2, f3, f4));
        this.a.addRect(rectF, Path.Direction.CCW);
    }

    public final boolean n() {
        return this.a.isEmpty();
    }

    public final void o(long j) {
        Matrix matrix = this.d;
        matrix.reset();
        matrix.setTranslate(kt2.c(j), kt2.d(j));
        this.a.transform(matrix);
    }

    @Override // defpackage.qz2
    public final void reset() {
        this.a.reset();
    }

    public /* synthetic */ TQ2_(int i) {
        this(new Path());
    }
}
