package defpackage;

import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class y15 extends cx1 implements j81<o94, sd5> {
    public final /* synthetic */ Z7jl w;
    public final /* synthetic */ w15 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y15(Z7jl z7jl, w15 w15Var) {
        super(1);
        this.w = z7jl;
        this.x = w15Var;
    }

    @Override // defpackage.j81
    public final sd5 invoke(o94 o94Var) {
        o94 o94Var2 = o94Var;
        qv1<Object>[] qv1VarArr = l94.a;
        o94Var2.a(i94.s, Collections.singletonList(this.w));
        o94Var2.a(w84.a, new FA4(null, new x15(this.x)));
        return sd5.a;
    }
}
