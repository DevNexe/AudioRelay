package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zo2 extends l91 implements h81<sd5> {
    public zo2(ap2 ap2Var) {
        super(0, ap2Var, ap2.class, "onNoisyEvent", "onNoisyEvent()V", 0);
    }

    @Override // defpackage.h81
    public final sd5 invoke() {
        ap2 ap2Var = (ap2) this.x;
        ap2Var.getClass();
        a62 a62Var = a62.a;
        a62.a.g("audio_output_changed", null);
        a62Var.k("Becoming noisy, stopping the player...");
        new fx(new w52(ap2Var, 2)).i(j54.c).g();
        return sd5.a;
    }
}
