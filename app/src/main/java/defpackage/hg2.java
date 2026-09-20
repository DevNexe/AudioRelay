package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hg2 extends cx1 implements h81<sd5> {
    public final /* synthetic */ me2 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hg2(me2 me2Var) {
        super(0);
        this.w = me2Var;
    }

    @Override // defpackage.h81
    public final sd5 invoke() {
        a62.a.f("audio_effect_factory_failed", new gg2(this.w));
        return sd5.a;
    }
}
