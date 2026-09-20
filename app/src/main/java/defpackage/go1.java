package defpackage;

import kotlinx.coroutines.flow.QnHx;

/* JADX INFO: loaded from: classes.dex */
public final class go1<Inputs, Events, State> implements fo1<Inputs, Events, State> {
    public final m7 a;
    public final po1.QnHx b;
    public final si2<State> c;
    public final x81<Events, z80<? super sd5>, Object> d;
    public final j81<fk4<Inputs, Events, State>, sd5> e;

    public go1(m7 m7Var, po1.QnHx qnHx, QnHx qnHx2, a8.QnHx qnHx3, a8.CQf cQf) {
        this.a = m7Var;
        this.b = qnHx;
        this.c = qnHx2;
        this.d = qnHx3;
        this.e = cQf;
    }

    public final Object a(roB rob) {
        si2<State> si2Var;
        State value;
        this.b.a();
        do {
            si2Var = this.c;
            value = si2Var.getValue();
        } while (!si2Var.b(value, (State) rob.invoke(value)));
        return value;
    }

    public final Object b(EFt eFt) {
        si2<State> si2Var;
        State value;
        Object objInvoke;
        this.b.a();
        do {
            si2Var = this.c;
            value = si2Var.getValue();
            objInvoke = eFt.invoke(value);
        } while (!si2Var.b(value, (State) objInvoke));
        return objInvoke;
    }

    @Override // defpackage.fo1
    public final Object o(Events events, z80<? super sd5> z80Var) {
        this.b.e();
        Object objInvoke = this.d.invoke(events, z80Var);
        return objInvoke == va0.COROUTINE_SUSPENDED ? objInvoke : sd5.a;
    }

    @Override // defpackage.fo1
    public final void p(String str, x81<? super gk4<Inputs, Events, State>, ? super z80<? super sd5>, ? extends Object> x81Var) {
        this.b.c();
        this.e.invoke(new fk4<>(str, x81Var));
    }

    @Override // defpackage.fo1
    public final void q() {
        this.b.b();
    }

    @Override // defpackage.fo1
    public final Object r() {
        this.b.d();
        return this.c.getValue();
    }

    @Override // defpackage.fo1
    public final sd5 s(j81 j81Var) {
        si2<State> si2Var;
        State value;
        this.b.a();
        do {
            si2Var = this.c;
            value = si2Var.getValue();
        } while (!si2Var.b(value, (State) j81Var.invoke(value)));
        return sd5.a;
    }
}
