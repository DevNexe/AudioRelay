package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class ae1 extends v05 {
    public final /* synthetic */ xd1 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae1(String str, xd1 xd1Var, int i, int i2) {
        super(str, true);
        this.e = xd1Var;
        this.f = i;
        this.g = i2;
    }

    @Override // defpackage.v05
    public final long a() {
        int i = this.f;
        int i2 = this.g;
        xd1 xd1Var = this.e;
        xd1Var.getClass();
        try {
            xd1Var.U.g(i, i2, true);
            return -1L;
        } catch (IOException e) {
            xd1Var.c(e);
            return -1L;
        }
    }
}
