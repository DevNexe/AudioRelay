package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class oz3 implements eo1<sy3, ry3, uy3> {
    public final ny1 a;
    public final cq4 b;
    public final d7G c;
    public final ny1 d;
    public final ta2 e;
    public final C0w f;
    public final uz4 g;

    public oz3(ny1 ny1Var, cq4 cq4Var, d7G d7g, ny1 ny1Var2, ta2 ta2Var, C0w c0w, uz4 uz4Var) {
        this.a = ny1Var;
        this.b = cq4Var;
        this.c = d7g;
        this.d = ny1Var2;
        this.e = ta2Var;
        this.f = c0w;
        this.g = uz4Var;
    }

    @Override // defpackage.eo1
    public final Object a(go1 go1Var, Object obj, z80 z80Var) throws Throwable {
        sy3 sy3Var = (sy3) obj;
        if (sy3Var instanceof sy3.F1) {
            go1Var.p("initialize", new ez3(this, null));
        } else {
            if (!ur1.a(sy3Var, sy3.CQf.a)) {
                boolean zA = ur1.a(sy3Var, sy3.LPt8Fixed.a);
                va0 va0Var = va0.COROUTINE_SUSPENDED;
                if (zA) {
                    Object objO = go1Var.o(ry3.QnHx.a, z80Var);
                    return objO == va0Var ? objO : sd5.a;
                }
                if (sy3Var instanceof sy3.T23) {
                    Object objO2 = go1Var.o(new ry3.CQf(((sy3.T23) sy3Var).a), z80Var);
                    return objO2 == va0Var ? objO2 : sd5.a;
                }
                if (ur1.a(sy3Var, sy3.FJCM.a)) {
                    go1Var.p("stop_player", new mz3(this, null));
                    return sd5.a;
                }
                if (ur1.a(sy3Var, sy3.y.a)) {
                    Object objB = b(go1Var, z80Var);
                    return objB == va0Var ? objB : sd5.a;
                }
                if (sy3Var instanceof sy3.QnHx) {
                    sd5 sd5VarS = go1Var.s(new fz3(sy3Var));
                    return sd5VarS == va0Var ? sd5VarS : sd5.a;
                }
                if (sy3Var instanceof sy3.NUlFixed) {
                    sd5 sd5VarS2 = go1Var.s(new gz3(sy3Var));
                    return sd5VarS2 == va0Var ? sd5VarS2 : sd5.a;
                }
                if (sy3Var instanceof sy3.YKK) {
                    sd5 sd5VarS3 = go1Var.s(new hz3(sy3Var));
                    return sd5VarS3 == va0Var ? sd5VarS3 : sd5.a;
                }
                if (sy3Var instanceof sy3.auxFixed) {
                    sd5 sd5VarS4 = go1Var.s(new iz3(sy3Var));
                    return sd5VarS4 == va0Var ? sd5VarS4 : sd5.a;
                }
                if (sy3Var instanceof sy3.EQ) {
                    sd5 sd5VarS5 = go1Var.s(new jz3(sy3Var));
                    return sd5VarS5 == va0Var ? sd5VarS5 : sd5.a;
                }
                if (ur1.a(sy3Var, sy3.PRnFixed.a)) {
                    sd5 sd5VarS6 = go1Var.s(kz3.w);
                    return sd5VarS6 == va0Var ? sd5VarS6 : sd5.a;
                }
                if (!ur1.a(sy3Var, sy3.byN.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                sd5 sd5VarS7 = go1Var.s(lz3.w);
                return sd5VarS7 == va0Var ? sd5VarS7 : sd5.a;
            }
            C0w c0w = this.f;
            c0w.getClass();
            new fx(new l83(c0w, 1)).i(j54.b).g();
            go1Var.q();
        }
        return sd5.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [fo1, go1] */
    /* JADX WARN: Type inference failed for: r6v1, types: [fo1] */
    /* JADX WARN: Type inference failed for: r6v4, types: [fo1] */
    public final Object b(go1 go1Var, z80 z80Var) throws Throwable {
        nz3 nz3Var;
        if (z80Var instanceof nz3) {
            nz3Var = (nz3) z80Var;
            int i = nz3Var.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                nz3Var.C = i - Integer.MIN_VALUE;
            } else {
                nz3Var = new nz3(this, z80Var);
            }
        } else {
            nz3Var = new nz3(this, z80Var);
        }
        Object obj = nz3Var.A;
        Object obj2 = va0.COROUTINE_SUSPENDED;
        int i2 = nz3Var.C;
        if (i2 == 0) {
            C0239D.H(obj);
            a62.a.e("called_toggle_mute");
            dc2.F1 f1 = dc2.F1.VOLUME_MUTE;
            nz3Var.z = go1Var;
            nz3Var.C = 1;
            ny1 ny1Var = this.d;
            ny1Var.getClass();
            Object objB = JUCk.b(new fx(new ec2(0, ny1Var, f1)), nz3Var);
            if (objB != obj2) {
                objB = sd5.a;
            }
            if (objB == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            go1Var = nz3Var.z;
            C0239D.H(obj);
        }
        go1Var.q();
        return sd5.a;
    }
}
