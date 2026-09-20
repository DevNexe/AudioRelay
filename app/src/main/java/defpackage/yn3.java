package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yn3 extends cx1 implements j81<n52, sd5> {
    public final /* synthetic */ String w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yn3(String str) {
        super(1);
        this.w = str;
    }

    @Override // defpackage.j81
    public final sd5 invoke(n52 n52Var) {
        n52Var.b("key_name", this.w);
        return sd5.a;
    }
}
