package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class o14 extends cx1 implements h81<sd5> {
    public final /* synthetic */ Runnable w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o14(Runnable runnable) {
        super(0);
        this.w = runnable;
    }

    @Override // defpackage.h81
    public final sd5 invoke() {
        this.w.run();
        return sd5.a;
    }
}
