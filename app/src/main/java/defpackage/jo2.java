package defpackage;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class jo2 extends c54 {
    public static final q14 c = new q14(false, "RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())));
    public final ThreadFactory b = c;

    @Override // defpackage.c54
    public final c54.F1 a() {
        return new ko2(this.b);
    }
}
