package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class hj4 {

    @Deprecated
    public float a;

    @Deprecated
    public float b;

    @Deprecated
    public float c;

    @Deprecated
    public float d;

    @Deprecated
    public float e;

    @Deprecated
    public float f;
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public static class CQf extends YKK {
        public final LPt8Fixed b;
        public final float c;
        public final float d;

        public CQf(LPt8Fixed lPt8, float f, float f2) {
            this.b = lPt8;
            this.c = f;
            this.d = f2;
        }

        @Override // hj4.YKK
        public final void a(Matrix matrix, aj4 aj4Var, int i, Canvas canvas) {
            LPt8Fixed lPt8 = this.b;
            float f = lPt8.c;
            float f2 = this.d;
            float f3 = lPt8.b;
            float f4 = this.c;
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(f4, f2);
            matrix2.preRotate(b());
            aj4Var.getClass();
            rectF.bottom += i;
            rectF.offset(0.0f, -i);
            int[] iArr = aj4.i;
            iArr[0] = aj4Var.f;
            iArr[1] = aj4Var.e;
            iArr[2] = aj4Var.d;
            Paint paint = aj4Var.c;
            float f5 = rectF.left;
            paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, aj4.j, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix2);
            canvas.drawRect(rectF, paint);
            canvas.restore();
        }

        public final float b() {
            LPt8Fixed lPt8 = this.b;
            return (float) Math.toDegrees(Math.atan((lPt8.c - this.d) / (lPt8.b - this.c)));
        }
    }

    public static class F1 extends NUlFixed {
        public static final RectF h = new RectF();

        @Deprecated
        public float b;

        @Deprecated
        public float c;

        @Deprecated
        public float d;

        @Deprecated
        public float e;

        @Deprecated
        public float f;

        @Deprecated
        public float g;

        public F1(float f, float f2, float f3, float f4) {
            this.b = f;
            this.c = f2;
            this.d = f3;
            this.e = f4;
        }

        @Override // hj4.NUlFixed
        public final void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = h;
            rectF.set(this.b, this.c, this.d, this.e);
            path.arcTo(rectF, this.f, this.g, false);
            path.transform(matrix);
        }
    }

    public static class LPt8Fixed extends NUlFixed {
        public float b;
        public float c;

        @Override // hj4.NUlFixed
        public final void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.b, this.c);
            path.transform(matrix);
        }
    }

    public static abstract class NUlFixed {
        public final Matrix a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    public static class QnHx extends YKK {
        public final F1 b;

        public QnHx(F1 f1) {
            this.b = f1;
        }

        @Override // hj4.YKK
        public final void a(Matrix matrix, aj4 aj4Var, int i, Canvas canvas) {
            F1 f1 = this.b;
            float f = f1.f;
            float f2 = f1.g;
            RectF rectF = new RectF(f1.b, f1.c, f1.d, f1.e);
            aj4Var.getClass();
            boolean z = f2 < 0.0f;
            Path path = aj4Var.g;
            int[] iArr = aj4.k;
            if (z) {
                iArr[0] = 0;
                iArr[1] = aj4Var.f;
                iArr[2] = aj4Var.e;
                iArr[3] = aj4Var.d;
            } else {
                path.rewind();
                path.moveTo(rectF.centerX(), rectF.centerY());
                path.arcTo(rectF, f, f2);
                path.close();
                float f3 = -i;
                rectF.inset(f3, f3);
                iArr[0] = 0;
                iArr[1] = aj4Var.d;
                iArr[2] = aj4Var.e;
                iArr[3] = aj4Var.f;
            }
            float fWidth = rectF.width() / 2.0f;
            if (fWidth <= 0.0f) {
                return;
            }
            float f4 = 1.0f - (i / fWidth);
            float[] fArr = aj4.l;
            fArr[1] = f4;
            fArr[2] = ((1.0f - f4) / 2.0f) + f4;
            RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP);
            Paint paint = aj4Var.b;
            paint.setShader(radialGradient);
            canvas.save();
            canvas.concat(matrix);
            canvas.scale(1.0f, rectF.height() / rectF.width());
            if (!z) {
                canvas.clipPath(path, Region.Op.DIFFERENCE);
                canvas.drawPath(path, aj4Var.h);
            }
            canvas.drawArc(rectF, f, f2, true, paint);
            canvas.restore();
        }
    }

    public static abstract class YKK {
        public static final Matrix a = new Matrix();

        public abstract void a(Matrix matrix, aj4 aj4Var, int i, Canvas canvas);
    }

    public hj4() {
        e(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f, float f2, float f3, float f4, float f5, float f6) {
        F1 f1 = new F1(f, f2, f3, f4);
        f1.f = f5;
        f1.g = f6;
        this.g.add(f1);
        QnHx qnHx = new QnHx(f1);
        float f7 = f5 + f6;
        boolean z = f6 < 0.0f;
        if (z) {
            f5 = (f5 + 180.0f) % 360.0f;
        }
        float f8 = z ? (180.0f + f7) % 360.0f : f7;
        b(f5);
        this.h.add(qnHx);
        this.e = f8;
        double d = f7;
        this.c = (((f3 - f) / 2.0f) * ((float) Math.cos(Math.toRadians(d)))) + ((f + f3) * 0.5f);
        this.d = (((f4 - f2) / 2.0f) * ((float) Math.sin(Math.toRadians(d)))) + ((f2 + f4) * 0.5f);
    }

    public final void b(float f) {
        float f2 = this.e;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 > 180.0f) {
            return;
        }
        float f4 = this.c;
        float f5 = this.d;
        F1 f1 = new F1(f4, f5, f4, f5);
        f1.f = this.e;
        f1.g = f3;
        this.h.add(new QnHx(f1));
        this.e = f;
    }

    public final void c(Matrix matrix, Path path) {
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((NUlFixed) arrayList.get(i)).a(matrix, path);
        }
    }

    public final void d(float f, float f2) {
        LPt8Fixed lPt8 = new LPt8Fixed();
        lPt8.b = f;
        lPt8.c = f2;
        this.g.add(lPt8);
        CQf cQf = new CQf(lPt8, this.c, this.d);
        float fB = cQf.b() + 270.0f;
        float fB2 = cQf.b() + 270.0f;
        b(fB);
        this.h.add(cQf);
        this.e = fB2;
        this.c = f;
        this.d = f2;
    }

    public final void e(float f, float f2, float f3) {
        this.a = 0.0f;
        this.b = f;
        this.c = 0.0f;
        this.d = f;
        this.e = f2;
        this.f = (f2 + f3) % 360.0f;
        this.g.clear();
        this.h.clear();
    }
}
