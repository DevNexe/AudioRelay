package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yVm extends cx1 implements x81<Integer, jy1, Integer> {
    public final /* synthetic */ One.F1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yVm(One.F1 f1) {
        super(2);
        this.w = f1;
    }

    @Override // defpackage.x81
    public final Integer invoke(Integer num, jy1 jy1Var) {
        return Integer.valueOf(this.w.a(0, num.intValue()));
    }
}
