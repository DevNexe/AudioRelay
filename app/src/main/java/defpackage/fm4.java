package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fm4 extends cx1 implements j81<yo1, sd5> {
    public final /* synthetic */ float w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fm4(float f) {
        super(1);
        this.w = f;
    }

    @Override // defpackage.j81
    public final sd5 invoke(yo1 yo1Var) {
        yo1Var.a.b(Float.valueOf(this.w), "fraction");
        return sd5.a;
    }
}
