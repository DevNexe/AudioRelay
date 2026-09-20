package defpackage;

import android.graphics.Matrix;

/* JADX INFO: loaded from: classes.dex */
public final class hy1<T> {
    public final x81<T, Matrix, sd5> a;
    public Matrix b;
    public Matrix c;
    public float[] d;
    public float[] e;
    public boolean f = true;
    public boolean g = true;
    public boolean h = true;

    /* JADX WARN: Multi-variable type inference failed */
    public hy1(x81<? super T, ? super Matrix, sd5> x81Var) {
        this.a = x81Var;
    }

    public final float[] a(T t) {
        float[] fArrC = this.e;
        if (fArrC == null) {
            fArrC = eu.c();
            this.e = fArrC;
        }
        if (this.g) {
            this.h = Cz.t(b(t), fArrC);
            this.g = false;
        }
        if (this.h) {
            return fArrC;
        }
        return null;
    }

    public final float[] b(T t) {
        float[] fArrC = this.d;
        if (fArrC == null) {
            fArrC = eu.c();
            this.d = fArrC;
        }
        if (!this.f) {
            return fArrC;
        }
        Matrix matrix = this.b;
        if (matrix == null) {
            matrix = new Matrix();
            this.b = matrix;
        }
        this.a.invoke(t, matrix);
        Matrix matrix2 = this.c;
        if (matrix2 == null || !ur1.a(matrix, matrix2)) {
            X.D(fArrC, matrix);
            this.b = matrix2;
            this.c = matrix;
        }
        this.f = false;
        return fArrC;
    }

    public final void c() {
        this.f = true;
        this.g = true;
    }
}
