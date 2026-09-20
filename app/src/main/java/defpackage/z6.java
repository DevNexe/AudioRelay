package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class z6 extends cx1 implements j81<j8, j8> {
    public final /* synthetic */ k6.QnHx w;
    public final /* synthetic */ b7 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z6(k6.QnHx qnHx, b7 b7Var) {
        super(1);
        this.w = qnHx;
        this.x = b7Var;
    }

    @Override // defpackage.j81
    public final j8 invoke(j8 j8Var) {
        j8 j8Var2;
        j8 j8VarY;
        j8 j8Var3 = j8Var;
        this.w.getClass();
        b7 b7Var = this.x;
        boolean z = b7Var instanceof b7.ta;
        if (z) {
            j8Var2 = new j8(j8Var3.a, j8Var3.b, j8Var3.c, b7Var.a(), b7Var.a(), true, 2552);
        } else {
            if (b7Var instanceof b7.Xn1) {
                j8VarY = j8.a(j8Var3, null, null, null, null, null, false, false, null, null, 4095);
            } else if (b7Var instanceof b7.Z) {
                j8VarY = j8.a(j8Var3, ((b7.Z) b7Var).d, null, null, null, null, true, false, null, null, 8059);
            } else if (b7Var instanceof b7.qc) {
                j8VarY = j8.a(j8Var3, null, null, null, null, null, false, false, null, null, 8063);
            } else if (b7Var instanceof b7.MZ) {
                j8VarY = AY.X(j8Var3, ((b7.MZ) b7Var).d, null, new y5(b7Var));
            } else if (b7Var instanceof b7.EQ) {
                j8VarY = AY.X(j8Var3, ((b7.EQ) b7Var).d, null, new a6(b7Var));
            } else if (b7Var instanceof b7.y) {
                j8VarY = AY.X(j8Var3, ((b7.y) b7Var).d, null, new b6(b7Var));
            } else if (b7Var instanceof b7.FJCM) {
                j8VarY = AY.X(j8Var3, ((b7.FJCM) b7Var).d, null, new c6(b7Var));
            } else if (b7Var instanceof b7.RBi) {
                j8VarY = AY.X(j8Var3, ((b7.RBi) b7Var).d, null, new d6(b7Var));
            } else if (b7Var instanceof b7.PRnFixed) {
                j8VarY = AY.X(j8Var3, ((b7.PRnFixed) b7Var).d, null, new e6(b7Var));
            } else if (b7Var instanceof b7.LPt6Fixed) {
                j8VarY = AY.X(j8Var3, ((b7.LPt6Fixed) b7Var).d, null, new f6(b7Var));
            } else if (b7Var instanceof b7.T23) {
                j8VarY = AY.W(j8Var3, ((b7.T23) b7Var).d, new g6(b7Var));
            } else if (b7Var instanceof b7.F1) {
                j8VarY = AY.W(j8Var3, ((b7.F1) b7Var).d, new h6(b7Var));
            } else if (b7Var instanceof b7.LPt8Fixed) {
                j8VarY = AY.W(j8Var3, ((b7.LPt8Fixed) b7Var).d, new q5(b7Var));
            } else if (b7Var instanceof b7.NUlFixed) {
                j8VarY = AY.W(j8Var3, ((b7.NUlFixed) b7Var).d, new r5(b7Var));
            } else if (b7Var instanceof b7.YKK) {
                j8VarY = j8.a(j8Var3, null, null, null, null, null, false, true, null, null, 7935);
            } else if (b7Var instanceof b7.auxFixed) {
                j8VarY = j8.a(j8Var3, null, null, null, null, null, false, false, null, null, 7935);
            } else if (b7Var instanceof b7.WE) {
                String str = ((b7.WE) b7Var).d;
                new s5(b7Var);
                String str2 = j8Var3.a;
                String str3 = j8Var3.b;
                s42.QnHx qnHx = s42.Companion;
                Th.q();
                b7.WE we = (b7.WE) b7Var;
                j8VarY = j8.a(j8Var3, null, null, null, null, wu.U0(j8Var3.g, Collections.singletonList(new r7(str2, str3, str, null, we.f, we.g, b7Var.a()))), false, false, null, null, 8127);
            } else if (b7Var instanceof b7.SjP) {
                j8VarY = AY.Y(j8Var3, ((b7.SjP) b7Var).d, new t5(b7Var));
            } else if (b7Var instanceof b7.Aa) {
                j8VarY = AY.Y(j8Var3, ((b7.Aa) b7Var).d, new u5(b7Var));
            } else if (b7Var instanceof b7.lPt3Fixed) {
                j8VarY = AY.Y(j8Var3, ((b7.lPt3Fixed) b7Var).d, new v5(b7Var));
            } else if (b7Var instanceof b7.LPt9Fixed) {
                j8VarY = AY.Y(j8Var3, ((b7.LPt9Fixed) b7Var).d, new w5(b7Var));
            } else if (b7Var instanceof b7.ck32) {
                j8VarY = AY.Y(j8Var3, ((b7.ck32) b7Var).d, new x5(b7Var));
            } else {
                j8Var2 = j8Var3;
            }
            j8Var2 = j8VarY;
        }
        if (b7Var instanceof b7.byN ? true : b7Var instanceof b7.Xn1) {
            z = true;
        }
        List listU0 = j8Var3.l;
        if (!z) {
            listU0 = wu.U0(listU0, Collections.singletonList(b7Var));
        }
        return j8.a(j8Var2, null, null, null, null, null, false, false, b7Var.a(), listU0, 5119);
    }
}
