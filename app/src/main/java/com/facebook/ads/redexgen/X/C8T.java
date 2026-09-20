package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8T, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C8T {
    public static final AtomicReference<C1074Xx> A00 = new AtomicReference<>();

    @Nullable
    public static C1074Xx A00() {
        return A00.get();
    }

    public static void A01(C1074Xx c1074Xx) {
        if (c1074Xx == null) {
            return;
        }
        A00.compareAndSet(null, c1074Xx);
    }
}
