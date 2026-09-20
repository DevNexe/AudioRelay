package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class DQ extends cx1 implements h81<Integer> {
    public final /* synthetic */ I8O w;
    public final /* synthetic */ String x;
    public final /* synthetic */ int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DQ(I8O i8o, String str, int i) {
        super(0);
        this.w = i8o;
        this.x = str;
        this.y = i;
    }

    @Override // defpackage.h81
    public final Integer invoke() {
        return Integer.valueOf(this.w.a.e().getInt(this.x, this.y));
    }
}
