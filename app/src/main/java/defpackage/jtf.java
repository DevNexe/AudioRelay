package defpackage;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class jtf implements py2 {
    public final Paint a = new Paint(7);
    public int b = 3;
    public Shader c;
    public av d;

    @Override // defpackage.py2
    public final long a() {
        return hH.c(this.a.getColor());
    }

    @Override // defpackage.py2
    public final void b(float f) {
        this.a.setAlpha((int) Math.rint(f * 255.0f));
    }

    @Override // defpackage.py2
    public final void c(int i) {
        this.b = i;
        Paint paint = this.a;
        if (Build.VERSION.SDK_INT >= 29) {
            ro5.a.a(paint, i);
        } else {
            paint.setXfermode(new PorterDuffXfermode(fp1.z0(i)));
        }
    }

    @Override // defpackage.py2
    public final av d() {
        return this.d;
    }

    @Override // defpackage.py2
    public final Paint e() {
        return this.a;
    }

    @Override // defpackage.py2
    public final void f(Shader shader) {
        this.c = shader;
        this.a.setShader(shader);
    }

    @Override // defpackage.py2
    public final Shader g() {
        return this.c;
    }

    @Override // defpackage.py2
    public final void h(int i) {
        this.a.setFilterBitmap(!(i == 0));
    }

    @Override // defpackage.py2
    public final void i(av avVar) {
        this.d = avVar;
        this.a.setColorFilter(avVar != null ? avVar.a : null);
    }

    @Override // defpackage.py2
    public final int j() {
        return this.a.isFilterBitmap() ? 1 : 0;
    }

    @Override // defpackage.py2
    public final void k(long j) {
        this.a.setColor(hH.A(j));
    }

    @Override // defpackage.py2
    public final int l() {
        return this.b;
    }

    public final int m() {
        Paint.Cap strokeCap = this.a.getStrokeCap();
        int i = strokeCap == null ? -1 : wbuE.a[strokeCap.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return 1;
            }
            if (i == 3) {
                return 2;
            }
        }
        return 0;
    }

    @Override // defpackage.py2
    public final float n() {
        return this.a.getAlpha() / 255.0f;
    }

    public final int o() {
        Paint.Join strokeJoin = this.a.getStrokeJoin();
        int i = strokeJoin == null ? -1 : wbuE.b[strokeJoin.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return 2;
            }
            if (i == 3) {
                return 1;
            }
        }
        return 0;
    }

    public final float p() {
        return this.a.getStrokeMiter();
    }

    public final float q() {
        return this.a.getStrokeWidth();
    }

    public final void r(fXUx fxux) {
        this.a.setPathEffect(null);
    }

    public final void s(int i) {
        Paint.Cap cap;
        Paint paint = this.a;
        if (i == 2) {
            cap = Paint.Cap.SQUARE;
        } else {
            if (i == 1) {
                cap = Paint.Cap.ROUND;
            } else {
                cap = i == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT;
            }
        }
        paint.setStrokeCap(cap);
    }

    public final void t(int i) {
        Paint.Join join;
        Paint paint = this.a;
        if (i == 0) {
            join = Paint.Join.MITER;
        } else {
            if (i == 2) {
                join = Paint.Join.BEVEL;
            } else {
                join = i == 1 ? Paint.Join.ROUND : Paint.Join.MITER;
            }
        }
        paint.setStrokeJoin(join);
    }

    public final void u(float f) {
        this.a.setStrokeMiter(f);
    }

    public final void v(float f) {
        this.a.setStrokeWidth(f);
    }

    public final void w(int i) {
        this.a.setStyle(i == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }
}
