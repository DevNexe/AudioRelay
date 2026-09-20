package defpackage;

import j$.util.concurrent.ThreadLocalRandom;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public final class t53 extends o_K {
    @Override // defpackage.yh3
    public final int e(int i, int i2) {
        return ThreadLocalRandom.current().nextInt(i, i2);
    }

    @Override // defpackage.o_K
    public final Random f() {
        return ThreadLocalRandom.current();
    }
}
