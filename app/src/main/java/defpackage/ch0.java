package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ch0 extends qg1 {
    public final u91 A;
    public final u91 B;
    public final fk C;
    public final mc1 D;
    public final ve1 w;
    public final la0 x;
    public final zg1 y;
    public final ag1 z;

    public ch0(ve1 ve1Var, sg1 sg1Var) {
        this.w = ve1Var;
        this.x = sg1Var.f;
        this.y = sg1Var.a;
        this.z = sg1Var.d;
        this.A = sg1Var.b;
        this.B = sg1Var.g;
        Object obj = sg1Var.e;
        fk fkVar = obj instanceof fk ? (fk) obj : null;
        if (fkVar == null) {
            fk.a.getClass();
            fkVar = (fk) fk.QnHx.b.getValue();
        }
        this.C = fkVar;
        this.D = sg1Var.c;
    }

    @Override // defpackage.sf1
    public final mc1 a() {
        return this.D;
    }

    @Override // defpackage.qg1
    public final ve1 c() {
        return this.w;
    }

    @Override // defpackage.qg1
    public final fk d() {
        return this.C;
    }

    @Override // defpackage.qg1
    public final u91 e() {
        return this.A;
    }

    @Override // defpackage.ua0
    public final la0 g() {
        return this.x;
    }

    @Override // defpackage.qg1
    public final u91 h() {
        return this.B;
    }

    @Override // defpackage.qg1
    public final zg1 i() {
        return this.y;
    }

    @Override // defpackage.qg1
    public final ag1 j() {
        return this.z;
    }
}
