package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wf0 extends cx1 implements j81<qk, sd5> {
    public final /* synthetic */ tf0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wf0(tf0 tf0Var) {
        super(1);
        this.w = tf0Var;
    }

    @Override // defpackage.j81
    public final sd5 invoke(qk qkVar) {
        qk qkVar2 = qkVar;
        rf0 rf0Var = this.w.c.a;
        if (rf0Var != null) {
            rf0Var.a(qkVar2);
        }
        return sd5.a;
    }
}
