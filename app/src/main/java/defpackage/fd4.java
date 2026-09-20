package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fd4 extends cx1 implements j81<qk, sd5> {
    public final /* synthetic */ j81<qk, sd5> w;
    public final /* synthetic */ gd4 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fd4(v33 v33Var, gd4 gd4Var) {
        super(1);
        this.w = v33Var;
        this.x = gd4Var;
    }

    @Override // defpackage.j81
    public final sd5 invoke(qk qkVar) {
        qk qkVar2;
        qk qkVar3 = qkVar;
        gd4 gd4Var = this.x;
        gd4Var.getClass();
        int i = qkVar3.c;
        int iEncode = gd4Var.b.encode(gd4Var.a, qkVar3.a, qkVar3.b, i, gd4Var.e, i / (gd4Var.c * 2));
        if (iEncode < 0) {
            a62.a.a("Failed to encode " + qkVar3.c + " bytes. Opus Error code " + iEncode);
            qkVar2 = OW8.y(new byte[0], 0, 3);
        } else {
            qkVar2 = new qk(gd4Var.e, 0, iEncode, false);
        }
        this.w.invoke(qkVar2);
        return sd5.a;
    }
}
