package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class ge1 extends v05 {
    public final /* synthetic */ xd1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ge1(String str, xd1 xd1Var) {
        super(str, true);
        this.e = xd1Var;
    }

    @Override // defpackage.v05
    public final long a() {
        xd1 xd1Var = this.e;
        xd1Var.getClass();
        try {
            xd1Var.U.g(2, 0, false);
            return -1L;
        } catch (IOException e) {
            xd1Var.c(e);
            return -1L;
        }
    }
}
