package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dG extends cx1 implements h81<Float> {
    public final /* synthetic */ I8O w;
    public final /* synthetic */ String x;
    public final /* synthetic */ float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dG(I8O i8o, String str, float f) {
        super(0);
        this.w = i8o;
        this.x = str;
        this.y = f;
    }

    @Override // defpackage.h81
    public final Float invoke() {
        return Float.valueOf(this.w.a.e().getFloat(this.x, this.y));
    }
}
