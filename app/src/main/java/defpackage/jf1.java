package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class jf1 extends cx1 implements j81<Throwable, sd5> {
    public final /* synthetic */ ze1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jf1(ze1 ze1Var) {
        super(1);
        this.w = ze1Var;
    }

    @Override // defpackage.j81
    public final sd5 invoke(Throwable th) throws IOException {
        this.w.close();
        return sd5.a;
    }
}
