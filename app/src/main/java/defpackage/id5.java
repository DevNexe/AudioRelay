package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class id5 extends LPt8Fixed<yy1> {
    public id5(yy1 yy1Var) {
        super(yy1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.jE
    public final void b(int i, Object obj) {
        ((yy1) this.c).z(i, (yy1) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.jE
    public final void e(int i, int i2, int i3) {
        ((yy1) this.c).I(i, i2, i3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.jE
    public final void f(int i, int i2) {
        ((yy1) this.c).M(i, i2);
    }

    @Override // defpackage.jE
    public final /* bridge */ /* synthetic */ void h(int i, Object obj) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.LPt8Fixed, defpackage.jE
    public final void i() {
        ww2 ww2Var = ((yy1) this.a).C;
        if (ww2Var != null) {
            ww2Var.m();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.LPt8Fixed
    public final void j() {
        yy1 yy1Var = (yy1) this.a;
        ui2<yy1> ui2Var = yy1Var.y;
        for (int i = ui2Var.y - 1; -1 < i; i--) {
            yy1Var.K(ui2Var.w[i]);
        }
        ui2Var.e();
    }
}
