package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class ev0 implements iw0<Executor> {

    public static final class QnHx {
        public static final ev0 a = new ev0();
    }

    @Override // defpackage.og3
    public final Object get() {
        return new f24(Executors.newSingleThreadExecutor());
    }
}
