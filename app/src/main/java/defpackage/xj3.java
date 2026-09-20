package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class xj3 extends cx1 implements h81<Set<Object>> {
    public final /* synthetic */ j81<fw0.QnHx, kg4<Object>> w;
    public final /* synthetic */ zj3 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public xj3(j81<? super fw0.QnHx, ? extends kg4<Object>> j81Var, zj3 zj3Var) {
        super(0);
        this.w = j81Var;
        this.x = zj3Var;
    }

    @Override // defpackage.h81
    public final Set<Object> invoke() {
        return this.w.invoke(new fw0.QnHx(this.x)).a();
    }
}
