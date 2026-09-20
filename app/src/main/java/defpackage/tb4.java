package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tb4 extends cx1 implements h81<sd5> {
    public final /* synthetic */ Throwable w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tb4(Throwable th) {
        super(0);
        this.w = th;
    }

    @Override // defpackage.h81
    public final sd5 invoke() {
        a62.a.a("Failed to create the broadcasting socket: " + this.w.getMessage());
        return sd5.a;
    }
}
