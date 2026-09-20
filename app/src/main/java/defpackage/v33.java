package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class v33 extends cx1 implements j81<qk, sd5> {
    public final /* synthetic */ yz2 w;
    public final /* synthetic */ List<qk> x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v33(yz2 yz2Var, ArrayList arrayList) {
        super(1);
        this.w = yz2Var;
        this.x = arrayList;
    }

    @Override // defpackage.j81
    public final sd5 invoke(qk qkVar) {
        u33 u33Var = new u33(this.x);
        this.w.a(qkVar, u33Var);
        return sd5.a;
    }
}
