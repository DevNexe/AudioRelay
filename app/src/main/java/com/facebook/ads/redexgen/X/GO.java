package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class GO implements InterfaceC1399eY {
    public final List<InterfaceC1400eZ> A00 = new ArrayList();

    @Override // com.facebook.ads.redexgen.X.InterfaceC1399eY
    public final InterfaceC1400eZ A5Y(int i) {
        return this.A00.get(i);
    }

    @Override // java.lang.Iterable
    public final Iterator<InterfaceC1400eZ> iterator() {
        return this.A00.iterator();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1399eY
    public final int size() {
        return this.A00.size();
    }
}
