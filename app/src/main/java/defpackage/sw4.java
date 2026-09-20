package defpackage;

import java.util.HashMap;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes3.dex */
public final class sw4 implements ILoggerFactory {
    public boolean w = false;
    public final HashMap x = new HashMap();
    public final LinkedBlockingQueue<tw4> y = new LinkedBlockingQueue<>();

    @Override // defpackage.ILoggerFactory
    public final synchronized t52 b(String str) {
        rw4 rw4Var;
        rw4Var = (rw4) this.x.get(str);
        if (rw4Var == null) {
            rw4Var = new rw4(str, this.y, this.w);
            this.x.put(str, rw4Var);
        }
        return rw4Var;
    }
}
