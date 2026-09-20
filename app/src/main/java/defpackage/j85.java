package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class j85 extends cx1 implements h81<sd5> {
    public final /* synthetic */ j81<Boolean, sd5> w;
    public final /* synthetic */ boolean x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j85(j81<? super Boolean, sd5> j81Var, boolean z) {
        super(0);
        this.w = j81Var;
        this.x = z;
    }

    @Override // defpackage.h81
    public final sd5 invoke() {
        this.w.invoke(Boolean.valueOf(!this.x));
        return sd5.a;
    }
}
