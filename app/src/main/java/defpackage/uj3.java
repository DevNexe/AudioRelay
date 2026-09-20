package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class uj3 extends cx1 implements h81<Set<Object>> {
    public final /* synthetic */ j81<dw0.QnHx, kg4<Object>> w;
    public final /* synthetic */ vj3 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public uj3(j81<? super dw0.QnHx, ? extends kg4<Object>> j81Var, vj3 vj3Var) {
        super(0);
        this.w = j81Var;
        this.x = vj3Var;
    }

    @Override // defpackage.h81
    public final Set<Object> invoke() {
        vj3 vj3Var = this.x;
        return this.w.invoke(new dw0.QnHx(vj3Var.a, vj3Var)).a();
    }
}
