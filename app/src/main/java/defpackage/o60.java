package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class o60 extends cx1 implements h81<sd5> {
    public final /* synthetic */ Throwable w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o60(Throwable th) {
        super(0);
        this.w = th;
    }

    @Override // defpackage.h81
    public final sd5 invoke() {
        a62.a.l("Failed to reconnect: " + this.w.getMessage());
        return sd5.a;
    }
}
