package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.BitSet;

/* JADX INFO: loaded from: classes3.dex */
public final class fj4 {
    public final hj4[] a = new hj4[4];
    public final Matrix[] b = new Matrix[4];
    public final Matrix[] c = new Matrix[4];
    public final PointF d = new PointF();
    public final Path e = new Path();
    public final Path f = new Path();
    public final hj4 g = new hj4();
    public final float[] h = new float[2];
    public final float[] i = new float[2];
    public final Path j = new Path();
    public final Path k = new Path();
    public final boolean l = true;

    public static class QnHx {
        public static final fj4 a = new fj4();
    }

    public fj4() {
        for (int i = 0; i < 4; i++) {
            this.a[i] = new hj4();
            this.b[i] = new Matrix();
            this.c[i] = new Matrix();
        }
    }

    public final void a(ej4 ej4Var, float f, RectF rectF, la2.QnHx qnHx, Path path) {
        int i;
        Matrix[] matrixArr;
        float[] fArr;
        Matrix[] matrixArr2;
        hj4[] hj4VarArr;
        pq0 pq0Var;
        Path path2;
        ia0 ia0Var;
        zv1 zv1Var;
        fj4 fj4Var = this;
        ej4 ej4Var2 = ej4Var;
        Path path3 = path;
        path.rewind();
        Path path4 = fj4Var.e;
        path4.rewind();
        Path path5 = fj4Var.f;
        path5.rewind();
        path5.addRect(rectF, Path.Direction.CW);
        int i2 = 0;
        while (true) {
            i = 4;
            matrixArr = fj4Var.c;
            fArr = fj4Var.h;
            matrixArr2 = fj4Var.b;
            hj4VarArr = fj4Var.a;
            if (i2 >= 4) {
                break;
            }
            if (i2 == 1) {
                ia0Var = ej4Var2.g;
            } else if (i2 != 2) {
                ia0Var = i2 != 3 ? ej4Var2.f : ej4Var2.e;
            } else {
                ia0Var = ej4Var2.h;
            }
            if (i2 == 1) {
                zv1Var = ej4Var2.c;
            } else if (i2 != 2) {
                zv1Var = i2 != 3 ? ej4Var2.b : ej4Var2.a;
            } else {
                zv1Var = ej4Var2.d;
            }
            hj4 hj4Var = hj4VarArr[i2];
            zv1Var.getClass();
            zv1Var.a(f, ia0Var.a(rectF), hj4Var);
            int i3 = i2 + 1;
            float f2 = i3 * 90;
            matrixArr2[i2].reset();
            PointF pointF = fj4Var.d;
            if (i2 == 1) {
                pointF.set(rectF.right, rectF.bottom);
            } else if (i2 == 2) {
                pointF.set(rectF.left, rectF.bottom);
            } else if (i2 != 3) {
                pointF.set(rectF.right, rectF.top);
            } else {
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i2].setTranslate(pointF.x, pointF.y);
            matrixArr2[i2].preRotate(f2);
            hj4 hj4Var2 = hj4VarArr[i2];
            fArr[0] = hj4Var2.c;
            fArr[1] = hj4Var2.d;
            matrixArr2[i2].mapPoints(fArr);
            matrixArr[i2].reset();
            matrixArr[i2].setTranslate(fArr[0], fArr[1]);
            matrixArr[i2].preRotate(f2);
            i2 = i3;
            path4 = path4;
        }
        Path path6 = path4;
        char c = 1;
        char c2 = 0;
        int i4 = 0;
        while (i4 < i) {
            hj4 hj4Var3 = hj4VarArr[i4];
            fArr[c2] = hj4Var3.a;
            fArr[c] = hj4Var3.b;
            matrixArr2[i4].mapPoints(fArr);
            if (i4 == 0) {
                path3.moveTo(fArr[c2], fArr[c]);
            } else {
                path3.lineTo(fArr[c2], fArr[c]);
            }
            hj4VarArr[i4].c(matrixArr2[i4], path3);
            if (qnHx != 0) {
                hj4 hj4Var4 = hj4VarArr[i4];
                Matrix matrix = matrixArr2[i4];
                la2 la2Var = la2.this;
                BitSet bitSet = la2Var.z;
                hj4Var4.getClass();
                bitSet.set(i4, false);
                hj4Var4.b(hj4Var4.f);
                la2Var.x[i4] = new gj4(new ArrayList(hj4Var4.h), new Matrix(matrix));
            }
            int i5 = i4 + 1;
            int i6 = i5 % 4;
            hj4 hj4Var5 = hj4VarArr[i4];
            fArr[0] = hj4Var5.c;
            fArr[1] = hj4Var5.d;
            matrixArr2[i4].mapPoints(fArr);
            hj4 hj4Var6 = hj4VarArr[i6];
            float f3 = hj4Var6.a;
            float[] fArr2 = fj4Var.i;
            fArr2[0] = f3;
            fArr2[1] = hj4Var6.b;
            matrixArr2[i6].mapPoints(fArr2);
            float fMax = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
            hj4 hj4Var7 = hj4VarArr[i4];
            fArr[0] = hj4Var7.c;
            fArr[1] = hj4Var7.d;
            matrixArr2[i4].mapPoints(fArr);
            float fAbs = (i4 == 1 || i4 == 3) ? Math.abs(rectF.centerX() - fArr[0]) : Math.abs(rectF.centerY() - fArr[1]);
            hj4 hj4Var8 = fj4Var.g;
            hj4Var8.e(0.0f, 270.0f, 0.0f);
            if (i4 == 1) {
                pq0Var = ej4Var2.k;
            } else if (i4 != 2) {
                pq0Var = i4 != 3 ? ej4Var2.j : ej4Var2.i;
            } else {
                pq0Var = ej4Var2.l;
            }
            pq0Var.a(fMax, fAbs, f, hj4Var8);
            Path path7 = fj4Var.j;
            path7.reset();
            hj4Var8.c(matrixArr[i4], path7);
            if (fj4Var.l && (fj4Var.b(path7, i4) || fj4Var.b(path7, i6))) {
                path7.op(path7, path5, Path.Op.DIFFERENCE);
                fArr[0] = hj4Var8.a;
                fArr[1] = hj4Var8.b;
                matrixArr[i4].mapPoints(fArr);
                path2 = path6;
                path2.moveTo(fArr[0], fArr[1]);
                hj4Var8.c(matrixArr[i4], path2);
                path3 = path;
            } else {
                path2 = path6;
                path3 = path;
                hj4Var8.c(matrixArr[i4], path3);
            }
            if (qnHx != 0) {
                Matrix matrix2 = matrixArr[i4];
                la2 la2Var2 = la2.this;
                la2Var2.z.set(i4 + 4, false);
                hj4Var8.b(hj4Var8.f);
                la2Var2.y[i4] = new gj4(new ArrayList(hj4Var8.h), new Matrix(matrix2));
            }
            fj4Var = this;
            ej4Var2 = ej4Var;
            path6 = path2;
            i4 = i5;
            c = 1;
            i = 4;
            c2 = 0;
        }
        Path path8 = path6;
        path.close();
        path8.close();
        if (path8.isEmpty()) {
            return;
        }
        path3.op(path8, Path.Op.UNION);
    }

    public final boolean b(Path path, int i) {
        Path path2 = this.k;
        path2.reset();
        this.a[i].c(this.b[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }
}
