package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class f40 extends h30 {
    public final ws1 c;
    public int d;

    public f40(vu1 vu1Var, ws1 ws1Var) {
        super(vu1Var);
        this.c = ws1Var;
    }

    @Override // defpackage.h30
    public final void a() {
        this.b = true;
        this.d++;
    }

    @Override // defpackage.h30
    public final void b() {
        this.b = false;
        g("\n");
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            g(this.c.a.g);
        }
    }

    @Override // defpackage.h30
    public final void i() {
        d(' ');
    }

    @Override // defpackage.h30
    public final void j() {
        this.d--;
    }
}
