package defpackage;

import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class sp0 extends cx1 implements j81<o94, sd5> {
    public final /* synthetic */ String w;
    public final /* synthetic */ h81<sd5> x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sp0(String str, h81<sd5> h81Var) {
        super(1);
        this.w = str;
        this.x = h81Var;
    }

    @Override // defpackage.j81
    public final sd5 invoke(o94 o94Var) {
        o94 o94Var2 = o94Var;
        qv1<Object>[] qv1VarArr = l94.a;
        o94Var2.a(i94.a, Collections.singletonList(this.w));
        o94Var2.a(w84.b, new FA4(null, new rp0(this.x)));
        return sd5.a;
    }
}
