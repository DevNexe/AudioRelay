package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class r93 extends cx1 implements j81<br, sd5> {
    public final /* synthetic */ s93<Object> w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r93(s93<Object> s93Var) {
        super(1);
        this.w = s93Var;
    }

    @Override // defpackage.j81
    public final sd5 invoke(br brVar) {
        br brVar2 = brVar;
        br.a(brVar2, "type", ii.serializer(pu4.a).a());
        StringBuilder sb = new StringBuilder("kotlinx.serialization.Polymorphic<");
        s93<Object> s93Var = this.w;
        sb.append(s93Var.a.a());
        sb.append('>');
        br.a(brVar2, "value", FWT.r(sb.toString(), xa4.QnHx.a, new pa4[0], ua4.w));
        brVar2.a = s93Var.b;
        return sd5.a;
    }
}
