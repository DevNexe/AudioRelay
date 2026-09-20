package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class ce1 extends v05 {
    public final /* synthetic */ xd1 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ gg g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ce1(String str, xd1 xd1Var, int i, gg ggVar, int i2, boolean z) {
        super(str, true);
        this.e = xd1Var;
        this.f = i;
        this.g = ggVar;
        this.h = i2;
    }

    @Override // defpackage.v05
    public final long a() {
        try {
            FWT fwt = this.e.H;
            gg ggVar = this.g;
            int i = this.h;
            fwt.getClass();
            ggVar.skip(i);
            this.e.U.h(this.f, rt0.CANCEL);
            synchronized (this.e) {
                this.e.W.remove(Integer.valueOf(this.f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
