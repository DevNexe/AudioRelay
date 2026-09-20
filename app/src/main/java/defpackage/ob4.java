package defpackage;

import com.google.protobuf.QnHx;

/* JADX INFO: loaded from: classes.dex */
public final class ob4 extends cx1 implements j81<ad2.CQf, sd5> {
    public final /* synthetic */ pb4 w;
    public final /* synthetic */ Sb1 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ob4(pb4 pb4Var, Sb1 sb1) {
        super(1);
        this.w = pb4Var;
        this.x = sb1;
    }

    @Override // defpackage.j81
    public final sd5 invoke(ad2.CQf cQf) {
        ad2.CQf cQf2 = cQf;
        bg3.CQf cQfC = bg3.B.c();
        this.w.getClass();
        yf3.CQf cQfC2 = yf3.D.c();
        Sb1 sb1 = this.x;
        cQfC2.A = sb1.a;
        cQfC2.M();
        cQfC2.B = sb1.b;
        cQfC2.M();
        cQfC2.C = sb1.c;
        cQfC2.M();
        yf3 yf3VarF = cQfC2.f();
        if (!yf3VarF.isInitialized()) {
            throw QnHx.AbstractC0099QnHx.C(yf3VarF);
        }
        cQfC.A = yf3VarF;
        cQfC.M();
        bg3 bg3VarF = cQfC.f();
        if (!bg3VarF.isInitialized()) {
            throw QnHx.AbstractC0099QnHx.C(bg3VarF);
        }
        cQf2.R = bg3VarF;
        cQf2.M();
        return sd5.a;
    }
}
