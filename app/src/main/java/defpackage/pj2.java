package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class pj2 extends cx1 implements j81<Integer, Object> {
    public final /* synthetic */ j81 w;
    public final /* synthetic */ List x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pj2(oj2 oj2Var, kj1 kj1Var) {
        super(1);
        this.w = oj2Var;
        this.x = kj1Var;
    }

    @Override // defpackage.j81
    public final Object invoke(Integer num) {
        return this.w.invoke(this.x.get(num.intValue()));
    }
}
