package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class k84 extends cx1 implements h81<kt2> {
    public final /* synthetic */ b84 w;
    public final /* synthetic */ ri2<sp1> x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k84(b84 b84Var, ri2<sp1> ri2Var) {
        super(0);
        this.w = b84Var;
        this.x = ri2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.h81
    public final kt2 invoke() {
        long jA;
        long j = this.x.getValue().a;
        b84 b84Var = this.w;
        n74 n74VarD = b84Var.d();
        if (n74VarD == null) {
            jA = kt2.d;
        } else {
            eb1 eb1Var = (eb1) b84Var.o.getValue();
            int i = eb1Var == null ? -1 : j84.QnHx.a[eb1Var.ordinal()];
            if (i == -1) {
                jA = kt2.d;
            } else if (i == 1) {
                jA = j84.a(b84Var, j, n74VarD.a, true);
            } else {
                if (i != 2) {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw new IllegalStateException("SelectionContainer does not support cursor".toString());
                }
                jA = j84.a(b84Var, j, n74VarD.b, false);
            }
        }
        return new kt2(jA);
    }
}
