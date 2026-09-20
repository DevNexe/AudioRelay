package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import com.facebook.infer.annotation.Nullsafe;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.eF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@Nullsafe(Nullsafe.Mode.LOCAL)
public final class C1380eF {
    public final InterfaceC1384eJ A00;
    public final String A01;
    public final Collection<C1395eU> A02;
    public final Collection<C1395eU> A03;
    public final List<Rect> A04;

    public C1380eF(String str, InterfaceC1384eJ interfaceC1384eJ, List<Rect> list, Collection<C1395eU> collection, Collection<C1395eU> collection2) {
        this.A01 = str;
        this.A00 = interfaceC1384eJ;
        this.A04 = new ArrayList(list);
        this.A02 = collection;
        this.A03 = collection2;
    }
}
