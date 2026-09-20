package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Region;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ZCR implements dn {
    public Canvas a = F6mt.a;
    public final Rect b = new Rect();
    public final Rect c = new Rect();

    @Override // defpackage.dn
    public final void a(long j, long j2, py2 py2Var) {
        this.a.drawLine(kt2.c(j), kt2.d(j), kt2.c(j2), kt2.d(j2), py2Var.e());
    }

    @Override // defpackage.dn
    public final void b(float f, float f2, float f3, float f4, float f5, float f6, py2 py2Var) {
        this.a.drawRoundRect(f, f2, f3, f4, f5, f6, py2Var.e());
    }

    @Override // defpackage.dn
    public final void c(qz2 qz2Var, py2 py2Var) {
        Canvas canvas = this.a;
        if (!(qz2Var instanceof TQ2_)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((TQ2_) qz2Var).a, py2Var.e());
    }

    @Override // defpackage.dn
    public final void d(qz2 qz2Var, int i) {
        Canvas canvas = this.a;
        if (!(qz2Var instanceof TQ2_)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(((TQ2_) qz2Var).a, i == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // defpackage.dn
    public final void e() {
        this.a.save();
    }

    @Override // defpackage.dn
    public final void f(float f, float f2, float f3, float f4, float f5, float f6, py2 py2Var) {
        this.a.drawArc(f, f2, f3, f4, f5, f6, false, py2Var.e());
    }

    @Override // defpackage.dn
    public final void g(dl3 dl3Var, jtf jtfVar) {
        u(dl3Var.a, dl3Var.b, dl3Var.c, dl3Var.d, jtfVar);
    }

    @Override // defpackage.dn
    public final void h() {
        hn.b(this.a, false);
    }

    @Override // defpackage.dn
    public final void i(dl3 dl3Var, int i) {
        n(dl3Var.a, dl3Var.b, dl3Var.c, dl3Var.d, i);
    }

    @Override // defpackage.dn
    public final void j(bj1 bj1Var, long j, long j2, long j3, long j4, py2 py2Var) {
        Canvas canvas = this.a;
        Bitmap bitmapC = fp1.C(bj1Var);
        int i = mp1.c;
        int i2 = (int) (j >> 32);
        Rect rect = this.b;
        rect.left = i2;
        rect.top = mp1.a(j);
        rect.right = i2 + ((int) (j2 >> 32));
        rect.bottom = sp1.b(j2) + mp1.a(j);
        sd5 sd5Var = sd5.a;
        int i3 = (int) (j3 >> 32);
        Rect rect2 = this.c;
        rect2.left = i3;
        rect2.top = mp1.a(j3);
        rect2.right = i3 + ((int) (j4 >> 32));
        rect2.bottom = sp1.b(j4) + mp1.a(j3);
        canvas.drawBitmap(bitmapC, rect, rect2, py2Var.e());
    }

    /* JADX WARN: Code duplicated, block: B:57:0x008d  */
    @Override // defpackage.dn
    public final void k(float[] fArr) {
        boolean z;
        boolean z2;
        int i = 0;
        loop0: while (true) {
            if (i >= 4) {
                z = true;
                break;
            }
            int i2 = 0;
            while (i2 < 4) {
                if (!(fArr[(i * 4) + i2] == (i == i2 ? 1.0f : 0.0f))) {
                    z = false;
                    break loop0;
                }
                i2++;
            }
            i++;
        }
        if (z) {
            return;
        }
        Matrix matrix = new Matrix();
        float f = fArr[2];
        if (f == 0.0f) {
            if (fArr[6] == 0.0f) {
                if (fArr[10] == 1.0f) {
                    if (fArr[14] == 0.0f) {
                        if (fArr[8] == 0.0f) {
                            if (fArr[9] == 0.0f) {
                                if (fArr[11] == 0.0f) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                            } else {
                                z2 = false;
                            }
                        } else {
                            z2 = false;
                        }
                    } else {
                        z2 = false;
                    }
                } else {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        if (!z2) {
            throw new IllegalArgumentException("Android does not support arbitrary transforms".toString());
        }
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[12];
        float f11 = fArr[13];
        float f12 = fArr[15];
        fArr[0] = f2;
        fArr[1] = f5;
        fArr[2] = f10;
        fArr[3] = f3;
        fArr[4] = f6;
        fArr[5] = f11;
        fArr[6] = f4;
        fArr[7] = f8;
        fArr[8] = f12;
        matrix.setValues(fArr);
        fArr[0] = f2;
        fArr[1] = f3;
        fArr[2] = f;
        fArr[3] = f4;
        fArr[4] = f5;
        fArr[5] = f6;
        fArr[6] = f7;
        fArr[7] = f8;
        fArr[8] = f9;
        this.a.concat(matrix);
    }

    @Override // defpackage.dn
    public final void l(dl3 dl3Var, py2 py2Var) {
        this.a.saveLayer(dl3Var.a, dl3Var.b, dl3Var.c, dl3Var.d, py2Var.e(), 31);
    }

    @Override // defpackage.dn
    public final void m() {
        this.a.scale(-1.0f, 1.0f);
    }

    @Override // defpackage.dn
    public final void n(float f, float f2, float f3, float f4, int i) {
        this.a.clipRect(f, f2, f3, f4, i == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // defpackage.dn
    public final void o(float f, float f2) {
        this.a.translate(f, f2);
    }

    @Override // defpackage.dn
    public final void p() {
        this.a.rotate(45.0f);
    }

    @Override // defpackage.dn
    public final void q(py2 py2Var, ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            long j = ((kt2) arrayList.get(i)).a;
            this.a.drawPoint(kt2.c(j), kt2.d(j), py2Var.e());
        }
    }

    @Override // defpackage.dn
    public final void r() {
        this.a.restore();
    }

    @Override // defpackage.dn
    public final void s(float f, long j, py2 py2Var) {
        this.a.drawCircle(kt2.c(j), kt2.d(j), f, py2Var.e());
    }

    @Override // defpackage.dn
    public final void t(bj1 bj1Var, long j, py2 py2Var) {
        this.a.drawBitmap(fp1.C(bj1Var), kt2.c(j), kt2.d(j), py2Var.e());
    }

    @Override // defpackage.dn
    public final void u(float f, float f2, float f3, float f4, py2 py2Var) {
        this.a.drawRect(f, f2, f3, f4, py2Var.e());
    }

    @Override // defpackage.dn
    public final void v() {
        hn.b(this.a, true);
    }

    public final Canvas w() {
        return this.a;
    }

    public final void x(Canvas canvas) {
        this.a = canvas;
    }
}
