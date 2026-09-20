package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class sAn {
    public final uz4 a;
    public volatile rz4 b;

    public sAn(uz4 uz4Var, String str) {
        this.a = uz4Var;
        this.b = new rz4(str, vz4.F1.a);
    }

    public final void a(uy4 uy4Var, String str) {
        this.b = rz4.a(this.b, new vz4.QnHx(uy4Var, str));
        rz4 rz4Var = this.b;
        uz4 uz4Var = this.a;
        uz4Var.getClass();
        uz4Var.a(rz4Var.a, rz4Var.b);
    }

    public final rx b(c54 c54Var) {
        return new ax(new zr2(new jr2(new hr2(new cs2(vq2.r(500L, 500L, TimeUnit.MILLISECONDS, c54Var), new Ot0r(this, 22))), new J(this, 17), m91.d, m91.c)), new l83(this, 5)).d(new dc(this, 9));
    }
}
