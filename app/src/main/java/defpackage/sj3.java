package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class sj3 extends cx1 implements h81<Set<Object>> {
    public final /* synthetic */ j81<bw0.QnHx, kg4<Object>> w;
    public final /* synthetic */ tj3 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public sj3(j81<? super bw0.QnHx, ? extends kg4<Object>> j81Var, tj3 tj3Var) {
        super(0);
        this.w = j81Var;
        this.x = tj3Var;
    }

    @Override // defpackage.h81
    public final Set<Object> invoke() {
        tj3 tj3Var = this.x;
        return this.w.invoke(new bw0.QnHx(tj3Var.a, tj3Var)).a();
    }
}
