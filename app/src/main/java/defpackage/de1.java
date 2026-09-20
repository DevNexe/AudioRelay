package defpackage;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class de1 extends v05 {
    public final /* synthetic */ xd1 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ List g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public de1(String str, xd1 xd1Var, int i, List list, boolean z) {
        super(str, true);
        this.e = xd1Var;
        this.f = i;
        this.g = list;
    }

    @Override // defpackage.v05
    public final long a() {
        this.e.H.getClass();
        try {
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
