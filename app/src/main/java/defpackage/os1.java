package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class os1 extends ss1 implements jx {
    public final boolean x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public os1(ms1 ms1Var) {
        super(true);
        boolean z = true;
        E0(ms1Var);
        fq fqVarA0 = A0();
        gq gqVar = fqVarA0 instanceof gq ? (gq) fqVarA0 : null;
        if (gqVar == null) {
            z = false;
            break;
        }
        ss1 ss1VarT = gqVar.t();
        while (!ss1VarT.v0()) {
            fq fqVarA1 = ss1VarT.A0();
            gq gqVar2 = fqVarA1 instanceof gq ? (gq) fqVarA1 : null;
            if (gqVar2 == null) {
                z = false;
                break;
            }
            ss1VarT = gqVar2.t();
        }
        this.x = z;
    }

    @Override // defpackage.jx
    public final boolean e0(Throwable th) {
        return G0(new iy(th, false));
    }

    @Override // defpackage.jx
    public final boolean h() {
        return G0(sd5.a);
    }

    @Override // defpackage.ss1
    public final boolean v0() {
        return this.x;
    }

    @Override // defpackage.ss1
    public final boolean w0() {
        return true;
    }
}
