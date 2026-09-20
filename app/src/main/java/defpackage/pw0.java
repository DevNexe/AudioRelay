package defpackage;

import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public final class pw0 extends o_K {
    public final QnHx y = new QnHx();

    public static final class QnHx extends ThreadLocal<Random> {
        @Override // java.lang.ThreadLocal
        public final Random initialValue() {
            return new Random();
        }
    }

    @Override // defpackage.o_K
    public final Random f() {
        return this.y.get();
    }
}
