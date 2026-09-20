package com.facebook.ads.redexgen.X;

import java.util.Comparator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Is, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0688Is implements Comparator<C0689It> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Comparator
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compare(C0689It c0689It, C0689It c0689It2) {
        if (c0689It.A00 < c0689It2.A00) {
            return -1;
        }
        return c0689It2.A00 < c0689It.A00 ? 1 : 0;
    }
}
