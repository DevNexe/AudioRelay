package defpackage;

import java.util.List;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes.dex */
public final class vx2 extends cx1 implements j81<List<? extends byte[]>, sd5> {
    public final /* synthetic */ wx2 w;
    public final /* synthetic */ e61 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vx2(wx2 wx2Var, e61 e61Var) {
        super(1);
        this.w = wx2Var;
        this.x = e61Var;
    }

    @Override // defpackage.j81
    public final sd5 invoke(List<? extends byte[]> list) {
        this.w.getClass();
        if (!((BlockingQueue) this.x.b).offer(list)) {
            a62.a.l("Queue's offer() failed");
        }
        return sd5.a;
    }
}
