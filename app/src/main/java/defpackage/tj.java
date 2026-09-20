package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tj extends cx1 implements h81<Boolean> {
    public final /* synthetic */ wj w;
    public final /* synthetic */ int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tj(wj wjVar, int i) {
        super(0);
        this.w = wjVar;
        this.x = i;
    }

    @Override // defpackage.h81
    public final Boolean invoke() {
        wj wjVar = this.w;
        return Boolean.valueOf(wjVar.o() < this.x && !wjVar.r());
    }
}
