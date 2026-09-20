package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class c74 extends cx1 implements j81<br, sd5> {
    public final /* synthetic */ e74<Object> w;
    public final /* synthetic */ rv1<Object>[] x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c74(e74<Object> e74Var, rv1<Object>[] rv1VarArr) {
        super(1);
        this.w = e74Var;
        this.x = rv1VarArr;
    }

    @Override // defpackage.j81
    public final sd5 invoke(br brVar) {
        br brVar2 = brVar;
        br.a(brVar2, "type", ii.serializer(pu4.a).a());
        StringBuilder sb = new StringBuilder("kotlinx.serialization.Sealed<");
        e74<Object> e74Var = this.w;
        sb.append(e74Var.a.a());
        sb.append('>');
        br.a(brVar2, "value", FWT.r(sb.toString(), xa4.QnHx.a, new pa4[0], new b74(this.x)));
        brVar2.a = e74Var.b;
        return sd5.a;
    }
}
