package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class iz1 implements aw4.QnHx {
    public final /* synthetic */ gz1 a;
    public final /* synthetic */ Object b;

    public iz1(gz1 gz1Var, Object obj) {
        this.a = gz1Var;
        this.b = obj;
    }

    @Override // aw4.QnHx
    public final void a() {
        gz1 gz1Var = this.a;
        gz1Var.b();
        yy1 yy1Var = (yy1) gz1Var.h.remove(this.b);
        if (yy1Var != null) {
            if (!(gz1Var.k > 0)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            yy1 yy1Var2 = gz1Var.a;
            int iIndexOf = ((ui2.QnHx) yy1Var2.r()).indexOf(yy1Var);
            int i = ((ui2.QnHx) yy1Var2.r()).w.y;
            int i2 = gz1Var.k;
            if (!(iIndexOf >= i - i2)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            gz1Var.j++;
            gz1Var.k = i2 - 1;
            int i3 = (((ui2.QnHx) yy1Var2.r()).w.y - gz1Var.k) - gz1Var.j;
            yy1Var2.G = true;
            yy1Var2.I(iIndexOf, i3, 1);
            yy1Var2.G = false;
            gz1Var.a(i3);
        }
    }

    @Override // aw4.QnHx
    public final int b() {
        ui2<yy1> ui2VarV;
        yy1 yy1Var = (yy1) this.a.h.get(this.b);
        if (yy1Var == null || (ui2VarV = yy1Var.v()) == null) {
            return 0;
        }
        return ui2VarV.y;
    }

    @Override // aw4.QnHx
    public final void c(int i, long j) {
        gz1 gz1Var = this.a;
        yy1 yy1Var = (yy1) gz1Var.h.get(this.b);
        if (yy1Var == null || !yy1Var.E()) {
            return;
        }
        int i2 = yy1Var.v().y;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException("Index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
        if (!(!yy1Var.Q)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        yy1 yy1Var2 = gz1Var.a;
        yy1Var2.G = true;
        Cz.B(yy1Var).c(yy1Var.v().w[i], j);
        yy1Var2.G = false;
    }
}
