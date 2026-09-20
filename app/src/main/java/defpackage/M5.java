package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class M5 extends cx1 implements j81<o94, sd5> {
    public final /* synthetic */ boolean w;
    public final /* synthetic */ long x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M5(long j, boolean z) {
        super(1);
        this.w = z;
        this.x = j;
    }

    @Override // defpackage.j81
    public final sd5 invoke(o94 o94Var) {
        o94Var.a(v74.c, new u74(this.w ? eb1.SelectionStart : eb1.SelectionEnd, this.x));
        return sd5.a;
    }
}
