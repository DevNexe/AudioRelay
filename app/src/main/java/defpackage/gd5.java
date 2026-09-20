package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gd5 extends cx1 implements h81<sd5> {
    public final /* synthetic */ String w;
    public final /* synthetic */ hd5 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gd5(String str, hd5 hd5Var) {
        super(0);
        this.w = str;
        this.x = hd5Var;
    }

    @Override // defpackage.h81
    public final sd5 invoke() {
        a62 a62Var = a62.a;
        a62Var.l("Ignoring packet received from " + this.w + ", expected " + this.x.d);
        a62Var.e("data_received_from_wrong_address");
        return sd5.a;
    }
}
