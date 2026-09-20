package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C03574q {
    public C03544n A00 = new C03544n();
    public final InterfaceC03554o A01;

    public C03574q(InterfaceC03554o interfaceC03554o) {
        this.A01 = interfaceC03554o;
    }

    public final View A00(int end, int next, int i, int i2) {
        int childStart = this.A01.A78();
        int iA77 = this.A01.A77();
        int i3 = next > end ? 1 : -1;
        View view = null;
        while (end != next) {
            View viewA5z = this.A01.A5z(end);
            this.A00.A03(childStart, iA77, this.A01.A62(viewA5z), this.A01.A61(viewA5z));
            if (i != 0) {
                this.A00.A01();
                this.A00.A02(i);
                if (this.A00.A04()) {
                    return viewA5z;
                }
            }
            if (i2 != 0) {
                this.A00.A01();
                this.A00.A02(i2);
                if (this.A00.A04()) {
                    view = viewA5z;
                }
            }
            end += i3;
        }
        return view;
    }
}
